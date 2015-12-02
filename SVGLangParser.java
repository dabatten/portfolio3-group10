// Generated from SVGLang.g4 by ANTLR 4.4

 	import java.awt.Color;
 	import util.SVGparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVGLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, INT=5, WS=6, SEMI=7, TEXT=8, CIRCLE=9, 
		RECTANGLE=10, LINE=11, POLYGON=12, RED=13, BLUE=14, YELLOW=15, GREEN=16, 
		BLACK=17, WHITE=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'RGB('", "')'", "','", "'('", "INT", "WS", "';'", "'text'", 
		"'circle'", "'rectangle'", "'line'", "'polygon'", "'red'", "'blue'", "'yellow'", 
		"'green'", "'black'", "'white'"
	};
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_shape = 2, RULE_rect = 3, RULE_circle = 4, 
		RULE_line = 5, RULE_color = 6, RULE_location = 7;
	public static final String[] ruleNames = {
		"start", "command", "shape", "rect", "circle", "line", "color", "location"
	};

	@Override
	public String getGrammarFileName() { return "SVGLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		int width = 0;
		int height = 0;
		int radius = 0;
		int x = 0;
		int y = 0;
		int red = 0;
		int green = 0;
		int blue = 0;
		Color c = new Color(red, green, blue);
		SVGparser svg = new SVGparser();


	public SVGLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public List<TerminalNode> SEMI() { return getTokens(SVGLangParser.SEMI); }
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode SEMI(int i) {
			return getToken(SVGLangParser.SEMI, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCLE) | (1L << RECTANGLE) | (1L << LINE))) != 0)) {
				{
				{
				setState(16); command();
				setState(17); match(SEMI);
				}
				}
				setState(23);
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

	public static class CommandContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(26);
			switch (_input.LA(1)) {
			case CIRCLE:
			case RECTANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); shape();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); line();
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

	public static class ShapeContext extends ParserRuleContext {
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
		}
		public RectContext rect() {
			return getRuleContext(RectContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitShape(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_shape);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case RECTANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); rect();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); circle();
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

	public static class RectContext extends ParserRuleContext {
		public Token INT;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(SVGLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SVGLangParser.INT, i);
		}
		public TerminalNode RECTANGLE() { return getToken(SVGLangParser.RECTANGLE, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public RectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterRect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitRect(this);
		}
	}

	public final RectContext rect() throws RecognitionException {
		RectContext _localctx = new RectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(RECTANGLE);
			setState(33); ((RectContext)_localctx).INT = match(INT);
			width = (((RectContext)_localctx).INT!=null?Integer.valueOf(((RectContext)_localctx).INT.getText()):0);
			setState(35); ((RectContext)_localctx).INT = match(INT);
			height = (((RectContext)_localctx).INT!=null?Integer.valueOf(((RectContext)_localctx).INT.getText()):0);
			setState(37); location();
			setState(38); color();
			svg.newRectangle(width,height,x,y,c);
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

	public static class CircleContext extends ParserRuleContext {
		public Token INT;
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode INT() { return getToken(SVGLangParser.INT, 0); }
		public TerminalNode CIRCLE() { return getToken(SVGLangParser.CIRCLE, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitCircle(this);
		}
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_circle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(CIRCLE);
			setState(42); ((CircleContext)_localctx).INT = match(INT);
			radius = (((CircleContext)_localctx).INT!=null?Integer.valueOf(((CircleContext)_localctx).INT.getText()):0);
			setState(44); location();
			setState(45); color();
			System.out.println("color:" + c.toString());
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
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public TerminalNode LINE() { return getToken(SVGLangParser.LINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(LINE);
			setState(49); location();
			setState(50); location();
			setState(51); color();
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

	public static class ColorContext extends ParserRuleContext {
		public Token INT;
		public TerminalNode YELLOW() { return getToken(SVGLangParser.YELLOW, 0); }
		public List<TerminalNode> INT() { return getTokens(SVGLangParser.INT); }
		public TerminalNode GREEN() { return getToken(SVGLangParser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(SVGLangParser.BLUE, 0); }
		public TerminalNode BLACK() { return getToken(SVGLangParser.BLACK, 0); }
		public TerminalNode RED() { return getToken(SVGLangParser.RED, 0); }
		public TerminalNode WHITE() { return getToken(SVGLangParser.WHITE, 0); }
		public TerminalNode INT(int i) {
			return getToken(SVGLangParser.INT, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_color);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case RED:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); match(RED);
				c = Color.red;
				}
				break;
			case BLUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(BLUE);
				c = Color.blue;
				}
				break;
			case YELLOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); match(YELLOW);
				c = Color.yellow;
				}
				break;
			case GREEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(59); match(GREEN);
				c = Color.green;
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); match(BLACK);
				c = Color.black;
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(63); match(WHITE);
				c = Color.white;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(65); match(T__3);
				setState(66); ((ColorContext)_localctx).INT = match(INT);
				red = (((ColorContext)_localctx).INT!=null?Integer.valueOf(((ColorContext)_localctx).INT.getText()):0);
				setState(68); match(T__1);
				setState(69); ((ColorContext)_localctx).INT = match(INT);
				green = (((ColorContext)_localctx).INT!=null?Integer.valueOf(((ColorContext)_localctx).INT.getText()):0);
				setState(71); match(T__1);
				setState(72); ((ColorContext)_localctx).INT = match(INT);
				blue = (((ColorContext)_localctx).INT!=null?Integer.valueOf(((ColorContext)_localctx).INT.getText()):0);
				setState(74); match(T__2);
				c = new Color(red, green, blue);
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

	public static class LocationContext extends ParserRuleContext {
		public Token INT;
		public List<TerminalNode> INT() { return getTokens(SVGLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SVGLangParser.INT, i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(T__0);
			setState(79); ((LocationContext)_localctx).INT = match(INT);
			x = (((LocationContext)_localctx).INT!=null?Integer.valueOf(((LocationContext)_localctx).INT.getText()):0);
			setState(81); match(T__1);
			setState(82); ((LocationContext)_localctx).INT = match(INT);
			y = (((LocationContext)_localctx).INT!=null?Integer.valueOf(((LocationContext)_localctx).INT.getText()):0);
			setState(84); match(T__2);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\5\3\35\n\3\3\4\3\4\5\4!\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\2\2\n\2\4\6\b\n\f\16\20\2\2Y\2\27\3\2\2\2\4\34\3\2\2\2\6 \3\2\2\2\b\""+
		"\3\2\2\2\n+\3\2\2\2\f\62\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22\23\5\4\3\2"+
		"\23\24\7\t\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2"+
		"\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\35\5\6\4\2\33\35\5\f\7\2"+
		"\34\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36!\5\b\5\2\37!\5\n\6\2 \36"+
		"\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"#\7\f\2\2#$\7\7\2\2$%\b\5\1\2%&\7\7\2"+
		"\2&\'\b\5\1\2\'(\5\20\t\2()\5\16\b\2)*\b\5\1\2*\t\3\2\2\2+,\7\13\2\2,"+
		"-\7\7\2\2-.\b\6\1\2./\5\20\t\2/\60\5\16\b\2\60\61\b\6\1\2\61\13\3\2\2"+
		"\2\62\63\7\r\2\2\63\64\5\20\t\2\64\65\5\20\t\2\65\66\5\16\b\2\66\r\3\2"+
		"\2\2\678\7\17\2\28O\b\b\1\29:\7\20\2\2:O\b\b\1\2;<\7\21\2\2<O\b\b\1\2"+
		"=>\7\22\2\2>O\b\b\1\2?@\7\23\2\2@O\b\b\1\2AB\7\24\2\2BO\b\b\1\2CD\7\3"+
		"\2\2DE\7\7\2\2EF\b\b\1\2FG\7\5\2\2GH\7\7\2\2HI\b\b\1\2IJ\7\5\2\2JK\7\7"+
		"\2\2KL\b\b\1\2LM\7\4\2\2MO\b\b\1\2N\67\3\2\2\2N9\3\2\2\2N;\3\2\2\2N=\3"+
		"\2\2\2N?\3\2\2\2NA\3\2\2\2NC\3\2\2\2O\17\3\2\2\2PQ\7\6\2\2QR\7\7\2\2R"+
		"S\b\t\1\2ST\7\5\2\2TU\7\7\2\2UV\b\t\1\2VW\7\4\2\2W\21\3\2\2\2\6\27\34"+
		" N";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}