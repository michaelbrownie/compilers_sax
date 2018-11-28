import models.Type;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

public class TypeChecker extends JavaBlyatBaseVisitor {

    public TypeChecker() {

    }

    @Override
    public Object visitProgramma(JavaBlyatParser.ProgrammaContext ctx) {
        return super.visitProgramma(ctx);
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
        Type type = Type.getType(ctx.DATATYPES().getText());

        return super.visitNew_variable(ctx);
    }

    @Override
    public Object visitNew_variable_declaration(JavaBlyatParser.New_variable_declarationContext ctx) {
        return super.visitNew_variable_declaration(ctx);
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
    public Object visitFunction(JavaBlyatParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public Object visitFunction_argument(JavaBlyatParser.Function_argumentContext ctx) {
        return super.visitFunction_argument(ctx);
    }

    @Override
    public Object visitFunction_argument_types(JavaBlyatParser.Function_argument_typesContext ctx) {
        return super.visitFunction_argument_types(ctx);
    }

    @Override
    public Object visitFunction_statement_block(JavaBlyatParser.Function_statement_blockContext ctx) {
        return super.visitFunction_statement_block(ctx);
    }

    @Override
    public Object visitCall_function(JavaBlyatParser.Call_functionContext ctx) {
        return super.visitCall_function(ctx);
    }

    @Override
    public Object visitCall_function_argument(JavaBlyatParser.Call_function_argumentContext ctx) {
        return super.visitCall_function_argument(ctx);
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

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }
}
