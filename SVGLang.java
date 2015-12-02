// Generated from SVGLang.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVGLang extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, WS=2, TEXT=3, CIRCLE=4, RECTANGLE=5, LINE=6, POLYGON=7, RGB=8, 
		RED=9, BLUE=10, YELLOW=11, GREEN=12, BlACK=13, WHITE=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"INT", "WS", "ALPHA", "TEXT", "CIRCLE", "RECTANGLE", "LINE", "POLYGON", 
		"RGB", "RED", "BLUE", "YELLOW", "GREEN", "BlACK", "WHITE"
	};


	public SVGLang(CharStream input) {
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
		case 0: INT_action((RuleContext)_localctx, actionIndex); break;
		case 1: WS_action((RuleContext)_localctx, actionIndex); break;
		case 3: TEXT_action((RuleContext)_localctx, actionIndex); break;
		case 4: CIRCLE_action((RuleContext)_localctx, actionIndex); break;
		case 5: RECTANGLE_action((RuleContext)_localctx, actionIndex); break;
		case 6: LINE_action((RuleContext)_localctx, actionIndex); break;
		case 7: POLYGON_action((RuleContext)_localctx, actionIndex); break;
		case 8: RGB_action((RuleContext)_localctx, actionIndex); break;
		case 9: RED_action((RuleContext)_localctx, actionIndex); break;
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
		case 8: System.out.println("found RED"); break;
		}
	}
	private void RGB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("found RGB : " + getText()); break;
		}
	}
	private void POLYGON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("found POLYGON"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\nc\n\n\r\n\16\nd\3\n\6\n"+
		"h\n\n\r\n\16\ni\3\n\6\nm\n\n\r\n\16\nn\3\n\6\nr\n\n\r\n\16\ns\3\n\6\n"+
		"w\n\n\r\n\16\nx\3\n\6\n|\n\n\r\n\16\n}\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\2\2\21\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31"+
		"\r\33\16\35\17\37\20\3\2\5\3\2\62;\5\2\13\f\17\17\"\"\7\2\"#\60\60AAC"+
		"\\c|\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\"\3\2\2\2\5)\3\2"+
		"\2\2\7/\3\2\2\2\t\61\3\2\2\2\138\3\2\2\2\rA\3\2\2\2\17M\3\2\2\2\21T\3"+
		"\2\2\2\23b\3\2\2\2\25\u0082\3\2\2\2\27\u0088\3\2\2\2\31\u008d\3\2\2\2"+
		"\33\u0094\3\2\2\2\35\u009a\3\2\2\2\37\u00a0\3\2\2\2!#\t\2\2\2\"!\3\2\2"+
		"\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\b\2\2\2\'\4\3\2\2\2(*\t"+
		"\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\3\3\2.\6"+
		"\3\2\2\2/\60\t\4\2\2\60\b\3\2\2\2\61\62\7v\2\2\62\63\7g\2\2\63\64\7z\2"+
		"\2\64\65\7v\2\2\65\66\3\2\2\2\66\67\b\5\4\2\67\n\3\2\2\289\7e\2\29:\7"+
		"k\2\2:;\7t\2\2;<\7e\2\2<=\7n\2\2=>\7g\2\2>?\3\2\2\2?@\b\6\5\2@\f\3\2\2"+
		"\2AB\7t\2\2BC\7g\2\2CD\7e\2\2DE\7v\2\2EF\7c\2\2FG\7p\2\2GH\7i\2\2HI\7"+
		"n\2\2IJ\7g\2\2JK\3\2\2\2KL\b\7\6\2L\16\3\2\2\2MN\7n\2\2NO\7k\2\2OP\7p"+
		"\2\2PQ\7g\2\2QR\3\2\2\2RS\b\b\7\2S\20\3\2\2\2TU\7r\2\2UV\7q\2\2VW\7n\2"+
		"\2WX\7{\2\2XY\7i\2\2YZ\7q\2\2Z[\7p\2\2[\\\3\2\2\2\\]\b\t\b\2]\22\3\2\2"+
		"\2^_\7T\2\2_`\7I\2\2`a\7D\2\2ac\7*\2\2b^\3\2\2\2cd\3\2\2\2db\3\2\2\2d"+
		"e\3\2\2\2eg\3\2\2\2fh\5\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2km\7.\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2"+
		"pr\5\3\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\7.\2\2"+
		"vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\3\2\2{z\3\2\2\2"+
		"|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7+\2\2\u0080\u0081"+
		"\b\n\t\2\u0081\24\3\2\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7f\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\13\n\2\u0087\26\3\2\2"+
		"\2\u0088\u0089\7d\2\2\u0089\u008a\7n\2\2\u008a\u008b\7w\2\2\u008b\u008c"+
		"\7g\2\2\u008c\30\3\2\2\2\u008d\u008e\7{\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7n\2\2\u0091\u0092\7q\2\2\u0092\u0093\7y\2\2\u0093"+
		"\32\3\2\2\2\u0094\u0095\7i\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\34\3\2\2\2\u009a\u009b\7d\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7c\2\2\u009d\u009e\7e\2\2\u009e\u009f\7m\2\2"+
		"\u009f\36\3\2\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7"+
		"k\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7g\2\2\u00a5 \3\2\2\2\13\2$+dins"+
		"x}\13\3\2\2\3\3\3\3\5\4\3\6\5\3\7\6\3\b\7\3\t\b\3\n\t\3\13\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}