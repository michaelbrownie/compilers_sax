// Generated from C:/Users/KYLIAN/Documents/compilers_sax\JavaBlyat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaBlyatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PLUS=8, MINUS=9, 
		TIMES=10, DIVIDE=11, EQUAL=12, NOTEQUAL=13, SMALLERTHAN=14, BIGGERTHAN=15, 
		SMALLERTHANEQUAL=16, BIGGERTHANEQUAL=17, OR=18, AND=19, NOT=20, PARENTHESESLEFT=21, 
		PARENTHESESRIGHT=22, RETURN=23, SEMICOLON=24, IS=25, DATATYPES=26, STRING=27, 
		INT=28, BOOLEAN=29, ID=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PLUS", "MINUS", 
		"TIMES", "DIVIDE", "EQUAL", "NOTEQUAL", "SMALLERTHAN", "BIGGERTHAN", "SMALLERTHANEQUAL", 
		"BIGGERTHANEQUAL", "OR", "AND", "NOT", "PARENTHESESLEFT", "PARENTHESESRIGHT", 
		"RETURN", "SEMICOLON", "IS", "DATATYPES", "STRING", "INT", "BOOLEAN", 
		"ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ifblyat'", "'elseifblyat'", "'elseblyat'", "'whileblyat'", "'cyka.blyat('", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'<'", "'>'", 
		"'<='", "'>='", "'||'", "'&&'", "'!'", "'('", "')'", "'returnblyat'", 
		"';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PLUS", "MINUS", "TIMES", 
		"DIVIDE", "EQUAL", "NOTEQUAL", "SMALLERTHAN", "BIGGERTHAN", "SMALLERTHANEQUAL", 
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


	public JavaBlyatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaBlyat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0109\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d7\n\33\3\34\3\34"+
		"\7\34\u00db\n\34\f\34\16\34\u00de\13\34\3\34\3\34\3\35\6\35\u00e3\n\35"+
		"\r\35\16\35\u00e4\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00fa\n\36\3\37\3\37"+
		"\7\37\u00fe\n\37\f\37\16\37\u0101\13\37\3 \6 \u0104\n \r \16 \u0105\3"+
		" \3 \3\u00dc\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!\3\2\7\4\2$$^^\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2"+
		"\13\f\17\17\"\"\2\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5I\3\2\2"+
		"\2\7U\3\2\2\2\t_\3\2\2\2\13j\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21z\3\2\2"+
		"\2\23|\3\2\2\2\25~\3\2\2\2\27\u0080\3\2\2\2\31\u0082\3\2\2\2\33\u0085"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008f\3\2\2"+
		"\2%\u0092\3\2\2\2\'\u0095\3\2\2\2)\u0098\3\2\2\2+\u009a\3\2\2\2-\u009c"+
		"\3\2\2\2/\u009e\3\2\2\2\61\u00aa\3\2\2\2\63\u00ac\3\2\2\2\65\u00d6\3\2"+
		"\2\2\67\u00d8\3\2\2\29\u00e2\3\2\2\2;\u00f9\3\2\2\2=\u00fb\3\2\2\2?\u0103"+
		"\3\2\2\2AB\7k\2\2BC\7h\2\2CD\7d\2\2DE\7n\2\2EF\7{\2\2FG\7c\2\2GH\7v\2"+
		"\2H\4\3\2\2\2IJ\7g\2\2JK\7n\2\2KL\7u\2\2LM\7g\2\2MN\7k\2\2NO\7h\2\2OP"+
		"\7d\2\2PQ\7n\2\2QR\7{\2\2RS\7c\2\2ST\7v\2\2T\6\3\2\2\2UV\7g\2\2VW\7n\2"+
		"\2WX\7u\2\2XY\7g\2\2YZ\7d\2\2Z[\7n\2\2[\\\7{\2\2\\]\7c\2\2]^\7v\2\2^\b"+
		"\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7k\2\2bc\7n\2\2cd\7g\2\2de\7d\2\2ef\7n\2"+
		"\2fg\7{\2\2gh\7c\2\2hi\7v\2\2i\n\3\2\2\2jk\7e\2\2kl\7{\2\2lm\7m\2\2mn"+
		"\7c\2\2no\7\60\2\2op\7d\2\2pq\7n\2\2qr\7{\2\2rs\7c\2\2st\7v\2\2tu\7*\2"+
		"\2u\f\3\2\2\2vw\7}\2\2w\16\3\2\2\2xy\7\177\2\2y\20\3\2\2\2z{\7-\2\2{\22"+
		"\3\2\2\2|}\7/\2\2}\24\3\2\2\2~\177\7,\2\2\177\26\3\2\2\2\u0080\u0081\7"+
		"\61\2\2\u0081\30\3\2\2\2\u0082\u0083\7?\2\2\u0083\u0084\7?\2\2\u0084\32"+
		"\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087\7?\2\2\u0087\34\3\2\2\2\u0088"+
		"\u0089\7>\2\2\u0089\36\3\2\2\2\u008a\u008b\7@\2\2\u008b \3\2\2\2\u008c"+
		"\u008d\7>\2\2\u008d\u008e\7?\2\2\u008e\"\3\2\2\2\u008f\u0090\7@\2\2\u0090"+
		"\u0091\7?\2\2\u0091$\3\2\2\2\u0092\u0093\7~\2\2\u0093\u0094\7~\2\2\u0094"+
		"&\3\2\2\2\u0095\u0096\7(\2\2\u0096\u0097\7(\2\2\u0097(\3\2\2\2\u0098\u0099"+
		"\7#\2\2\u0099*\3\2\2\2\u009a\u009b\7*\2\2\u009b,\3\2\2\2\u009c\u009d\7"+
		"+\2\2\u009d.\3\2\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7d\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7{\2\2\u00a7\u00a8\7c\2\2"+
		"\u00a8\u00a9\7v\2\2\u00a9\60\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab\62\3\2\2"+
		"\2\u00ac\u00ad\7?\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7u\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3"+
		"\u00b4\7i\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7{\2\2"+
		"\u00b7\u00b8\7c\2\2\u00b8\u00d7\7v\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7{\2\2\u00bf\u00c0\7c\2\2\u00c0\u00d7\7v\2\2\u00c1\u00c2\7d\2\2"+
		"\u00c2\u00c3\7q\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7d\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca\u00cb\7{\2\2\u00cb\u00cc\7c\2\2\u00cc\u00d7\7v\2\2"+
		"\u00cd\u00ce\7x\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1"+
		"\7f\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7{\2\2\u00d4"+
		"\u00d5\7c\2\2\u00d5\u00d7\7v\2\2\u00d6\u00ae\3\2\2\2\u00d6\u00b9\3\2\2"+
		"\2\u00d6\u00c1\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d7\66\3\2\2\2\u00d8\u00dc"+
		"\7$\2\2\u00d9\u00db\n\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e0\7$\2\2\u00e08\3\2\2\2\u00e1\u00e3\t\3\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		":\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7w\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7{\2\2"+
		"\u00ed\u00ee\7c\2\2\u00ee\u00fa\7v\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1"+
		"\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7d\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7{\2\2\u00f7\u00f8\7c\2\2"+
		"\u00f8\u00fa\7v\2\2\u00f9\u00e6\3\2\2\2\u00f9\u00ef\3\2\2\2\u00fa<\3\2"+
		"\2\2\u00fb\u00ff\t\4\2\2\u00fc\u00fe\t\5\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100>\3\2\2\2"+
		"\u0101\u00ff\3\2\2\2\u0102\u0104\t\6\2\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\b \2\2\u0108@\3\2\2\2\t\2\u00d6\u00dc\u00e4\u00f9\u00ff\u0105\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}