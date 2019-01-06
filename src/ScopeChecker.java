import models.Scope;
import models.Symbol;
import models.Type;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ScopeChecker extends JavaBlyatBaseVisitor {


    private ParseTreeProperty scopeTree;
    private ParseTreeProperty variableTree;

    private Scope scope;

    private int count_if_blocks_name = 0;
    private int count_else_if_blocks_name = 0;
    private int count_else_blocks_name = 0;
    private int count_while_blocks_name = 0;


    private String lastUsedScopeName;


    public ScopeChecker() {
        this.scopeTree = new ParseTreeProperty();
        this.variableTree = new ParseTreeProperty();
        this.scope = new Scope("begin_1");
    }

    @Override
    public Object visitStatementBlock(JavaBlyatParser.StatementBlockContext ctx) {
        this.scopeTree.put(ctx, this.scope);
        Scope s = this.scope.createChildScope(lastUsedScopeName);
        this.scope = s;
        this.scope.getParent().addChild(this.scope);
        visitChildren(ctx);
        this.scope = this.scope.closeChildScope();
        return null;
    }

    @Override
    public Object visitIf_statement(JavaBlyatParser.If_statementContext ctx) {
        this.count_if_blocks_name++;
        Scope scope = this.scope.createChildScope("if_" + this.count_if_blocks_name);
        this.scope = scope;
        this.scope.getParent().addChild(this.scope);
        this.scopeTree.put(ctx, this.scope);
        if(visit(ctx.expression()) != Type.BOOL) {
            throw new RuntimeException("The ifblyat statement on rule: " + ctx.getStart().getLine() + " is not a comparison or a boolean.");
        }
        //Else if blocks
        for (int i = 0; i < ctx.elseif_block().size(); i++) {
            count_else_if_blocks_name++;
            Scope scopeElseIf = this.scope.createChildScope("else_if_" + this.count_else_if_blocks_name);
            this.scope = scopeElseIf;
            this.scope.getParent().addChild(this.scope);
            //this.scopeTree.put(ctx, this.scope);
            visit(ctx.elseif_block(i));
            this.scope = this.scope.closeChildScope();
        }
        //Else block
        if(ctx.else_block() != null){
            count_else_blocks_name++;
            Scope scopeElse = this.scope.createChildScope("else_" + this.count_else_blocks_name);
            this.scope = scopeElse;
            this.scope.getParent().addChild(this.scope);
            //this.scopeTree.put(ctx, this.scope);
            visit(ctx.else_block());
            this.scope = this.scope.closeChildScope();
        }

        if(ctx.statement_block() != null){
            visit(ctx.statement_block());
        }

        this.scope = this.scope.closeChildScope();
        return null;
    }

    @Override
    public Object visitElseif_block(JavaBlyatParser.Elseif_blockContext ctx) {
        scopeTree.put(ctx, this.scope);
        if(visit(ctx.expression()) == Type.BOOL){
            visit(ctx.statement_block());
            return null;
        }
        throw new RuntimeException("One elseifblyat statement in a ifblyat statement on rule: " + ctx.getStart().getLine() + " is not a comparison or a boolean.");
    }

    @Override
    public Object visitElse_block(JavaBlyatParser.Else_blockContext ctx) {
        scopeTree.put(ctx, this.scope);
        visit(ctx.statement_block());
        return Type.BOOL;
    }

    @Override
    public Object visitNew_variable(JavaBlyatParser.New_variableContext ctx) {
        Symbol symbol = new Symbol(ctx.ID().getText(), Type.getType(ctx.DATATYPES().getText()));
        this.scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        if(scope.addVariableToScope(symbol)){
            this.variableTree.put(ctx,symbol);
            this.scope.setPosOnSymbol(symbol);
            return super.visitNew_variable(ctx);
        }
        throw new RuntimeException("Variable " + ctx.ID().getText() + " is already assigned!");
    }

    @Override
    public Object visitNew_variable_declaration(JavaBlyatParser.New_variable_declarationContext ctx) {
        Symbol symbol = new Symbol(ctx.ID().getText(), Type.getType(ctx.DATATYPES().getText()));
        this.scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        if(scope.addVariableToScope(symbol)){
            this.variableTree.put(ctx,symbol);
            this.scope.setPosOnSymbol(symbol);
            return super.visitNew_variable_declaration(ctx);
        }
        throw new RuntimeException("Variable " + ctx.ID().getText() + " is already assigned!");
    }

    @Override
    public Object visitPlusplusAndminminExpressions(JavaBlyatParser.PlusplusAndminminExpressionsContext ctx) {
        this.scopeTree.put(ctx,scope);
        Symbol s = scope.searchVariable(ctx.leftExpression.getText());
        this.variableTree.put(ctx, s);
        if(s != null){
            scope.increaseStack();
            return Type.INT;
        }
        throw new RuntimeException("Variable " + ctx.leftExpression.getText() + " not found!");
    }

    @Override
    public Object visitChange_variable(JavaBlyatParser.Change_variableContext ctx) {
        Symbol symbol = scope.searchVariable(ctx.id.getText());
        this.scopeTree.put(ctx,scope);
        this.variableTree.put(ctx, symbol);
        if(symbol != null){
            if(visit(ctx.expr) != symbol.getType()){
                throw new RuntimeException("Datatypes of " + ctx.ID().getText() + " does not match!");
            } else {
                return null;
            }
        }
        throw new RuntimeException("Variable " + ctx.ID().getText() + " does not exist in the current scope!");
    }

    @Override
    public Object visitWhile_loop(JavaBlyatParser.While_loopContext ctx) {
        count_while_blocks_name++;
        lastUsedScopeName = "while_" + count_while_blocks_name;
        Scope scope = this.scope.createChildScope(lastUsedScopeName);
        this.scope = scope;
        this.scope.getParent().addChild(this.scope);
        this.scopeTree.put(ctx, this.scope);
        if(visit(ctx.expression()) == Type.BOOL){
            visit(ctx.statement_block());
            this.scope = this.scope.closeChildScope();
            return Type.BOOL;
        }
        throw new RuntimeException("Whileblyat loop does not contain a comparison or a boolean.");
    }

    @Override
    public Object visitPrintId(JavaBlyatParser.PrintIdContext ctx) {
        Symbol symbol = this.scope.searchVariable(ctx.ID().getText());
        this.scope.increaseStack();
        if(symbol != null){
            scopeTree.put(ctx, scope);
            this.scope.increaseStack();
            return null;
        }
        throw new RuntimeException("The variable" + ctx.ID().getText() + " does not exist in the current scope!");
    }



    @Override
    public Object visitPrintString(JavaBlyatParser.PrintStringContext ctx) {
        scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        return super.visitPrintString(ctx);
    }

    @Override
    public Object visitPrintCalcExpression(JavaBlyatParser.PrintCalcExpressionContext ctx) {
        scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        return super.visitPrintCalcExpression(ctx);
    }

    @Override
    public Object visitPrintExpression(JavaBlyatParser.PrintExpressionContext ctx) {
        scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        return super.visitPrintExpression(ctx);
    }

    @Override
    public Object visitCompareExpressions(JavaBlyatParser.CompareExpressionsContext ctx) {
        this.scopeTree.put(ctx, scope);
        visitChildren(ctx.leftExpression);
        visitChildren(ctx.rightExpression);
        return Type.BOOL;
    }

    @Override
    public Object visitEqualExpressions(JavaBlyatParser.EqualExpressionsContext ctx) {
        this.scopeTree.put(ctx, scope);
        visitChildren(ctx.leftExpression);
        visitChildren(ctx.rightExpression);
        return Type.BOOL;
    }

    @Override
    public Object visitOrAndandExpressions(JavaBlyatParser.OrAndandExpressionsContext ctx) {
        this.scopeTree.put(ctx, scope);
        visitChildren(ctx.leftExpression);
        visitChildren(ctx.rightExpression);
        return super.visitOrAndandExpressions(ctx);
    }

    @Override
    public Object visitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx) {
        this.scopeTree.put(ctx, scope);
        visitChildren(ctx);
        return Type.INT;
    }

    @Override
    public Object visitLiteralExpression(JavaBlyatParser.LiteralExpressionContext ctx) {
        scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        if (ctx.calc_expression() != null) {
            return visit(ctx.calc_expression());
        }
        return visit(ctx.expression());
    }

    @Override
    public Object visitLiteralExpr(JavaBlyatParser.LiteralExprContext ctx) {
        scopeTree.put(ctx, scope);
        return super.visitLiteralExpr(ctx);
    }

    @Override
    public Object visitLiteralString(JavaBlyatParser.LiteralStringContext ctx) {
        this.scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        return Type.STRING;
    }

    @Override
    public Object visitLiteralInt(JavaBlyatParser.LiteralIntContext ctx) {
        this.scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        return Type.INT;
    }

    @Override
    public Object visitLiteralBoolean(JavaBlyatParser.LiteralBooleanContext ctx) {
        this.scopeTree.put(ctx, scope);
        this.scope.increaseStack();
        return Type.BOOL;
    }

    @Override
    public Object visitLiteralId(JavaBlyatParser.LiteralIdContext ctx) {
        this.scopeTree.put(ctx, scope);
        Symbol symbol = this.scope.searchVariable(ctx.ID().getText());
        if(symbol != null){
            return symbol.getType();
        }
        throw new RuntimeException("Variable " + ctx.ID().getText() + " does not exist in the current scope!");
    }

    public ParseTreeProperty getScopeTree() {
        return scopeTree;
    }

    public ParseTreeProperty getVariableTree() {
        return variableTree;
    }


    public Scope getScope() {
        return scope;
    }
}
