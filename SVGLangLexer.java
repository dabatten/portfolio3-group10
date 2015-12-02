// Generated from SVGLang.g4 by ANTLR 4.4

 	import java.awt.Color;
 	import util.SVGparser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVGLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, INT=5, WS=6, SEMI=7, TEXT=8, CIRCLE=9, 
		RECTANGLE=10, LINE=11, POLYGON=12, RED=13, BLUE=14, YELLOW=15, GREEN=16, 
		BLACK=17, WHITE=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "INT", "WS", "ALPHA", "SEMI", "TEXT", 
		"CIRCLE", "RECTANGLE", "LINE", "POLYGON", "RED", "BLUE", "YELLOW", "GREEN", 
		"BLACK", "WHITE"
	};


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



	public SVGLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SVGLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: INT_action((RuleContext)_localctx, actionIndex); break;
		case 5: WS_action((RuleContext)_localctx, actionIndex); break;
		case 8: TEXT_action((RuleContext)_localctx, actionIndex); break;
		case 9: CIRCLE_action((RuleContext)_localctx, actionIndex); break;
		case 10: RECTANGLE_action((RuleContext)_localctx, actionIndex); break;
		case 11: LINE_action((RuleContext)_localctx, actionIndex); break;
		case 12: POLYGON_action((RuleContext)_localctx, actionIndex); break;
		case 13: RED_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void RECTANGLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("found RECTANGLE"); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("found INT : " + getText()); break;
		}
	}
	private void TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("found TEXT"); break;
		}
	}
	private void CIRCLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("found CIRCLE"); break;
		}
	}
	private void LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("found LINE"); break;
		}
	}
	private void RED_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("found RED"); break;
		}
	}
	private void POLYGON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("found POLYGON"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\6\6\66\n\6\r\6\16\6\67\3\6\3\6\3\7\6\7=\n\7\r\7\16\7>\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\2\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\7\2\"#\60\60AAC\\c|\u0097\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\62\3\2\2\2\13\65\3\2\2\2\r"+
		"<\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25M\3\2\2\2\27V\3\2\2\2"+
		"\31b\3\2\2\2\33i\3\2\2\2\35s\3\2\2\2\37y\3\2\2\2!~\3\2\2\2#\u0085\3\2"+
		"\2\2%\u008b\3\2\2\2\'\u0091\3\2\2\2)*\7T\2\2*+\7I\2\2+,\7D\2\2,-\7*\2"+
		"\2-\4\3\2\2\2./\7+\2\2/\6\3\2\2\2\60\61\7.\2\2\61\b\3\2\2\2\62\63\7*\2"+
		"\2\63\n\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\289\3\2\2\29:\b\6\2\2:\f\3\2\2\2;=\t\3\2\2<;\3\2\2\2=>\3"+
		"\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\7\3\2A\16\3\2\2\2BC\t\4\2\2C"+
		"\20\3\2\2\2DE\7=\2\2E\22\3\2\2\2FG\7v\2\2GH\7g\2\2HI\7z\2\2IJ\7v\2\2J"+
		"K\3\2\2\2KL\b\n\4\2L\24\3\2\2\2MN\7e\2\2NO\7k\2\2OP\7t\2\2PQ\7e\2\2QR"+
		"\7n\2\2RS\7g\2\2ST\3\2\2\2TU\b\13\5\2U\26\3\2\2\2VW\7t\2\2WX\7g\2\2XY"+
		"\7e\2\2YZ\7v\2\2Z[\7c\2\2[\\\7p\2\2\\]\7i\2\2]^\7n\2\2^_\7g\2\2_`\3\2"+
		"\2\2`a\b\f\6\2a\30\3\2\2\2bc\7n\2\2cd\7k\2\2de\7p\2\2ef\7g\2\2fg\3\2\2"+
		"\2gh\b\r\7\2h\32\3\2\2\2ij\7r\2\2jk\7q\2\2kl\7n\2\2lm\7{\2\2mn\7i\2\2"+
		"no\7q\2\2op\7p\2\2pq\3\2\2\2qr\b\16\b\2r\34\3\2\2\2st\7t\2\2tu\7g\2\2"+
		"uv\7f\2\2vw\3\2\2\2wx\b\17\t\2x\36\3\2\2\2yz\7d\2\2z{\7n\2\2{|\7w\2\2"+
		"|}\7g\2\2} \3\2\2\2~\177\7{\2\2\177\u0080\7g\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083\u0084\7y\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\7i\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089\7g\2\2"+
		"\u0089\u008a\7p\2\2\u008a$\3\2\2\2\u008b\u008c\7d\2\2\u008c\u008d\7n\2"+
		"\2\u008d\u008e\7c\2\2\u008e\u008f\7e\2\2\u008f\u0090\7m\2\2\u0090&\3\2"+
		"\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093\u0094\7k\2\2\u0094\u0095"+
		"\7v\2\2\u0095\u0096\7g\2\2\u0096(\3\2\2\2\5\2\67>\n\3\6\2\3\7\3\3\n\4"+
		"\3\13\5\3\f\6\3\r\7\3\16\b\3\17\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}