// Generated from c:\Users\Kevin Stephen Biswas\Desktop\ANTLAR\Project\Project.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SAYS=3, SHOUTS=4, WORD=5, WHITESPACE=6, NEWLINE=7, EMOJI=8, 
		OPERAND=9, DIGIT=10;
	public static final int
		RULE_chat = 0, RULE_line = 1, RULE_message = 2, RULE_name = 3, RULE_command = 4, 
		RULE_mention = 5, RULE_emotion = 6, RULE_math = 7;
	public static final String[] ruleNames = {
		"chat", "line", "message", "name", "command", "mention", "emotion", "math"
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

	@Override
	public String getGrammarFileName() { return "Project.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChatContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProjectParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ChatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chat; }
	}

	public final ChatContext chat() throws RecognitionException {
		ChatContext _localctx = new ChatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				line();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD || _la==NEWLINE );
			setState(21);
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

	public static class LineContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ProjectParser.NEWLINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			name();
			setState(24);
			command();
			setState(25);
			message();
			setState(26);
			match(NEWLINE);
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

	public static class MessageContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ProjectParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ProjectParser.NEWLINE, i);
		}
		public List<MentionContext> mention() {
			return getRuleContexts(MentionContext.class);
		}
		public MentionContext mention(int i) {
			return getRuleContext(MentionContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(ProjectParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ProjectParser.WORD, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(ProjectParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(ProjectParser.WHITESPACE, i);
		}
		public List<EmotionContext> emotion() {
			return getRuleContexts(EmotionContext.class);
		}
		public EmotionContext emotion(int i) {
			return getRuleContext(EmotionContext.class,i);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_message);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(34);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NEWLINE:
						{
						setState(28);
						match(NEWLINE);
						}
						break;
					case T__1:
						{
						setState(29);
						mention();
						}
						break;
					case WORD:
						{
						setState(30);
						match(WORD);
						}
						break;
					case WHITESPACE:
						{
						setState(31);
						match(WHITESPACE);
						}
						break;
					case EMOJI:
						{
						setState(32);
						emotion();
						}
						break;
					case DIGIT:
						{
						setState(33);
						math();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ProjectParser.WORD, 0); }
		public TerminalNode WHITESPACE() { return getToken(ProjectParser.WHITESPACE, 0); }
		public TerminalNode NEWLINE() { return getToken(ProjectParser.NEWLINE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(38);
				match(NEWLINE);
				}
			}

			setState(41);
			match(WORD);
			setState(42);
			match(WHITESPACE);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode WHITESPACE() { return getToken(ProjectParser.WHITESPACE, 0); }
		public TerminalNode SAYS() { return getToken(ProjectParser.SAYS, 0); }
		public TerminalNode SHOUTS() { return getToken(ProjectParser.SHOUTS, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==SAYS || _la==SHOUTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(45);
			match(T__0);
			setState(46);
			match(WHITESPACE);
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

	public static class MentionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ProjectParser.WORD, 0); }
		public MentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mention; }
	}

	public final MentionContext mention() throws RecognitionException {
		MentionContext _localctx = new MentionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mention);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(WORD);
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

	public static class EmotionContext extends ParserRuleContext {
		public TerminalNode EMOJI() { return getToken(ProjectParser.EMOJI, 0); }
		public EmotionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emotion; }
	}

	public final EmotionContext emotion() throws RecognitionException {
		EmotionContext _localctx = new EmotionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emotion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(EMOJI);
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

	public static class MathContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ProjectParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ProjectParser.DIGIT, i);
		}
		public TerminalNode OPERAND() { return getToken(ProjectParser.OPERAND, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_math);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(DIGIT);
			setState(54);
			match(OPERAND);
			setState(55);
			match(DIGIT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4%\n\4"+
		"\r\4\16\4&\3\5\5\5*\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\5\6\2;\2\23\3\2"+
		"\2\2\4\31\3\2\2\2\6$\3\2\2\2\b)\3\2\2\2\n.\3\2\2\2\f\62\3\2\2\2\16\65"+
		"\3\2\2\2\20\67\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32"+
		"\5\b\5\2\32\33\5\n\6\2\33\34\5\6\4\2\34\35\7\t\2\2\35\5\3\2\2\2\36%\7"+
		"\t\2\2\37%\5\f\7\2 %\7\7\2\2!%\7\b\2\2\"%\5\16\b\2#%\5\20\t\2$\36\3\2"+
		"\2\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&$"+
		"\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(*\7\t\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2"+
		"\2+,\7\7\2\2,-\7\b\2\2-\t\3\2\2\2./\t\2\2\2/\60\7\3\2\2\60\61\7\b\2\2"+
		"\61\13\3\2\2\2\62\63\7\4\2\2\63\64\7\7\2\2\64\r\3\2\2\2\65\66\7\n\2\2"+
		"\66\17\3\2\2\2\678\7\f\2\289\7\13\2\29:\7\f\2\2:\21\3\2\2\2\6\25$&)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}