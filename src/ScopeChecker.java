import models.Scope;
import models.Symbol;
import models.Type;
import models.Value;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ScopeChecker extends JavaBlyatBaseVisitor {


    private ParseTreeProperty scopeTree;
    private ParseTreeProperty variableTree;
    private ParseTreeProperty valueExpressionTree;

    private Scope scope;

    private int scope_count_method = 0;
    private int count_if_blocks_name = 0;
    private int count_else_if_blocks_name = 0;
    private int count_else_blocks_name = 0;
    private int count_while_blocks_name = 0;


    public ScopeChecker() {
        this.scopeTree = new ParseTreeProperty();
        this.variableTree = new ParseTreeProperty();
        this.valueExpressionTree = new ParseTreeProperty();

        this.scope = new Scope("method_" + scope_count_method);
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
            this.scopeTree.put(ctx, this.scope);
            visit(ctx.elseif_block(i));
            this.scope = this.scope.closeChildScope();
        }
        //Else block
        if(ctx.else_block() != null){
            count_else_blocks_name++;
            Scope scopeElse = this.scope.createChildScope("else_" + this.count_else_blocks_name);
            this.scope = scopeElse;
            this.scope.getParent().addChild(this.scope);
            this.scopeTree.put(ctx, this.scope);
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
            return Type.BOOL;
        }
        throw new RuntimeException("One elseifblyat statement in a ifblyat statement on rule: " + ctx.getStart().getLine() + " is not a comparison or a boolean.");
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
        if(scope.addVariableToScope(symbol)){
            this.variableTree.put(ctx,symbol);
            this.scope.setPosOnSymbol(symbol);
            return super.visitNew_variable_declaration(ctx);
        }
        throw new RuntimeException("Variable " + ctx.ID().getText() + " is already assigned!");
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
        Scope scope = this.scope.createChildScope("while_" + this.count_while_blocks_name);
        this.scope = scope;
        this.scope.getParent().addChild(this.scope);
        this.scopeTree.put(ctx, this.scope);
        if(visit(ctx.expression()) == Type.BOOL){
            visit(ctx.statement_block());
            this.scope = this.scope.closeChildScope();
            return null;
        }
        throw new RuntimeException("Whileblyat loop does not contain a comparison or a boolean.");
    }

    @Override
    public Object visitPrintId(JavaBlyatParser.PrintIdContext ctx) {
        Symbol symbol = this.scope.searchVariable(ctx.ID().getText());
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
    public Object visitCompareExpressions(JavaBlyatParser.CompareExpressionsContext ctx) {
        this.scopeTree.put(ctx, scope);
        Type left = (Type) visit(ctx.leftExpression);
        Type right = (Type) visit(ctx.rightExpression);
        if(this.compare(left, right)){
            return Type.BOOL;
        }
        throw new RuntimeException("You can't compare an " + left.toString() + " with " + right.toString());
    }

    @Override
    public Object visitNotExpression(JavaBlyatParser.NotExpressionContext ctx) {
        this.scopeTree.put(ctx, scope);
        return super.visitNotExpression(ctx);
    }

    @Override
    public Object visitEqualExpressions(JavaBlyatParser.EqualExpressionsContext ctx) {
        this.scopeTree.put(ctx, scope);
        Type left = (Type) visit(ctx.leftExpression);
        Type right = (Type) visit(ctx.rightExpression);
        if(this.compare(left, right)){
            return Type.BOOL;
        }
        throw new RuntimeException("You can't compare an " + left.toString() + " with " + right.toString());
    }

    private boolean compare(Type left, Type right){
        if(left == Type.INT && right == Type.INT || left == Type.BOOL && right == Type.BOOL){
            return true;
        }
        return false;
    }

    @Override
    public Object visitOrAndandExpressions(JavaBlyatParser.OrAndandExpressionsContext ctx) {
        this.scopeTree.put(ctx, scope);
        return super.visitOrAndandExpressions(ctx);
    }

    @Override
    public Object visitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx) {
        this.scopeTree.put(ctx, scope);
        if(ctx.operator.getText().equals("+") || ctx.operator.getText().equals("-") || ctx.operator.getText().equals("*") || ctx.operator.getText().equals("/")){
            if (visit(ctx.leftExpression) == Type.INT && visit(ctx.rightExpression) == Type.INT) {
                Value v = new Value(Type.INT);
                this.valueExpressionTree.put(ctx, v);
                return Type.INT;
            }
        }
        return null;
    }

    @Override
    public Object visitLiteralExpression(JavaBlyatParser.LiteralExpressionContext ctx) {
        scopeTree.put(ctx, scope);
        if (ctx.calc_expression() != null) {
            return visit(ctx.calc_expression());
        }
        return super.visitLiteralExpression(ctx);
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
        Symbol symbol = this.scope.searchVariable(ctx.ID().getText());
        this.scopeTree.put(ctx, scope);
        if(symbol != null){
            return symbol.getType();
        }
        throw new RuntimeException("Variable " + ctx.ID().getText() + " does not exist in the current scope!");
    }
}
