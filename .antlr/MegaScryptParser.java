// Generated from e:\GameProgramming2\CustomScriptingLanguage\MegaScrypt.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MegaScryptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, True=11, False=12, Var=13, Equals=14, Underscore=15, Add=16, 
		Increment=17, Minus=18, Decrement=19, Multiply=20, Divide=21, LeftParenthesis=22, 
		RightParenthesis=23, Dot=24, And=25, Or=26, Not=27, DivideEquals=28, SubEquals=29, 
		MultiplyEquals=30, AddEquals=31, DoubleEquals=32, NotEquals=33, LessOrEqual=34, 
		GreaterOrEqual=35, GreaterThan=36, LessThan=37, Null=38, Id=39, Number=40, 
		String=41, WhiteSpace=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_increment = 4, RULE_bincrement = 5, RULE_block = 6, RULE_funcDeclearation = 7, 
		RULE_varList = 8, RULE_returnStmt = 9, RULE_ifStmt = 10, RULE_elseifStmt = 11, 
		RULE_elseStmt = 12, RULE_invocation = 13, RULE_paramList = 14, RULE_expression = 15, 
		RULE_print = 16, RULE_object = 17, RULE_objectPair = 18, RULE_objectGet = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "assignment", "increment", "bincrement", 
			"block", "funcDeclearation", "varList", "returnStmt", "ifStmt", "elseifStmt", 
			"elseStmt", "invocation", "paramList", "expression", "print", "object", 
			"objectPair", "objectGet"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'function'", "','", "'return'", "'if'", "'else'", 
			"'Print'", "':'", "'true'", "'false'", "'var'", "'='", "'_'", "'+'", 
			"'++'", "'-'", "'--'", "'*'", "'/'", "'('", "')'", "'.'", "'&&'", "'||'", 
			"'!'", "'/='", "'-='", "'*='", "'+='", "'=='", "'!='", "'<='", "'>='", 
			"'>'", "'<'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "True", 
			"False", "Var", "Equals", "Underscore", "Add", "Increment", "Minus", 
			"Decrement", "Multiply", "Divide", "LeftParenthesis", "RightParenthesis", 
			"Dot", "And", "Or", "Not", "DivideEquals", "SubEquals", "MultiplyEquals", 
			"AddEquals", "DoubleEquals", "NotEquals", "LessOrEqual", "GreaterOrEqual", 
			"GreaterThan", "LessThan", "Null", "Id", "Number", "String", "WhiteSpace"
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
	public String getGrammarFileName() { return "MegaScrypt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MegaScryptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << Var) | (1L << Increment) | (1L << Decrement) | (1L << Id))) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					statement();
					}
					break;
				case 2:
					{
					setState(41);
					block();
					}
					break;
				}
				}
				setState(46);
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

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public BincrementContext bincrement() {
			return getRuleContext(BincrementContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case Var:
			case Increment:
			case Decrement:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(47);
					declaration();
					}
					break;
				case 2:
					{
					setState(48);
					assignment();
					}
					break;
				case 3:
					{
					setState(49);
					increment();
					}
					break;
				case 4:
					{
					setState(50);
					bincrement();
					}
					break;
				case 5:
					{
					setState(51);
					invocation();
					}
					break;
				case 6:
					{
					setState(52);
					returnStmt();
					}
					break;
				}
				setState(55);
				match(T__0);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				ifStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				print();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(MegaScryptParser.Var, 0); }
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public ObjectGetContext objectGet() {
			return getRuleContext(ObjectGetContext.class,0);
		}
		public TerminalNode Equals() { return getToken(MegaScryptParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Var);
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(62);
				match(Id);
				}
				break;
			case 2:
				{
				setState(63);
				objectGet();
				}
				break;
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(66);
				match(Equals);
				setState(69);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case True:
				case False:
				case Increment:
				case Minus:
				case Decrement:
				case LeftParenthesis:
				case Not:
				case Null:
				case Id:
				case Number:
				case String:
					{
					setState(67);
					expression(0);
					}
					break;
				case T__1:
					{
					setState(68);
					object();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(MegaScryptParser.Equals, 0); }
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public ObjectGetContext objectGet() {
			return getRuleContext(ObjectGetContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode DivideEquals() { return getToken(MegaScryptParser.DivideEquals, 0); }
		public TerminalNode MultiplyEquals() { return getToken(MegaScryptParser.MultiplyEquals, 0); }
		public TerminalNode AddEquals() { return getToken(MegaScryptParser.AddEquals, 0); }
		public TerminalNode SubEquals() { return getToken(MegaScryptParser.SubEquals, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(73);
					match(Id);
					}
					break;
				case 2:
					{
					setState(74);
					objectGet();
					}
					break;
				}
				setState(77);
				match(Equals);
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case True:
				case False:
				case Increment:
				case Minus:
				case Decrement:
				case LeftParenthesis:
				case Not:
				case Null:
				case Id:
				case Number:
				case String:
					{
					setState(78);
					expression(0);
					}
					break;
				case T__1:
					{
					setState(79);
					object();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(Id);
				setState(83);
				match(Equals);
				setState(84);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(Id);
				setState(86);
				match(DivideEquals);
				setState(87);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(Id);
				setState(89);
				match(MultiplyEquals);
				setState(90);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				match(Id);
				setState(92);
				match(AddEquals);
				setState(93);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(Id);
				setState(95);
				match(SubEquals);
				setState(96);
				expression(0);
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public TerminalNode Increment() { return getToken(MegaScryptParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(MegaScryptParser.Decrement, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Id);
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==Increment || _la==Decrement) ) {
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

	public static class BincrementContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public TerminalNode Increment() { return getToken(MegaScryptParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(MegaScryptParser.Decrement, 0); }
		public BincrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bincrement; }
	}

	public final BincrementContext bincrement() throws RecognitionException {
		BincrementContext _localctx = new BincrementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bincrement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==Increment || _la==Decrement) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(103);
			match(Id);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__1);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << Var) | (1L << Increment) | (1L << Decrement) | (1L << Id))) != 0)) {
					{
					{
					setState(106);
					statement();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(T__2);
				}
				break;
			case T__5:
			case T__6:
			case T__8:
			case Var:
			case Increment:
			case Decrement:
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				statement();
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

	public static class FuncDeclearationContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(MegaScryptParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MegaScryptParser.RightParenthesis, 0); }
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDeclearationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclearation; }
	}

	public final FuncDeclearationContext funcDeclearation() throws RecognitionException {
		FuncDeclearationContext _localctx = new FuncDeclearationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcDeclearation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__3);
			setState(117);
			match(LeftParenthesis);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(118);
				varList();
				}
			}

			setState(121);
			match(RightParenthesis);
			setState(122);
			match(T__1);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << Var) | (1L << Increment) | (1L << Decrement) | (1L << Id))) != 0)) {
				{
				{
				setState(123);
				statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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

	public static class VarListContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(MegaScryptParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(MegaScryptParser.Var, i);
		}
		public List<TerminalNode> Id() { return getTokens(MegaScryptParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(MegaScryptParser.Id, i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(Var);
			setState(132);
			match(Id);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(133);
				match(T__4);
				setState(134);
				match(Var);
				setState(135);
				match(Id);
				}
				}
				setState(140);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__5);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << True) | (1L << False) | (1L << Increment) | (1L << Minus) | (1L << Decrement) | (1L << LeftParenthesis) | (1L << Not) | (1L << Null) | (1L << Id) | (1L << Number) | (1L << String))) != 0)) {
				{
				setState(142);
				expression(0);
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(MegaScryptParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(MegaScryptParser.RightParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseifStmtContext> elseifStmt() {
			return getRuleContexts(ElseifStmtContext.class);
		}
		public ElseifStmtContext elseifStmt(int i) {
			return getRuleContext(ElseifStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__6);
			setState(146);
			match(LeftParenthesis);
			setState(147);
			expression(0);
			setState(148);
			match(RightParenthesis);
			setState(149);
			block();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					elseifStmt();
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(156);
				elseStmt();
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

	public static class ElseifStmtContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(MegaScryptParser.LeftParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParenthesis() { return getToken(MegaScryptParser.RightParenthesis, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifStmt; }
	}

	public final ElseifStmtContext elseifStmt() throws RecognitionException {
		ElseifStmtContext _localctx = new ElseifStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__7);
			setState(160);
			match(T__6);
			setState(161);
			match(LeftParenthesis);
			setState(162);
			expression(0);
			setState(163);
			match(RightParenthesis);
			setState(164);
			block();
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

	public static class ElseStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__7);
			setState(167);
			block();
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

	public static class InvocationContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public TerminalNode LeftParenthesis() { return getToken(MegaScryptParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MegaScryptParser.RightParenthesis, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(Id);
			setState(170);
			match(LeftParenthesis);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << True) | (1L << False) | (1L << Increment) | (1L << Minus) | (1L << Decrement) | (1L << LeftParenthesis) | (1L << Not) | (1L << Null) | (1L << Id) | (1L << Number) | (1L << String))) != 0)) {
				{
				setState(171);
				paramList();
				}
			}

			setState(174);
			match(RightParenthesis);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expression(0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(177);
				match(T__4);
				setState(178);
				expression(0);
				}
				}
				setState(183);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(MegaScryptParser.Number, 0); }
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public TerminalNode True() { return getToken(MegaScryptParser.True, 0); }
		public TerminalNode False() { return getToken(MegaScryptParser.False, 0); }
		public TerminalNode LeftParenthesis() { return getToken(MegaScryptParser.LeftParenthesis, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RightParenthesis() { return getToken(MegaScryptParser.RightParenthesis, 0); }
		public FuncDeclearationContext funcDeclearation() {
			return getRuleContext(FuncDeclearationContext.class,0);
		}
		public TerminalNode Minus() { return getToken(MegaScryptParser.Minus, 0); }
		public TerminalNode Not() { return getToken(MegaScryptParser.Not, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public BincrementContext bincrement() {
			return getRuleContext(BincrementContext.class,0);
		}
		public TerminalNode Increment() { return getToken(MegaScryptParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(MegaScryptParser.Decrement, 0); }
		public TerminalNode Null() { return getToken(MegaScryptParser.Null, 0); }
		public TerminalNode String() { return getToken(MegaScryptParser.String, 0); }
		public ObjectGetContext objectGet() {
			return getRuleContext(ObjectGetContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(MegaScryptParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(MegaScryptParser.Divide, 0); }
		public TerminalNode Add() { return getToken(MegaScryptParser.Add, 0); }
		public TerminalNode LessThan() { return getToken(MegaScryptParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(MegaScryptParser.GreaterThan, 0); }
		public TerminalNode DoubleEquals() { return getToken(MegaScryptParser.DoubleEquals, 0); }
		public TerminalNode NotEquals() { return getToken(MegaScryptParser.NotEquals, 0); }
		public TerminalNode LessOrEqual() { return getToken(MegaScryptParser.LessOrEqual, 0); }
		public TerminalNode GreaterOrEqual() { return getToken(MegaScryptParser.GreaterOrEqual, 0); }
		public TerminalNode MultiplyEquals() { return getToken(MegaScryptParser.MultiplyEquals, 0); }
		public TerminalNode DivideEquals() { return getToken(MegaScryptParser.DivideEquals, 0); }
		public TerminalNode And() { return getToken(MegaScryptParser.And, 0); }
		public TerminalNode Or() { return getToken(MegaScryptParser.Or, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(185);
				match(Number);
				}
				break;
			case 2:
				{
				setState(186);
				match(Id);
				}
				break;
			case 3:
				{
				setState(187);
				match(True);
				}
				break;
			case 4:
				{
				setState(188);
				match(False);
				}
				break;
			case 5:
				{
				setState(189);
				match(LeftParenthesis);
				setState(190);
				expression(0);
				setState(191);
				match(RightParenthesis);
				}
				break;
			case 6:
				{
				setState(193);
				funcDeclearation();
				}
				break;
			case 7:
				{
				setState(194);
				match(Minus);
				setState(195);
				expression(14);
				}
				break;
			case 8:
				{
				setState(196);
				match(Not);
				setState(197);
				expression(13);
				}
				break;
			case 9:
				{
				setState(198);
				invocation();
				}
				break;
			case 10:
				{
				setState(199);
				bincrement();
				}
				break;
			case 11:
				{
				setState(200);
				match(Id);
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==Increment || _la==Decrement) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 12:
				{
				setState(202);
				match(Null);
				}
				break;
			case 13:
				{
				setState(203);
				match(String);
				}
				break;
			case 14:
				{
				setState(204);
				objectGet();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(208);
						_la = _input.LA(1);
						if ( !(_la==Multiply || _la==Divide) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(211);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(214);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DoubleEquals) | (1L << NotEquals) | (1L << LessOrEqual) | (1L << GreaterOrEqual) | (1L << GreaterThan) | (1L << LessThan))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(217);
						_la = _input.LA(1);
						if ( !(_la==DivideEquals || _la==MultiplyEquals) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(220);
						match(And);
						setState(221);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(223);
						match(Or);
						setState(224);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode LeftParenthesis() { return getToken(MegaScryptParser.LeftParenthesis, 0); }
		public TerminalNode RightParenthesis() { return getToken(MegaScryptParser.RightParenthesis, 0); }
		public TerminalNode String() { return getToken(MegaScryptParser.String, 0); }
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__8);
			setState(231);
			match(LeftParenthesis);
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
				{
				{
				setState(232);
				match(String);
				setState(233);
				match(T__4);
				setState(234);
				match(Id);
				}
				}
				break;
			case Id:
				{
				{
				setState(235);
				match(Id);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(238);
			match(RightParenthesis);
			setState(239);
			match(T__0);
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

	public static class ObjectContext extends ParserRuleContext {
		public List<ObjectPairContext> objectPair() {
			return getRuleContexts(ObjectPairContext.class);
		}
		public ObjectPairContext objectPair(int i) {
			return getRuleContext(ObjectPairContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__1);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Id) {
				{
				{
				setState(242);
				objectPair();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(243);
					match(T__4);
					}
				}

				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
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

	public static class ObjectPairContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(MegaScryptParser.Id, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPair; }
	}

	public final ObjectPairContext objectPair() throws RecognitionException {
		ObjectPairContext _localctx = new ObjectPairContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_objectPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(Id);
			setState(254);
			match(T__9);
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case True:
			case False:
			case Increment:
			case Minus:
			case Decrement:
			case LeftParenthesis:
			case Not:
			case Null:
			case Id:
			case Number:
			case String:
				{
				setState(255);
				expression(0);
				}
				break;
			case T__1:
				{
				setState(256);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ObjectGetContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(MegaScryptParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(MegaScryptParser.Id, i);
		}
		public List<TerminalNode> Dot() { return getTokens(MegaScryptParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(MegaScryptParser.Dot, i);
		}
		public ObjectGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectGet; }
	}

	public final ObjectGetContext objectGet() throws RecognitionException {
		ObjectGetContext _localctx = new ObjectGetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_objectGet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(Id);
			setState(262); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(260);
					match(Dot);
					setState(261);
					match(Id);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\5\4C"+
		"\n\4\3\4\3\4\3\4\5\4H\n\4\5\4J\n\4\3\5\3\5\5\5N\n\5\3\5\3\5\3\5\5\5S\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b\5\b"+
		"u\n\b\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e\13\n\3\13\3"+
		"\13\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009a\n\f\f\f\16\f\u009d"+
		"\13\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\5\17\u00af\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u00b6\n\20\f"+
		"\20\16\20\u00b9\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d0\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7\13\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00ef\n\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u00f7\n\23\7\23\u00f9\n\23\f\23\16\23\u00fc\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\5\24\u0104\n\24\3\25\3\25\3\25\6\25\u0109\n\25\r\25\16\25\u010a"+
		"\3\25\2\3 \26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\4\2\23"+
		"\23\25\25\3\2\26\27\4\2\22\22\24\24\3\2\"\'\4\2\36\36  \2\u012d\2.\3\2"+
		"\2\2\4=\3\2\2\2\6?\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fh\3\2\2\2\16t\3\2\2"+
		"\2\20v\3\2\2\2\22\u0085\3\2\2\2\24\u008f\3\2\2\2\26\u0093\3\2\2\2\30\u00a1"+
		"\3\2\2\2\32\u00a8\3\2\2\2\34\u00ab\3\2\2\2\36\u00b2\3\2\2\2 \u00cf\3\2"+
		"\2\2\"\u00e8\3\2\2\2$\u00f3\3\2\2\2&\u00ff\3\2\2\2(\u0105\3\2\2\2*-\5"+
		"\4\3\2+-\5\16\b\2,*\3\2\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\3\3\2\2\2\60.\3\2\2\2\618\5\6\4\2\628\5\b\5\2\638\5\n\6\2\648\5\f\7"+
		"\2\658\5\34\17\2\668\5\24\13\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2"+
		"\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29:\7\3\2\2:>\3\2"+
		"\2\2;>\5\26\f\2<>\5\"\22\2=\67\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2\2"+
		"?B\7\17\2\2@C\7)\2\2AC\5(\25\2B@\3\2\2\2BA\3\2\2\2CI\3\2\2\2DG\7\20\2"+
		"\2EH\5 \21\2FH\5$\23\2GE\3\2\2\2GF\3\2\2\2HJ\3\2\2\2ID\3\2\2\2IJ\3\2\2"+
		"\2J\7\3\2\2\2KN\7)\2\2LN\5(\25\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OR\7\20"+
		"\2\2PS\5 \21\2QS\5$\23\2RP\3\2\2\2RQ\3\2\2\2Sd\3\2\2\2TU\7)\2\2UV\7\20"+
		"\2\2Vd\5 \21\2WX\7)\2\2XY\7\36\2\2Yd\5 \21\2Z[\7)\2\2[\\\7 \2\2\\d\5 "+
		"\21\2]^\7)\2\2^_\7!\2\2_d\5 \21\2`a\7)\2\2ab\7\37\2\2bd\5 \21\2cM\3\2"+
		"\2\2cT\3\2\2\2cW\3\2\2\2cZ\3\2\2\2c]\3\2\2\2c`\3\2\2\2d\t\3\2\2\2ef\7"+
		")\2\2fg\t\2\2\2g\13\3\2\2\2hi\t\2\2\2ij\7)\2\2j\r\3\2\2\2ko\7\4\2\2ln"+
		"\5\4\3\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2r"+
		"u\7\5\2\2su\5\4\3\2tk\3\2\2\2ts\3\2\2\2u\17\3\2\2\2vw\7\6\2\2wy\7\30\2"+
		"\2xz\5\22\n\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\31\2\2|\u0080\7\4\2\2"+
		"}\177\5\4\3\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\5\2\2\u0084"+
		"\21\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u008c\7)\2\2\u0087\u0088\7\7\2"+
		"\2\u0088\u0089\7\17\2\2\u0089\u008b\7)\2\2\u008a\u0087\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\23\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0091\7\b\2\2\u0090\u0092\5 \21\2\u0091\u0090\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\25\3\2\2\2\u0093\u0094\7\t\2\2\u0094\u0095"+
		"\7\30\2\2\u0095\u0096\5 \21\2\u0096\u0097\7\31\2\2\u0097\u009b\5\16\b"+
		"\2\u0098\u009a\5\30\r\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a0\5\32\16\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\7\30\2"+
		"\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\5\16\b\2\u00a7"+
		"\31\3\2\2\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\5\16\b\2\u00aa\33\3\2\2\2"+
		"\u00ab\u00ac\7)\2\2\u00ac\u00ae\7\30\2\2\u00ad\u00af\5\36\20\2\u00ae\u00ad"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\31\2\2"+
		"\u00b1\35\3\2\2\2\u00b2\u00b7\5 \21\2\u00b3\u00b4\7\7\2\2\u00b4\u00b6"+
		"\5 \21\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\37\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\21\1"+
		"\2\u00bb\u00d0\7*\2\2\u00bc\u00d0\7)\2\2\u00bd\u00d0\7\r\2\2\u00be\u00d0"+
		"\7\16\2\2\u00bf\u00c0\7\30\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c2\7\31\2"+
		"\2\u00c2\u00d0\3\2\2\2\u00c3\u00d0\5\20\t\2\u00c4\u00c5\7\24\2\2\u00c5"+
		"\u00d0\5 \21\20\u00c6\u00c7\7\35\2\2\u00c7\u00d0\5 \21\17\u00c8\u00d0"+
		"\5\34\17\2\u00c9\u00d0\5\f\7\2\u00ca\u00cb\7)\2\2\u00cb\u00d0\t\2\2\2"+
		"\u00cc\u00d0\7(\2\2\u00cd\u00d0\7+\2\2\u00ce\u00d0\5(\25\2\u00cf\u00ba"+
		"\3\2\2\2\u00cf\u00bc\3\2\2\2\u00cf\u00bd\3\2\2\2\u00cf\u00be\3\2\2\2\u00cf"+
		"\u00bf\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c6\3\2"+
		"\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00e5\3\2"+
		"\2\2\u00d1\u00d2\f\r\2\2\u00d2\u00d3\t\3\2\2\u00d3\u00e4\5 \21\16\u00d4"+
		"\u00d5\f\f\2\2\u00d5\u00d6\t\4\2\2\u00d6\u00e4\5 \21\r\u00d7\u00d8\f\13"+
		"\2\2\u00d8\u00d9\t\5\2\2\u00d9\u00e4\5 \21\f\u00da\u00db\f\n\2\2\u00db"+
		"\u00dc\t\6\2\2\u00dc\u00e4\5 \21\13\u00dd\u00de\f\t\2\2\u00de\u00df\7"+
		"\33\2\2\u00df\u00e4\5 \21\n\u00e0\u00e1\f\b\2\2\u00e1\u00e2\7\34\2\2\u00e2"+
		"\u00e4\5 \21\t\u00e3\u00d1\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e3\u00d7\3\2"+
		"\2\2\u00e3\u00da\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6!\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ee\7\30\2\2\u00ea\u00eb"+
		"\7+\2\2\u00eb\u00ec\7\7\2\2\u00ec\u00ef\7)\2\2\u00ed\u00ef\7)\2\2\u00ee"+
		"\u00ea\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\31"+
		"\2\2\u00f1\u00f2\7\3\2\2\u00f2#\3\2\2\2\u00f3\u00fa\7\4\2\2\u00f4\u00f6"+
		"\5&\24\2\u00f5\u00f7\7\7\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\7\5\2\2\u00fe%\3\2\2\2\u00ff\u0100\7)\2\2\u0100\u0103\7\f\2\2\u0101"+
		"\u0104\5 \21\2\u0102\u0104\5$\23\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2"+
		"\2\2\u0104\'\3\2\2\2\u0105\u0108\7)\2\2\u0106\u0107\7\32\2\2\u0107\u0109"+
		"\7)\2\2\u0108\u0106\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b)\3\2\2\2\36,.\67=BGIMRcoty\u0080\u008c\u0091\u009b"+
		"\u009f\u00ae\u00b7\u00cf\u00e3\u00e5\u00ee\u00f6\u00fa\u0103\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}