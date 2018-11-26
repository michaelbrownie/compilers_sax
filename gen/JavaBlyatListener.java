// Generated from C:/Users/KYLIAN/Documents/compilers_sax\JavaBlyat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaBlyatParser}.
 */
public interface JavaBlyatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#programma}.
	 * @param ctx the parse tree
	 */
	void enterProgramma(JavaBlyatParser.ProgrammaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#programma}.
	 * @param ctx the parse tree
	 */
	void exitProgramma(JavaBlyatParser.ProgrammaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaBlyatParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaBlyatParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(JavaBlyatParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(JavaBlyatParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(JavaBlyatParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(JavaBlyatParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(JavaBlyatParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(JavaBlyatParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#new_variable}.
	 * @param ctx the parse tree
	 */
	void enterNew_variable(JavaBlyatParser.New_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#new_variable}.
	 * @param ctx the parse tree
	 */
	void exitNew_variable(JavaBlyatParser.New_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#new_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNew_variable_declaration(JavaBlyatParser.New_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#new_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNew_variable_declaration(JavaBlyatParser.New_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#change_variable}.
	 * @param ctx the parse tree
	 */
	void enterChange_variable(JavaBlyatParser.Change_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#change_variable}.
	 * @param ctx the parse tree
	 */
	void exitChange_variable(JavaBlyatParser.Change_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(JavaBlyatParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(JavaBlyatParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(JavaBlyatParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(JavaBlyatParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printString}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintString(JavaBlyatParser.PrintStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link JavaBlyatParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintString(JavaBlyatParser.PrintStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JavaBlyatParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JavaBlyatParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(JavaBlyatParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(JavaBlyatParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#function_argument_types}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_types(JavaBlyatParser.Function_argument_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#function_argument_types}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_types(JavaBlyatParser.Function_argument_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#function_statement_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement_block(JavaBlyatParser.Function_statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#function_statement_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement_block(JavaBlyatParser.Function_statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(JavaBlyatParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(JavaBlyatParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBlyatParser#call_function_argument}.
	 * @param ctx the parse tree
	 */
	void enterCall_function_argument(JavaBlyatParser.Call_function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBlyatParser#call_function_argument}.
	 * @param ctx the parse tree
	 */
	void exitCall_function_argument(JavaBlyatParser.Call_function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link JavaBlyatParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(JavaBlyatParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementBlock}
	 * labeled alternative in {@link JavaBlyatParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(JavaBlyatParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpressions(JavaBlyatParser.CompareExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpressions(JavaBlyatParser.CompareExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(JavaBlyatParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(JavaBlyatParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(JavaBlyatParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(JavaBlyatParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpressions(JavaBlyatParser.EqualExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpressions(JavaBlyatParser.EqualExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orAndandExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrAndandExpressions(JavaBlyatParser.OrAndandExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orAndandExpressions}
	 * labeled alternative in {@link JavaBlyatParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrAndandExpressions(JavaBlyatParser.OrAndandExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalValueExp}
	 * labeled alternative in {@link JavaBlyatParser#calc_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValueExp(JavaBlyatParser.LiteralValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalValueExp}
	 * labeled alternative in {@link JavaBlyatParser#calc_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValueExp(JavaBlyatParser.LiteralValueExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calcValueExpression}
	 * labeled alternative in {@link JavaBlyatParser#calc_expression}.
	 * @param ctx the parse tree
	 */
	void enterCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calcValueExpression}
	 * labeled alternative in {@link JavaBlyatParser#calc_expression}.
	 * @param ctx the parse tree
	 */
	void exitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(JavaBlyatParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(JavaBlyatParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralString(JavaBlyatParser.LiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralString(JavaBlyatParser.LiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralInt(JavaBlyatParser.LiteralIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalInt}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralInt(JavaBlyatParser.LiteralIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalBoolean}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBoolean(JavaBlyatParser.LiteralBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalBoolean}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBoolean(JavaBlyatParser.LiteralBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalId}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralId(JavaBlyatParser.LiteralIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalId}
	 * labeled alternative in {@link JavaBlyatParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralId(JavaBlyatParser.LiteralIdContext ctx);
}