// Generated from pl\dzielins42\dice\DiceNotation.g4 by ANTLR 4.5
package pl.dzielins42.dice;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiceNotationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Number=2;
	public static final int
		RULE_eval = 0, RULE_baseRoll = 1;
	public static final String[] ruleNames = {
		"eval", "baseRoll"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'d'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Number"
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
	public String getGrammarFileName() { return "DiceNotation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    private java.util.Random _random = new java.util.Random();

	    public static int eval(String expression) {
	        ANTLRInputStream in = new ANTLRInputStream(expression);
	        DiceNotationLexer lexer = new DiceNotationLexer(in);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        DiceNotationParser parser = new DiceNotationParser(tokens);
	        return parser.eval().value; 
	    }


	public DiceNotationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvalContext extends ParserRuleContext {
		public int value;
		public BaseRollContext br;
		public BaseRollContext baseRoll() {
			return getRuleContext(BaseRollContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			((EvalContext)_localctx).br = baseRoll();
			((EvalContext)_localctx).value =  ((EvalContext)_localctx).br.value;
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

	public static class BaseRollContext extends ParserRuleContext {
		public int value;
		public Token a;
		public Token b;
		public List<TerminalNode> Number() { return getTokens(DiceNotationParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DiceNotationParser.Number, i);
		}
		public BaseRollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseRoll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).enterBaseRoll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).exitBaseRoll(this);
		}
	}

	public final BaseRollContext baseRoll() throws RecognitionException {
		BaseRollContext _localctx = new BaseRollContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_baseRoll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			((BaseRollContext)_localctx).a = match(Number);
			setState(8);
			match(T__0);
			setState(9);
			((BaseRollContext)_localctx).b = match(Number);

			        int x, y, v;
			        int sum = 0;
			        x = Integer.parseInt((((BaseRollContext)_localctx).a!=null?((BaseRollContext)_localctx).a.getText():null));
			        y = Integer.parseInt((((BaseRollContext)_localctx).b!=null?((BaseRollContext)_localctx).b.getText():null));
			        for (int i = 0; i < x; i++) {
			            v = _random.nextInt(y) + 1;
			            sum += v;
			        }
			        ((BaseRollContext)_localctx).value =  sum;
			    
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\4\17\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\f\2\6\3\2\2\2\4"+
		"\t\3\2\2\2\6\7\5\4\3\2\7\b\b\2\1\2\b\3\3\2\2\2\t\n\7\4\2\2\n\13\7\3\2"+
		"\2\13\f\7\4\2\2\f\r\b\3\1\2\r\5\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}