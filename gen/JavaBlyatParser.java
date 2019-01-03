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
		PLUS=10, MINUS=11, TIMES=12, DIVIDE=13, EQUAL=14, NOTEQUAL=15, SMALLERTHAN=16, 
		BIGGERTHAN=17, SMALLERTHANEQUAL=18, BIGGERTHANEQUAL=19, OR=20, AND=21, 
		NOT=22, PARENTHESESLEFT=23, PARENTHESESRIGHT=24, RETURN=25, SEMICOLON=26, 
		IS=27, DATATYPES=28, STRING=29, INT=30, BOOLEAN=31, ID=32, WS=33, COMMENT=34;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_if_statement = 2, RULE_elseif_block = 3, 
		RULE_else_block = 4, RULE_new_variable = 5, RULE_new_variable_declaration = 6, 
		RULE_change_variable = 7, RULE_while_loop = 8, RULE_print = 9, RULE_statement_block = 10, 
		RULE_expression = 11, RULE_calc_expression = 12, RULE_literal = 13;
	public static final String[] ruleNames = {
		"program", "statement", "if_statement", "elseif_block", "else_block", 
		"new_variable", "new_variable_declaration", "change_variable", "while_loop", 
		"print", "statement_block", "expression", "calc_expression", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ifblyat'", "'elseifblyat'", "'elseblyat'", "'whileblyat'", "'cyka.blyat('", 
		"'{'", "'}'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", 
		"'<'", "'>'", "'<='", "'>='", "'||'", "'&&'", "'!'", "'('", "')'", "'returnblyat'", 
		"';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "PLUS", "MINUS", 
		"TIMES", "DIVIDE", "EQUAL", "NOTEQUAL", "SMALLERTHAN", "BIGGERTHAN", "SMALLERTHANEQUAL", 
		"BIGGERTHANEQUAL", "OR", "AND", "NOT", "PARENTHESESLEFT", "PARENTHESESRIGHT", 
		"RETURN", "SEMICOLON", "IS", "DATATYPES", "STRING", "INT", "BOOLEAN", 
		"ID", "WS", "COMMENT"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaBlyatParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << PARENTHESESLEFT) | (1L << DATATYPES) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				new_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				new_variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				change_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				expression(0);
				setState(42);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				print();
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
			setState(47);
			match(T__0);
			setState(48);
			match(PARENTHESESLEFT);
			setState(49);
			((If_statementContext)_localctx).expr = expression(0);
			setState(50);
			match(PARENTHESESRIGHT);
			setState(51);
			((If_statementContext)_localctx).statementBlock = statement_block();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(52);
				elseif_block();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(58);
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
			setState(61);
			match(T__1);
			setState(62);
			match(PARENTHESESLEFT);
			setState(63);
			((Elseif_blockContext)_localctx).expr = expression(0);
			setState(64);
			match(PARENTHESESRIGHT);
			setState(65);
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
			setState(67);
			match(T__2);
			setState(68);
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
			setState(70);
			match(DATATYPES);
			setState(71);
			match(ID);
			setState(72);
			match(IS);
			setState(73);
			((New_variableContext)_localctx).expr = calc_expression(0);
			setState(74);
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
			setState(76);
			match(DATATYPES);
			setState(77);
			match(ID);
			setState(78);
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
			setState(80);
			((Change_variableContext)_localctx).id = match(ID);
			setState(81);
			match(IS);
			setState(82);
			((Change_variableContext)_localctx).expr = calc_expression(0);
			setState(83);
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
		public ExpressionContext expr;
		public Statement_blockContext statementBlock;
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
			setState(85);
			match(T__3);
			setState(86);
			match(PARENTHESESLEFT);
			setState(87);
			((While_loopContext)_localctx).expr = expression(0);
			setState(88);
			match(PARENTHESESRIGHT);
			setState(89);
			((While_loopContext)_localctx).statementBlock = statement_block();
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
	public static class PrintExpressionContext extends PrintContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public PrintExpressionContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitPrintExpression(this);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__4);
				setState(92);
				match(ID);
				setState(93);
				match(PARENTHESESRIGHT);
				setState(94);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__4);
				setState(96);
				match(STRING);
				setState(97);
				match(PARENTHESESRIGHT);
				setState(98);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new PrintCalcExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(T__4);
				setState(100);
				calc_expression(0);
				setState(101);
				match(PARENTHESESRIGHT);
				setState(102);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new PrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__4);
				setState(105);
				expression(0);
				setState(106);
				match(PARENTHESESRIGHT);
				setState(107);
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
		enterRule(_localctx, 20, RULE_statement_block);
		int _la;
		try {
			_localctx = new StatementBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__5);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << PARENTHESESLEFT) | (1L << DATATYPES) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(112);
				statement();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__6);
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
		public Token operator;
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
	public static class EqualExpressionsContext extends ExpressionContext {
		public ExpressionContext leftExpression;
		public Token operator;
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
		public Token operator;
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
	public static class PlusplusAndminminExpressionsContext extends ExpressionContext {
		public ExpressionContext leftExpression;
		public Token operator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PlusplusAndminminExpressionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitPlusplusAndminminExpressions(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(121);
			literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((EqualExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						((EqualExpressionsContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((EqualExpressionsContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						((EqualExpressionsContext)_localctx).rightExpression = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new CompareExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						((CompareExpressionsContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALLERTHAN) | (1L << BIGGERTHAN) | (1L << SMALLERTHANEQUAL) | (1L << BIGGERTHANEQUAL))) != 0)) ) {
							((CompareExpressionsContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						((CompareExpressionsContext)_localctx).rightExpression = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new OrAndandExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((OrAndandExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						((OrAndandExpressionsContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
							((OrAndandExpressionsContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(131);
						((OrAndandExpressionsContext)_localctx).rightExpression = expression(4);
						}
						break;
					case 4:
						{
						_localctx = new PlusplusAndminminExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((PlusplusAndminminExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(133);
						((PlusplusAndminminExpressionsContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((PlusplusAndminminExpressionsContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode MINUS() { return getToken(JavaBlyatParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(JavaBlyatParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(JavaBlyatParser.DIVIDE, 0); }
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_calc_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralValueExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(140);
			literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalcValueExpressionContext(new Calc_expressionContext(_parentctx, _parentState));
					((CalcValueExpressionContext)_localctx).leftExpression = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_calc_expression);
					setState(142);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(143);
					((CalcValueExpressionContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE))) != 0)) ) {
						((CalcValueExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(144);
					((CalcValueExpressionContext)_localctx).rightExpression = calc_expression(3);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public Token parenthesesleft;
		public Token parenthesesright;
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
		enterRule(_localctx, 26, RULE_literal);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTHESESLEFT:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((LiteralExpressionContext)_localctx).parenthesesleft = match(PARENTHESESLEFT);
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(151);
					expression(0);
					}
					break;
				case 2:
					{
					setState(152);
					calc_expression(0);
					}
					break;
				}
				setState(155);
				((LiteralExpressionContext)_localctx).parenthesesright = match(PARENTHESESRIGHT);
				}
				break;
			case STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new LiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new LiteralIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 12:
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
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean calc_expression_sempred(Calc_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\f\3\f\7\ft"+
		"\n\f\f\f\16\fw\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\17\3\17\3\17\5\17\u009c"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\17\2\4\30\32\20"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\20\21\3\2\22\25\3\2\26\27"+
		"\3\2\n\13\3\2\f\17\2\u00ae\2!\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b?\3\2\2"+
		"\2\nE\3\2\2\2\fH\3\2\2\2\16N\3\2\2\2\20R\3\2\2\2\22W\3\2\2\2\24o\3\2\2"+
		"\2\26q\3\2\2\2\30z\3\2\2\2\32\u008d\3\2\2\2\34\u00a3\3\2\2\2\36 \5\4\3"+
		"\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2"+
		"$%\7\2\2\3%\3\3\2\2\2&\60\5\6\4\2\'\60\5\f\7\2(\60\5\16\b\2)\60\5\20\t"+
		"\2*\60\5\22\n\2+,\5\30\r\2,-\7\34\2\2-\60\3\2\2\2.\60\5\24\13\2/&\3\2"+
		"\2\2/\'\3\2\2\2/(\3\2\2\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/.\3\2\2\2\60\5"+
		"\3\2\2\2\61\62\7\3\2\2\62\63\7\31\2\2\63\64\5\30\r\2\64\65\7\32\2\2\65"+
		"9\5\26\f\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:"+
		"=\3\2\2\2;9\3\2\2\2<>\5\n\6\2=<\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?@\7\4\2\2"+
		"@A\7\31\2\2AB\5\30\r\2BC\7\32\2\2CD\5\26\f\2D\t\3\2\2\2EF\7\5\2\2FG\5"+
		"\26\f\2G\13\3\2\2\2HI\7\36\2\2IJ\7\"\2\2JK\7\35\2\2KL\5\32\16\2LM\7\34"+
		"\2\2M\r\3\2\2\2NO\7\36\2\2OP\7\"\2\2PQ\7\34\2\2Q\17\3\2\2\2RS\7\"\2\2"+
		"ST\7\35\2\2TU\5\32\16\2UV\7\34\2\2V\21\3\2\2\2WX\7\6\2\2XY\7\31\2\2YZ"+
		"\5\30\r\2Z[\7\32\2\2[\\\5\26\f\2\\\23\3\2\2\2]^\7\7\2\2^_\7\"\2\2_`\7"+
		"\32\2\2`p\7\34\2\2ab\7\7\2\2bc\7\37\2\2cd\7\32\2\2dp\7\34\2\2ef\7\7\2"+
		"\2fg\5\32\16\2gh\7\32\2\2hi\7\34\2\2ip\3\2\2\2jk\7\7\2\2kl\5\30\r\2lm"+
		"\7\32\2\2mn\7\34\2\2np\3\2\2\2o]\3\2\2\2oa\3\2\2\2oe\3\2\2\2oj\3\2\2\2"+
		"p\25\3\2\2\2qu\7\b\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wu\3\2\2\2xy\7\t\2\2y\27\3\2\2\2z{\b\r\1\2{|\5\34\17\2|\u008a"+
		"\3\2\2\2}~\f\7\2\2~\177\t\2\2\2\177\u0089\5\30\r\b\u0080\u0081\f\6\2\2"+
		"\u0081\u0082\t\3\2\2\u0082\u0089\5\30\r\7\u0083\u0084\f\5\2\2\u0084\u0085"+
		"\t\4\2\2\u0085\u0089\5\30\r\6\u0086\u0087\f\4\2\2\u0087\u0089\t\5\2\2"+
		"\u0088}\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\31\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\16\1\2\u008e\u008f\5\34"+
		"\17\2\u008f\u0095\3\2\2\2\u0090\u0091\f\4\2\2\u0091\u0092\t\6\2\2\u0092"+
		"\u0094\5\32\16\5\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\33\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\7\31\2\2\u0099\u009c\5\30\r\2\u009a\u009c\5\32\16\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\32\2\2"+
		"\u009e\u00a4\3\2\2\2\u009f\u00a4\7\37\2\2\u00a0\u00a4\7 \2\2\u00a1\u00a4"+
		"\7!\2\2\u00a2\u00a4\7\"\2\2\u00a3\u0098\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\35\3\2\2"+
		"\2\r!/9=ou\u0088\u008a\u0095\u009b\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}