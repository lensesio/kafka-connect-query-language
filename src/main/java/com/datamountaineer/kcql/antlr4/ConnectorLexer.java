// Generated from ConnectorLexer.g4 by ANTLR 4.7
package com.datamountaineer.kcql.antlr4;

 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConnectorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INSERT=1, UPSERT=2, INTO=3, SELECT=4, FROM=5, IGNORE=6, AS=7, AUTOCREATE=8, 
		AUTOEVOLVE=9, CLUSTERBY=10, BUCKETS=11, BATCH=12, CAPITALIZE=13, INITIALIZE=14, 
		PARTITIONBY=15, DISTRIBUTEBY=16, TIMESTAMP=17, SYS_TIME=18, WITHGROUP=19, 
		WITHOFFSET=20, WITHTAG=21, WITHKEY=22, KEYDELIM=23, WITHSTRUCTURE=24, 
		WITHTYPE=25, PK=26, SAMPLE=27, EVERY=28, WITHFORMAT=29, WITHUNWRAP=30, 
		FORMAT=31, PROJECTTO=32, STOREAS=33, LIMIT=34, INCREMENTALMODE=35, WITHDOCTYPE=36, 
		WITHINDEXSUFFIX=37, WITHCONVERTER=38, WITHJMSSELECTOR=39, WITHTARGET=40, 
		WITHCOMPRESSION=41, WITHDELAY=42, TIMESTAMPUNIT=43, TTL=44, EQUAL=45, 
		INT=46, ASTERISK=47, COMMA=48, DOT=49, LEFT_PARAN=50, RIGHT_PARAN=51, 
		FIELD=52, TOPICNAME=53, KEYDELIMVALUE=54, NEWLINE=55, WS=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INSERT", "UPSERT", "INTO", "SELECT", "FROM", "IGNORE", "AS", "AUTOCREATE", 
		"AUTOEVOLVE", "CLUSTERBY", "BUCKETS", "BATCH", "CAPITALIZE", "INITIALIZE", 
		"PARTITIONBY", "DISTRIBUTEBY", "TIMESTAMP", "SYS_TIME", "WITHGROUP", "WITHOFFSET", 
		"WITHTAG", "WITHKEY", "KEYDELIM", "WITHSTRUCTURE", "WITHTYPE", "PK", "SAMPLE", 
		"EVERY", "WITHFORMAT", "WITHUNWRAP", "FORMAT", "PROJECTTO", "STOREAS", 
		"LIMIT", "INCREMENTALMODE", "WITHDOCTYPE", "WITHINDEXSUFFIX", "WITHCONVERTER", 
		"WITHJMSSELECTOR", "WITHTARGET", "WITHCOMPRESSION", "WITHDELAY", "TIMESTAMPUNIT", 
		"TTL", "EQUAL", "INT", "ASTERISK", "COMMA", "DOT", "LEFT_PARAN", "RIGHT_PARAN", 
		"FIELD", "TOPICNAME", "KEYDELIMVALUE", "ESCAPED_TOPIC", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'='", null, "'*'", 
		"','", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INSERT", "UPSERT", "INTO", "SELECT", "FROM", "IGNORE", "AS", "AUTOCREATE", 
		"AUTOEVOLVE", "CLUSTERBY", "BUCKETS", "BATCH", "CAPITALIZE", "INITIALIZE", 
		"PARTITIONBY", "DISTRIBUTEBY", "TIMESTAMP", "SYS_TIME", "WITHGROUP", "WITHOFFSET", 
		"WITHTAG", "WITHKEY", "KEYDELIM", "WITHSTRUCTURE", "WITHTYPE", "PK", "SAMPLE", 
		"EVERY", "WITHFORMAT", "WITHUNWRAP", "FORMAT", "PROJECTTO", "STOREAS", 
		"LIMIT", "INCREMENTALMODE", "WITHDOCTYPE", "WITHINDEXSUFFIX", "WITHCONVERTER", 
		"WITHJMSSELECTOR", "WITHTARGET", "WITHCOMPRESSION", "WITHDELAY", "TIMESTAMPUNIT", 
		"TTL", "EQUAL", "INT", "ASTERISK", "COMMA", "DOT", "LEFT_PARAN", "RIGHT_PARAN", 
		"FIELD", "TOPICNAME", "KEYDELIMVALUE", "NEWLINE", "WS"
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


	public ConnectorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConnectorLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0440\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0082\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u0090\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u009a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a8"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b2\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c0\n\7\3\b\3\b\3\b\3\b\5\b\u00c6\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00dc\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f2\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0106\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0116\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0122\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0138\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u014e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0166"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0180\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u019c"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01b2\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u01c6\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01dc\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ec"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01fc\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0216\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0232\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0244\n\32\3\33\3\33\3\33\3\33\5\33"+
		"\u024a\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0258\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0264\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u027a\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0290\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02c8\n \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u02e5\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u02f5\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0301\n#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\5$\u0321\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0339\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0359\n"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0375\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u0395\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\5)\u03ab\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u03cb\n*\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u03df\n+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03fb\n,\3"+
		"-\3-\3-\3-\3-\3-\5-\u0403\n-\3.\3.\3/\6/\u0408\n/\r/\16/\u0409\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\6\65\u0417\n\65\r\65"+
		"\16\65\u0418\3\66\6\66\u041c\n\66\r\66\16\66\u041d\3\66\5\66\u0421\n\66"+
		"\3\67\6\67\u0424\n\67\r\67\16\67\u0425\3\67\5\67\u0429\n\67\38\38\68\u042d"+
		"\n8\r8\168\u042e\38\38\39\59\u0434\n9\39\39\39\39\3:\6:\u043b\n:\r:\16"+
		":\u043c\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o\2q9s:\3\2\7\6\2\62;B\\aac|\t\2--//\61<C\\aac}\177"+
		"\177\b\2%%--//\61<B\\a\177\3\2bb\5\2\13\f\17\17\"\"\2\u047e\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\3\u0081\3\2\2\2\5\u008f\3\2\2\2\7\u0099\3\2\2\2\t\u00a7"+
		"\3\2\2\2\13\u00b1\3\2\2\2\r\u00bf\3\2\2\2\17\u00c5\3\2\2\2\21\u00db\3"+
		"\2\2\2\23\u00f1\3\2\2\2\25\u0105\3\2\2\2\27\u0115\3\2\2\2\31\u0121\3\2"+
		"\2\2\33\u0137\3\2\2\2\35\u014d\3\2\2\2\37\u0165\3\2\2\2!\u017f\3\2\2\2"+
		"#\u019b\3\2\2\2%\u01b1\3\2\2\2\'\u01c5\3\2\2\2)\u01db\3\2\2\2+\u01eb\3"+
		"\2\2\2-\u01fb\3\2\2\2/\u0215\3\2\2\2\61\u0231\3\2\2\2\63\u0243\3\2\2\2"+
		"\65\u0249\3\2\2\2\67\u0257\3\2\2\29\u0263\3\2\2\2;\u0279\3\2\2\2=\u028f"+
		"\3\2\2\2?\u02c7\3\2\2\2A\u02e4\3\2\2\2C\u02f4\3\2\2\2E\u0300\3\2\2\2G"+
		"\u0320\3\2\2\2I\u0338\3\2\2\2K\u0358\3\2\2\2M\u0374\3\2\2\2O\u0394\3\2"+
		"\2\2Q\u03aa\3\2\2\2S\u03ca\3\2\2\2U\u03de\3\2\2\2W\u03fa\3\2\2\2Y\u0402"+
		"\3\2\2\2[\u0404\3\2\2\2]\u0407\3\2\2\2_\u040b\3\2\2\2a\u040d\3\2\2\2c"+
		"\u040f\3\2\2\2e\u0411\3\2\2\2g\u0413\3\2\2\2i\u0416\3\2\2\2k\u0420\3\2"+
		"\2\2m\u0428\3\2\2\2o\u042a\3\2\2\2q\u0433\3\2\2\2s\u043a\3\2\2\2uv\7k"+
		"\2\2vw\7p\2\2wx\7u\2\2xy\7g\2\2yz\7t\2\2z\u0082\7v\2\2{|\7K\2\2|}\7P\2"+
		"\2}~\7U\2\2~\177\7G\2\2\177\u0080\7T\2\2\u0080\u0082\7V\2\2\u0081u\3\2"+
		"\2\2\u0081{\3\2\2\2\u0082\4\3\2\2\2\u0083\u0084\7w\2\2\u0084\u0085\7r"+
		"\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087\u0088\7t\2\2\u0088\u0090"+
		"\7v\2\2\u0089\u008a\7W\2\2\u008a\u008b\7R\2\2\u008b\u008c\7U\2\2\u008c"+
		"\u008d\7G\2\2\u008d\u008e\7T\2\2\u008e\u0090\7V\2\2\u008f\u0083\3\2\2"+
		"\2\u008f\u0089\3\2\2\2\u0090\6\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7v\2\2\u0094\u009a\7q\2\2\u0095\u0096\7K\2\2\u0096"+
		"\u0097\7P\2\2\u0097\u0098\7V\2\2\u0098\u009a\7Q\2\2\u0099\u0091\3\2\2"+
		"\2\u0099\u0095\3\2\2\2\u009a\b\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7e\2\2\u00a0"+
		"\u00a8\7v\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a3\7G\2\2\u00a3\u00a4\7N\2\2"+
		"\u00a4\u00a5\7G\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a8\7V\2\2\u00a7\u009b"+
		"\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7q\2\2\u00ac\u00b2\7o\2\2\u00ad\u00ae\7H\2\2"+
		"\u00ae\u00af\7T\2\2\u00af\u00b0\7Q\2\2\u00b0\u00b2\7O\2\2\u00b1\u00a9"+
		"\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7i\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2"+
		"\u00b8\u00c0\7g\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb\7I\2\2\u00bb\u00bc"+
		"\7P\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7T\2\2\u00be\u00c0\7G\2\2\u00bf"+
		"\u00b3\3\2\2\2\u00bf\u00b9\3\2\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c6\7u\2\2\u00c3\u00c4\7C\2\2\u00c4\u00c6\7U\2\2\u00c5\u00c1"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\20\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7e\2\2"+
		"\u00cc\u00cd\7t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00dc\7g\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d3\7W\2\2\u00d3"+
		"\u00d4\7V\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7E\2\2\u00d6\u00d7\7T\2\2"+
		"\u00d7\u00d8\7G\2\2\u00d8\u00d9\7C\2\2\u00d9\u00da\7V\2\2\u00da\u00dc"+
		"\7G\2\2\u00db\u00c7\3\2\2\2\u00db\u00d1\3\2\2\2\u00dc\22\3\2\2\2\u00dd"+
		"\u00de\7c\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7q\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\u00e3\7x\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5"+
		"\7n\2\2\u00e5\u00e6\7x\2\2\u00e6\u00f2\7g\2\2\u00e7\u00e8\7C\2\2\u00e8"+
		"\u00e9\7W\2\2\u00e9\u00ea\7V\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ec\7G\2\2"+
		"\u00ec\u00ed\7X\2\2\u00ed\u00ee\7Q\2\2\u00ee\u00ef\7N\2\2\u00ef\u00f0"+
		"\7X\2\2\u00f0\u00f2\7G\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f2"+
		"\24\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7w\2\2\u00f6"+
		"\u00f7\7u\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7t\2\2"+
		"\u00fa\u00fb\7d\2\2\u00fb\u0106\7{\2\2\u00fc\u00fd\7E\2\2\u00fd\u00fe"+
		"\7N\2\2\u00fe\u00ff\7W\2\2\u00ff\u0100\7U\2\2\u0100\u0101\7V\2\2\u0101"+
		"\u0102\7G\2\2\u0102\u0103\7T\2\2\u0103\u0104\7D\2\2\u0104\u0106\7[\2\2"+
		"\u0105\u00f3\3\2\2\2\u0105\u00fc\3\2\2\2\u0106\26\3\2\2\2\u0107\u0108"+
		"\7d\2\2\u0108\u0109\7w\2\2\u0109\u010a\7e\2\2\u010a\u010b\7m\2\2\u010b"+
		"\u010c\7g\2\2\u010c\u010d\7v\2\2\u010d\u0116\7u\2\2\u010e\u010f\7D\2\2"+
		"\u010f\u0110\7W\2\2\u0110\u0111\7E\2\2\u0111\u0112\7M\2\2\u0112\u0113"+
		"\7G\2\2\u0113\u0114\7V\2\2\u0114\u0116\7U\2\2\u0115\u0107\3\2\2\2\u0115"+
		"\u010e\3\2\2\2\u0116\30\3\2\2\2\u0117\u0118\7d\2\2\u0118\u0119\7c\2\2"+
		"\u0119\u011a\7v\2\2\u011a\u011b\7e\2\2\u011b\u0122\7j\2\2\u011c\u011d"+
		"\7D\2\2\u011d\u011e\7C\2\2\u011e\u011f\7V\2\2\u011f\u0120\7E\2\2\u0120"+
		"\u0122\7J\2\2\u0121\u0117\3\2\2\2\u0121\u011c\3\2\2\2\u0122\32\3\2\2\2"+
		"\u0123\u0124\7e\2\2\u0124\u0125\7c\2\2\u0125\u0126\7r\2\2\u0126\u0127"+
		"\7k\2\2\u0127\u0128\7v\2\2\u0128\u0129\7c\2\2\u0129\u012a\7n\2\2\u012a"+
		"\u012b\7k\2\2\u012b\u012c\7|\2\2\u012c\u0138\7g\2\2\u012d\u012e\7E\2\2"+
		"\u012e\u012f\7C\2\2\u012f\u0130\7R\2\2\u0130\u0131\7K\2\2\u0131\u0132"+
		"\7V\2\2\u0132\u0133\7C\2\2\u0133\u0134\7N\2\2\u0134\u0135\7K\2\2\u0135"+
		"\u0136\7\\\2\2\u0136\u0138\7G\2\2\u0137\u0123\3\2\2\2\u0137\u012d\3\2"+
		"\2\2\u0138\34\3\2\2\2\u0139\u013a\7k\2\2\u013a\u013b\7p\2\2\u013b\u013c"+
		"\7k\2\2\u013c\u013d\7v\2\2\u013d\u013e\7k\2\2\u013e\u013f\7c\2\2\u013f"+
		"\u0140\7n\2\2\u0140\u0141\7k\2\2\u0141\u0142\7|\2\2\u0142\u014e\7g\2\2"+
		"\u0143\u0144\7K\2\2\u0144\u0145\7P\2\2\u0145\u0146\7K\2\2\u0146\u0147"+
		"\7V\2\2\u0147\u0148\7K\2\2\u0148\u0149\7C\2\2\u0149\u014a\7N\2\2\u014a"+
		"\u014b\7K\2\2\u014b\u014c\7\\\2\2\u014c\u014e\7G\2\2\u014d\u0139\3\2\2"+
		"\2\u014d\u0143\3\2\2\2\u014e\36\3\2\2\2\u014f\u0150\7r\2\2\u0150\u0151"+
		"\7c\2\2\u0151\u0152\7t\2\2\u0152\u0153\7v\2\2\u0153\u0154\7k\2\2\u0154"+
		"\u0155\7v\2\2\u0155\u0156\7k\2\2\u0156\u0157\7q\2\2\u0157\u0158\7p\2\2"+
		"\u0158\u0159\7d\2\2\u0159\u0166\7{\2\2\u015a\u015b\7R\2\2\u015b\u015c"+
		"\7C\2\2\u015c\u015d\7T\2\2\u015d\u015e\7V\2\2\u015e\u015f\7K\2\2\u015f"+
		"\u0160\7V\2\2\u0160\u0161\7K\2\2\u0161\u0162\7Q\2\2\u0162\u0163\7P\2\2"+
		"\u0163\u0164\7D\2\2\u0164\u0166\7[\2\2\u0165\u014f\3\2\2\2\u0165\u015a"+
		"\3\2\2\2\u0166 \3\2\2\2\u0167\u0168\7f\2\2\u0168\u0169\7k\2\2\u0169\u016a"+
		"\7u\2\2\u016a\u016b\7v\2\2\u016b\u016c\7t\2\2\u016c\u016d\7k\2\2\u016d"+
		"\u016e\7d\2\2\u016e\u016f\7w\2\2\u016f\u0170\7v\2\2\u0170\u0171\7g\2\2"+
		"\u0171\u0172\7d\2\2\u0172\u0180\7{\2\2\u0173\u0174\7F\2\2\u0174\u0175"+
		"\7K\2\2\u0175\u0176\7U\2\2\u0176\u0177\7V\2\2\u0177\u0178\7T\2\2\u0178"+
		"\u0179\7K\2\2\u0179\u017a\7D\2\2\u017a\u017b\7W\2\2\u017b\u017c\7V\2\2"+
		"\u017c\u017d\7G\2\2\u017d\u017e\7D\2\2\u017e\u0180\7[\2\2\u017f\u0167"+
		"\3\2\2\2\u017f\u0173\3\2\2\2\u0180\"\3\2\2\2\u0181\u0182\7y\2\2\u0182"+
		"\u0183\7k\2\2\u0183\u0184\7v\2\2\u0184\u0185\7j\2\2\u0185\u0186\7v\2\2"+
		"\u0186\u0187\7k\2\2\u0187\u0188\7o\2\2\u0188\u0189\7g\2\2\u0189\u018a"+
		"\7u\2\2\u018a\u018b\7v\2\2\u018b\u018c\7c\2\2\u018c\u018d\7o\2\2\u018d"+
		"\u019c\7r\2\2\u018e\u018f\7Y\2\2\u018f\u0190\7K\2\2\u0190\u0191\7V\2\2"+
		"\u0191\u0192\7J\2\2\u0192\u0193\7V\2\2\u0193\u0194\7K\2\2\u0194\u0195"+
		"\7O\2\2\u0195\u0196\7G\2\2\u0196\u0197\7U\2\2\u0197\u0198\7V\2\2\u0198"+
		"\u0199\7C\2\2\u0199\u019a\7O\2\2\u019a\u019c\7R\2\2\u019b\u0181\3\2\2"+
		"\2\u019b\u018e\3\2\2\2\u019c$\3\2\2\2\u019d\u019e\7u\2\2\u019e\u019f\7"+
		"{\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1\7a\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3"+
		"\7k\2\2\u01a3\u01a4\7o\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7*\2\2\u01a6"+
		"\u01b2\7+\2\2\u01a7\u01a8\7U\2\2\u01a8\u01a9\7[\2\2\u01a9\u01aa\7U\2\2"+
		"\u01aa\u01ab\7a\2\2\u01ab\u01ac\7V\2\2\u01ac\u01ad\7K\2\2\u01ad\u01ae"+
		"\7O\2\2\u01ae\u01af\7G\2\2\u01af\u01b0\7*\2\2\u01b0\u01b2\7+\2\2\u01b1"+
		"\u019d\3\2\2\2\u01b1\u01a7\3\2\2\2\u01b2&\3\2\2\2\u01b3\u01b4\7y\2\2\u01b4"+
		"\u01b5\7k\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7j\2\2\u01b7\u01b8\7i\2\2"+
		"\u01b8\u01b9\7t\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7w\2\2\u01bb\u01c6"+
		"\7r\2\2\u01bc\u01bd\7Y\2\2\u01bd\u01be\7K\2\2\u01be\u01bf\7V\2\2\u01bf"+
		"\u01c0\7J\2\2\u01c0\u01c1\7I\2\2\u01c1\u01c2\7T\2\2\u01c2\u01c3\7Q\2\2"+
		"\u01c3\u01c4\7W\2\2\u01c4\u01c6\7R\2\2\u01c5\u01b3\3\2\2\2\u01c5\u01bc"+
		"\3\2\2\2\u01c6(\3\2\2\2\u01c7\u01c8\7y\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca"+
		"\7v\2\2\u01ca\u01cb\7j\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7h\2\2\u01cd"+
		"\u01ce\7h\2\2\u01ce\u01cf\7u\2\2\u01cf\u01d0\7g\2\2\u01d0\u01dc\7v\2\2"+
		"\u01d1\u01d2\7Y\2\2\u01d2\u01d3\7K\2\2\u01d3\u01d4\7V\2\2\u01d4\u01d5"+
		"\7J\2\2\u01d5\u01d6\7Q\2\2\u01d6\u01d7\7H\2\2\u01d7\u01d8\7H\2\2\u01d8"+
		"\u01d9\7U\2\2\u01d9\u01da\7G\2\2\u01da\u01dc\7V\2\2\u01db\u01c7\3\2\2"+
		"\2\u01db\u01d1\3\2\2\2\u01dc*\3\2\2\2\u01dd\u01de\7y\2\2\u01de\u01df\7"+
		"k\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7j\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3"+
		"\7c\2\2\u01e3\u01ec\7i\2\2\u01e4\u01e5\7Y\2\2\u01e5\u01e6\7K\2\2\u01e6"+
		"\u01e7\7V\2\2\u01e7\u01e8\7J\2\2\u01e8\u01e9\7V\2\2\u01e9\u01ea\7C\2\2"+
		"\u01ea\u01ec\7I\2\2\u01eb\u01dd\3\2\2\2\u01eb\u01e4\3\2\2\2\u01ec,\3\2"+
		"\2\2\u01ed\u01ee\7y\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7v\2\2\u01f0\u01f1"+
		"\7j\2\2\u01f1\u01f2\7m\2\2\u01f2\u01f3\7g\2\2\u01f3\u01fc\7{\2\2\u01f4"+
		"\u01f5\7Y\2\2\u01f5\u01f6\7K\2\2\u01f6\u01f7\7V\2\2\u01f7\u01f8\7J\2\2"+
		"\u01f8\u01f9\7M\2\2\u01f9\u01fa\7G\2\2\u01fa\u01fc\7[\2\2\u01fb\u01ed"+
		"\3\2\2\2\u01fb\u01f4\3\2\2\2\u01fc.\3\2\2\2\u01fd\u01fe\7m\2\2\u01fe\u01ff"+
		"\7g\2\2\u01ff\u0200\7{\2\2\u0200\u0201\7f\2\2\u0201\u0202\7g\2\2\u0202"+
		"\u0203\7n\2\2\u0203\u0204\7k\2\2\u0204\u0205\7o\2\2\u0205\u0206\7k\2\2"+
		"\u0206\u0207\7v\2\2\u0207\u0208\7g\2\2\u0208\u0216\7t\2\2\u0209\u020a"+
		"\7M\2\2\u020a\u020b\7G\2\2\u020b\u020c\7[\2\2\u020c\u020d\7F\2\2\u020d"+
		"\u020e\7G\2\2\u020e\u020f\7N\2\2\u020f\u0210\7K\2\2\u0210\u0211\7O\2\2"+
		"\u0211\u0212\7K\2\2\u0212\u0213\7V\2\2\u0213\u0214\7G\2\2\u0214\u0216"+
		"\7T\2\2\u0215\u01fd\3\2\2\2\u0215\u0209\3\2\2\2\u0216\60\3\2\2\2\u0217"+
		"\u0218\7y\2\2\u0218\u0219\7k\2\2\u0219\u021a\7v\2\2\u021a\u021b\7j\2\2"+
		"\u021b\u021c\7u\2\2\u021c\u021d\7v\2\2\u021d\u021e\7t\2\2\u021e\u021f"+
		"\7w\2\2\u021f\u0220\7e\2\2\u0220\u0221\7v\2\2\u0221\u0222\7w\2\2\u0222"+
		"\u0223\7t\2\2\u0223\u0232\7g\2\2\u0224\u0225\7Y\2\2\u0225\u0226\7K\2\2"+
		"\u0226\u0227\7V\2\2\u0227\u0228\7J\2\2\u0228\u0229\7U\2\2\u0229\u022a"+
		"\7V\2\2\u022a\u022b\7T\2\2\u022b\u022c\7W\2\2\u022c\u022d\7E\2\2\u022d"+
		"\u022e\7V\2\2\u022e\u022f\7W\2\2\u022f\u0230\7T\2\2\u0230\u0232\7G\2\2"+
		"\u0231\u0217\3\2\2\2\u0231\u0224\3\2\2\2\u0232\62\3\2\2\2\u0233\u0234"+
		"\7y\2\2\u0234\u0235\7k\2\2\u0235\u0236\7v\2\2\u0236\u0237\7j\2\2\u0237"+
		"\u0238\7v\2\2\u0238\u0239\7{\2\2\u0239\u023a\7r\2\2\u023a\u0244\7g\2\2"+
		"\u023b\u023c\7Y\2\2\u023c\u023d\7K\2\2\u023d\u023e\7V\2\2\u023e\u023f"+
		"\7J\2\2\u023f\u0240\7V\2\2\u0240\u0241\7[\2\2\u0241\u0242\7R\2\2\u0242"+
		"\u0244\7G\2\2\u0243\u0233\3\2\2\2\u0243\u023b\3\2\2\2\u0244\64\3\2\2\2"+
		"\u0245\u0246\7r\2\2\u0246\u024a\7m\2\2\u0247\u0248\7R\2\2\u0248\u024a"+
		"\7M\2\2\u0249\u0245\3\2\2\2\u0249\u0247\3\2\2\2\u024a\66\3\2\2\2\u024b"+
		"\u024c\7u\2\2\u024c\u024d\7c\2\2\u024d\u024e\7o\2\2\u024e\u024f\7r\2\2"+
		"\u024f\u0250\7n\2\2\u0250\u0258\7g\2\2\u0251\u0252\7U\2\2\u0252\u0253"+
		"\7C\2\2\u0253\u0254\7O\2\2\u0254\u0255\7R\2\2\u0255\u0256\7N\2\2\u0256"+
		"\u0258\7G\2\2\u0257\u024b\3\2\2\2\u0257\u0251\3\2\2\2\u02588\3\2\2\2\u0259"+
		"\u025a\7g\2\2\u025a\u025b\7x\2\2\u025b\u025c\7g\2\2\u025c\u025d\7t\2\2"+
		"\u025d\u0264\7{\2\2\u025e\u025f\7G\2\2\u025f\u0260\7X\2\2\u0260\u0261"+
		"\7G\2\2\u0261\u0262\7T\2\2\u0262\u0264\7[\2\2\u0263\u0259\3\2\2\2\u0263"+
		"\u025e\3\2\2\2\u0264:\3\2\2\2\u0265\u0266\7Y\2\2\u0266\u0267\7K\2\2\u0267"+
		"\u0268\7V\2\2\u0268\u0269\7J\2\2\u0269\u026a\7H\2\2\u026a\u026b\7Q\2\2"+
		"\u026b\u026c\7T\2\2\u026c\u026d\7O\2\2\u026d\u026e\7C\2\2\u026e\u027a"+
		"\7V\2\2\u026f\u0270\7y\2\2\u0270\u0271\7k\2\2\u0271\u0272\7v\2\2\u0272"+
		"\u0273\7j\2\2\u0273\u0274\7h\2\2\u0274\u0275\7q\2\2\u0275\u0276\7t\2\2"+
		"\u0276\u0277\7o\2\2\u0277\u0278\7c\2\2\u0278\u027a\7v\2\2\u0279\u0265"+
		"\3\2\2\2\u0279\u026f\3\2\2\2\u027a<\3\2\2\2\u027b\u027c\7Y\2\2\u027c\u027d"+
		"\7K\2\2\u027d\u027e\7V\2\2\u027e\u027f\7J\2\2\u027f\u0280\7W\2\2\u0280"+
		"\u0281\7P\2\2\u0281\u0282\7Y\2\2\u0282\u0283\7T\2\2\u0283\u0284\7C\2\2"+
		"\u0284\u0290\7R\2\2\u0285\u0286\7y\2\2\u0286\u0287\7k\2\2\u0287\u0288"+
		"\7v\2\2\u0288\u0289\7j\2\2\u0289\u028a\7w\2\2\u028a\u028b\7p\2\2\u028b"+
		"\u028c\7y\2\2\u028c\u028d\7t\2\2\u028d\u028e\7c\2\2\u028e\u0290\7r\2\2"+
		"\u028f\u027b\3\2\2\2\u028f\u0285\3\2\2\2\u0290>\3\2\2\2\u0291\u0292\7"+
		"c\2\2\u0292\u0293\7x\2\2\u0293\u0294\7t\2\2\u0294\u02c8\7q\2\2\u0295\u0296"+
		"\7C\2\2\u0296\u0297\7X\2\2\u0297\u0298\7T\2\2\u0298\u02c8\7Q\2\2\u0299"+
		"\u029a\7v\2\2\u029a\u029b\7g\2\2\u029b\u029c\7z\2\2\u029c\u02c8\7v\2\2"+
		"\u029d\u029e\7V\2\2\u029e\u029f\7G\2\2\u029f\u02a0\7Z\2\2\u02a0\u02c8"+
		"\7V\2\2\u02a1\u02a2\7d\2\2\u02a2\u02a3\7k\2\2\u02a3\u02a4\7p\2\2\u02a4"+
		"\u02a5\7c\2\2\u02a5\u02a6\7t\2\2\u02a6\u02c8\7{\2\2\u02a7\u02a8\7D\2\2"+
		"\u02a8\u02a9\7K\2\2\u02a9\u02aa\7P\2\2\u02aa\u02ab\7C\2\2\u02ab\u02ac"+
		"\7T\2\2\u02ac\u02c8\7[\2\2\u02ad\u02ae\7l\2\2\u02ae\u02af\7u\2\2\u02af"+
		"\u02b0\7q\2\2\u02b0\u02c8\7p\2\2\u02b1\u02b2\7L\2\2\u02b2\u02b3\7U\2\2"+
		"\u02b3\u02b4\7Q\2\2\u02b4\u02c8\7P\2\2\u02b5\u02b6\7q\2\2\u02b6\u02b7"+
		"\7d\2\2\u02b7\u02b8\7l\2\2\u02b8\u02b9\7g\2\2\u02b9\u02ba\7e\2\2\u02ba"+
		"\u02c8\7v\2\2\u02bb\u02bc\7Q\2\2\u02bc\u02bd\7D\2\2\u02bd\u02be\7L\2\2"+
		"\u02be\u02bf\7G\2\2\u02bf\u02c0\7E\2\2\u02c0\u02c8\7V\2\2\u02c1\u02c2"+
		"\7o\2\2\u02c2\u02c3\7c\2\2\u02c3\u02c8\7r\2\2\u02c4\u02c5\7O\2\2\u02c5"+
		"\u02c6\7C\2\2\u02c6\u02c8\7R\2\2\u02c7\u0291\3\2\2\2\u02c7\u0295\3\2\2"+
		"\2\u02c7\u0299\3\2\2\2\u02c7\u029d\3\2\2\2\u02c7\u02a1\3\2\2\2\u02c7\u02a7"+
		"\3\2\2\2\u02c7\u02ad\3\2\2\2\u02c7\u02b1\3\2\2\2\u02c7\u02b5\3\2\2\2\u02c7"+
		"\u02bb\3\2\2\2\u02c7\u02c1\3\2\2\2\u02c7\u02c4\3\2\2\2\u02c8@\3\2\2\2"+
		"\u02c9\u02ca\7r\2\2\u02ca\u02cb\7t\2\2\u02cb\u02cc\7q\2\2\u02cc\u02cd"+
		"\7l\2\2\u02cd\u02ce\7g\2\2\u02ce\u02cf\7e\2\2\u02cf\u02d0\7v\2\2\u02d0"+
		"\u02d1\7V\2\2\u02d1\u02e5\7q\2\2\u02d2\u02d3\7R\2\2\u02d3\u02d4\7T\2\2"+
		"\u02d4\u02d5\7Q\2\2\u02d5\u02d6\7L\2\2\u02d6\u02d7\7G\2\2\u02d7\u02d8"+
		"\7E\2\2\u02d8\u02d9\7V\2\2\u02d9\u02da\7V\2\2\u02da\u02e5\7Q\2\2\u02db"+
		"\u02dc\7r\2\2\u02dc\u02dd\7t\2\2\u02dd\u02de\7q\2\2\u02de\u02df\7l\2\2"+
		"\u02df\u02e0\7g\2\2\u02e0\u02e1\7e\2\2\u02e1\u02e2\7v\2\2\u02e2\u02e3"+
		"\7v\2\2\u02e3\u02e5\7q\2\2\u02e4\u02c9\3\2\2\2\u02e4\u02d2\3\2\2\2\u02e4"+
		"\u02db\3\2\2\2\u02e5B\3\2\2\2\u02e6\u02e7\7U\2\2\u02e7\u02e8\7V\2\2\u02e8"+
		"\u02e9\7Q\2\2\u02e9\u02ea\7T\2\2\u02ea\u02eb\7G\2\2\u02eb\u02ec\7C\2\2"+
		"\u02ec\u02f5\7U\2\2\u02ed\u02ee\7u\2\2\u02ee\u02ef\7v\2\2\u02ef\u02f0"+
		"\7q\2\2\u02f0\u02f1\7t\2\2\u02f1\u02f2\7g\2\2\u02f2\u02f3\7c\2\2\u02f3"+
		"\u02f5\7u\2\2\u02f4\u02e6\3\2\2\2\u02f4\u02ed\3\2\2\2\u02f5D\3\2\2\2\u02f6"+
		"\u02f7\7N\2\2\u02f7\u02f8\7K\2\2\u02f8\u02f9\7O\2\2\u02f9\u02fa\7K\2\2"+
		"\u02fa\u0301\7V\2\2\u02fb\u02fc\7n\2\2\u02fc\u02fd\7k\2\2\u02fd\u02fe"+
		"\7o\2\2\u02fe\u02ff\7k\2\2\u02ff\u0301\7v\2\2\u0300\u02f6\3\2\2\2\u0300"+
		"\u02fb\3\2\2\2\u0301F\3\2\2\2\u0302\u0303\7K\2\2\u0303\u0304\7P\2\2\u0304"+
		"\u0305\7E\2\2\u0305\u0306\7T\2\2\u0306\u0307\7G\2\2\u0307\u0308\7O\2\2"+
		"\u0308\u0309\7G\2\2\u0309\u030a\7P\2\2\u030a\u030b\7V\2\2\u030b\u030c"+
		"\7C\2\2\u030c\u030d\7N\2\2\u030d\u030e\7O\2\2\u030e\u030f\7Q\2\2\u030f"+
		"\u0310\7F\2\2\u0310\u0321\7G\2\2\u0311\u0312\7k\2\2\u0312\u0313\7p\2\2"+
		"\u0313\u0314\7e\2\2\u0314\u0315\7t\2\2\u0315\u0316\7g\2\2\u0316\u0317"+
		"\7o\2\2\u0317\u0318\7g\2\2\u0318\u0319\7p\2\2\u0319\u031a\7v\2\2\u031a"+
		"\u031b\7c\2\2\u031b\u031c\7n\2\2\u031c\u031d\7o\2\2\u031d\u031e\7q\2\2"+
		"\u031e\u031f\7f\2\2\u031f\u0321\7g\2\2\u0320\u0302\3\2\2\2\u0320\u0311"+
		"\3\2\2\2\u0321H\3\2\2\2\u0322\u0323\7Y\2\2\u0323\u0324\7K\2\2\u0324\u0325"+
		"\7V\2\2\u0325\u0326\7J\2\2\u0326\u0327\7F\2\2\u0327\u0328\7Q\2\2\u0328"+
		"\u0329\7E\2\2\u0329\u032a\7V\2\2\u032a\u032b\7[\2\2\u032b\u032c\7R\2\2"+
		"\u032c\u0339\7G\2\2\u032d\u032e\7y\2\2\u032e\u032f\7k\2\2\u032f\u0330"+
		"\7v\2\2\u0330\u0331\7j\2\2\u0331\u0332\7f\2\2\u0332\u0333\7q\2\2\u0333"+
		"\u0334\7e\2\2\u0334\u0335\7v\2\2\u0335\u0336\7{\2\2\u0336\u0337\7r\2\2"+
		"\u0337\u0339\7g\2\2\u0338\u0322\3\2\2\2\u0338\u032d\3\2\2\2\u0339J\3\2"+
		"\2\2\u033a\u033b\7Y\2\2\u033b\u033c\7K\2\2\u033c\u033d\7V\2\2\u033d\u033e"+
		"\7J\2\2\u033e\u033f\7K\2\2\u033f\u0340\7P\2\2\u0340\u0341\7F\2\2\u0341"+
		"\u0342\7G\2\2\u0342\u0343\7Z\2\2\u0343\u0344\7U\2\2\u0344\u0345\7W\2\2"+
		"\u0345\u0346\7H\2\2\u0346\u0347\7H\2\2\u0347\u0348\7K\2\2\u0348\u0359"+
		"\7Z\2\2\u0349\u034a\7y\2\2\u034a\u034b\7k\2\2\u034b\u034c\7v\2\2\u034c"+
		"\u034d\7j\2\2\u034d\u034e\7k\2\2\u034e\u034f\7p\2\2\u034f\u0350\7f\2\2"+
		"\u0350\u0351\7g\2\2\u0351\u0352\7z\2\2\u0352\u0353\7u\2\2\u0353\u0354"+
		"\7w\2\2\u0354\u0355\7h\2\2\u0355\u0356\7h\2\2\u0356\u0357\7k\2\2\u0357"+
		"\u0359\7z\2\2\u0358\u033a\3\2\2\2\u0358\u0349\3\2\2\2\u0359L\3\2\2\2\u035a"+
		"\u035b\7Y\2\2\u035b\u035c\7K\2\2\u035c\u035d\7V\2\2\u035d\u035e\7J\2\2"+
		"\u035e\u035f\7E\2\2\u035f\u0360\7Q\2\2\u0360\u0361\7P\2\2\u0361\u0362"+
		"\7X\2\2\u0362\u0363\7G\2\2\u0363\u0364\7T\2\2\u0364\u0365\7V\2\2\u0365"+
		"\u0366\7G\2\2\u0366\u0375\7T\2\2\u0367\u0368\7y\2\2\u0368\u0369\7k\2\2"+
		"\u0369\u036a\7v\2\2\u036a\u036b\7j\2\2\u036b\u036c\7e\2\2\u036c\u036d"+
		"\7q\2\2\u036d\u036e\7p\2\2\u036e\u036f\7x\2\2\u036f\u0370\7g\2\2\u0370"+
		"\u0371\7t\2\2\u0371\u0372\7v\2\2\u0372\u0373\7g\2\2\u0373\u0375\7t\2\2"+
		"\u0374\u035a\3\2\2\2\u0374\u0367\3\2\2\2\u0375N\3\2\2\2\u0376\u0377\7"+
		"Y\2\2\u0377\u0378\7K\2\2\u0378\u0379\7V\2\2\u0379\u037a\7J\2\2\u037a\u037b"+
		"\7L\2\2\u037b\u037c\7O\2\2\u037c\u037d\7U\2\2\u037d\u037e\7U\2\2\u037e"+
		"\u037f\7G\2\2\u037f\u0380\7N\2\2\u0380\u0381\7G\2\2\u0381\u0382\7E\2\2"+
		"\u0382\u0383\7V\2\2\u0383\u0384\7Q\2\2\u0384\u0395\7T\2\2\u0385\u0386"+
		"\7y\2\2\u0386\u0387\7k\2\2\u0387\u0388\7v\2\2\u0388\u0389\7j\2\2\u0389"+
		"\u038a\7l\2\2\u038a\u038b\7o\2\2\u038b\u038c\7u\2\2\u038c\u038d\7u\2\2"+
		"\u038d\u038e\7g\2\2\u038e\u038f\7n\2\2\u038f\u0390\7g\2\2\u0390\u0391"+
		"\7e\2\2\u0391\u0392\7v\2\2\u0392\u0393\7q\2\2\u0393\u0395\7t\2\2\u0394"+
		"\u0376\3\2\2\2\u0394\u0385\3\2\2\2\u0395P\3\2\2\2\u0396\u0397\7Y\2\2\u0397"+
		"\u0398\7K\2\2\u0398\u0399\7V\2\2\u0399\u039a\7J\2\2\u039a\u039b\7V\2\2"+
		"\u039b\u039c\7C\2\2\u039c\u039d\7T\2\2\u039d\u039e\7I\2\2\u039e\u039f"+
		"\7G\2\2\u039f\u03ab\7V\2\2\u03a0\u03a1\7y\2\2\u03a1\u03a2\7k\2\2\u03a2"+
		"\u03a3\7v\2\2\u03a3\u03a4\7j\2\2\u03a4\u03a5\7v\2\2\u03a5\u03a6\7c\2\2"+
		"\u03a6\u03a7\7t\2\2\u03a7\u03a8\7i\2\2\u03a8\u03a9\7g\2\2\u03a9\u03ab"+
		"\7v\2\2\u03aa\u0396\3\2\2\2\u03aa\u03a0\3\2\2\2\u03abR\3\2\2\2\u03ac\u03ad"+
		"\7Y\2\2\u03ad\u03ae\7K\2\2\u03ae\u03af\7V\2\2\u03af\u03b0\7J\2\2\u03b0"+
		"\u03b1\7E\2\2\u03b1\u03b2\7Q\2\2\u03b2\u03b3\7O\2\2\u03b3\u03b4\7R\2\2"+
		"\u03b4\u03b5\7T\2\2\u03b5\u03b6\7G\2\2\u03b6\u03b7\7U\2\2\u03b7\u03b8"+
		"\7U\2\2\u03b8\u03b9\7K\2\2\u03b9\u03ba\7Q\2\2\u03ba\u03cb\7P\2\2\u03bb"+
		"\u03bc\7y\2\2\u03bc\u03bd\7k\2\2\u03bd\u03be\7v\2\2\u03be\u03bf\7j\2\2"+
		"\u03bf\u03c0\7e\2\2\u03c0\u03c1\7q\2\2\u03c1\u03c2\7o\2\2\u03c2\u03c3"+
		"\7r\2\2\u03c3\u03c4\7t\2\2\u03c4\u03c5\7g\2\2\u03c5\u03c6\7u\2\2\u03c6"+
		"\u03c7\7u\2\2\u03c7\u03c8\7k\2\2\u03c8\u03c9\7q\2\2\u03c9\u03cb\7p\2\2"+
		"\u03ca\u03ac\3\2\2\2\u03ca\u03bb\3\2\2\2\u03cbT\3\2\2\2\u03cc\u03cd\7"+
		"Y\2\2\u03cd\u03ce\7K\2\2\u03ce\u03cf\7V\2\2\u03cf\u03d0\7J\2\2\u03d0\u03d1"+
		"\7F\2\2\u03d1\u03d2\7G\2\2\u03d2\u03d3\7N\2\2\u03d3\u03d4\7C\2\2\u03d4"+
		"\u03df\7[\2\2\u03d5\u03d6\7y\2\2\u03d6\u03d7\7k\2\2\u03d7\u03d8\7v\2\2"+
		"\u03d8\u03d9\7j\2\2\u03d9\u03da\7f\2\2\u03da\u03db\7g\2\2\u03db\u03dc"+
		"\7n\2\2\u03dc\u03dd\7c\2\2\u03dd\u03df\7{\2\2\u03de\u03cc\3\2\2\2\u03de"+
		"\u03d5\3\2\2\2\u03dfV\3\2\2\2\u03e0\u03e1\7V\2\2\u03e1\u03e2\7K\2\2\u03e2"+
		"\u03e3\7O\2\2\u03e3\u03e4\7G\2\2\u03e4\u03e5\7U\2\2\u03e5\u03e6\7V\2\2"+
		"\u03e6\u03e7\7C\2\2\u03e7\u03e8\7O\2\2\u03e8\u03e9\7R\2\2\u03e9\u03ea"+
		"\7W\2\2\u03ea\u03eb\7P\2\2\u03eb\u03ec\7K\2\2\u03ec\u03fb\7V\2\2\u03ed"+
		"\u03ee\7v\2\2\u03ee\u03ef\7k\2\2\u03ef\u03f0\7o\2\2\u03f0\u03f1\7g\2\2"+
		"\u03f1\u03f2\7u\2\2\u03f2\u03f3\7v\2\2\u03f3\u03f4\7c\2\2\u03f4\u03f5"+
		"\7o\2\2\u03f5\u03f6\7r\2\2\u03f6\u03f7\7w\2\2\u03f7\u03f8\7p\2\2\u03f8"+
		"\u03f9\7k\2\2\u03f9\u03fb\7v\2\2\u03fa\u03e0\3\2\2\2\u03fa\u03ed\3\2\2"+
		"\2\u03fbX\3\2\2\2\u03fc\u03fd\7V\2\2\u03fd\u03fe\7V\2\2\u03fe\u0403\7"+
		"N\2\2\u03ff\u0400\7v\2\2\u0400\u0401\7v\2\2\u0401\u0403\7n\2\2\u0402\u03fc"+
		"\3\2\2\2\u0402\u03ff\3\2\2\2\u0403Z\3\2\2\2\u0404\u0405\7?\2\2\u0405\\"+
		"\3\2\2\2\u0406\u0408\4\62;\2\u0407\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a^\3\2\2\2\u040b\u040c\7,\2\2\u040c"+
		"`\3\2\2\2\u040d\u040e\7.\2\2\u040eb\3\2\2\2\u040f\u0410\7\60\2\2\u0410"+
		"d\3\2\2\2\u0411\u0412\7*\2\2\u0412f\3\2\2\2\u0413\u0414\7+\2\2\u0414h"+
		"\3\2\2\2\u0415\u0417\t\2\2\2\u0416\u0415\3\2\2\2\u0417\u0418\3\2\2\2\u0418"+
		"\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419j\3\2\2\2\u041a\u041c\t\3\2\2"+
		"\u041b\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e"+
		"\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u0421\5o8\2\u0420\u041b\3\2\2\2\u0420"+
		"\u041f\3\2\2\2\u0421l\3\2\2\2\u0422\u0424\t\4\2\2\u0423\u0422\3\2\2\2"+
		"\u0424\u0425\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0429"+
		"\3\2\2\2\u0427\u0429\5o8\2\u0428\u0423\3\2\2\2\u0428\u0427\3\2\2\2\u0429"+
		"n\3\2\2\2\u042a\u042c\7b\2\2\u042b\u042d\n\5\2\2\u042c\u042b\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2"+
		"\2\2\u0430\u0431\7b\2\2\u0431p\3\2\2\2\u0432\u0434\7\17\2\2\u0433\u0432"+
		"\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\7\f\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0438\b9\2\2\u0438r\3\2\2\2\u0439\u043b\t\6\2\2\u043a"+
		"\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043a\3\2\2\2\u043c\u043d\3\2"+
		"\2\2\u043d\u043e\3\2\2\2\u043e\u043f\b:\2\2\u043ft\3\2\2\28\2\u0081\u008f"+
		"\u0099\u00a7\u00b1\u00bf\u00c5\u00db\u00f1\u0105\u0115\u0121\u0137\u014d"+
		"\u0165\u017f\u019b\u01b1\u01c5\u01db\u01eb\u01fb\u0215\u0231\u0243\u0249"+
		"\u0257\u0263\u0279\u028f\u02c7\u02e4\u02f4\u0300\u0320\u0338\u0358\u0374"+
		"\u0394\u03aa\u03ca\u03de\u03fa\u0402\u0409\u0418\u041d\u0420\u0425\u0428"+
		"\u042e\u0433\u043c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}