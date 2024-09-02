// Generated from FracLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FracLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, FRACTION=11, STRING=12, WS=13, COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "FRACTION", "STRING", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'display'", "';'", "'<='", "'+'", "'-'", "'*'", "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "FRACTION", 
			"STRING", "WS", "COMMENT"
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


	public FracLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FracLang.g4"; }

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
		"\u0004\u0000\u000ee\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\t8\b\t\u000b"+
		"\t\f\t9\u0001\n\u0004\n=\b\n\u000b\n\f\n>\u0001\n\u0001\n\u0004\nC\b\n"+
		"\u000b\n\f\nD\u0003\nG\b\n\u0001\u000b\u0001\u000b\u0005\u000bK\b\u000b"+
		"\n\u000b\f\u000bN\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fS\b\f"+
		"\u000b\f\f\fT\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r"+
		"]\b\r\n\r\f\r`\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0002L^\u0000\u000e"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u0001\u0000\u0003\u0001\u0000az\u0001\u000009\u0003\u0000\t\n\r\r  k"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d"+
		"\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001"+
		"\u0000\u0000\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000"+
		"\u0000\u000b.\u0001\u0000\u0000\u0000\r0\u0001\u0000\u0000\u0000\u000f"+
		"2\u0001\u0000\u0000\u0000\u00114\u0001\u0000\u0000\u0000\u00137\u0001"+
		"\u0000\u0000\u0000\u0015<\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000"+
		"\u0000\u0019R\u0001\u0000\u0000\u0000\u001bX\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005d\u0000\u0000\u001e\u001f\u0005i\u0000\u0000\u001f \u0005"+
		"s\u0000\u0000 !\u0005p\u0000\u0000!\"\u0005l\u0000\u0000\"#\u0005a\u0000"+
		"\u0000#$\u0005y\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005;\u0000"+
		"\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005<\u0000\u0000()\u0005=\u0000"+
		"\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005+\u0000\u0000+\b\u0001\u0000"+
		"\u0000\u0000,-\u0005-\u0000\u0000-\n\u0001\u0000\u0000\u0000./\u0005*"+
		"\u0000\u0000/\f\u0001\u0000\u0000\u000001\u0005:\u0000\u00001\u000e\u0001"+
		"\u0000\u0000\u000023\u0005(\u0000\u00003\u0010\u0001\u0000\u0000\u0000"+
		"45\u0005)\u0000\u00005\u0012\u0001\u0000\u0000\u000068\u0007\u0000\u0000"+
		"\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:\u0014\u0001\u0000\u0000\u0000"+
		";=\u0007\u0001\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?F\u0001\u0000"+
		"\u0000\u0000@B\u0005/\u0000\u0000AC\u0007\u0001\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000G\u0016\u0001\u0000\u0000\u0000HL\u0005\"\u0000"+
		"\u0000IK\t\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MO\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\"\u0000\u0000P\u0018\u0001"+
		"\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0006\f\u0000\u0000W\u001a\u0001\u0000"+
		"\u0000\u0000XY\u0005-\u0000\u0000YZ\u0005-\u0000\u0000Z^\u0001\u0000\u0000"+
		"\u0000[]\t\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\n\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000cd\u0006\r\u0000\u0000d\u001c\u0001\u0000\u0000\u0000"+
		"\b\u00009>DFLT^\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}