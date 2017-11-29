// Generated from rc.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IF=5, TYPE=6, ABRE_PARENTESES=7, FECHA_PARENTESES=8, 
		TRUE=9, FALSE=10, ID_OP_RESERVADO=11, LITERAL=12, LET=13, BE=14, NOVO_JOGO=15, 
		NOVO_ROBO=16, DEFCOM=17, DEFOP=18, RETURNS=19, AS=20, FIM=21, OP_SETA=22, 
		OUT=23, ID_COMANDO_RESERVADO=24, ID_COMANDO=25, ID=26, ID_OPERADOR=27, 
		NUMBER=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "IF", "TYPE", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"TRUE", "FALSE", "ID_OP_RESERVADO", "LITERAL", "LET", "BE", "NOVO_JOGO", 
		"NOVO_ROBO", "DEFCOM", "DEFOP", "RETURNS", "AS", "FIM", "OP_SETA", "OUT", 
		"ID_COMANDO_RESERVADO", "ID_COMANDO", "ID", "ID_OPERADOR", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "'Is'", "'Default'", "'If'", null, "'('", "')'", "'true'", 
		"'false'", null, null, "'Let'", "'be'", "'new game'", "'new robot'", "'defcom'", 
		"'defop'", "'returns'", "'as'", "'end'", null, "'Out'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IF", "TYPE", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"TRUE", "FALSE", "ID_OP_RESERVADO", "LITERAL", "LET", "BE", "NOVO_JOGO", 
		"NOVO_ROBO", "DEFCOM", "DEFOP", "RETURNS", "AS", "FIM", "OP_SETA", "OUT", 
		"ID_COMANDO_RESERVADO", "ID_COMANDO", "ID", "ID_OPERADOR", "NUMBER", "WS"
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


	public rcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00ff\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\5\f\u0086\n\f\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\5\27\u00ca\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u00dc\n\31\3\32\6\32\u00df\n\32\r\32\16"+
		"\32\u00e0\3\32\7\32\u00e4\n\32\f\32\16\32\u00e7\13\32\3\33\6\33\u00ea"+
		"\n\33\r\33\16\33\u00eb\3\34\3\34\6\34\u00f0\n\34\r\34\16\34\u00f1\3\35"+
		"\6\35\u00f5\n\35\r\35\16\35\u00f6\3\36\6\36\u00fa\n\36\r\36\16\36\u00fb"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37\3\2\b\5\2,-//\61\61\5\2\f\f\17\17$$\3\2C\\\4\2C\\c|"+
		"\3\2\62;\4\2\13\f\"\"\2\u010d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\t"+
		"D\3\2\2\2\13L\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25"+
		"{\3\2\2\2\27\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u0090\3\2\2\2\35\u0094"+
		"\3\2\2\2\37\u0097\3\2\2\2!\u00a0\3\2\2\2#\u00aa\3\2\2\2%\u00b1\3\2\2\2"+
		"\'\u00b7\3\2\2\2)\u00bf\3\2\2\2+\u00c2\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3"+
		"\2\2\2\61\u00db\3\2\2\2\63\u00de\3\2\2\2\65\u00e9\3\2\2\2\67\u00ed\3\2"+
		"\2\29\u00f4\3\2\2\2;\u00f9\3\2\2\2=>\7.\2\2>\4\3\2\2\2?@\7\60\2\2@\6\3"+
		"\2\2\2AB\7K\2\2BC\7u\2\2C\b\3\2\2\2DE\7F\2\2EF\7g\2\2FG\7h\2\2GH\7c\2"+
		"\2HI\7w\2\2IJ\7n\2\2JK\7v\2\2K\n\3\2\2\2LM\7K\2\2MN\7h\2\2N\f\3\2\2\2"+
		"OP\7k\2\2PQ\7p\2\2QR\7v\2\2RS\7g\2\2ST\7i\2\2TU\7g\2\2Uq\7t\2\2VW\7n\2"+
		"\2WX\7k\2\2XY\7v\2\2YZ\7g\2\2Z[\7t\2\2[\\\7c\2\2\\q\7n\2\2]^\7h\2\2^_"+
		"\7n\2\2_`\7q\2\2`a\7c\2\2ab\7v\2\2bc\7k\2\2cd\7p\2\2dq\7i\2\2ef\7n\2\2"+
		"fg\7q\2\2gh\7i\2\2hi\7k\2\2ij\7e\2\2jk\7c\2\2kq\7n\2\2lm\7n\2\2mn\7k\2"+
		"\2no\7u\2\2oq\7v\2\2pO\3\2\2\2pV\3\2\2\2p]\3\2\2\2pe\3\2\2\2pl\3\2\2\2"+
		"q\16\3\2\2\2rs\7*\2\2s\20\3\2\2\2tu\7+\2\2u\22\3\2\2\2vw\7v\2\2wx\7t\2"+
		"\2xy\7w\2\2yz\7g\2\2z\24\3\2\2\2{|\7h\2\2|}\7c\2\2}~\7n\2\2~\177\7u\2"+
		"\2\177\u0080\7g\2\2\u0080\26\3\2\2\2\u0081\u0086\t\2\2\2\u0082\u0083\7"+
		"o\2\2\u0083\u0084\7q\2\2\u0084\u0086\7f\2\2\u0085\u0081\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0086\30\3\2\2\2\u0087\u008b\7$\2\2\u0088\u008a\n\3\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7$\2\2\u008f"+
		"\32\3\2\2\2\u0090\u0091\7N\2\2\u0091\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093"+
		"\34\3\2\2\2\u0094\u0095\7d\2\2\u0095\u0096\7g\2\2\u0096\36\3\2\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7g\2\2\u0099\u009a\7y\2\2\u009a\u009b\7\"\2"+
		"\2\u009b\u009c\7i\2\2\u009c\u009d\7c\2\2\u009d\u009e\7o\2\2\u009e\u009f"+
		"\7g\2\2\u009f \3\2\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3"+
		"\7y\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7q\2\2\u00a6"+
		"\u00a7\7d\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7v\2\2\u00a9\"\3\2\2\2\u00aa"+
		"\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7e\2\2"+
		"\u00ae\u00af\7q\2\2\u00af\u00b0\7o\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7f\2"+
		"\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6"+
		"\7r\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7u\2\2\u00be(\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"*\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7f\2\2\u00c5"+
		",\3\2\2\2\u00c6\u00ca\7\u2194\2\2\u00c7\u00c8\7/\2\2\u00c8\u00ca\7@\2"+
		"\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca.\3\2\2\2\u00cb\u00cc"+
		"\7Q\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7v\2\2\u00ce\60\3\2\2\2\u00cf\u00d0"+
		"\7C\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7i\2\2\u00d4\u00dc\7p\2\2\u00d5\u00dc\5/\30\2\u00d6\u00d7\7R\2"+
		"\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00dc"+
		"\7v\2\2\u00db\u00cf\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00df\t\4\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2"+
		"\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4"+
		"\t\5\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\64\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\t\5\2"+
		"\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\66\3\2\2\2\u00ed\u00ef\7a\2\2\u00ee\u00f0\t\5\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f28\3\2\2\2\u00f3\u00f5\t\6\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7:\3\2\2\2\u00f8"+
		"\u00fa\t\7\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\36\2\2\u00fe"+
		"<\3\2\2\2\21\2p\u0085\u008b\u00c9\u00db\u00e0\u00e3\u00e5\u00e9\u00eb"+
		"\u00ef\u00f1\u00f6\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}