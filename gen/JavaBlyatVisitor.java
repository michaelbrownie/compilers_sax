// Generated from C:/Users/KYLIAN/Documents/compilers_sax\JavaBlyat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaBlyatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaBlyatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaBlyatParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaBlyatParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(JavaBlyatParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(JavaBlyatParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(JavaBlyatParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#new_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_variable(JavaBlyatParser.New_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#new_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_variable_declaration(JavaBlyatParser.New_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#change_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_variable(JavaBlyatParser.Change_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaBlyatParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(JavaBlyatParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(JavaBlyatParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(JavaBlyatParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printCalcExpression}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCalcExpression(JavaBlyatParser.PrintCalcExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(JavaBlyatParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link JavaBlyatParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(JavaBlyatParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpressions(JavaBlyatParser.CompareExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(JavaBlyatParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpressions(JavaBlyatParser.EqualExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orAndandExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAndandExpressions(JavaBlyatParser.OrAndandExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusplusAndminminExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusplusAndminminExpressions(JavaBlyatParser.PlusplusAndminminExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalValueExp}
	 * labeled alternative in {@link JavaBlyatParser#calc_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValueExp(JavaBlyatParser.LiteralValueExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calcValueExpression}
	 * labeled alternative in {@link JavaBlyatParser#calc_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(JavaBlyatParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralString(JavaBlyatParser.LiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralInt(JavaBlyatParser.LiteralIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalBoolean}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBoolean(JavaBlyatParser.LiteralBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalId}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralId(JavaBlyatParser.LiteralIdContext ctx);
}