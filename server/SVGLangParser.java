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
		T__2=1, T__1=2, T__0=3, INT=4, WS=5, SEMI=6, TEXT=7, CIRCLE=8, RECTANGLE=9, 
		LINE=10, POLYGON=11, RED=12, BLUE=13, YELLOW=14, GREEN=15, BLACK=16, WHITE=17, 
		COMMA=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'RGB('", "')'", "'('", "INT", "WS", "';'", "'text'", "'circle'", 
		"'rectangle'", "'line'", "'polygon'", "'red'", "'blue'", "'yellow'", "'green'", 
		"'black'", "'white'", "','"
	};
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_shape = 2, RULE_rect = 3, RULE_circle = 4, 
		RULE_line = 5, RULE_color = 6, RULE_location = 7, RULE_start_point = 8, 
		RULE_end_point = 9;
	public static final String[] ruleNames = {
		"start", "command", "shape", "rect", "circle", "line", "color", "location", 
		"start_point", "end_point"
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


		//rect and circle
		int width = 0;
		int height = 0;
		int radius = 0;
		int x = 0;
		int y = 0;
		
		//line
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		//rgb
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CIRCLE) | (1L << RECTANGLE) | (1L << LINE))) != 0)) {
				{
				{
				setState(20); command();
				setState(21); match(SEMI);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			svg.buildFile();
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
			setState(32);
			switch (_input.LA(1)) {
			case CIRCLE:
			case RECTANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); shape();
				}
				break;
			case LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); line();
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
			setState(36);
			switch (_input.LA(1)) {
			case RECTANGLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); rect();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); circle();
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
			setState(38); match(RECTANGLE);
			setState(39); ((RectContext)_localctx).INT = match(INT);
			width = (((RectContext)_localctx).INT!=null?Integer.valueOf(((RectContext)_localctx).INT.getText()):0);
			setState(41); ((RectContext)_localctx).INT = match(INT);
			height = (((RectContext)_localctx).INT!=null?Integer.valueOf(((RectContext)_localctx).INT.getText()):0);
			setState(43); location();
			setState(44); color();
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
			setState(47); match(CIRCLE);
			setState(48); ((CircleContext)_localctx).INT = match(INT);
			radius = (((CircleContext)_localctx).INT!=null?Integer.valueOf(((CircleContext)_localctx).INT.getText()):0);
			setState(50); location();
			setState(51); color();
			svg.newCircle(radius,x,y,c);
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
		public Start_pointContext start_point() {
			return getRuleContext(Start_pointContext.class,0);
		}
		public End_pointContext end_point() {
			return getRuleContext(End_pointContext.class,0);
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
			setState(54); match(LINE);
			setState(55); start_point();
			setState(56); end_point();
			setState(57); color();
			svg.newLine(x1,y1,x2,y2,c);
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
			setState(83);
			switch (_input.LA(1)) {
			case RED:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); match(RED);
				c = Color.red;
				}
				break;
			case BLUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(BLUE);
				c = Color.blue;
				}
				break;
			case YELLOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(64); match(YELLOW);
				c = Color.yellow;
				}
				break;
			case GREEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(66); match(GREEN);
				c = Color.green;
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(68); match(BLACK);
				c = Color.black;
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(70); match(WHITE);
				c = Color.white;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(72); match(T__2);
				setState(73); ((ColorContext)_localctx).INT = match(INT);
				red = (((ColorContext)_localctx).INT!=null?Integer.valueOf(((ColorContext)_localctx).INT.getText()):0);
				setState(75); match(COMMA);
				setState(76); ((ColorContext)_localctx).INT = match(INT);
				green = (((ColorContext)_localctx).INT!=null?Integer.valueOf(((ColorContext)_localctx).INT.getText()):0);
				setState(78); match(COMMA);
				setState(79); ((ColorContext)_localctx).INT = match(INT);
				blue = (((ColorContext)_localctx).INT!=null?Integer.valueOf(((ColorContext)_localctx).INT.getText()):0);
				setState(81); match(T__1);
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
		public TerminalNode COMMA() { return getToken(SVGLangParser.COMMA, 0); }
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
			setState(85); match(T__0);
			setState(86); ((LocationContext)_localctx).INT = match(INT);
			x = (((LocationContext)_localctx).INT!=null?Integer.valueOf(((LocationContext)_localctx).INT.getText()):0);
			setState(88); match(COMMA);
			setState(89); ((LocationContext)_localctx).INT = match(INT);
			y = (((LocationContext)_localctx).INT!=null?Integer.valueOf(((LocationContext)_localctx).INT.getText()):0);
			setState(91); match(T__1);
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

	public static class Start_pointContext extends ParserRuleContext {
		public Token INT;
		public List<TerminalNode> INT() { return getTokens(SVGLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SVGLangParser.INT, i);
		}
		public Start_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterStart_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitStart_point(this);
		}
	}

	public final Start_pointContext start_point() throws RecognitionException {
		Start_pointContext _localctx = new Start_pointContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(T__0);
			setState(94); ((Start_pointContext)_localctx).INT = match(INT);
			x1 = (((Start_pointContext)_localctx).INT!=null?Integer.valueOf(((Start_pointContext)_localctx).INT.getText()):0);
			setState(96); match(COMMA);
			setState(97); ((Start_pointContext)_localctx).INT = match(INT);
			y1 = (((Start_pointContext)_localctx).INT!=null?Integer.valueOf(((Start_pointContext)_localctx).INT.getText()):0);
			setState(99); match(T__1);
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

	public static class End_pointContext extends ParserRuleContext {
		public Token INT;
		public List<TerminalNode> INT() { return getTokens(SVGLangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SVGLangParser.INT, i);
		}
		public End_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).enterEnd_point(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGLangListener ) ((SVGLangListener)listener).exitEnd_point(this);
		}
	}

	public final End_pointContext end_point() throws RecognitionException {
		End_pointContext _localctx = new End_pointContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_end_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(T__0);
			setState(102); ((End_pointContext)_localctx).INT = match(INT);
			x2 = (((End_pointContext)_localctx).INT!=null?Integer.valueOf(((End_pointContext)_localctx).INT.getText()):0);
			setState(104); match(COMMA);
			setState(105); ((End_pointContext)_localctx).INT = match(INT);
			y2 = (((End_pointContext)_localctx).INT!=null?Integer.valueOf(((End_pointContext)_localctx).INT.getText()):0);
			setState(107); match(T__1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\5\3#\n\3\3\4\3"+
		"\4\5\4\'\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bV\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2n\2\33"+
		"\3\2\2\2\4\"\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n\61\3\2\2\2\f8\3\2\2\2\16"+
		"U\3\2\2\2\20W\3\2\2\2\22_\3\2\2\2\24g\3\2\2\2\26\27\5\4\3\2\27\30\7\b"+
		"\2\2\30\32\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2"+
		"\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\b\2\1\2\37\3\3\2\2\2 #\5\6\4\2"+
		"!#\5\f\7\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$\'\5\b\5\2%\'\5\n\6\2&$\3"+
		"\2\2\2&%\3\2\2\2\'\7\3\2\2\2()\7\13\2\2)*\7\6\2\2*+\b\5\1\2+,\7\6\2\2"+
		",-\b\5\1\2-.\5\20\t\2./\5\16\b\2/\60\b\5\1\2\60\t\3\2\2\2\61\62\7\n\2"+
		"\2\62\63\7\6\2\2\63\64\b\6\1\2\64\65\5\20\t\2\65\66\5\16\b\2\66\67\b\6"+
		"\1\2\67\13\3\2\2\289\7\f\2\29:\5\22\n\2:;\5\24\13\2;<\5\16\b\2<=\b\7\1"+
		"\2=\r\3\2\2\2>?\7\16\2\2?V\b\b\1\2@A\7\17\2\2AV\b\b\1\2BC\7\20\2\2CV\b"+
		"\b\1\2DE\7\21\2\2EV\b\b\1\2FG\7\22\2\2GV\b\b\1\2HI\7\23\2\2IV\b\b\1\2"+
		"JK\7\3\2\2KL\7\6\2\2LM\b\b\1\2MN\7\24\2\2NO\7\6\2\2OP\b\b\1\2PQ\7\24\2"+
		"\2QR\7\6\2\2RS\b\b\1\2ST\7\4\2\2TV\b\b\1\2U>\3\2\2\2U@\3\2\2\2UB\3\2\2"+
		"\2UD\3\2\2\2UF\3\2\2\2UH\3\2\2\2UJ\3\2\2\2V\17\3\2\2\2WX\7\5\2\2XY\7\6"+
		"\2\2YZ\b\t\1\2Z[\7\24\2\2[\\\7\6\2\2\\]\b\t\1\2]^\7\4\2\2^\21\3\2\2\2"+
		"_`\7\5\2\2`a\7\6\2\2ab\b\n\1\2bc\7\24\2\2cd\7\6\2\2de\b\n\1\2ef\7\4\2"+
		"\2f\23\3\2\2\2gh\7\5\2\2hi\7\6\2\2ij\b\13\1\2jk\7\24\2\2kl\7\6\2\2lm\b"+
		"\13\1\2mn\7\4\2\2n\25\3\2\2\2\6\33\"&U";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}