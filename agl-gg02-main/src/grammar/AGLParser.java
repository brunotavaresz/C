// Generated from AGL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AGLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		BOOL=53, ID=54, INT=55, FLOAT=56, STRING=57, LINE_COMMENT=58, BLOCK_COMMENT=59, 
		WS=60;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_comment = 2, RULE_declaration = 3, 
		RULE_instantiation = 4, RULE_referenceCommand = 5, RULE_assignment = 6, 
		RULE_propertyChange = 7, RULE_loop = 8, RULE_propertyBlock = 9, RULE_waitCommand = 10, 
		RULE_closeCommand = 11, RULE_refreshCommand = 12, RULE_printCommand = 13, 
		RULE_moveCommand = 14, RULE_conditional = 15, RULE_ifBlock = 16, RULE_elseBlock = 17, 
		RULE_importCommand = 18, RULE_type = 19, RULE_view = 20, RULE_expression = 21, 
		RULE_point = 22, RULE_vector = 23, RULE_time = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "comment", "declaration", "instantiation", "referenceCommand", 
			"assignment", "propertyChange", "loop", "propertyBlock", "waitCommand", 
			"closeCommand", "refreshCommand", "printCommand", "moveCommand", "conditional", 
			"ifBlock", "elseBlock", "importCommand", "type", "view", "expression", 
			"point", "vector", "time"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "':'", "'with'", "'{'", "'}'", "';'", "'at'", "'.'", "'for'", 
			"'in'", "'..'", "'do'", "'wait'", "'mouse'", "'click'", "'close'", "'refresh'", 
			"'after'", "'print'", "'move'", "'by'", "'if'", "'=='", "'else'", "'end'", 
			"'import'", "'Line'", "'Rectangle'", "'Ellipse'", "'Text'", "'Arc'", 
			"'ArcChord'", "'PieSlice'", "'Integer'", "'Number'", "'String'", "'Point'", 
			"'Vector'", "'Dot'", "'Time'", "'PolyLine'", "'Spline'", "'Polygon'", 
			"'Blob'", "'Boolean'", "'View'", "'-'", "'('", "','", "')'", "'ms'", 
			"'s'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "BOOL", "ID", "INT", "FLOAT", "STRING", 
			"LINE_COMMENT", "BLOCK_COMMENT", "WS"
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
	public String getGrammarFileName() { return "AGL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AGLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AGLParser.EOF, 0); }
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
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 882846264391836168L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ReferenceCommandContext referenceCommand() {
			return getRuleContext(ReferenceCommandContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PropertyChangeContext propertyChange() {
			return getRuleContext(PropertyChangeContext.class,0);
		}
		public RefreshCommandContext refreshCommand() {
			return getRuleContext(RefreshCommandContext.class,0);
		}
		public PrintCommandContext printCommand() {
			return getRuleContext(PrintCommandContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public WaitCommandContext waitCommand() {
			return getRuleContext(WaitCommandContext.class,0);
		}
		public CloseCommandContext closeCommand() {
			return getRuleContext(CloseCommandContext.class,0);
		}
		public MoveCommandContext moveCommand() {
			return getRuleContext(MoveCommandContext.class,0);
		}
		public PropertyBlockContext propertyBlock() {
			return getRuleContext(PropertyBlockContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ImportCommandContext importCommand() {
			return getRuleContext(ImportCommandContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				referenceCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				instantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				propertyChange();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				refreshCommand();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				printCommand();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				loop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(67);
				waitCommand();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(68);
				closeCommand();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(69);
				moveCommand();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(70);
				propertyBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(71);
				conditional();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(72);
				importCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(AGLParser.LINE_COMMENT, 0); }
		public TerminalNode BLOCK_COMMENT() { return getToken(AGLParser.BLOCK_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==BLOCK_COMMENT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			type();
			setState(78);
			match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(79);
				match(T__0);
				setState(80);
				expression();
				}
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
	public static class InstantiationContext extends ParserRuleContext {
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
	 
		public InstantiationContext() { }
		public void copyFrom(InstantiationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstantiationAtPointContext extends InstantiationContext {
		public List<TerminalNode> ID() { return getTokens(AGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AGLParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public InstantiationAtPointContext(InstantiationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterInstantiationAtPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitInstantiationAtPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitInstantiationAtPoint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstantiationWithExpressionContext extends InstantiationContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(AGLParser.BOOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstantiationWithExpressionContext(InstantiationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterInstantiationWithExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitInstantiationWithExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitInstantiationWithExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstantiationWithPropertiesContext extends InstantiationContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public InstantiationWithPropertiesContext(InstantiationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterInstantiationWithProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitInstantiationWithProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitInstantiationWithProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instantiation);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new InstantiationWithPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ID);
				setState(84);
				match(T__1);
				setState(85);
				type();
				setState(86);
				match(T__2);
				setState(87);
				match(T__3);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(88);
					assignment();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new InstantiationWithExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(ID);
				setState(97);
				match(T__1);
				setState(98);
				type();
				setState(99);
				match(T__0);
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(100);
					match(BOOL);
					}
					break;
				case 2:
					{
					setState(101);
					expression();
					}
					break;
				}
				setState(104);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new InstantiationAtPointContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(ID);
				setState(107);
				match(T__1);
				setState(108);
				type();
				setState(109);
				match(T__6);
				setState(112);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__47:
					{
					setState(110);
					point();
					}
					break;
				case ID:
					{
					setState(111);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114);
				match(T__2);
				setState(115);
				match(T__3);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(116);
					assignment();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceCommandContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ReferenceCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterReferenceCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitReferenceCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitReferenceCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceCommandContext referenceCommand() throws RecognitionException {
		ReferenceCommandContext _localctx = new ReferenceCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_referenceCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type();
			setState(127);
			match(T__6);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				{
				setState(128);
				point();
				}
				break;
			case ID:
				{
				setState(129);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(T__2);
			setState(133);
			match(T__3);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(134);
				assignment();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__4);
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
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WaitCommandContext waitCommand() {
			return getRuleContext(WaitCommandContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ID);
			setState(143);
			match(T__0);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(144);
				expression();
				}
				break;
			case 2:
				{
				setState(145);
				waitCommand();
				}
				break;
			}
			setState(148);
			match(T__5);
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
	public static class PropertyChangeContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AGLParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterPropertyChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitPropertyChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitPropertyChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyChangeContext propertyChange() throws RecognitionException {
		PropertyChangeContext _localctx = new PropertyChangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propertyChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(151);
			match(T__7);
			setState(152);
			match(ID);
			setState(153);
			match(T__0);
			setState(154);
			expression();
			setState(155);
			match(T__5);
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
		public List<TerminalNode> ID() { return getTokens(AGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AGLParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(AGLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AGLParser.INT, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<PropertyBlockContext> propertyBlock() {
			return getRuleContexts(PropertyBlockContext.class);
		}
		public PropertyBlockContext propertyBlock(int i) {
			return getRuleContext(PropertyBlockContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__8);
			setState(158);
			match(ID);
			setState(159);
			match(T__9);
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(161);
			match(T__10);
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(T__11);
			setState(164);
			match(T__3);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 882846264391836168L) != 0)) {
				{
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(165);
					statement();
					}
					break;
				case 2:
					{
					setState(166);
					propertyBlock();
					}
					break;
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__4);
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
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
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
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterPropertyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitPropertyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitPropertyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBlockContext propertyBlock() throws RecognitionException {
		PropertyBlockContext _localctx = new PropertyBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__2);
			setState(175);
			match(ID);
			setState(176);
			match(T__11);
			setState(177);
			match(T__3);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(178);
				assignment();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(T__4);
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
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterWaitCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitWaitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitWaitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitCommandContext waitCommand() throws RecognitionException {
		WaitCommandContext _localctx = new WaitCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_waitCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__12);
			setState(187);
			match(T__13);
			setState(188);
			match(T__14);
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
	public static class CloseCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public CloseCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterCloseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitCloseCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitCloseCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseCommandContext closeCommand() throws RecognitionException {
		CloseCommandContext _localctx = new CloseCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_closeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__15);
			setState(191);
			match(ID);
			setState(192);
			match(T__5);
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
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public RefreshCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refreshCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterRefreshCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitRefreshCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitRefreshCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefreshCommandContext refreshCommand() throws RecognitionException {
		RefreshCommandContext _localctx = new RefreshCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_refreshCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__16);
			setState(195);
			match(ID);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(196);
				match(T__17);
				setState(197);
				time();
				}
			}

			setState(200);
			match(T__5);
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
	public static class PrintCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AGLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public PrintCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterPrintCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitPrintCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitPrintCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintCommandContext printCommand() throws RecognitionException {
		PrintCommandContext _localctx = new PrintCommandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__18);
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(204);
			match(T__5);
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
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public MoveCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterMoveCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitMoveCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitMoveCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveCommandContext moveCommand() throws RecognitionException {
		MoveCommandContext _localctx = new MoveCommandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_moveCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__19);
			setState(207);
			match(ID);
			setState(208);
			match(T__20);
			setState(209);
			vector();
			setState(210);
			match(T__5);
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
	public static class ConditionalContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			ifBlock();
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(213);
				elseBlock();
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
	public static class IfBlockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(AGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AGLParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__21);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(217);
				expression();
				}
				break;
			case 2:
				{
				setState(218);
				match(ID);
				}
				break;
			}
			setState(221);
			match(T__22);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(222);
				expression();
				}
				break;
			case 2:
				{
				setState(223);
				match(ID);
				}
				break;
			}
			setState(226);
			match(T__11);
			setState(228); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(227);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(230); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__23);
			setState(233);
			match(T__11);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				statement();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 882846264391836168L) != 0) );
			setState(239);
			match(T__24);
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
	public static class ImportCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AGLParser.STRING, 0); }
		public ImportCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterImportCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitImportCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitImportCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportCommandContext importCommand() throws RecognitionException {
		ImportCommandContext _localctx = new ImportCommandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_importCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__25);
			setState(242);
			match(STRING);
			setState(243);
			match(T__5);
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
	public static class TypeContext extends ParserRuleContext {
		public ViewContext view() {
			return getRuleContext(ViewContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				view();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 11);
				{
				setState(255);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 12);
				{
				setState(256);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 13);
				{
				setState(257);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 14);
				{
				setState(258);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 15);
				{
				setState(259);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 16);
				{
				setState(260);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 17);
				{
				setState(261);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 18);
				{
				setState(262);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 19);
				{
				setState(263);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 20);
				{
				setState(264);
				match(T__44);
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
	public static class ViewContext extends ParserRuleContext {
		public ViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewContext view() throws RecognitionException {
		ViewContext _localctx = new ViewContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_view);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__45);
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
		public TerminalNode INT() { return getToken(AGLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(AGLParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(AGLParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(AGLParser.STRING, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public WaitCommandContext waitCommand() {
			return getRuleContext(WaitCommandContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(269);
				match(T__46);
				}
			}

			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(272);
				match(INT);
				}
				break;
			case 2:
				{
				setState(273);
				match(BOOL);
				}
				break;
			case 3:
				{
				setState(274);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(275);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(276);
				point();
				}
				break;
			case 6:
				{
				setState(277);
				vector();
				}
				break;
			case 7:
				{
				setState(278);
				time();
				}
				break;
			case 8:
				{
				setState(279);
				match(ID);
				}
				break;
			case 9:
				{
				setState(280);
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
		public List<TerminalNode> ID() { return getTokens(AGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AGLParser.ID, i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__47);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(284);
				expression();
				}
				break;
			case 2:
				{
				setState(285);
				match(ID);
				}
				break;
			}
			setState(288);
			match(T__48);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(289);
				expression();
				}
				break;
			case 2:
				{
				setState(290);
				match(ID);
				}
				break;
			}
			setState(293);
			match(T__49);
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
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitVector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vector);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				point();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
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
		public TerminalNode INT() { return getToken(AGLParser.INT, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AGLListener ) ((AGLListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AGLVisitor ) return ((AGLVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(INT);
			setState(300);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
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
		"\u0004\u0001<\u012f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004g\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004q\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"v\b\u0004\n\u0004\f\u0004y\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"}\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0083\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0088\b"+
		"\u0005\n\u0005\f\u0005\u008b\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0093\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a8\b\b\n\b\f\b\u00ab\t\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b4"+
		"\b\t\n\t\f\t\u00b7\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00c7\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00d7\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00dc\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e1\b\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00e5\b"+
		"\u0010\u000b\u0010\f\u0010\u00e6\u0001\u0011\u0001\u0011\u0001\u0011\u0004"+
		"\u0011\u00ec\b\u0011\u000b\u0011\f\u0011\u00ed\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u010a\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015"+
		"\u010f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u011a\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u011f\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0124\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u012a\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000"+
		"\u0004\u0001\u0000:;\u0001\u000067\u0002\u00006699\u0001\u000034\u0156"+
		"\u00005\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004K"+
		"\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\b|\u0001\u0000"+
		"\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000\u0000\u0000"+
		"\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000"+
		"\u0012\u00ae\u0001\u0000\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000"+
		"\u0016\u00be\u0001\u0000\u0000\u0000\u0018\u00c2\u0001\u0000\u0000\u0000"+
		"\u001a\u00ca\u0001\u0000\u0000\u0000\u001c\u00ce\u0001\u0000\u0000\u0000"+
		"\u001e\u00d4\u0001\u0000\u0000\u0000 \u00d8\u0001\u0000\u0000\u0000\""+
		"\u00e8\u0001\u0000\u0000\u0000$\u00f1\u0001\u0000\u0000\u0000&\u0109\u0001"+
		"\u0000\u0000\u0000(\u010b\u0001\u0000\u0000\u0000*\u010e\u0001\u0000\u0000"+
		"\u0000,\u011b\u0001\u0000\u0000\u0000.\u0129\u0001\u0000\u0000\u00000"+
		"\u012b\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"89\u0005\u0000\u0000\u00019\u0001\u0001\u0000\u0000\u0000:J\u0003\u0004"+
		"\u0002\u0000;J\u0003\u0006\u0003\u0000<J\u0003\n\u0005\u0000=J\u0003\b"+
		"\u0004\u0000>J\u0003\f\u0006\u0000?J\u0003\u000e\u0007\u0000@J\u0003\u0018"+
		"\f\u0000AJ\u0003\u001a\r\u0000BJ\u0003\u0010\b\u0000CJ\u0003\u0014\n\u0000"+
		"DJ\u0003\u0016\u000b\u0000EJ\u0003\u001c\u000e\u0000FJ\u0003\u0012\t\u0000"+
		"GJ\u0003\u001e\u000f\u0000HJ\u0003$\u0012\u0000I:\u0001\u0000\u0000\u0000"+
		"I;\u0001\u0000\u0000\u0000I<\u0001\u0000\u0000\u0000I=\u0001\u0000\u0000"+
		"\u0000I>\u0001\u0000\u0000\u0000I?\u0001\u0000\u0000\u0000I@\u0001\u0000"+
		"\u0000\u0000IA\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000IC\u0001"+
		"\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000"+
		"IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0007\u0000\u0000\u0000L\u0005"+
		"\u0001\u0000\u0000\u0000MN\u0003&\u0013\u0000NQ\u00056\u0000\u0000OP\u0005"+
		"\u0001\u0000\u0000PR\u0003*\u0015\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\u0007\u0001\u0000\u0000\u0000ST\u00056\u0000\u0000"+
		"TU\u0005\u0002\u0000\u0000UV\u0003&\u0013\u0000VW\u0005\u0003\u0000\u0000"+
		"W[\u0005\u0004\u0000\u0000XZ\u0003\f\u0006\u0000YX\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0005"+
		"\u0000\u0000_}\u0001\u0000\u0000\u0000`a\u00056\u0000\u0000ab\u0005\u0002"+
		"\u0000\u0000bc\u0003&\u0013\u0000cf\u0005\u0001\u0000\u0000dg\u00055\u0000"+
		"\u0000eg\u0003*\u0015\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0006\u0000\u0000i}\u0001\u0000"+
		"\u0000\u0000jk\u00056\u0000\u0000kl\u0005\u0002\u0000\u0000lm\u0003&\u0013"+
		"\u0000mp\u0005\u0007\u0000\u0000nq\u0003,\u0016\u0000oq\u00056\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rs\u0005\u0003\u0000\u0000sw\u0005\u0004\u0000\u0000tv\u0003\f\u0006"+
		"\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0005\u0000\u0000{}\u0001\u0000\u0000\u0000"+
		"|S\u0001\u0000\u0000\u0000|`\u0001\u0000\u0000\u0000|j\u0001\u0000\u0000"+
		"\u0000}\t\u0001\u0000\u0000\u0000~\u007f\u0003&\u0013\u0000\u007f\u0082"+
		"\u0005\u0007\u0000\u0000\u0080\u0083\u0003,\u0016\u0000\u0081\u0083\u0005"+
		"6\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0003"+
		"\u0000\u0000\u0085\u0089\u0005\u0004\u0000\u0000\u0086\u0088\u0003\f\u0006"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u000b\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u00056\u0000\u0000\u008f\u0092\u0005\u0001\u0000\u0000"+
		"\u0090\u0093\u0003*\u0015\u0000\u0091\u0093\u0003\u0014\n\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095"+
		"\r\u0001\u0000\u0000\u0000\u0096\u0097\u00056\u0000\u0000\u0097\u0098"+
		"\u0005\b\u0000\u0000\u0098\u0099\u00056\u0000\u0000\u0099\u009a\u0005"+
		"\u0001\u0000\u0000\u009a\u009b\u0003*\u0015\u0000\u009b\u009c\u0005\u0006"+
		"\u0000\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d\u009e\u0005\t\u0000"+
		"\u0000\u009e\u009f\u00056\u0000\u0000\u009f\u00a0\u0005\n\u0000\u0000"+
		"\u00a0\u00a1\u0007\u0001\u0000\u0000\u00a1\u00a2\u0005\u000b\u0000\u0000"+
		"\u00a2\u00a3\u0007\u0001\u0000\u0000\u00a3\u00a4\u0005\f\u0000\u0000\u00a4"+
		"\u00a9\u0005\u0004\u0000\u0000\u00a5\u00a8\u0003\u0002\u0001\u0000\u00a6"+
		"\u00a8\u0003\u0012\t\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0005\u0000\u0000\u00ad\u0011\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0003\u0000\u0000\u00af\u00b0\u00056\u0000\u0000\u00b0\u00b1\u0005"+
		"\f\u0000\u0000\u00b1\u00b5\u0005\u0004\u0000\u0000\u00b2\u00b4\u0003\f"+
		"\u0006\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000\u00b9\u0013\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\r\u0000\u0000\u00bb\u00bc\u0005\u000e\u0000"+
		"\u0000\u00bc\u00bd\u0005\u000f\u0000\u0000\u00bd\u0015\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u0010\u0000\u0000\u00bf\u00c0\u00056\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0006\u0000\u0000\u00c1\u0017\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0011\u0000\u0000\u00c3\u00c6\u00056\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0012\u0000\u0000\u00c5\u00c7\u00030\u0018\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0006\u0000\u0000\u00c9\u0019"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0013\u0000\u0000\u00cb\u00cc"+
		"\u0007\u0002\u0000\u0000\u00cc\u00cd\u0005\u0006\u0000\u0000\u00cd\u001b"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0014\u0000\u0000\u00cf\u00d0"+
		"\u00056\u0000\u0000\u00d0\u00d1\u0005\u0015\u0000\u0000\u00d1\u00d2\u0003"+
		".\u0017\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u001d\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0003 \u0010\u0000\u00d5\u00d7\u0003\"\u0011"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u001f\u0001\u0000\u0000\u0000\u00d8\u00db\u0005\u0016\u0000"+
		"\u0000\u00d9\u00dc\u0003*\u0015\u0000\u00da\u00dc\u00056\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e0\u0005\u0017\u0000\u0000\u00de"+
		"\u00e1\u0003*\u0015\u0000\u00df\u00e1\u00056\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e4\u0005\f\u0000\u0000\u00e3\u00e5\u0003\u0002"+
		"\u0001\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0018\u0000"+
		"\u0000\u00e9\u00eb\u0005\f\u0000\u0000\u00ea\u00ec\u0003\u0002\u0001\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0019\u0000\u0000"+
		"\u00f0#\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u001a\u0000\u0000\u00f2"+
		"\u00f3\u00059\u0000\u0000\u00f3\u00f4\u0005\u0006\u0000\u0000\u00f4%\u0001"+
		"\u0000\u0000\u0000\u00f5\u010a\u0003(\u0014\u0000\u00f6\u010a\u0005\u001b"+
		"\u0000\u0000\u00f7\u010a\u0005\u001c\u0000\u0000\u00f8\u010a\u0005\u001d"+
		"\u0000\u0000\u00f9\u010a\u0005\u001e\u0000\u0000\u00fa\u010a\u0005\u001f"+
		"\u0000\u0000\u00fb\u010a\u0005 \u0000\u0000\u00fc\u010a\u0005!\u0000\u0000"+
		"\u00fd\u010a\u0005\"\u0000\u0000\u00fe\u010a\u0005#\u0000\u0000\u00ff"+
		"\u010a\u0005$\u0000\u0000\u0100\u010a\u0005%\u0000\u0000\u0101\u010a\u0005"+
		"&\u0000\u0000\u0102\u010a\u0005\'\u0000\u0000\u0103\u010a\u0005(\u0000"+
		"\u0000\u0104\u010a\u0005)\u0000\u0000\u0105\u010a\u0005*\u0000\u0000\u0106"+
		"\u010a\u0005+\u0000\u0000\u0107\u010a\u0005,\u0000\u0000\u0108\u010a\u0005"+
		"-\u0000\u0000\u0109\u00f5\u0001\u0000\u0000\u0000\u0109\u00f6\u0001\u0000"+
		"\u0000\u0000\u0109\u00f7\u0001\u0000\u0000\u0000\u0109\u00f8\u0001\u0000"+
		"\u0000\u0000\u0109\u00f9\u0001\u0000\u0000\u0000\u0109\u00fa\u0001\u0000"+
		"\u0000\u0000\u0109\u00fb\u0001\u0000\u0000\u0000\u0109\u00fc\u0001\u0000"+
		"\u0000\u0000\u0109\u00fd\u0001\u0000\u0000\u0000\u0109\u00fe\u0001\u0000"+
		"\u0000\u0000\u0109\u00ff\u0001\u0000\u0000\u0000\u0109\u0100\u0001\u0000"+
		"\u0000\u0000\u0109\u0101\u0001\u0000\u0000\u0000\u0109\u0102\u0001\u0000"+
		"\u0000\u0000\u0109\u0103\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000"+
		"\u0000\u0000\u0109\u0105\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\'\u0001\u0000\u0000\u0000\u010b\u010c\u0005.\u0000"+
		"\u0000\u010c)\u0001\u0000\u0000\u0000\u010d\u010f\u0005/\u0000\u0000\u010e"+
		"\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0119\u0001\u0000\u0000\u0000\u0110\u011a\u00057\u0000\u0000\u0111\u011a"+
		"\u00055\u0000\u0000\u0112\u011a\u00058\u0000\u0000\u0113\u011a\u00059"+
		"\u0000\u0000\u0114\u011a\u0003,\u0016\u0000\u0115\u011a\u0003.\u0017\u0000"+
		"\u0116\u011a\u00030\u0018\u0000\u0117\u011a\u00056\u0000\u0000\u0118\u011a"+
		"\u0003\u0014\n\u0000\u0119\u0110\u0001\u0000\u0000\u0000\u0119\u0111\u0001"+
		"\u0000\u0000\u0000\u0119\u0112\u0001\u0000\u0000\u0000\u0119\u0113\u0001"+
		"\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u0119\u0115\u0001"+
		"\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a+\u0001\u0000"+
		"\u0000\u0000\u011b\u011e\u00050\u0000\u0000\u011c\u011f\u0003*\u0015\u0000"+
		"\u011d\u011f\u00056\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0123\u00051\u0000\u0000\u0121\u0124\u0003*\u0015\u0000\u0122\u0124\u0005"+
		"6\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u00052\u0000"+
		"\u0000\u0126-\u0001\u0000\u0000\u0000\u0127\u012a\u0003,\u0016\u0000\u0128"+
		"\u012a\u00056\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u012a/\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"7\u0000\u0000\u012c\u012d\u0007\u0003\u0000\u0000\u012d1\u0001\u0000\u0000"+
		"\u0000\u001a5IQ[fpw|\u0082\u0089\u0092\u00a7\u00a9\u00b5\u00c6\u00d6\u00db"+
		"\u00e0\u00e6\u00ed\u0109\u010e\u0119\u011e\u0123\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}