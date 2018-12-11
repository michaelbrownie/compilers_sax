import models.Scope;
import models.Symbol;
import models.Type;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ScopeChecker extends JavaBlyatBaseVisitor {


    private ParseTreeProperty scopeTree;
    private ParseTreeProperty variableTree;

    private Scope scope;

    private int scope_count_method = 0;


    public ScopeChecker() {
        this.scopeTree = new ParseTreeProperty();
        this.variableTree = new ParseTreeProperty();

        this.scope = new Scope(null, "method_" + scope_count_method);
    }

    @Override
    public Object visitProgram(JavaBlyatParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitStatement(JavaBlyatParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitIf_statement(JavaBlyatParser.If_statementContext ctx) {
        return super.visitIf_statement(ctx);
    }

    @Override
    public Object visitElseif_block(JavaBlyatParser.Elseif_blockContext ctx) {
        return super.visitElseif_block(ctx);
    }

    @Override
    public Object visitElse_block(JavaBlyatParser.Else_blockContext ctx) {
        return super.visitElse_block(ctx);
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
        return super.visitChange_variable(ctx);
    }

    @Override
    public Object visitWhile_loop(JavaBlyatParser.While_loopContext ctx) {
        return super.visitWhile_loop(ctx);
    }

    @Override
    public Object visitPrintId(JavaBlyatParser.PrintIdContext ctx) {
        return super.visitPrintId(ctx);
    }

    @Override
    public Object visitPrintString(JavaBlyatParser.PrintStringContext ctx) {
        return super.visitPrintString(ctx);
    }

    @Override
    public Object visitPrintCalcExpression(JavaBlyatParser.PrintCalcExpressionContext ctx) {
        return super.visitPrintCalcExpression(ctx);
    }

    @Override
    public Object visitStatementBlock(JavaBlyatParser.StatementBlockContext ctx) {
        return super.visitStatementBlock(ctx);
    }

    @Override
    public Object visitCompareExpressions(JavaBlyatParser.CompareExpressionsContext ctx) {
        return super.visitCompareExpressions(ctx);
    }

    @Override
    public Object visitLiteralExpr(JavaBlyatParser.LiteralExprContext ctx) {
        return super.visitLiteralExpr(ctx);
    }

    @Override
    public Object visitNotExpression(JavaBlyatParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Object visitEqualExpressions(JavaBlyatParser.EqualExpressionsContext ctx) {
        return super.visitEqualExpressions(ctx);
    }

    @Override
    public Object visitOrAndandExpressions(JavaBlyatParser.OrAndandExpressionsContext ctx) {
        return super.visitOrAndandExpressions(ctx);
    }

    @Override
    public Object visitLiteralValueExp(JavaBlyatParser.LiteralValueExpContext ctx) {
        return super.visitLiteralValueExp(ctx);
    }

    @Override
    public Object visitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx) {
        return super.visitCalcValueExpression(ctx);
    }

    @Override
    public Object visitLiteralExpression(JavaBlyatParser.LiteralExpressionContext ctx) {
        return super.visitLiteralExpression(ctx);
    }

    @Override
    public Object visitLiteralString(JavaBlyatParser.LiteralStringContext ctx) {
        return super.visitLiteralString(ctx);
    }

    @Override
    public Object visitLiteralInt(JavaBlyatParser.LiteralIntContext ctx) {
        return super.visitLiteralInt(ctx);
    }

    @Override
    public Object visitLiteralBoolean(JavaBlyatParser.LiteralBooleanContext ctx) {
        return super.visitLiteralBoolean(ctx);
    }

    @Override
    public Object visitLiteralId(JavaBlyatParser.LiteralIdContext ctx) {
        return super.visitLiteralId(ctx);
    }
}
