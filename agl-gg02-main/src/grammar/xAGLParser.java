// Generated from xAGL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class xAGLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, BOOL=24, ID=25, 
		INT=26, FLOAT=27, STRING=28, LINE_COMMENT=29, BLOCK_COMMENT=30, WS=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_loop = 3, 
		RULE_refreshCommand = 4, RULE_moveCommand = 5, RULE_waitCommand = 6, RULE_propertyBlock = 7, 
		RULE_expression = 8, RULE_point = 9, RULE_vector = 10, RULE_time = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "loop", "refreshCommand", "moveCommand", 
			"waitCommand", "propertyBlock", "expression", "point", "vector", "time"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'='", "';'", "'for'", "'in'", "'..'", "'do'", "'{'", "'}'", 
			"'refresh'", "'after'", "'move'", "'by'", "'wait'", "'mouse'", "'click'", 
			"'with'", "'-'", "'('", "','", "')'", "'ms'", "'s'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BOOL", "ID", "INT", "FLOAT", "STRING", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "xAGL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xAGLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 33559568L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public MoveCommandContext moveCommand() {
			return getRuleContext(MoveCommandContext.class,0);
		}
		public RefreshCommandContext refreshCommand() {
			return getRuleContext(RefreshCommandContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				moveCommand();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				refreshCommand();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				assignment();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(xAGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(xAGLParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(ID);
			setState(36);
			match(T__0);
			setState(37);
			match(ID);
			setState(38);
			match(T__1);
			setState(39);
			expression();
			setState(40);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xAGLParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(xAGLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(xAGLParser.INT, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__3);
			setState(43);
			match(ID);
			setState(44);
			match(T__4);
			setState(45);
			match(INT);
			setState(46);
			match(T__5);
			setState(47);
			match(INT);
			setState(48);
			match(T__6);
			setState(49);
			match(T__7);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33559568L) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RefreshCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xAGLParser.ID, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public RefreshCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterRefreshCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitRefreshCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitRefreshCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshCommandContext refreshCommand() throws RecognitionException {
		RefreshCommandContext _localctx = new RefreshCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_refreshCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__9);
			setState(59);
			match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(60);
				match(T__10);
				setState(61);
				time();
				}
			}

			setState(64);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xAGLParser.ID, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MoveCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterMoveCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitMoveCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitMoveCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveCommandContext moveCommand() throws RecognitionException {
		MoveCommandContext _localctx = new MoveCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_moveCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__11);
			setState(67);
			match(ID);
			setState(68);
			match(T__12);
			setState(69);
			vector();
			setState(70);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WaitCommandContext extends ParserRuleContext {
		public WaitCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterWaitCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitWaitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitWaitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitCommandContext waitCommand() throws RecognitionException {
		WaitCommandContext _localctx = new WaitCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_waitCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__13);
			setState(73);
			match(T__14);
			setState(74);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBlockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xAGLParser.ID, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public PropertyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterPropertyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitPropertyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitPropertyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBlockContext propertyBlock() throws RecognitionException {
		PropertyBlockContext _localctx = new PropertyBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__16);
			setState(77);
			match(ID);
			setState(78);
			match(T__6);
			setState(79);
			match(T__7);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(80);
				assignment();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(xAGLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(xAGLParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(xAGLParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(xAGLParser.STRING, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode ID() { return getToken(xAGLParser.ID, 0); }
		public WaitCommandContext waitCommand() {
			return getRuleContext(WaitCommandContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(88);
				match(T__17);
				}
			}

			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(91);
				match(INT);
				}
				break;
			case 2:
				{
				setState(92);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(93);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(94);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(95);
				point();
				}
				break;
			case 6:
				{
				setState(96);
				vector();
				}
				break;
			case 7:
				{
				setState(97);
				time();
				}
				break;
			case 8:
				{
				setState(98);
				match(ID);
				}
				break;
			case 9:
				{
				setState(99);
				waitCommand();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__18);
			setState(103);
			expression();
			setState(104);
			match(T__19);
			setState(105);
			expression();
			setState(106);
			match(T__20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VectorContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode ID() { return getToken(xAGLParser.ID, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vector);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				point();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(xAGLParser.INT, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAGLListener ) ((xAGLListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAGLVisitor ) return ((xAGLVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(INT);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001ft\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003\n\u0003\f\u0003"+
		"7\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004?\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007R\b\u0007\n\u0007\f\u0007U\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0003\bZ\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\be\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\no\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000"+
		"\u0016\u0017x\u0000\u0019\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004#\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b"+
		":\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000"+
		"\u0000\u000eL\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012"+
		"f\u0001\u0000\u0000\u0000\u0014n\u0001\u0000\u0000\u0000\u0016p\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d\"\u0003\n\u0005\u0000\u001e\"\u0003\b\u0004\u0000"+
		"\u001f\"\u0003\u0004\u0002\u0000 \"\u0003\u0006\u0003\u0000!\u001d\u0001"+
		"\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0005"+
		"\u0019\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0019\u0000\u0000"+
		"&\'\u0005\u0002\u0000\u0000\'(\u0003\u0010\b\u0000()\u0005\u0003\u0000"+
		"\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\u0004\u0000\u0000+,\u0005"+
		"\u0019\u0000\u0000,-\u0005\u0005\u0000\u0000-.\u0005\u001a\u0000\u0000"+
		"./\u0005\u0006\u0000\u0000/0\u0005\u001a\u0000\u000001\u0005\u0007\u0000"+
		"\u000015\u0005\b\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005"+
		"\t\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\n\u0000\u0000;>"+
		"\u0005\u0019\u0000\u0000<=\u0005\u000b\u0000\u0000=?\u0003\u0016\u000b"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0003\u0000\u0000A\t\u0001\u0000\u0000\u0000BC\u0005"+
		"\f\u0000\u0000CD\u0005\u0019\u0000\u0000DE\u0005\r\u0000\u0000EF\u0003"+
		"\u0014\n\u0000FG\u0005\u0003\u0000\u0000G\u000b\u0001\u0000\u0000\u0000"+
		"HI\u0005\u000e\u0000\u0000IJ\u0005\u000f\u0000\u0000JK\u0005\u0010\u0000"+
		"\u0000K\r\u0001\u0000\u0000\u0000LM\u0005\u0011\u0000\u0000MN\u0005\u0019"+
		"\u0000\u0000NO\u0005\u0007\u0000\u0000OS\u0005\b\u0000\u0000PR\u0003\u0004"+
		"\u0002\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VW\u0005\t\u0000\u0000W\u000f\u0001\u0000\u0000"+
		"\u0000XZ\u0005\u0012\u0000\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Zd\u0001\u0000\u0000\u0000[e\u0005\u001a\u0000\u0000\\e\u0005"+
		"\u0018\u0000\u0000]e\u0005\u001b\u0000\u0000^e\u0005\u001c\u0000\u0000"+
		"_e\u0003\u0012\t\u0000`e\u0003\u0014\n\u0000ae\u0003\u0016\u000b\u0000"+
		"be\u0005\u0019\u0000\u0000ce\u0003\f\u0006\u0000d[\u0001\u0000\u0000\u0000"+
		"d\\\u0001\u0000\u0000\u0000d]\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000"+
		"\u0000d_\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0011"+
		"\u0001\u0000\u0000\u0000fg\u0005\u0013\u0000\u0000gh\u0003\u0010\b\u0000"+
		"hi\u0005\u0014\u0000\u0000ij\u0003\u0010\b\u0000jk\u0005\u0015\u0000\u0000"+
		"k\u0013\u0001\u0000\u0000\u0000lo\u0003\u0012\t\u0000mo\u0005\u0019\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0015\u0001"+
		"\u0000\u0000\u0000pq\u0005\u001a\u0000\u0000qr\u0007\u0000\u0000\u0000"+
		"r\u0017\u0001\u0000\u0000\u0000\b\u001b!5>SYdn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}