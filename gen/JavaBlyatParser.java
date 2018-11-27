// Generated from C:/Users/KYLIAN/Documents/compilers_sax\JavaBlyat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaBlyatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		PLUS=10, MIN=11, KEER=12, GEDEELD=13, EQUAL=14, NOTEQUAL=15, SMALLERTHAN=16, 
		BIGGERTHAN=17, SMALLERTHANEQUAL=18, BIGGERTHANEQUAL=19, OR=20, AND=21, 
		NOT=22, PARENTHESESLEFT=23, PARENTHESESRIGHT=24, RETURN=25, SEMICOLON=26, 
		IS=27, DATATYPES=28, STRING=29, INT=30, BOOLEAN=31, ID=32, WS=33;
	public static final int
		RULE_programma = 0, RULE_statement = 1, RULE_if_statement = 2, RULE_elseif_block = 3, 
		RULE_else_block = 4, RULE_new_variable = 5, RULE_new_variable_declaration = 6, 
		RULE_change_variable = 7, RULE_while_loop = 8, RULE_print = 9, RULE_function = 10, 
		RULE_function_argument = 11, RULE_function_argument_types = 12, RULE_function_statement_block = 13, 
		RULE_call_function = 14, RULE_call_function_argument = 15, RULE_statement_block = 16, 
		RULE_expression = 17, RULE_calc_expression = 18, RULE_literal = 19;
	public static final String[] ruleNames = {
		"programma", "statement", "if_statement", "elseif_block", "else_block", 
		"new_variable", "new_variable_declaration", "change_variable", "while_loop", 
		"print", "function", "function_argument", "function_argument_types", "function_statement_block", 
		"call_function", "call_function_argument", "statement_block", "expression", 
		"calc_expression", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ifblyat'", "'elseifblyat'", "'elseblyat'", "'whileblyat'", "'cyka.blyat('", 
		"'functionblyat'", "','", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'=='", 
		"'!='", "'<'", "'>'", "'<='", "'>='", "'||'", "'&&'", "'!'", "'('", "')'", 
		"'returnblyat'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "PLUS", "MIN", 
		"KEER", "GEDEELD", "EQUAL", "NOTEQUAL", "SMALLERTHAN", "BIGGERTHAN", "SMALLERTHANEQUAL", 
		"BIGGERTHANEQUAL", "OR", "AND", "NOT", "PARENTHESESLEFT", "PARENTHESESRIGHT", 
		"RETURN", "SEMICOLON", "IS", "DATATYPES", "STRING", "INT", "BOOLEAN", 
		"ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaBlyat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaBlyatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaBlyatParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgrammaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programma; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitProgramma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammaContext programma() throws RecognitionException {
		ProgrammaContext _localctx = new ProgrammaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programma);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					function();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					statement();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATATYPES) {
				{
				{
				setState(52);
				function();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public New_variableContext new_variable() {
			return getRuleContext(New_variableContext.class,0);
		}
		public New_variable_declarationContext new_variable_declaration() {
			return getRuleContext(New_variable_declarationContext.class,0);
		}
		public Change_variableContext change_variable() {
			return getRuleContext(Change_variableContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				new_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				new_variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				change_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				call_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public ExpressionContext expr;
		public Statement_blockContext statementBlock;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			match(PARENTHESESLEFT);
			setState(71);
			((If_statementContext)_localctx).expr = expression(0);
			setState(72);
			match(PARENTHESESRIGHT);
			setState(73);
			((If_statementContext)_localctx).statementBlock = statement_block();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(74);
				elseif_block();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(80);
				else_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public ExpressionContext expr;
		public Statement_blockContext statementBlock;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseif_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__1);
			setState(84);
			match(PARENTHESESLEFT);
			setState(85);
			((Elseif_blockContext)_localctx).expr = expression(0);
			setState(86);
			match(PARENTHESESRIGHT);
			setState(87);
			((Elseif_blockContext)_localctx).statementBlock = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public Statement_blockContext statementBlock;
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__2);
			setState(90);
			((Else_blockContext)_localctx).statementBlock = statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_variableContext extends ParserRuleContext {
		public Calc_expressionContext expr;
		public TerminalNode DATATYPES() { return getToken(JavaBlyatParser.DATATYPES, 0); }
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public TerminalNode IS() { return getToken(JavaBlyatParser.IS, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public Calc_expressionContext calc_expression() {
			return getRuleContext(Calc_expressionContext.class,0);
		}
		public New_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitNew_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_variableContext new_variable() throws RecognitionException {
		New_variableContext _localctx = new New_variableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_new_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(DATATYPES);
			setState(93);
			match(ID);
			setState(94);
			match(IS);
			setState(95);
			((New_variableContext)_localctx).expr = calc_expression(0);
			setState(96);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_variable_declarationContext extends ParserRuleContext {
		public TerminalNode DATATYPES() { return getToken(JavaBlyatParser.DATATYPES, 0); }
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public New_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_variable_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitNew_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_variable_declarationContext new_variable_declaration() throws RecognitionException {
		New_variable_declarationContext _localctx = new New_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_new_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DATATYPES);
			setState(99);
			match(ID);
			setState(100);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_variableContext extends ParserRuleContext {
		public Token id;
		public Calc_expressionContext expr;
		public TerminalNode IS() { return getToken(JavaBlyatParser.IS, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public Calc_expressionContext calc_expression() {
			return getRuleContext(Calc_expressionContext.class,0);
		}
		public Change_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitChange_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Change_variableContext change_variable() throws RecognitionException {
		Change_variableContext _localctx = new Change_variableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_change_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((Change_variableContext)_localctx).id = match(ID);
			setState(103);
			match(IS);
			setState(104);
			((Change_variableContext)_localctx).expr = calc_expression(0);
			setState(105);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__3);
			setState(108);
			match(PARENTHESESLEFT);
			setState(109);
			expression(0);
			setState(110);
			match(PARENTHESESRIGHT);
			setState(111);
			statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintCalcExpressionContext extends PrintContext {
		public Calc_expressionContext calc_expression() {
			return getRuleContext(Calc_expressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public PrintCalcExpressionContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitPrintCalcExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIdContext extends PrintContext {
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public PrintIdContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringContext extends PrintContext {
		public TerminalNode STRING() { return getToken(JavaBlyatParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public PrintStringContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__4);
				setState(114);
				match(ID);
				setState(115);
				match(PARENTHESESRIGHT);
				setState(116);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__4);
				setState(118);
				match(STRING);
				setState(119);
				match(PARENTHESESRIGHT);
				setState(120);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new PrintCalcExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(T__4);
				setState(122);
				calc_expression(0);
				setState(123);
				match(PARENTHESESRIGHT);
				setState(124);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DATATYPES() { return getToken(JavaBlyatParser.DATATYPES, 0); }
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public TerminalNode PARENTHESESLEFT() { return getToken(JavaBlyatParser.PARENTHESESLEFT, 0); }
		public TerminalNode PARENTHESESRIGHT() { return getToken(JavaBlyatParser.PARENTHESESRIGHT, 0); }
		public Function_statement_blockContext function_statement_block() {
			return getRuleContext(Function_statement_blockContext.class,0);
		}
		public Function_argumentContext function_argument() {
			return getRuleContext(Function_argumentContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(DATATYPES);
			setState(129);
			match(T__5);
			setState(130);
			match(ID);
			setState(131);
			match(PARENTHESESLEFT);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATATYPES) {
				{
				setState(132);
				function_argument();
				}
			}

			setState(135);
			match(PARENTHESESRIGHT);
			setState(136);
			function_statement_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argumentContext extends ParserRuleContext {
		public List<TerminalNode> DATATYPES() { return getTokens(JavaBlyatParser.DATATYPES); }
		public TerminalNode DATATYPES(int i) {
			return getToken(JavaBlyatParser.DATATYPES, i);
		}
		public List<Function_argument_typesContext> function_argument_types() {
			return getRuleContexts(Function_argument_typesContext.class);
		}
		public Function_argument_typesContext function_argument_types(int i) {
			return getRuleContext(Function_argument_typesContext.class,i);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					match(DATATYPES);
					setState(139);
					function_argument_types();
					setState(140);
					match(T__6);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(147);
			match(DATATYPES);
			setState(148);
			function_argument_types();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argument_typesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JavaBlyatParser.STRING, 0); }
		public TerminalNode INT() { return getToken(JavaBlyatParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaBlyatParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public Function_argument_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitFunction_argument_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argument_typesContext function_argument_types() throws RecognitionException {
		Function_argument_typesContext _localctx = new Function_argument_typesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_argument_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_statement_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(JavaBlyatParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public Function_statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitFunction_statement_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_statement_blockContext function_statement_block() throws RecognitionException {
		Function_statement_blockContext _localctx = new Function_statement_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__7);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << DATATYPES) | (1L << ID))) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(159);
				match(RETURN);
				setState(160);
				match(ID);
				setState(161);
				match(SEMICOLON);
				}
			}

			setState(164);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public TerminalNode PARENTHESESLEFT() { return getToken(JavaBlyatParser.PARENTHESESLEFT, 0); }
		public TerminalNode PARENTHESESRIGHT() { return getToken(JavaBlyatParser.PARENTHESESRIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public Call_function_argumentContext call_function_argument() {
			return getRuleContext(Call_function_argumentContext.class,0);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(PARENTHESESLEFT);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(168);
				call_function_argument();
				}
			}

			setState(171);
			match(PARENTHESESRIGHT);
			setState(172);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_function_argumentContext extends ParserRuleContext {
		public List<Function_argument_typesContext> function_argument_types() {
			return getRuleContexts(Function_argument_typesContext.class);
		}
		public Function_argument_typesContext function_argument_types(int i) {
			return getRuleContext(Function_argument_typesContext.class,i);
		}
		public Call_function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitCall_function_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_function_argumentContext call_function_argument() throws RecognitionException {
		Call_function_argumentContext _localctx = new Call_function_argumentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call_function_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					function_argument_types();
					setState(175);
					match(T__6);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(182);
			function_argument_types();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_blockContext extends ParserRuleContext {
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
	 
		public Statement_blockContext() { }
		public void copyFrom(Statement_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementBlockContext extends Statement_blockContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(Statement_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement_block);
		int _la;
		try {
			_localctx = new StatementBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__7);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << DATATYPES) | (1L << ID))) != 0)) {
				{
				{
				setState(185);
				statement();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompareExpressionsContext extends ExpressionContext {
		public ExpressionContext leftExpression;
		public ExpressionContext rightExpression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SMALLERTHAN() { return getToken(JavaBlyatParser.SMALLERTHAN, 0); }
		public TerminalNode BIGGERTHAN() { return getToken(JavaBlyatParser.BIGGERTHAN, 0); }
		public TerminalNode SMALLERTHANEQUAL() { return getToken(JavaBlyatParser.SMALLERTHANEQUAL, 0); }
		public TerminalNode BIGGERTHANEQUAL() { return getToken(JavaBlyatParser.BIGGERTHANEQUAL, 0); }
		public CompareExpressionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitCompareExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext rightExpression;
		public TerminalNode NOT() { return getToken(JavaBlyatParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualExpressionsContext extends ExpressionContext {
		public ExpressionContext leftExpression;
		public ExpressionContext rightExpression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(JavaBlyatParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(JavaBlyatParser.NOTEQUAL, 0); }
		public EqualExpressionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitEqualExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrAndandExpressionsContext extends ExpressionContext {
		public ExpressionContext leftExpression;
		public ExpressionContext rightExpression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(JavaBlyatParser.OR, 0); }
		public TerminalNode AND() { return getToken(JavaBlyatParser.AND, 0); }
		public OrAndandExpressionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitOrAndandExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				match(NOT);
				setState(195);
				((NotExpressionContext)_localctx).rightExpression = expression(2);
				}
				break;
			case PARENTHESESLEFT:
			case STRING:
			case INT:
			case BOOLEAN:
			case ID:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((EqualExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						((EqualExpressionsContext)_localctx).rightExpression = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new CompareExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALLERTHAN) | (1L << BIGGERTHAN) | (1L << SMALLERTHANEQUAL) | (1L << BIGGERTHANEQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						((CompareExpressionsContext)_localctx).rightExpression = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new OrAndandExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((OrAndandExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						((OrAndandExpressionsContext)_localctx).rightExpression = expression(4);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Calc_expressionContext extends ParserRuleContext {
		public Calc_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_expression; }
	 
		public Calc_expressionContext() { }
		public void copyFrom(Calc_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralValueExpContext extends Calc_expressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralValueExpContext(Calc_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitLiteralValueExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalcValueExpressionContext extends Calc_expressionContext {
		public Calc_expressionContext leftExpression;
		public Token operator;
		public Calc_expressionContext rightExpression;
		public List<Calc_expressionContext> calc_expression() {
			return getRuleContexts(Calc_expressionContext.class);
		}
		public Calc_expressionContext calc_expression(int i) {
			return getRuleContext(Calc_expressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JavaBlyatParser.PLUS, 0); }
		public TerminalNode MIN() { return getToken(JavaBlyatParser.MIN, 0); }
		public TerminalNode KEER() { return getToken(JavaBlyatParser.KEER, 0); }
		public TerminalNode GEDEELD() { return getToken(JavaBlyatParser.GEDEELD, 0); }
		public CalcValueExpressionContext(Calc_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitCalcValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Calc_expressionContext calc_expression() throws RecognitionException {
		return calc_expression(0);
	}

	private Calc_expressionContext calc_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Calc_expressionContext _localctx = new Calc_expressionContext(_ctx, _parentState);
		Calc_expressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_calc_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralValueExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(214);
			literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalcValueExpressionContext(new Calc_expressionContext(_parentctx, _parentState));
					((CalcValueExpressionContext)_localctx).leftExpression = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_calc_expression);
					setState(216);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(217);
					((CalcValueExpressionContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MIN) | (1L << KEER) | (1L << GEDEELD))) != 0)) ) {
						((CalcValueExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(218);
					((CalcValueExpressionContext)_localctx).rightExpression = calc_expression(3);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralIdContext extends LiteralContext {
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public LiteralIdContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitLiteralId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralStringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(JavaBlyatParser.STRING, 0); }
		public LiteralStringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBooleanContext extends LiteralContext {
		public TerminalNode BOOLEAN() { return getToken(JavaBlyatParser.BOOLEAN, 0); }
		public LiteralBooleanContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitLiteralBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends LiteralContext {
		public TerminalNode PARENTHESESLEFT() { return getToken(JavaBlyatParser.PARENTHESESLEFT, 0); }
		public TerminalNode PARENTHESESRIGHT() { return getToken(JavaBlyatParser.PARENTHESESRIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Calc_expressionContext calc_expression() {
			return getRuleContext(Calc_expressionContext.class,0);
		}
		public LiteralExpressionContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralIntContext extends LiteralContext {
		public TerminalNode INT() { return getToken(JavaBlyatParser.INT, 0); }
		public LiteralIntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitLiteralInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTHESESLEFT:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(PARENTHESESLEFT);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(225);
					expression(0);
					}
					break;
				case 2:
					{
					setState(226);
					calc_expression(0);
					}
					break;
				}
				setState(229);
				match(PARENTHESESRIGHT);
				}
				break;
			case STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new LiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new LiteralIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return calc_expression_sempred((Calc_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean calc_expression_sempred(Calc_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13"+
		"\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7"+
		"\r\u0091\n\r\f\r\16\r\u0094\13\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\7\17"+
		"\u009d\n\17\f\17\16\17\u00a0\13\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u00ac\n\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u00b4\n\21\f\21\16\21\u00b7\13\21\3\21\3\21\3\22\3\22\7\22\u00bd\n\22"+
		"\f\22\16\22\u00c0\13\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c8\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d3\n\23\f\23\16"+
		"\23\u00d6\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00de\n\24\f\24\16"+
		"\24\u00e1\13\24\3\25\3\25\3\25\5\25\u00e6\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00ee\n\25\3\25\2\4$&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\7\3\2\37\"\3\2\20\21\3\2\22\25\3\2\26\27\3\2\f\17\2\u00f9"+
		"\2-\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bU\3\2\2\2\n[\3\2\2\2\f^\3\2\2\2\16"+
		"d\3\2\2\2\20h\3\2\2\2\22m\3\2\2\2\24\u0080\3\2\2\2\26\u0082\3\2\2\2\30"+
		"\u0092\3\2\2\2\32\u0098\3\2\2\2\34\u009a\3\2\2\2\36\u00a8\3\2\2\2 \u00b5"+
		"\3\2\2\2\"\u00ba\3\2\2\2$\u00c7\3\2\2\2&\u00d7\3\2\2\2(\u00ed\3\2\2\2"+
		"*,\5\26\f\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2"+
		"\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5\26\f\2\67\66\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\2\2\3=\3\3\2\2\2>F\5\6\4\2"+
		"?F\5\f\7\2@F\5\16\b\2AF\5\20\t\2BF\5\22\n\2CF\5\24\13\2DF\5\36\20\2E>"+
		"\3\2\2\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F"+
		"\5\3\2\2\2GH\7\3\2\2HI\7\31\2\2IJ\5$\23\2JK\7\32\2\2KO\5\"\22\2LN\5\b"+
		"\5\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2QO\3\2\2\2RT\5\n"+
		"\6\2SR\3\2\2\2ST\3\2\2\2T\7\3\2\2\2UV\7\4\2\2VW\7\31\2\2WX\5$\23\2XY\7"+
		"\32\2\2YZ\5\"\22\2Z\t\3\2\2\2[\\\7\5\2\2\\]\5\"\22\2]\13\3\2\2\2^_\7\36"+
		"\2\2_`\7\"\2\2`a\7\35\2\2ab\5&\24\2bc\7\34\2\2c\r\3\2\2\2de\7\36\2\2e"+
		"f\7\"\2\2fg\7\34\2\2g\17\3\2\2\2hi\7\"\2\2ij\7\35\2\2jk\5&\24\2kl\7\34"+
		"\2\2l\21\3\2\2\2mn\7\6\2\2no\7\31\2\2op\5$\23\2pq\7\32\2\2qr\5\"\22\2"+
		"r\23\3\2\2\2st\7\7\2\2tu\7\"\2\2uv\7\32\2\2v\u0081\7\34\2\2wx\7\7\2\2"+
		"xy\7\37\2\2yz\7\32\2\2z\u0081\7\34\2\2{|\7\7\2\2|}\5&\24\2}~\7\32\2\2"+
		"~\177\7\34\2\2\177\u0081\3\2\2\2\u0080s\3\2\2\2\u0080w\3\2\2\2\u0080{"+
		"\3\2\2\2\u0081\25\3\2\2\2\u0082\u0083\7\36\2\2\u0083\u0084\7\b\2\2\u0084"+
		"\u0085\7\"\2\2\u0085\u0087\7\31\2\2\u0086\u0088\5\30\r\2\u0087\u0086\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\32\2\2\u008a"+
		"\u008b\5\34\17\2\u008b\27\3\2\2\2\u008c\u008d\7\36\2\2\u008d\u008e\5\32"+
		"\16\2\u008e\u008f\7\t\2\2\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\36\2\2\u0096\u0097\5\32\16\2\u0097"+
		"\31\3\2\2\2\u0098\u0099\t\2\2\2\u0099\33\3\2\2\2\u009a\u009e\7\n\2\2\u009b"+
		"\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a4\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\33\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a5\7\34\2\2\u00a4\u00a1\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\13\2\2\u00a7"+
		"\35\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00ab\7\31\2\2\u00aa\u00ac\5 \21"+
		"\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\7\32\2\2\u00ae\u00af\7\34\2\2\u00af\37\3\2\2\2\u00b0\u00b1\5\32\16\2"+
		"\u00b1\u00b2\7\t\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00b9\5\32\16\2\u00b9!\3\2\2\2\u00ba\u00be\7\n\2"+
		"\2\u00bb\u00bd\5\4\3\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7\13\2\2\u00c2#\3\2\2\2\u00c3\u00c4\b\23\1\2\u00c4\u00c5\7\30\2"+
		"\2\u00c5\u00c8\5$\23\4\u00c6\u00c8\5(\25\2\u00c7\u00c3\3\2\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00d4\3\2\2\2\u00c9\u00ca\f\7\2\2\u00ca\u00cb\t\3\2\2\u00cb"+
		"\u00d3\5$\23\b\u00cc\u00cd\f\6\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00d3\5$"+
		"\23\7\u00cf\u00d0\f\5\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00d3\5$\23\6\u00d2"+
		"\u00c9\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5%\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00d8\b\24\1\2\u00d8\u00d9\5(\25\2\u00d9\u00df\3\2\2\2"+
		"\u00da\u00db\f\4\2\2\u00db\u00dc\t\6\2\2\u00dc\u00de\5&\24\5\u00dd\u00da"+
		"\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\'\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\7\31\2\2\u00e3\u00e6\5$\23"+
		"\2\u00e4\u00e6\5&\24\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00e8\7\32\2\2\u00e8\u00ee\3\2\2\2\u00e9\u00ee\7\37\2\2"+
		"\u00ea\u00ee\7 \2\2\u00eb\u00ee\7!\2\2\u00ec\u00ee\7\"\2\2\u00ed\u00e2"+
		"\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee)\3\2\2\2\26-\639EOS\u0080\u0087\u0092\u009e\u00a4"+
		"\u00ab\u00b5\u00be\u00c7\u00d2\u00d4\u00df\u00e5\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}