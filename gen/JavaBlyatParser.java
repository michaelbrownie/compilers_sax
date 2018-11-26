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
		null, "'ifblyat'", "'elseifblyat'", "'elseblyat'", "'whileblyat'", "'consoleblyat.log('", 
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterProgramma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitProgramma(this);
		}
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
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << DATATYPES) | (1L << ID))) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitStatement(this);
		}
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				new_variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				new_variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				change_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitIf_statement(this);
		}
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
			setState(63);
			match(T__0);
			setState(64);
			match(PARENTHESESLEFT);
			setState(65);
			((If_statementContext)_localctx).expr = expression(0);
			setState(66);
			match(PARENTHESESRIGHT);
			setState(67);
			((If_statementContext)_localctx).statementBlock = statement_block();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(68);
				elseif_block();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(74);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitElseif_block(this);
		}
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
			setState(77);
			match(T__1);
			setState(78);
			match(PARENTHESESLEFT);
			setState(79);
			((Elseif_blockContext)_localctx).expr = expression(0);
			setState(80);
			match(PARENTHESESRIGHT);
			setState(81);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitElse_block(this);
		}
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
			setState(83);
			match(T__2);
			setState(84);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterNew_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitNew_variable(this);
		}
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
			setState(86);
			match(DATATYPES);
			setState(87);
			match(ID);
			setState(88);
			match(IS);
			setState(89);
			((New_variableContext)_localctx).expr = calc_expression(0);
			setState(90);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterNew_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitNew_variable_declaration(this);
		}
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
			setState(92);
			match(DATATYPES);
			setState(93);
			match(ID);
			setState(94);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterChange_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitChange_variable(this);
		}
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
			setState(96);
			((Change_variableContext)_localctx).id = match(ID);
			setState(97);
			match(IS);
			setState(98);
			((Change_variableContext)_localctx).expr = calc_expression(0);
			setState(99);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitWhile_loop(this);
		}
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
			setState(101);
			match(T__3);
			setState(102);
			match(PARENTHESESLEFT);
			setState(103);
			expression(0);
			setState(104);
			match(PARENTHESESRIGHT);
			setState(105);
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
	public static class PrintIdContext extends PrintContext {
		public TerminalNode ID() { return getToken(JavaBlyatParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public PrintIdContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringContext extends PrintContext {
		public TerminalNode STRING() { return getToken(JavaBlyatParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(JavaBlyatParser.SEMICOLON, 0); }
		public Calc_expressionContext calc_expression() {
			return getRuleContext(Calc_expressionContext.class,0);
		}
		public PrintStringContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterPrintString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitPrintString(this);
		}
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__4);
				setState(108);
				match(ID);
				setState(109);
				match(PARENTHESESRIGHT);
				setState(110);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__4);
				setState(112);
				match(STRING);
				setState(113);
				match(PARENTHESESRIGHT);
				setState(114);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__4);
				setState(116);
				calc_expression(0);
				setState(117);
				match(PARENTHESESRIGHT);
				setState(118);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitFunction(this);
		}
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
			setState(122);
			match(DATATYPES);
			setState(123);
			match(T__5);
			setState(124);
			match(ID);
			setState(125);
			match(PARENTHESESLEFT);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATATYPES) {
				{
				setState(126);
				function_argument();
				}
			}

			setState(129);
			match(PARENTHESESRIGHT);
			setState(130);
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
		public Calc_expressionContext expr;
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
		public List<TerminalNode> IS() { return getTokens(JavaBlyatParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(JavaBlyatParser.IS, i);
		}
		public List<Calc_expressionContext> calc_expression() {
			return getRuleContexts(Calc_expressionContext.class);
		}
		public Calc_expressionContext calc_expression(int i) {
			return getRuleContext(Calc_expressionContext.class,i);
		}
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaBlyatVisitor ) return ((JavaBlyatVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_argument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					match(DATATYPES);
					setState(133);
					function_argument_types();
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS) {
						{
						setState(134);
						match(IS);
						setState(135);
						((Function_argumentContext)_localctx).expr = calc_expression(0);
						}
					}

					setState(138);
					match(T__6);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(145);
			match(DATATYPES);
			setState(146);
			function_argument_types();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(147);
				match(IS);
				setState(148);
				((Function_argumentContext)_localctx).expr = calc_expression(0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterFunction_argument_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitFunction_argument_types(this);
		}
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
			setState(151);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterFunction_statement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitFunction_statement_block(this);
		}
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
			setState(153);
			match(T__7);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << DATATYPES) | (1L << ID))) != 0)) {
				{
				{
				setState(154);
				statement();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(160);
				match(RETURN);
				setState(161);
				match(ID);
				setState(162);
				match(SEMICOLON);
				}
			}

			setState(165);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitCall_function(this);
		}
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
			setState(167);
			match(ID);
			setState(168);
			match(PARENTHESESLEFT);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				setState(169);
				call_function_argument();
				}
			}

			setState(172);
			match(PARENTHESESRIGHT);
			setState(173);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterCall_function_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitCall_function_argument(this);
		}
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
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					function_argument_types();
					setState(176);
					match(T__6);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(183);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitStatementBlock(this);
		}
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
			setState(185);
			match(T__7);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << DATATYPES) | (1L << ID))) != 0)) {
				{
				{
				setState(186);
				statement();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterCompareExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitCompareExpressions(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitLiteralExpr(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitNotExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterEqualExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitEqualExpressions(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterOrAndandExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitOrAndandExpressions(this);
		}
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
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				match(NOT);
				setState(196);
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
				setState(197);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new EqualExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((EqualExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						((EqualExpressionsContext)_localctx).rightExpression = expression(6);
						}
						break;
					case 2:
						{
						_localctx = new CompareExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((CompareExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMALLERTHAN) | (1L << BIGGERTHAN) | (1L << SMALLERTHANEQUAL) | (1L << BIGGERTHANEQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						((CompareExpressionsContext)_localctx).rightExpression = expression(5);
						}
						break;
					case 3:
						{
						_localctx = new OrAndandExpressionsContext(new ExpressionContext(_parentctx, _parentState));
						((OrAndandExpressionsContext)_localctx).leftExpression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						((OrAndandExpressionsContext)_localctx).rightExpression = expression(4);
						}
						break;
					}
					} 
				}
				setState(213);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterLiteralValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitLiteralValueExp(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterCalcValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitCalcValueExpression(this);
		}
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

			setState(215);
			literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CalcValueExpressionContext(new Calc_expressionContext(_parentctx, _parentState));
					((CalcValueExpressionContext)_localctx).leftExpression = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_calc_expression);
					setState(217);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(218);
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
					setState(219);
					((CalcValueExpressionContext)_localctx).rightExpression = calc_expression(3);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterLiteralId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitLiteralId(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitLiteralString(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterLiteralBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitLiteralBoolean(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitLiteralExpression(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).enterLiteralInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaBlyatListener ) ((JavaBlyatListener)listener).exitLiteralInt(this);
		}
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
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTHESESLEFT:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(PARENTHESESLEFT);
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(226);
					expression(0);
					}
					break;
				case 2:
					{
					setState(227);
					calc_expression(0);
					}
					break;
				}
				setState(230);
				match(PARENTHESESRIGHT);
				}
				break;
			case STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new LiteralBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new LiteralIdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\5\4N\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0082"+
		"\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\r\3\r\7\r\u008f\n\r\f"+
		"\r\16\r\u0092\13\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\16\3\16\3\17\3\17\7"+
		"\17\u009e\n\17\f\17\16\17\u00a1\13\17\3\17\3\17\3\17\5\17\u00a6\n\17\3"+
		"\17\3\17\3\20\3\20\3\20\5\20\u00ad\n\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u00b5\n\21\f\21\16\21\u00b8\13\21\3\21\3\21\3\22\3\22\7\22\u00be"+
		"\n\22\f\22\16\22\u00c1\13\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c9"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d4\n\23\f\23"+
		"\16\23\u00d7\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00df\n\24\f\24"+
		"\16\24\u00e2\13\24\3\25\3\25\3\25\5\25\u00e7\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00ef\n\25\3\25\2\4$&\26\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(\2\7\3\2\37\"\3\2\20\21\3\2\22\25\3\2\26\27\3\2\f\17\2"+
		"\u00fb\2-\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bO\3\2\2\2\nU\3\2\2\2\fX\3\2\2"+
		"\2\16^\3\2\2\2\20b\3\2\2\2\22g\3\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30\u0090"+
		"\3\2\2\2\32\u0099\3\2\2\2\34\u009b\3\2\2\2\36\u00a9\3\2\2\2 \u00b6\3\2"+
		"\2\2\"\u00bb\3\2\2\2$\u00c8\3\2\2\2&\u00d8\3\2\2\2(\u00ee\3\2\2\2*,\5"+
		"\26\f\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2"+
		"\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\2\2\3\67\3\3\2\2\28@\5\6\4\29@\5"+
		"\f\7\2:@\5\16\b\2;@\5\20\t\2<@\5\22\n\2=@\5\24\13\2>@\5\36\20\2?8\3\2"+
		"\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3"+
		"\2\2\2AB\7\3\2\2BC\7\31\2\2CD\5$\23\2DE\7\32\2\2EI\5\"\22\2FH\5\b\5\2"+
		"GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\5\n\6\2"+
		"ML\3\2\2\2MN\3\2\2\2N\7\3\2\2\2OP\7\4\2\2PQ\7\31\2\2QR\5$\23\2RS\7\32"+
		"\2\2ST\5\"\22\2T\t\3\2\2\2UV\7\5\2\2VW\5\"\22\2W\13\3\2\2\2XY\7\36\2\2"+
		"YZ\7\"\2\2Z[\7\35\2\2[\\\5&\24\2\\]\7\34\2\2]\r\3\2\2\2^_\7\36\2\2_`\7"+
		"\"\2\2`a\7\34\2\2a\17\3\2\2\2bc\7\"\2\2cd\7\35\2\2de\5&\24\2ef\7\34\2"+
		"\2f\21\3\2\2\2gh\7\6\2\2hi\7\31\2\2ij\5$\23\2jk\7\32\2\2kl\5\"\22\2l\23"+
		"\3\2\2\2mn\7\7\2\2no\7\"\2\2op\7\32\2\2p{\7\34\2\2qr\7\7\2\2rs\7\37\2"+
		"\2st\7\32\2\2t{\7\34\2\2uv\7\7\2\2vw\5&\24\2wx\7\32\2\2xy\7\34\2\2y{\3"+
		"\2\2\2zm\3\2\2\2zq\3\2\2\2zu\3\2\2\2{\25\3\2\2\2|}\7\36\2\2}~\7\b\2\2"+
		"~\177\7\"\2\2\177\u0081\7\31\2\2\u0080\u0082\5\30\r\2\u0081\u0080\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0085\5\34\17\2\u0085\27\3\2\2\2\u0086\u0087\7\36\2\2\u0087\u008a\5\32"+
		"\16\2\u0088\u0089\7\35\2\2\u0089\u008b\5&\24\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\t\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u0086\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\36"+
		"\2\2\u0094\u0097\5\32\16\2\u0095\u0096\7\35\2\2\u0096\u0098\5&\24\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\31\3\2\2\2\u0099\u009a\t\2\2"+
		"\2\u009a\33\3\2\2\2\u009b\u009f\7\n\2\2\u009c\u009e\5\4\3\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a5\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\33\2\2\u00a3\u00a4\7"+
		"\"\2\2\u00a4\u00a6\7\34\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\"\2"+
		"\2\u00aa\u00ac\7\31\2\2\u00ab\u00ad\5 \21\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\32\2\2\u00af\u00b0\7"+
		"\34\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b3\7\t\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\5\32\16\2\u00ba!\3\2\2\2\u00bb\u00bf\7\n\2\2\u00bc\u00be\5\4\3"+
		"\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\13\2\2"+
		"\u00c3#\3\2\2\2\u00c4\u00c5\b\23\1\2\u00c5\u00c6\7\30\2\2\u00c6\u00c9"+
		"\5$\23\4\u00c7\u00c9\5(\25\2\u00c8\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00d5\3\2\2\2\u00ca\u00cb\f\7\2\2\u00cb\u00cc\t\3\2\2\u00cc\u00d4\5$"+
		"\23\b\u00cd\u00ce\f\6\2\2\u00ce\u00cf\t\4\2\2\u00cf\u00d4\5$\23\7\u00d0"+
		"\u00d1\f\5\2\2\u00d1\u00d2\t\5\2\2\u00d2\u00d4\5$\23\6\u00d3\u00ca\3\2"+
		"\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d8\u00d9\b\24\1\2\u00d9\u00da\5(\25\2\u00da\u00e0\3\2\2\2\u00db\u00dc"+
		"\f\4\2\2\u00dc\u00dd\t\6\2\2\u00dd\u00df\5&\24\5\u00de\u00db\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\'\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e3\u00e6\7\31\2\2\u00e4\u00e7\5$\23\2\u00e5\u00e7"+
		"\5&\24\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\7\32\2\2\u00e9\u00ef\3\2\2\2\u00ea\u00ef\7\37\2\2\u00eb\u00ef\7"+
		" \2\2\u00ec\u00ef\7!\2\2\u00ed\u00ef\7\"\2\2\u00ee\u00e3\3\2\2\2\u00ee"+
		"\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef)\3\2\2\2\27-\63?IMz\u0081\u008a\u0090\u0097\u009f\u00a5\u00ac"+
		"\u00b6\u00bf\u00c8\u00d3\u00d5\u00e0\u00e6\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}