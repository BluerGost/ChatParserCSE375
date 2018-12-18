// Generated from c:\Users\Kevin Stephen Biswas\Desktop\ANTLAR\Project\Project.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SAYS=3, SHOUTS=4, WORD=5, WHITESPACE=6, NEWLINE=7, EMOJI=8, 
		OPERAND=9, DIGIT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "A", "S", "Y", "H", "O", "U", "T", "SAYS", "SHOUTS", "WORD", 
		"WHITESPACE", "NEWLINE", "SMILE", "WELLDONE", "SAD", "JOKING", "EMOJI", 
		"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPERAND", "NUMBER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SAYS", "SHOUTS", "WORD", "WHITESPACE", "NEWLINE", "EMOJI", 
		"OPERAND", "DIGIT"
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


	public ProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Project.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u0091\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\6\rW\n\r\r\r\16\rX\3\16\3\16\3\17\5\17^\n\17\3\17\3\17\6\17"+
		"b\n\17\r\17\16\17c\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\6\24w\n\24\r\24\16\24x\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\6\31\u0087\n\31\r\31\16"+
		"\31\u0088\3\32\3\32\3\33\6\33\u008e\n\33\r\33\16\33\u008f\2\2\34\3\3\5"+
		"\4\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\5\27\6\31\7\33\b\35\t\37\2!\2#\2"+
		"%\2\'\n)\2+\2-\2/\2\61\13\63\2\65\f\3\2\13\4\2CCcc\4\2UUuu\4\2[[{{\4\2"+
		"JJjj\4\2QQqq\4\2WWww\4\2VVvv\4\2C\\c|\4\2\13\13\"\"\2\u008d\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\'\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2"+
		"\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2"+
		"\23G\3\2\2\2\25I\3\2\2\2\27N\3\2\2\2\31V\3\2\2\2\33Z\3\2\2\2\35a\3\2\2"+
		"\2\37e\3\2\2\2!h\3\2\2\2#l\3\2\2\2%o\3\2\2\2\'v\3\2\2\2)z\3\2\2\2+|\3"+
		"\2\2\2-~\3\2\2\2/\u0080\3\2\2\2\61\u0086\3\2\2\2\63\u008a\3\2\2\2\65\u008d"+
		"\3\2\2\2\678\7<\2\28\4\3\2\2\29:\7B\2\2:\6\3\2\2\2;<\t\2\2\2<\b\3\2\2"+
		"\2=>\t\3\2\2>\n\3\2\2\2?@\t\4\2\2@\f\3\2\2\2AB\t\5\2\2B\16\3\2\2\2CD\t"+
		"\6\2\2D\20\3\2\2\2EF\t\7\2\2F\22\3\2\2\2GH\t\b\2\2H\24\3\2\2\2IJ\5\t\5"+
		"\2JK\5\7\4\2KL\5\13\6\2LM\5\t\5\2M\26\3\2\2\2NO\5\t\5\2OP\5\r\7\2PQ\5"+
		"\17\b\2QR\5\21\t\2RS\5\23\n\2ST\5\t\5\2T\30\3\2\2\2UW\t\t\2\2VU\3\2\2"+
		"\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\32\3\2\2\2Z[\t\n\2\2[\34\3\2\2\2\\^"+
		"\7\17\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_b\7\f\2\2`b\7\17\2\2a]\3\2\2"+
		"\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\36\3\2\2\2ef\7<\2\2fg\7+\2"+
		"\2g \3\2\2\2hi\7*\2\2ij\7{\2\2jk\7+\2\2k\"\3\2\2\2lm\7<\2\2mn\7*\2\2n"+
		"$\3\2\2\2op\7<\2\2pq\7r\2\2q&\3\2\2\2rw\5\37\20\2sw\5!\21\2tw\5#\22\2"+
		"uw\5%\23\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y(\3\2\2\2z{\7-\2\2{*\3\2\2\2|}\7/\2\2},\3\2\2\2~\177\7,\2\2"+
		"\177.\3\2\2\2\u0080\u0081\7\61\2\2\u0081\60\3\2\2\2\u0082\u0087\5)\25"+
		"\2\u0083\u0087\5+\26\2\u0084\u0087\5-\27\2\u0085\u0087\5/\30\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\62\3\2\2"+
		"\2\u008a\u008b\4\62;\2\u008b\64\3\2\2\2\u008c\u008e\5\63\32\2\u008d\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\66\3\2\2\2\f\2X]acvx\u0086\u0088\u008f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}