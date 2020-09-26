// Generated from e:\GameProgramming2\CustomScriptingLanguage\MegaScrypt.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MegaScryptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, True=11, False=12, Var=13, Equals=14, Underscore=15, Add=16, 
		Increment=17, Minus=18, Decrement=19, Multiply=20, Divide=21, LeftParenthesis=22, 
		RightParenthesis=23, Dot=24, And=25, Or=26, Not=27, DivideEquals=28, SubEquals=29, 
		MultiplyEquals=30, AddEquals=31, DoubleEquals=32, NotEquals=33, LessOrEqual=34, 
		GreaterOrEqual=35, GreaterThan=36, LessThan=37, Null=38, Id=39, Number=40, 
		String=41, WhiteSpace=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "True", "False", "Var", "Equals", "Digit", "Letter", "Underscore", 
			"Add", "Increment", "Minus", "Decrement", "Multiply", "Divide", "LeftParenthesis", 
			"RightParenthesis", "Dot", "And", "Or", "Not", "DivideEquals", "SubEquals", 
			"MultiplyEquals", "AddEquals", "DoubleEquals", "NotEquals", "LessOrEqual", 
			"GreaterOrEqual", "GreaterThan", "LessThan", "Null", "Id", "Number", 
			"String", "WhiteSpace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'function'", "','", "'return'", "'if'", "'else'", 
			"'Print'", "':'", "'true'", "'false'", "'var'", "'='", "'_'", "'+'", 
			"'++'", "'-'", "'--'", "'*'", "'/'", "'('", "')'", "'.'", "'&&'", "'||'", 
			"'!'", "'/='", "'-='", "'*='", "'+='", "'=='", "'!='", "'<='", "'>='", 
			"'>'", "'<'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "True", 
			"False", "Var", "Equals", "Underscore", "Add", "Increment", "Minus", 
			"Decrement", "Multiply", "Divide", "LeftParenthesis", "RightParenthesis", 
			"Dot", "And", "Or", "Not", "DivideEquals", "SubEquals", "MultiplyEquals", 
			"AddEquals", "DoubleEquals", "NotEquals", "LessOrEqual", "GreaterOrEqual", 
			"GreaterThan", "LessThan", "Null", "Id", "Number", "String", "WhiteSpace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MegaScryptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MegaScrypt.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\5*\u00da\n*\3*\3*\3*\7*\u00df"+
		"\n*\f*\16*\u00e2\13*\3+\6+\u00e5\n+\r+\16+\u00e6\3+\3+\7+\u00eb\n+\f+"+
		"\16+\u00ee\13+\5+\u00f0\n+\3,\3,\3,\3,\7,\u00f6\n,\f,\16,\u00f9\13,\3"+
		",\3,\3-\6-\u00fe\n-\r-\16-\u00ff\3-\3-\3\u00f7\2.\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\21%\22\'\23"+
		")\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%"+
		"M&O\'Q(S)U*W+Y,\3\2\6\3\2\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\2\u010a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13j\3\2"+
		"\2\2\rl\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23{\3\2\2\2\25\u0081\3\2\2\2\27"+
		"\u0083\3\2\2\2\31\u0088\3\2\2\2\33\u008e\3\2\2\2\35\u0092\3\2\2\2\37\u0094"+
		"\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2"+
		")\u009f\3\2\2\2+\u00a1\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3\2\2\2\61\u00a8"+
		"\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00ae\3\2\2\29\u00b1\3\2"+
		"\2\2;\u00b4\3\2\2\2=\u00b6\3\2\2\2?\u00b9\3\2\2\2A\u00bc\3\2\2\2C\u00bf"+
		"\3\2\2\2E\u00c2\3\2\2\2G\u00c5\3\2\2\2I\u00c8\3\2\2\2K\u00cb\3\2\2\2M"+
		"\u00ce\3\2\2\2O\u00d0\3\2\2\2Q\u00d2\3\2\2\2S\u00d9\3\2\2\2U\u00e4\3\2"+
		"\2\2W\u00f1\3\2\2\2Y\u00fd\3\2\2\2[\\\7=\2\2\\\4\3\2\2\2]^\7}\2\2^\6\3"+
		"\2\2\2_`\7\177\2\2`\b\3\2\2\2ab\7h\2\2bc\7w\2\2cd\7p\2\2de\7e\2\2ef\7"+
		"v\2\2fg\7k\2\2gh\7q\2\2hi\7p\2\2i\n\3\2\2\2jk\7.\2\2k\f\3\2\2\2lm\7t\2"+
		"\2mn\7g\2\2no\7v\2\2op\7w\2\2pq\7t\2\2qr\7p\2\2r\16\3\2\2\2st\7k\2\2t"+
		"u\7h\2\2u\20\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z\22\3\2\2\2{"+
		"|\7R\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\24\3\2\2"+
		"\2\u0081\u0082\7<\2\2\u0082\26\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7w\2\2\u0086\u0087\7g\2\2\u0087\30\3\2\2\2\u0088\u0089"+
		"\7h\2\2\u0089\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c"+
		"\u008d\7g\2\2\u008d\32\3\2\2\2\u008e\u008f\7x\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7t\2\2\u0091\34\3\2\2\2\u0092\u0093\7?\2\2\u0093\36\3\2\2\2\u0094"+
		"\u0095\t\2\2\2\u0095 \3\2\2\2\u0096\u0097\t\3\2\2\u0097\"\3\2\2\2\u0098"+
		"\u0099\7a\2\2\u0099$\3\2\2\2\u009a\u009b\7-\2\2\u009b&\3\2\2\2\u009c\u009d"+
		"\7-\2\2\u009d\u009e\7-\2\2\u009e(\3\2\2\2\u009f\u00a0\7/\2\2\u00a0*\3"+
		"\2\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7/\2\2\u00a3,\3\2\2\2\u00a4\u00a5"+
		"\7,\2\2\u00a5.\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\60\3\2\2\2\u00a8\u00a9"+
		"\7*\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab\64\3\2\2\2\u00ac\u00ad"+
		"\7\60\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7(\2\2\u00b0"+
		"8\3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b3\7~\2\2\u00b3:\3\2\2\2\u00b4\u00b5"+
		"\7#\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\7?\2\2\u00b8>"+
		"\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba\u00bb\7?\2\2\u00bb@\3\2\2\2\u00bc\u00bd"+
		"\7,\2\2\u00bd\u00be\7?\2\2\u00beB\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0\u00c1"+
		"\7?\2\2\u00c1D\3\2\2\2\u00c2\u00c3\7?\2\2\u00c3\u00c4\7?\2\2\u00c4F\3"+
		"\2\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7\7?\2\2\u00c7H\3\2\2\2\u00c8\u00c9"+
		"\7>\2\2\u00c9\u00ca\7?\2\2\u00caJ\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc\u00cd"+
		"\7?\2\2\u00cdL\3\2\2\2\u00ce\u00cf\7@\2\2\u00cfN\3\2\2\2\u00d0\u00d1\7"+
		">\2\2\u00d1P\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5"+
		"\7n\2\2\u00d5\u00d6\7n\2\2\u00d6R\3\2\2\2\u00d7\u00da\7a\2\2\u00d8\u00da"+
		"\5!\21\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00e0\3\2\2\2\u00db"+
		"\u00df\7a\2\2\u00dc\u00df\5!\21\2\u00dd\u00df\5\37\20\2\u00de\u00db\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1T\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e5\5\37\20\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ef\3\2\2\2\u00e8\u00ec\7\60\2\2"+
		"\u00e9\u00eb\5\37\20\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00e8\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0V\3\2\2\2\u00f1\u00f7\7$\2\2\u00f2"+
		"\u00f3\7^\2\2\u00f3\u00f6\7$\2\2\u00f4\u00f6\n\4\2\2\u00f5\u00f2\3\2\2"+
		"\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb"+
		"X\3\2\2\2\u00fc\u00fe\t\5\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\b-\2\2\u0102Z\3\2\2\2\f\2\u00d9\u00de\u00e0\u00e6\u00ec\u00ef\u00f5\u00f7"+
		"\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}