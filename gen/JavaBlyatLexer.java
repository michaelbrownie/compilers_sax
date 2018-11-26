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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		PLUS=10, MIN=11, KEER=12, GEDEELD=13, EQUAL=14, NOTEQUAL=15, SMALLERTHAN=16, 
		BIGGERTHAN=17, SMALLERTHANEQUAL=18, BIGGERTHANEQUAL=19, OR=20, AND=21, 
		NOT=22, PARENTHESESLEFT=23, PARENTHESESRIGHT=24, RETURN=25, SEMICOLON=26, 
		IS=27, DATATYPES=28, STRING=29, INT=30, BOOLEAN=31, ID=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"PLUS", "MIN", "KEER", "GEDEELD", "EQUAL", "NOTEQUAL", "SMALLERTHAN", 
		"BIGGERTHAN", "SMALLERTHANEQUAL", "BIGGERTHANEQUAL", "OR", "AND", "NOT", 
		"PARENTHESESLEFT", "PARENTHESESRIGHT", "RETURN", "SEMICOLON", "IS", "DATATYPES", 
		"STRING", "INT", "BOOLEAN", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00f1\n\35\3\36\3\36\7\36\u00f5\n\36\f\36\16\36\u00f8"+
		"\13\36\3\36\3\36\3\37\6\37\u00fd\n\37\r\37\16\37\u00fe\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0114\n \3!\3!\7!\u0118"+
		"\n!\f!\16!\u011b\13!\3\"\6\"\u011e\n\"\r\"\16\"\u011f\3\"\3\"\3\u00f6"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#\3\2\7\4\2$$^^\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u012a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3"+
		"\2\2\2\5M\3\2\2\2\7Y\3\2\2\2\tc\3\2\2\2\13n\3\2\2\2\r\u0080\3\2\2\2\17"+
		"\u008e\3\2\2\2\21\u0090\3\2\2\2\23\u0092\3\2\2\2\25\u0094\3\2\2\2\27\u0096"+
		"\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009f\3"+
		"\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2\2%\u00a6\3\2\2\2\'\u00a9\3\2\2\2)\u00ac"+
		"\3\2\2\2+\u00af\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2"+
		"\63\u00b8\3\2\2\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00f0\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u0113\3\2\2\2A\u0115\3\2\2\2C\u011d\3\2\2\2E"+
		"F\7k\2\2FG\7h\2\2GH\7d\2\2HI\7n\2\2IJ\7{\2\2JK\7c\2\2KL\7v\2\2L\4\3\2"+
		"\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2PQ\7g\2\2QR\7k\2\2RS\7h\2\2ST\7d\2\2TU"+
		"\7n\2\2UV\7{\2\2VW\7c\2\2WX\7v\2\2X\6\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u"+
		"\2\2\\]\7g\2\2]^\7d\2\2^_\7n\2\2_`\7{\2\2`a\7c\2\2ab\7v\2\2b\b\3\2\2\2"+
		"cd\7y\2\2de\7j\2\2ef\7k\2\2fg\7n\2\2gh\7g\2\2hi\7d\2\2ij\7n\2\2jk\7{\2"+
		"\2kl\7c\2\2lm\7v\2\2m\n\3\2\2\2no\7e\2\2op\7q\2\2pq\7p\2\2qr\7u\2\2rs"+
		"\7q\2\2st\7n\2\2tu\7g\2\2uv\7d\2\2vw\7n\2\2wx\7{\2\2xy\7c\2\2yz\7v\2\2"+
		"z{\7\60\2\2{|\7n\2\2|}\7q\2\2}~\7i\2\2~\177\7*\2\2\177\f\3\2\2\2\u0080"+
		"\u0081\7h\2\2\u0081\u0082\7w\2\2\u0082\u0083\7p\2\2\u0083\u0084\7e\2\2"+
		"\u0084\u0085\7v\2\2\u0085\u0086\7k\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7d\2\2\u0089\u008a\7n\2\2\u008a\u008b\7{\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7v\2\2\u008d\16\3\2\2\2\u008e\u008f\7.\2\2\u008f"+
		"\20\3\2\2\2\u0090\u0091\7}\2\2\u0091\22\3\2\2\2\u0092\u0093\7\177\2\2"+
		"\u0093\24\3\2\2\2\u0094\u0095\7-\2\2\u0095\26\3\2\2\2\u0096\u0097\7/\2"+
		"\2\u0097\30\3\2\2\2\u0098\u0099\7,\2\2\u0099\32\3\2\2\2\u009a\u009b\7"+
		"\61\2\2\u009b\34\3\2\2\2\u009c\u009d\7?\2\2\u009d\u009e\7?\2\2\u009e\36"+
		"\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a1\7?\2\2\u00a1 \3\2\2\2\u00a2\u00a3"+
		"\7>\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5$\3\2\2\2\u00a6\u00a7"+
		"\7>\2\2\u00a7\u00a8\7?\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa\u00ab"+
		"\7?\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad\u00ae\7~\2\2\u00ae*\3"+
		"\2\2\2\u00af\u00b0\7(\2\2\u00b0\u00b1\7(\2\2\u00b1,\3\2\2\2\u00b2\u00b3"+
		"\7#\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5\60\3\2\2\2\u00b6\u00b7"+
		"\7+\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7d\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7{\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5\66\3\2\2"+
		"\2\u00c6\u00c7\7?\2\2\u00c78\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7"+
		"v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce"+
		"\7i\2\2\u00ce\u00cf\7d\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7{\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00f1\7v\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2"+
		"\u00d5\u00d6\7v\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9"+
		"\7{\2\2\u00d9\u00da\7c\2\2\u00da\u00f1\7v\2\2\u00db\u00dc\7d\2\2\u00dc"+
		"\u00dd\7q\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4"+
		"\7n\2\2\u00e4\u00e5\7{\2\2\u00e5\u00e6\7c\2\2\u00e6\u00f1\7v\2\2\u00e7"+
		"\u00e8\7x\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7f\2\2"+
		"\u00eb\u00ec\7d\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7{\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f1\7v\2\2\u00f0\u00c8\3\2\2\2\u00f0\u00d3\3\2\2\2\u00f0"+
		"\u00db\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f1:\3\2\2\2\u00f2\u00f6\7$\2\2\u00f3"+
		"\u00f5\n\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7$\2\2\u00fa<\3\2\2\2\u00fb\u00fd\t\3\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff>\3\2\2\2"+
		"\u0100\u0101\7v\2\2\u0101\u0102\7t\2\2\u0102\u0103\7w\2\2\u0103\u0104"+
		"\7g\2\2\u0104\u0105\7d\2\2\u0105\u0106\7n\2\2\u0106\u0107\7{\2\2\u0107"+
		"\u0108\7c\2\2\u0108\u0114\7v\2\2\u0109\u010a\7h\2\2\u010a\u010b\7c\2\2"+
		"\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d\u010e\7g\2\2\u010e\u010f"+
		"\7d\2\2\u010f\u0110\7n\2\2\u0110\u0111\7{\2\2\u0111\u0112\7c\2\2\u0112"+
		"\u0114\7v\2\2\u0113\u0100\3\2\2\2\u0113\u0109\3\2\2\2\u0114@\3\2\2\2\u0115"+
		"\u0119\t\4\2\2\u0116\u0118\t\5\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011aB\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011e\t\6\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b\""+
		"\2\2\u0122D\3\2\2\2\t\2\u00f0\u00f6\u00fe\u0113\u0119\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}