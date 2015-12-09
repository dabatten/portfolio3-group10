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
		T__2=1, T__1=2, T__0=3, INT=4, WS=5, SEMI=6, TEXT=7, CIRCLE=8, RECTANGLE=9, 
		LINE=10, POLYGON=11, RED=12, BLUE=13, YELLOW=14, GREEN=15, BLACK=16, WHITE=17, 
		COMMA=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "INT", "WS", "ALPHA", "SEMI", "TEXT", "CIRCLE", 
		"RECTANGLE", "LINE", "POLYGON", "RED", "BLUE", "YELLOW", "GREEN", "BLACK", 
		"WHITE", "COMMA"
	};


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
		case 3: INT_action((RuleContext)_localctx, actionIndex); break;
		case 4: WS_action((RuleContext)_localctx, actionIndex); break;
		case 7: TEXT_action((RuleContext)_localctx, actionIndex); break;
		case 8: CIRCLE_action((RuleContext)_localctx, actionIndex); break;
		case 9: RECTANGLE_action((RuleContext)_localctx, actionIndex); break;
		case 10: LINE_action((RuleContext)_localctx, actionIndex); break;
		case 11: POLYGON_action((RuleContext)_localctx, actionIndex); break;
		case 12: RED_action((RuleContext)_localctx, actionIndex); break;
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
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5"+
		"\64\n\5\r\5\16\5\65\3\5\3\5\3\6\6\6;\n\6\r\6\16\6<\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\2\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24\3\2\5"+
		"\3\2\62;\5\2\13\f\17\17\"\"\7\2\"#\60\60AAC\\c|\u0097\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\3)\3\2\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\63\3\2\2\2\13:\3\2\2\2\r@\3\2\2"+
		"\2\17B\3\2\2\2\21D\3\2\2\2\23K\3\2\2\2\25T\3\2\2\2\27`\3\2\2\2\31g\3\2"+
		"\2\2\33q\3\2\2\2\35w\3\2\2\2\37|\3\2\2\2!\u0083\3\2\2\2#\u0089\3\2\2\2"+
		"%\u008f\3\2\2\2\'\u0095\3\2\2\2)*\7T\2\2*+\7I\2\2+,\7D\2\2,-\7*\2\2-\4"+
		"\3\2\2\2./\7+\2\2/\6\3\2\2\2\60\61\7*\2\2\61\b\3\2\2\2\62\64\t\2\2\2\63"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		"8\b\5\2\28\n\3\2\2\29;\t\3\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=>\3\2\2\2>?\b\6\3\2?\f\3\2\2\2@A\t\4\2\2A\16\3\2\2\2BC\7=\2\2C\20\3\2"+
		"\2\2DE\7v\2\2EF\7g\2\2FG\7z\2\2GH\7v\2\2HI\3\2\2\2IJ\b\t\4\2J\22\3\2\2"+
		"\2KL\7e\2\2LM\7k\2\2MN\7t\2\2NO\7e\2\2OP\7n\2\2PQ\7g\2\2QR\3\2\2\2RS\b"+
		"\n\5\2S\24\3\2\2\2TU\7t\2\2UV\7g\2\2VW\7e\2\2WX\7v\2\2XY\7c\2\2YZ\7p\2"+
		"\2Z[\7i\2\2[\\\7n\2\2\\]\7g\2\2]^\3\2\2\2^_\b\13\6\2_\26\3\2\2\2`a\7n"+
		"\2\2ab\7k\2\2bc\7p\2\2cd\7g\2\2de\3\2\2\2ef\b\f\7\2f\30\3\2\2\2gh\7r\2"+
		"\2hi\7q\2\2ij\7n\2\2jk\7{\2\2kl\7i\2\2lm\7q\2\2mn\7p\2\2no\3\2\2\2op\b"+
		"\r\b\2p\32\3\2\2\2qr\7t\2\2rs\7g\2\2st\7f\2\2tu\3\2\2\2uv\b\16\t\2v\34"+
		"\3\2\2\2wx\7d\2\2xy\7n\2\2yz\7w\2\2z{\7g\2\2{\36\3\2\2\2|}\7{\2\2}~\7"+
		"g\2\2~\177\7n\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081\u0082\7y\2"+
		"\2\u0082 \3\2\2\2\u0083\u0084\7i\2\2\u0084\u0085\7t\2\2\u0085\u0086\7"+
		"g\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088\"\3\2\2\2\u0089\u008a"+
		"\7d\2\2\u008a\u008b\7n\2\2\u008b\u008c\7c\2\2\u008c\u008d\7e\2\2\u008d"+
		"\u008e\7m\2\2\u008e$\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091\7j\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094&\3\2\2\2\u0095"+
		"\u0096\7.\2\2\u0096(\3\2\2\2\5\2\65<\n\3\5\2\3\6\3\3\t\4\3\n\5\3\13\6"+
		"\3\f\7\3\r\b\3\16\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}