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
		T__0=1, T__1=2, Number=3, D=4, ADDITION=5, SUBSTRACTION=6, MULTIPLICATION=7;
	public static final int
		RULE_eval = 0, RULE_intExpr = 1, RULE_intAdditionExpr = 2, RULE_intMultiplyExpr = 3, 
		RULE_intAtomExpr = 4, RULE_baseRoll = 5;
	public static final String[] ruleNames = {
		"eval", "intExpr", "intAdditionExpr", "intMultiplyExpr", "intAtomExpr", 
		"baseRoll"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, "'+'", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Number", "D", "ADDITION", "SUBSTRACTION", "MULTIPLICATION"
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
		public IntExprContext expr;
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
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
			setState(12);
			((EvalContext)_localctx).expr = intExpr();
			 ((EvalContext)_localctx).value =  ((EvalContext)_localctx).expr.value; 
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

	public static class IntExprContext extends ParserRuleContext {
		public int value;
		public IntAdditionExprContext expr;
		public IntAdditionExprContext intAdditionExpr() {
			return getRuleContext(IntAdditionExprContext.class,0);
		}
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).exitIntExpr(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		IntExprContext _localctx = new IntExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_intExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			((IntExprContext)_localctx).expr = intAdditionExpr();
			 ((IntExprContext)_localctx).value =  ((IntExprContext)_localctx).expr.value; 
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

	public static class IntAdditionExprContext extends ParserRuleContext {
		public int value;
		public IntMultiplyExprContext o1;
		public IntMultiplyExprContext o2;
		public List<IntMultiplyExprContext> intMultiplyExpr() {
			return getRuleContexts(IntMultiplyExprContext.class);
		}
		public IntMultiplyExprContext intMultiplyExpr(int i) {
			return getRuleContext(IntMultiplyExprContext.class,i);
		}
		public List<TerminalNode> ADDITION() { return getTokens(DiceNotationParser.ADDITION); }
		public TerminalNode ADDITION(int i) {
			return getToken(DiceNotationParser.ADDITION, i);
		}
		public List<TerminalNode> SUBSTRACTION() { return getTokens(DiceNotationParser.SUBSTRACTION); }
		public TerminalNode SUBSTRACTION(int i) {
			return getToken(DiceNotationParser.SUBSTRACTION, i);
		}
		public IntAdditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAdditionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).enterIntAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).exitIntAdditionExpr(this);
		}
	}

	public final IntAdditionExprContext intAdditionExpr() throws RecognitionException {
		IntAdditionExprContext _localctx = new IntAdditionExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_intAdditionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((IntAdditionExprContext)_localctx).o1 = intMultiplyExpr();
			 ((IntAdditionExprContext)_localctx).value =  ((IntAdditionExprContext)_localctx).o1.value; 
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITION || _la==SUBSTRACTION) {
				{
				setState(28);
				switch (_input.LA(1)) {
				case ADDITION:
					{
					setState(20);
					match(ADDITION);
					setState(21);
					((IntAdditionExprContext)_localctx).o2 = intMultiplyExpr();
					 _localctx.value += ((IntAdditionExprContext)_localctx).o2.value; 
					}
					break;
				case SUBSTRACTION:
					{
					setState(24);
					match(SUBSTRACTION);
					setState(25);
					((IntAdditionExprContext)_localctx).o2 = intMultiplyExpr();
					 _localctx.value -= ((IntAdditionExprContext)_localctx).o2.value; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IntMultiplyExprContext extends ParserRuleContext {
		public int value;
		public IntAtomExprContext o1;
		public IntAtomExprContext o2;
		public List<IntAtomExprContext> intAtomExpr() {
			return getRuleContexts(IntAtomExprContext.class);
		}
		public IntAtomExprContext intAtomExpr(int i) {
			return getRuleContext(IntAtomExprContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATION() { return getTokens(DiceNotationParser.MULTIPLICATION); }
		public TerminalNode MULTIPLICATION(int i) {
			return getToken(DiceNotationParser.MULTIPLICATION, i);
		}
		public IntMultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intMultiplyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).enterIntMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).exitIntMultiplyExpr(this);
		}
	}

	public final IntMultiplyExprContext intMultiplyExpr() throws RecognitionException {
		IntMultiplyExprContext _localctx = new IntMultiplyExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intMultiplyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((IntMultiplyExprContext)_localctx).o1 = intAtomExpr();
			 ((IntMultiplyExprContext)_localctx).value =  ((IntMultiplyExprContext)_localctx).o1.value; 
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION) {
				{
				{
				setState(35);
				match(MULTIPLICATION);
				setState(36);
				((IntMultiplyExprContext)_localctx).o2 = intAtomExpr();
				 _localctx.value *= ((IntMultiplyExprContext)_localctx).o2.value; 
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IntAtomExprContext extends ParserRuleContext {
		public int value;
		public Token n;
		public BaseRollContext br;
		public IntExprContext expr;
		public TerminalNode Number() { return getToken(DiceNotationParser.Number, 0); }
		public BaseRollContext baseRoll() {
			return getRuleContext(BaseRollContext.class,0);
		}
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public IntAtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAtomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).enterIntAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceNotationListener ) ((DiceNotationListener)listener).exitIntAtomExpr(this);
		}
	}

	public final IntAtomExprContext intAtomExpr() throws RecognitionException {
		IntAtomExprContext _localctx = new IntAtomExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intAtomExpr);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((IntAtomExprContext)_localctx).n = match(Number);
				 ((IntAtomExprContext)_localctx).value =  Integer.parseInt((((IntAtomExprContext)_localctx).n!=null?((IntAtomExprContext)_localctx).n.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((IntAtomExprContext)_localctx).br = baseRoll();
				 ((IntAtomExprContext)_localctx).value =  ((IntAtomExprContext)_localctx).br.value; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(T__0);
				setState(50);
				((IntAtomExprContext)_localctx).expr = intExpr();
				setState(51);
				match(T__1);
				 ((IntAtomExprContext)_localctx).value =  ((IntAtomExprContext)_localctx).expr.value; 
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

	public static class BaseRollContext extends ParserRuleContext {
		public int value;
		public Token a;
		public Token b;
		public TerminalNode D() { return getToken(DiceNotationParser.D, 0); }
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
		enterRule(_localctx, 10, RULE_baseRoll);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if (_la==Number) {
				{
				setState(56);
				((BaseRollContext)_localctx).a = match(Number);
				}
			}

			setState(59);
			match(D);
			{
			setState(60);
			((BaseRollContext)_localctx).b = match(Number);
			}

			        int x, y, v;
			        int sum = 0;
			        x = (((BaseRollContext)_localctx).a != null) ? Integer.parseInt((((BaseRollContext)_localctx).a!=null?((BaseRollContext)_localctx).a.getText():null)) : 1;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\tB\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\69\n\6\3\7\5\7<\n\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2A"+
		"\2\16\3\2\2\2\4\21\3\2\2\2\6\24\3\2\2\2\b#\3\2\2\2\n8\3\2\2\2\f;\3\2\2"+
		"\2\16\17\5\4\3\2\17\20\b\2\1\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\b\3\1"+
		"\2\23\5\3\2\2\2\24\25\5\b\5\2\25 \b\4\1\2\26\27\7\7\2\2\27\30\5\b\5\2"+
		"\30\31\b\4\1\2\31\37\3\2\2\2\32\33\7\b\2\2\33\34\5\b\5\2\34\35\b\4\1\2"+
		"\35\37\3\2\2\2\36\26\3\2\2\2\36\32\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !"+
		"\3\2\2\2!\7\3\2\2\2\" \3\2\2\2#$\5\n\6\2$+\b\5\1\2%&\7\t\2\2&\'\5\n\6"+
		"\2\'(\b\5\1\2(*\3\2\2\2)%\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\t\3\2"+
		"\2\2-+\3\2\2\2./\7\5\2\2/9\b\6\1\2\60\61\5\f\7\2\61\62\b\6\1\2\629\3\2"+
		"\2\2\63\64\7\3\2\2\64\65\5\4\3\2\65\66\7\4\2\2\66\67\b\6\1\2\679\3\2\2"+
		"\28.\3\2\2\28\60\3\2\2\28\63\3\2\2\29\13\3\2\2\2:<\7\5\2\2;:\3\2\2\2;"+
		"<\3\2\2\2<=\3\2\2\2=>\7\6\2\2>?\7\5\2\2?@\b\7\1\2@\r\3\2\2\2\7\36 +8;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}