// Generated from d:/Projects/U Projects/lispCompilerPython/src/MyParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, SQ=3, DQ=4, PLUS=5, MINUS=6, MULT=7, DIV=8, PERC=9, 
		COLON=10, EQUALS=11, NOT_EQUALS=12, LESS_THAN=13, LESS_OR_EQUAL_THAN=14, 
		GREATER_THAN=15, GREATER_OR_EQUAL_THAN=16, VAR=17, ATOM=18, SYMBOL=19, 
		STRING=20, COMMENT=21, MULTIPLE_COMMENT=22, WS=23, USE=24, WRITE=25, WRITE_LINE=26, 
		PRINT=27, DEFPARAMETER=28, DEFCONSTANT=29, DEFMACRO=30, DEFTYPE=31, DEFVAR=32, 
		DEFUN=33, SETQ=34, SETF=35, SET=36, DEFCLASS=37, CLASS=38, CASE=39, IF=40, 
		WHEN=41, UNLESS=42, COND=43, LOOP=44, DO=45, AND=46, OR=47, NOT=48, THROW=49, 
		CATCH=50, FORMAT=51, T=52, NIL=53, TYPE=54, TYPE_OF=55, DECLAIM=56, LET=57, 
		LET_STAR=58, LAMBDA=59, FUNCTION=60, DATATYPES=61, RETURN=62, RETURN_FROM=63;
	public static final int
		RULE_prog = 0, RULE_lists = 1, RULE_list = 2, RULE_equation = 3, RULE_conditional_equation = 4, 
		RULE_print_block = 5, RULE_write_block = 6, RULE_write_line_block = 7, 
		RULE_defparameter_block = 8, RULE_defconstant_block = 9, RULE_defmacro_block = 10, 
		RULE_deftype_block = 11, RULE_defvar_block = 12, RULE_define_function = 13, 
		RULE_function_arguments = 14, RULE_setq_block = 15, RULE_defclass_block = 16, 
		RULE_class_block = 17, RULE_case_block = 18, RULE_if_condition = 19, RULE_when_block = 20, 
		RULE_unless_block = 21, RULE_cond_block = 22, RULE_loop_block = 23, RULE_do_block = 24, 
		RULE_and_block = 25, RULE_or_block = 26, RULE_not_block = 27, RULE_throw_block = 28, 
		RULE_catch_block = 29, RULE_format_block = 30, RULE_type_block = 31, RULE_type_of_block = 32, 
		RULE_declaim_block = 33, RULE_let_block = 34, RULE_let_star_block = 35, 
		RULE_lambda_block = 36, RULE_function_block = 37, RULE_return_block = 38, 
		RULE_value = 39, RULE_function_call = 40, RULE_return_from_block = 41, 
		RULE_literal = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "lists", "list", "equation", "conditional_equation", "print_block", 
			"write_block", "write_line_block", "defparameter_block", "defconstant_block", 
			"defmacro_block", "deftype_block", "defvar_block", "define_function", 
			"function_arguments", "setq_block", "defclass_block", "class_block", 
			"case_block", "if_condition", "when_block", "unless_block", "cond_block", 
			"loop_block", "do_block", "and_block", "or_block", "not_block", "throw_block", 
			"catch_block", "format_block", "type_block", "type_of_block", "declaim_block", 
			"let_block", "let_star_block", "lambda_block", "function_block", "return_block", 
			"value", "function_call", "return_from_block", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'''", "'\"'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"':'", "'='", "'/='", "'<'", "'<='", "'>'", "'>='", null, null, null, 
			null, null, null, null, "'use'", "'write'", "'write-line'", "'print'", 
			"'defparameter'", "'defconstant'", "'defmacro'", "'deftype'", "'defvar'", 
			"'defun'", "'setq'", "'setf'", "'set'", "'defclass'", "'class'", "'case'", 
			"'if'", "'when'", "'unless'", "'cond'", "'loop'", "'do'", "'and'", "'or'", 
			"'not'", "'throw'", "'catch'", "'format'", "'t'", "'nil'", "'type'", 
			"'type-of'", "'declaim'", "'let'", "'let*'", "'lambda'", "'function'", 
			null, "'return'", "'return-from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "SQ", "DQ", "PLUS", "MINUS", "MULT", "DIV", 
			"PERC", "COLON", "EQUALS", "NOT_EQUALS", "LESS_THAN", "LESS_OR_EQUAL_THAN", 
			"GREATER_THAN", "GREATER_OR_EQUAL_THAN", "VAR", "ATOM", "SYMBOL", "STRING", 
			"COMMENT", "MULTIPLE_COMMENT", "WS", "USE", "WRITE", "WRITE_LINE", "PRINT", 
			"DEFPARAMETER", "DEFCONSTANT", "DEFMACRO", "DEFTYPE", "DEFVAR", "DEFUN", 
			"SETQ", "SETF", "SET", "DEFCLASS", "CLASS", "CASE", "IF", "WHEN", "UNLESS", 
			"COND", "LOOP", "DO", "AND", "OR", "NOT", "THROW", "CATCH", "FORMAT", 
			"T", "NIL", "TYPE", "TYPE_OF", "DECLAIM", "LET", "LET_STAR", "LAMBDA", 
			"FUNCTION", "DATATYPES", "RETURN", "RETURN_FROM"
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
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public ListsContext lists() {
			return getRuleContext(ListsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(86);
				lists();
				}
			}

			setState(89);
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
	public static class ListsContext extends ParserRuleContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lists; }
	}

	public final ListsContext lists() throws RecognitionException {
		ListsContext _localctx = new ListsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				list();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyParser.RPAREN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<Conditional_equationContext> conditional_equation() {
			return getRuleContexts(Conditional_equationContext.class);
		}
		public Conditional_equationContext conditional_equation(int i) {
			return getRuleContext(Conditional_equationContext.class,i);
		}
		public List<Print_blockContext> print_block() {
			return getRuleContexts(Print_blockContext.class);
		}
		public Print_blockContext print_block(int i) {
			return getRuleContext(Print_blockContext.class,i);
		}
		public List<Write_blockContext> write_block() {
			return getRuleContexts(Write_blockContext.class);
		}
		public Write_blockContext write_block(int i) {
			return getRuleContext(Write_blockContext.class,i);
		}
		public List<Write_line_blockContext> write_line_block() {
			return getRuleContexts(Write_line_blockContext.class);
		}
		public Write_line_blockContext write_line_block(int i) {
			return getRuleContext(Write_line_blockContext.class,i);
		}
		public List<Defparameter_blockContext> defparameter_block() {
			return getRuleContexts(Defparameter_blockContext.class);
		}
		public Defparameter_blockContext defparameter_block(int i) {
			return getRuleContext(Defparameter_blockContext.class,i);
		}
		public List<Defconstant_blockContext> defconstant_block() {
			return getRuleContexts(Defconstant_blockContext.class);
		}
		public Defconstant_blockContext defconstant_block(int i) {
			return getRuleContext(Defconstant_blockContext.class,i);
		}
		public List<Defmacro_blockContext> defmacro_block() {
			return getRuleContexts(Defmacro_blockContext.class);
		}
		public Defmacro_blockContext defmacro_block(int i) {
			return getRuleContext(Defmacro_blockContext.class,i);
		}
		public List<Deftype_blockContext> deftype_block() {
			return getRuleContexts(Deftype_blockContext.class);
		}
		public Deftype_blockContext deftype_block(int i) {
			return getRuleContext(Deftype_blockContext.class,i);
		}
		public List<Defvar_blockContext> defvar_block() {
			return getRuleContexts(Defvar_blockContext.class);
		}
		public Defvar_blockContext defvar_block(int i) {
			return getRuleContext(Defvar_blockContext.class,i);
		}
		public List<Define_functionContext> define_function() {
			return getRuleContexts(Define_functionContext.class);
		}
		public Define_functionContext define_function(int i) {
			return getRuleContext(Define_functionContext.class,i);
		}
		public List<Setq_blockContext> setq_block() {
			return getRuleContexts(Setq_blockContext.class);
		}
		public Setq_blockContext setq_block(int i) {
			return getRuleContext(Setq_blockContext.class,i);
		}
		public List<Defclass_blockContext> defclass_block() {
			return getRuleContexts(Defclass_blockContext.class);
		}
		public Defclass_blockContext defclass_block(int i) {
			return getRuleContext(Defclass_blockContext.class,i);
		}
		public List<Class_blockContext> class_block() {
			return getRuleContexts(Class_blockContext.class);
		}
		public Class_blockContext class_block(int i) {
			return getRuleContext(Class_blockContext.class,i);
		}
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public List<If_conditionContext> if_condition() {
			return getRuleContexts(If_conditionContext.class);
		}
		public If_conditionContext if_condition(int i) {
			return getRuleContext(If_conditionContext.class,i);
		}
		public List<When_blockContext> when_block() {
			return getRuleContexts(When_blockContext.class);
		}
		public When_blockContext when_block(int i) {
			return getRuleContext(When_blockContext.class,i);
		}
		public List<Unless_blockContext> unless_block() {
			return getRuleContexts(Unless_blockContext.class);
		}
		public Unless_blockContext unless_block(int i) {
			return getRuleContext(Unless_blockContext.class,i);
		}
		public List<Cond_blockContext> cond_block() {
			return getRuleContexts(Cond_blockContext.class);
		}
		public Cond_blockContext cond_block(int i) {
			return getRuleContext(Cond_blockContext.class,i);
		}
		public List<Loop_blockContext> loop_block() {
			return getRuleContexts(Loop_blockContext.class);
		}
		public Loop_blockContext loop_block(int i) {
			return getRuleContext(Loop_blockContext.class,i);
		}
		public List<Do_blockContext> do_block() {
			return getRuleContexts(Do_blockContext.class);
		}
		public Do_blockContext do_block(int i) {
			return getRuleContext(Do_blockContext.class,i);
		}
		public List<And_blockContext> and_block() {
			return getRuleContexts(And_blockContext.class);
		}
		public And_blockContext and_block(int i) {
			return getRuleContext(And_blockContext.class,i);
		}
		public List<Or_blockContext> or_block() {
			return getRuleContexts(Or_blockContext.class);
		}
		public Or_blockContext or_block(int i) {
			return getRuleContext(Or_blockContext.class,i);
		}
		public List<Not_blockContext> not_block() {
			return getRuleContexts(Not_blockContext.class);
		}
		public Not_blockContext not_block(int i) {
			return getRuleContext(Not_blockContext.class,i);
		}
		public List<Throw_blockContext> throw_block() {
			return getRuleContexts(Throw_blockContext.class);
		}
		public Throw_blockContext throw_block(int i) {
			return getRuleContext(Throw_blockContext.class,i);
		}
		public List<Catch_blockContext> catch_block() {
			return getRuleContexts(Catch_blockContext.class);
		}
		public Catch_blockContext catch_block(int i) {
			return getRuleContext(Catch_blockContext.class,i);
		}
		public List<Format_blockContext> format_block() {
			return getRuleContexts(Format_blockContext.class);
		}
		public Format_blockContext format_block(int i) {
			return getRuleContext(Format_blockContext.class,i);
		}
		public List<Type_blockContext> type_block() {
			return getRuleContexts(Type_blockContext.class);
		}
		public Type_blockContext type_block(int i) {
			return getRuleContext(Type_blockContext.class,i);
		}
		public List<Type_of_blockContext> type_of_block() {
			return getRuleContexts(Type_of_blockContext.class);
		}
		public Type_of_blockContext type_of_block(int i) {
			return getRuleContext(Type_of_blockContext.class,i);
		}
		public List<Declaim_blockContext> declaim_block() {
			return getRuleContexts(Declaim_blockContext.class);
		}
		public Declaim_blockContext declaim_block(int i) {
			return getRuleContext(Declaim_blockContext.class,i);
		}
		public List<Let_blockContext> let_block() {
			return getRuleContexts(Let_blockContext.class);
		}
		public Let_blockContext let_block(int i) {
			return getRuleContext(Let_blockContext.class,i);
		}
		public List<Let_star_blockContext> let_star_block() {
			return getRuleContexts(Let_star_blockContext.class);
		}
		public Let_star_blockContext let_star_block(int i) {
			return getRuleContext(Let_star_blockContext.class,i);
		}
		public List<Lambda_blockContext> lambda_block() {
			return getRuleContexts(Lambda_blockContext.class);
		}
		public Lambda_blockContext lambda_block(int i) {
			return getRuleContext(Lambda_blockContext.class,i);
		}
		public List<Function_blockContext> function_block() {
			return getRuleContexts(Function_blockContext.class);
		}
		public Function_blockContext function_block(int i) {
			return getRuleContext(Function_blockContext.class,i);
		}
		public List<Return_blockContext> return_block() {
			return getRuleContexts(Return_blockContext.class);
		}
		public Return_blockContext return_block(int i) {
			return getRuleContext(Return_blockContext.class,i);
		}
		public List<Return_from_blockContext> return_from_block() {
			return getRuleContexts(Return_from_blockContext.class);
		}
		public Return_from_blockContext return_from_block(int i) {
			return getRuleContext(Return_from_blockContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(MyParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyParser.STRING, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public List<TerminalNode> ATOM() { return getTokens(MyParser.ATOM); }
		public TerminalNode ATOM(int i) {
			return getToken(MyParser.ATOM, i);
		}
		public List<TerminalNode> VAR() { return getTokens(MyParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(MyParser.VAR, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LPAREN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2292332107220909034L) != 0)) {
				{
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(97);
					list();
					}
					break;
				case 2:
					{
					setState(98);
					equation();
					}
					break;
				case 3:
					{
					setState(99);
					conditional_equation();
					}
					break;
				case 4:
					{
					setState(100);
					print_block();
					}
					break;
				case 5:
					{
					setState(101);
					write_block();
					}
					break;
				case 6:
					{
					setState(102);
					write_line_block();
					}
					break;
				case 7:
					{
					setState(103);
					defparameter_block();
					}
					break;
				case 8:
					{
					setState(104);
					defconstant_block();
					}
					break;
				case 9:
					{
					setState(105);
					defmacro_block();
					}
					break;
				case 10:
					{
					setState(106);
					deftype_block();
					}
					break;
				case 11:
					{
					setState(107);
					defvar_block();
					}
					break;
				case 12:
					{
					setState(108);
					define_function();
					}
					break;
				case 13:
					{
					setState(109);
					setq_block();
					}
					break;
				case 14:
					{
					setState(110);
					defclass_block();
					}
					break;
				case 15:
					{
					setState(111);
					class_block();
					}
					break;
				case 16:
					{
					setState(112);
					case_block();
					}
					break;
				case 17:
					{
					setState(113);
					if_condition();
					}
					break;
				case 18:
					{
					setState(114);
					when_block();
					}
					break;
				case 19:
					{
					setState(115);
					unless_block();
					}
					break;
				case 20:
					{
					setState(116);
					cond_block();
					}
					break;
				case 21:
					{
					setState(117);
					loop_block();
					}
					break;
				case 22:
					{
					setState(118);
					do_block();
					}
					break;
				case 23:
					{
					setState(119);
					and_block();
					}
					break;
				case 24:
					{
					setState(120);
					or_block();
					}
					break;
				case 25:
					{
					setState(121);
					not_block();
					}
					break;
				case 26:
					{
					setState(122);
					throw_block();
					}
					break;
				case 27:
					{
					setState(123);
					catch_block();
					}
					break;
				case 28:
					{
					setState(124);
					format_block();
					}
					break;
				case 29:
					{
					setState(125);
					type_block();
					}
					break;
				case 30:
					{
					setState(126);
					type_of_block();
					}
					break;
				case 31:
					{
					setState(127);
					declaim_block();
					}
					break;
				case 32:
					{
					setState(128);
					let_block();
					}
					break;
				case 33:
					{
					setState(129);
					let_star_block();
					}
					break;
				case 34:
					{
					setState(130);
					lambda_block();
					}
					break;
				case 35:
					{
					setState(131);
					function_block();
					}
					break;
				case 36:
					{
					setState(132);
					return_block();
					}
					break;
				case 37:
					{
					setState(133);
					return_from_block();
					}
					break;
				case 38:
					{
					setState(134);
					literal();
					}
					break;
				case 39:
					{
					setState(135);
					match(STRING);
					}
					break;
				case 40:
					{
					setState(136);
					match(SYMBOL);
					}
					break;
				case 41:
					{
					setState(137);
					match(ATOM);
					}
					break;
				case 42:
					{
					setState(138);
					match(VAR);
					}
					break;
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RPAREN);
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
	public static class EquationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(MyParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MyParser.DIV, 0); }
		public TerminalNode PERC() { return getToken(MyParser.PERC, 0); }
		public List<TerminalNode> ATOM() { return getTokens(MyParser.ATOM); }
		public TerminalNode ATOM(int i) {
			return getToken(MyParser.ATOM, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_equation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOM:
				{
				setState(147);
				match(ATOM);
				}
				break;
			case SYMBOL:
				{
				setState(148);
				match(SYMBOL);
				}
				break;
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case PERC:
				{
				setState(149);
				equation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(156);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ATOM:
						{
						setState(152);
						match(ATOM);
						}
						break;
					case SYMBOL:
						{
						setState(153);
						match(SYMBOL);
						}
						break;
					case PLUS:
					case MINUS:
					case MULT:
					case DIV:
					case PERC:
						{
						setState(154);
						equation();
						}
						break;
					case LPAREN:
						{
						setState(155);
						list();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class Conditional_equationContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(MyParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(MyParser.NOT_EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(MyParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL_THAN() { return getToken(MyParser.GREATER_OR_EQUAL_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(MyParser.LESS_THAN, 0); }
		public TerminalNode LESS_OR_EQUAL_THAN() { return getToken(MyParser.LESS_OR_EQUAL_THAN, 0); }
		public List<TerminalNode> ATOM() { return getTokens(MyParser.ATOM); }
		public TerminalNode ATOM(int i) {
			return getToken(MyParser.ATOM, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public List<Conditional_equationContext> conditional_equation() {
			return getRuleContexts(Conditional_equationContext.class);
		}
		public Conditional_equationContext conditional_equation(int i) {
			return getRuleContext(Conditional_equationContext.class,i);
		}
		public Conditional_equationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_equation; }
	}

	public final Conditional_equationContext conditional_equation() throws RecognitionException {
		Conditional_equationContext _localctx = new Conditional_equationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional_equation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOM:
				{
				setState(161);
				match(ATOM);
				}
				break;
			case SYMBOL:
				{
				setState(162);
				match(SYMBOL);
				}
				break;
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case PERC:
				{
				setState(163);
				equation();
				}
				break;
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_OR_EQUAL_THAN:
			case GREATER_THAN:
			case GREATER_OR_EQUAL_THAN:
				{
				setState(164);
				conditional_equation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ATOM:
						{
						setState(167);
						match(ATOM);
						}
						break;
					case SYMBOL:
						{
						setState(168);
						match(SYMBOL);
						}
						break;
					case PLUS:
					case MINUS:
					case MULT:
					case DIV:
					case PERC:
						{
						setState(169);
						equation();
						}
						break;
					case EQUALS:
					case NOT_EQUALS:
					case LESS_THAN:
					case LESS_OR_EQUAL_THAN:
					case GREATER_THAN:
					case GREATER_OR_EQUAL_THAN:
						{
						setState(170);
						conditional_equation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(175); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class Print_blockContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MyParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public Print_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_block; }
	}

	public final Print_blockContext print_block() throws RecognitionException {
		Print_blockContext _localctx = new Print_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(PRINT);
			setState(178);
			match(STRING);
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
	public static class Write_blockContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(MyParser.WRITE, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode SQ() { return getToken(MyParser.SQ, 0); }
		public Write_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_block; }
	}

	public final Write_blockContext write_block() throws RecognitionException {
		Write_blockContext _localctx = new Write_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_write_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WRITE);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(181);
				match(STRING);
				}
				break;
			case LPAREN:
				{
				setState(182);
				list();
				}
				break;
			case SQ:
				{
				{
				setState(183);
				match(SQ);
				setState(184);
				list();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Write_line_blockContext extends ParserRuleContext {
		public TerminalNode WRITE_LINE() { return getToken(MyParser.WRITE_LINE, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public Write_line_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_line_block; }
	}

	public final Write_line_blockContext write_line_block() throws RecognitionException {
		Write_line_blockContext _localctx = new Write_line_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_write_line_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WRITE_LINE);
			setState(188);
			match(STRING);
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
	public static class Defparameter_blockContext extends ParserRuleContext {
		public TerminalNode DEFPARAMETER() { return getToken(MyParser.DEFPARAMETER, 0); }
		public TerminalNode ATOM() { return getToken(MyParser.ATOM, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public TerminalNode VAR() { return getToken(MyParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Defparameter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defparameter_block; }
	}

	public final Defparameter_blockContext defparameter_block() throws RecognitionException {
		Defparameter_blockContext _localctx = new Defparameter_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defparameter_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(DEFPARAMETER);
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(192);
				match(STRING);
				}
				break;
			case LPAREN:
				{
				setState(193);
				list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Defconstant_blockContext extends ParserRuleContext {
		public TerminalNode DEFCONSTANT() { return getToken(MyParser.DEFCONSTANT, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Defconstant_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defconstant_block; }
	}

	public final Defconstant_blockContext defconstant_block() throws RecognitionException {
		Defconstant_blockContext _localctx = new Defconstant_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defconstant_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(DEFCONSTANT);
			setState(197);
			match(SYMBOL);
			setState(198);
			list();
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
	public static class Defmacro_blockContext extends ParserRuleContext {
		public TerminalNode DEFMACRO() { return getToken(MyParser.DEFMACRO, 0); }
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public TerminalNode LPAREN() { return getToken(MyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyParser.RPAREN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Defmacro_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defmacro_block; }
	}

	public final Defmacro_blockContext defmacro_block() throws RecognitionException {
		Defmacro_blockContext _localctx = new Defmacro_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defmacro_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(DEFMACRO);
			setState(201);
			match(SYMBOL);
			setState(202);
			match(LPAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL) {
				{
				{
				setState(203);
				match(SYMBOL);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(RPAREN);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					list();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class Deftype_blockContext extends ParserRuleContext {
		public TerminalNode DEFTYPE() { return getToken(MyParser.DEFTYPE, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Deftype_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deftype_block; }
	}

	public final Deftype_blockContext deftype_block() throws RecognitionException {
		Deftype_blockContext _localctx = new Deftype_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_deftype_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DEFTYPE);
			setState(217);
			match(SYMBOL);
			setState(218);
			list();
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
	public static class Defvar_blockContext extends ParserRuleContext {
		public TerminalNode DEFVAR() { return getToken(MyParser.DEFVAR, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Defvar_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar_block; }
	}

	public final Defvar_blockContext defvar_block() throws RecognitionException {
		Defvar_blockContext _localctx = new Defvar_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defvar_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(DEFVAR);
			setState(221);
			match(SYMBOL);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(222);
				list();
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
	public static class Define_functionContext extends ParserRuleContext {
		public TerminalNode DEFUN() { return getToken(MyParser.DEFUN, 0); }
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public List<TerminalNode> ATOM() { return getTokens(MyParser.ATOM); }
		public TerminalNode ATOM(int i) {
			return getToken(MyParser.ATOM, i);
		}
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public List<TerminalNode> STRING() { return getTokens(MyParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyParser.STRING, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<Define_functionContext> define_function() {
			return getRuleContexts(Define_functionContext.class);
		}
		public Define_functionContext define_function(int i) {
			return getRuleContext(Define_functionContext.class,i);
		}
		public Define_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_function; }
	}

	public final Define_functionContext define_function() throws RecognitionException {
		Define_functionContext _localctx = new Define_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_define_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(DEFUN);
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==ATOM || _la==SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			function_arguments();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(232);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ATOM:
						{
						setState(228);
						match(ATOM);
						}
						break;
					case STRING:
						{
						setState(229);
						match(STRING);
						}
						break;
					case LPAREN:
						{
						setState(230);
						list();
						}
						break;
					case DEFUN:
						{
						setState(231);
						define_function();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class Function_argumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyParser.RPAREN, 0); }
		public List<TerminalNode> ATOM() { return getTokens(MyParser.ATOM); }
		public TerminalNode ATOM(int i) {
			return getToken(MyParser.ATOM, i);
		}
		public List<TerminalNode> VAR() { return getTokens(MyParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(MyParser.VAR, i);
		}
		public Function_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arguments; }
	}

	public final Function_argumentsContext function_arguments() throws RecognitionException {
		Function_argumentsContext _localctx = new Function_argumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LPAREN);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==ATOM) {
				{
				{
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==ATOM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(RPAREN);
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
	public static class Setq_blockContext extends ParserRuleContext {
		public TerminalNode SETQ() { return getToken(MyParser.SETQ, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Setq_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setq_block; }
	}

	public final Setq_blockContext setq_block() throws RecognitionException {
		Setq_blockContext _localctx = new Setq_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setq_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(SETQ);
			setState(247);
			match(SYMBOL);
			setState(248);
			list();
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
	public static class Defclass_blockContext extends ParserRuleContext {
		public TerminalNode DEFCLASS() { return getToken(MyParser.DEFCLASS, 0); }
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public TerminalNode LPAREN() { return getToken(MyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyParser.RPAREN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Defclass_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defclass_block; }
	}

	public final Defclass_blockContext defclass_block() throws RecognitionException {
		Defclass_blockContext _localctx = new Defclass_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_defclass_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DEFCLASS);
			setState(251);
			match(SYMBOL);
			setState(252);
			match(LPAREN);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYMBOL) {
				{
				{
				setState(253);
				match(SYMBOL);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(254);
					list();
					}
				}

				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(RPAREN);
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
	public static class Class_blockContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MyParser.CLASS, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Class_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_block; }
	}

	public final Class_blockContext class_block() throws RecognitionException {
		Class_blockContext _localctx = new Class_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_class_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(CLASS);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					list();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MyParser.CASE, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(MyParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MyParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MyParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MyParser.RPAREN, i);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CASE);
			setState(272);
			list();
			setState(283); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(273);
					match(LPAREN);
					setState(274);
					list();
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LPAREN) {
						{
						{
						setState(275);
						list();
						}
						}
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(281);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(285); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class If_conditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyParser.IF, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public Conditional_equationContext conditional_equation() {
			return getRuleContext(Conditional_equationContext.class,0);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(IF);
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL:
				{
				setState(288);
				match(SYMBOL);
				}
				break;
			case EQUALS:
			case NOT_EQUALS:
			case LESS_THAN:
			case LESS_OR_EQUAL_THAN:
			case GREATER_THAN:
			case GREATER_OR_EQUAL_THAN:
				{
				setState(289);
				conditional_equation();
				}
				break;
			case LPAREN:
				{
				setState(290);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					list();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
	public static class When_blockContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MyParser.WHEN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public When_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_block; }
	}

	public final When_blockContext when_block() throws RecognitionException {
		When_blockContext _localctx = new When_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_when_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(WHEN);
			setState(300);
			list();
			setState(301);
			list();
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
	public static class Unless_blockContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(MyParser.UNLESS, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Unless_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_block; }
	}

	public final Unless_blockContext unless_block() throws RecognitionException {
		Unless_blockContext _localctx = new Unless_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unless_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(UNLESS);
			setState(304);
			list();
			setState(305);
			list();
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
	public static class Cond_blockContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(MyParser.COND, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(MyParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MyParser.LPAREN, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MyParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MyParser.RPAREN, i);
		}
		public Cond_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_block; }
	}

	public final Cond_blockContext cond_block() throws RecognitionException {
		Cond_blockContext _localctx = new Cond_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cond_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(COND);
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(308);
					match(LPAREN);
					setState(309);
					list();
					setState(310);
					list();
					setState(311);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class Loop_blockContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(MyParser.LOOP, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Loop_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_block; }
	}

	public final Loop_blockContext loop_block() throws RecognitionException {
		Loop_blockContext _localctx = new Loop_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loop_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LOOP);
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					list();
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
	public static class Do_blockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MyParser.DO, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Do_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_block; }
	}

	public final Do_blockContext do_block() throws RecognitionException {
		Do_blockContext _localctx = new Do_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_do_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DO);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					list();
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class And_blockContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MyParser.AND, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public And_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_block; }
	}

	public final And_blockContext and_block() throws RecognitionException {
		And_blockContext _localctx = new And_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_and_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(AND);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					list();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class Or_blockContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(MyParser.OR, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Or_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_block; }
	}

	public final Or_blockContext or_block() throws RecognitionException {
		Or_blockContext _localctx = new Or_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_or_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(OR);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					list();
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class Not_blockContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MyParser.NOT, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Not_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_block; }
	}

	public final Not_blockContext not_block() throws RecognitionException {
		Not_blockContext _localctx = new Not_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_not_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(NOT);
			setState(346);
			list();
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
	public static class Throw_blockContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(MyParser.THROW, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Throw_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_block; }
	}

	public final Throw_blockContext throw_block() throws RecognitionException {
		Throw_blockContext _localctx = new Throw_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_throw_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(THROW);
			setState(349);
			match(SYMBOL);
			setState(350);
			list();
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
	public static class Catch_blockContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(MyParser.CATCH, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Catch_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_block; }
	}

	public final Catch_blockContext catch_block() throws RecognitionException {
		Catch_blockContext _localctx = new Catch_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_catch_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(CATCH);
			setState(353);
			match(SYMBOL);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					list();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class Format_blockContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(MyParser.FORMAT, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public TerminalNode T() { return getToken(MyParser.T, 0); }
		public TerminalNode NIL() { return getToken(MyParser.NIL, 0); }
		public TerminalNode VAR() { return getToken(MyParser.VAR, 0); }
		public Format_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format_block; }
	}

	public final Format_blockContext format_block() throws RecognitionException {
		Format_blockContext _localctx = new Format_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_format_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(FORMAT);
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==T || _la==NIL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(362);
			match(STRING);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(363);
				match(VAR);
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
	public static class Type_blockContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MyParser.TYPE, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Type_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_block; }
	}

	public final Type_blockContext type_block() throws RecognitionException {
		Type_blockContext _localctx = new Type_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(TYPE);
			setState(367);
			list();
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
	public static class Type_of_blockContext extends ParserRuleContext {
		public TerminalNode TYPE_OF() { return getToken(MyParser.TYPE_OF, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Type_of_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_of_block; }
	}

	public final Type_of_blockContext type_of_block() throws RecognitionException {
		Type_of_blockContext _localctx = new Type_of_blockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_type_of_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(TYPE_OF);
			setState(370);
			list();
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
	public static class Declaim_blockContext extends ParserRuleContext {
		public TerminalNode DECLAIM() { return getToken(MyParser.DECLAIM, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(MyParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MyParser.LPAREN, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MyParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MyParser.RPAREN, i);
		}
		public Declaim_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaim_block; }
	}

	public final Declaim_blockContext declaim_block() throws RecognitionException {
		Declaim_blockContext _localctx = new Declaim_blockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declaim_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(DECLAIM);
			setState(377); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(373);
					match(LPAREN);
					setState(374);
					match(SYMBOL);
					setState(375);
					match(SYMBOL);
					setState(376);
					match(RPAREN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(379); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class Let_blockContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(MyParser.LET, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(MyParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MyParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MyParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MyParser.RPAREN, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Let_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_block; }
	}

	public final Let_blockContext let_block() throws RecognitionException {
		Let_blockContext _localctx = new Let_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_let_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LET);
			setState(382);
			match(LPAREN);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(383);
				match(LPAREN);
				setState(384);
				match(SYMBOL);
				setState(385);
				list();
				setState(386);
				match(RPAREN);
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(RPAREN);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394);
					list();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
	public static class Let_star_blockContext extends ParserRuleContext {
		public TerminalNode LET_STAR() { return getToken(MyParser.LET_STAR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(MyParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(MyParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(MyParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(MyParser.RPAREN, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public Let_star_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_star_block; }
	}

	public final Let_star_blockContext let_star_block() throws RecognitionException {
		Let_star_blockContext _localctx = new Let_star_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_let_star_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(LET_STAR);
			setState(401);
			match(LPAREN);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(402);
				match(LPAREN);
				setState(403);
				match(SYMBOL);
				setState(404);
				list();
				setState(405);
				match(RPAREN);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(RPAREN);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					list();
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	public static class Lambda_blockContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(MyParser.LAMBDA, 0); }
		public TerminalNode LPAREN() { return getToken(MyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MyParser.RPAREN, 0); }
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> ATOM() { return getTokens(MyParser.ATOM); }
		public TerminalNode ATOM(int i) {
			return getToken(MyParser.ATOM, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public Lambda_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_block; }
	}

	public final Lambda_blockContext lambda_block() throws RecognitionException {
		Lambda_blockContext _localctx = new Lambda_blockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lambda_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(LAMBDA);
			setState(420);
			match(LPAREN);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATOM || _la==SYMBOL) {
				{
				{
				setState(421);
				_la = _input.LA(1);
				if ( !(_la==ATOM || _la==SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			match(RPAREN);
			setState(429); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(428);
					list();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(431); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MyParser.FUNCTION, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(FUNCTION);
			setState(434);
			list();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(435);
					match(SYMBOL);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
	public static class Return_blockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyParser.LPAREN, 0); }
		public TerminalNode RETURN() { return getToken(MyParser.RETURN, 0); }
		public TerminalNode RPAREN() { return getToken(MyParser.RPAREN, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public TerminalNode VAR() { return getToken(MyParser.VAR, 0); }
		public Return_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_block; }
	}

	public final Return_blockContext return_block() throws RecognitionException {
		Return_blockContext _localctx = new Return_blockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_return_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LPAREN);
			setState(442);
			match(RETURN);
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(444);
			match(RPAREN);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(MyParser.ATOM, 0); }
		public TerminalNode STRING() { return getToken(MyParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !(_la==ATOM || _la==STRING) ) {
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
	public static class Function_callContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MyParser.VAR, 0); }
		public TerminalNode SYMBOL() { return getToken(MyParser.SYMBOL, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_call);
		int _la;
		try {
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(449);
				value();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				list();
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
	public static class Return_from_blockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MyParser.LPAREN, 0); }
		public TerminalNode RETURN_FROM() { return getToken(MyParser.RETURN_FROM, 0); }
		public List<TerminalNode> SYMBOL() { return getTokens(MyParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(MyParser.SYMBOL, i);
		}
		public TerminalNode RPAREN() { return getToken(MyParser.RPAREN, 0); }
		public TerminalNode VAR() { return getToken(MyParser.VAR, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_from_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_from_block; }
	}

	public final Return_from_blockContext return_from_block() throws RecognitionException {
		Return_from_blockContext _localctx = new Return_from_blockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_return_from_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(LPAREN);
			setState(454);
			match(RETURN_FROM);
			setState(455);
			match(SYMBOL);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(456);
				match(SYMBOL);
				}
				break;
			case 2:
				{
				setState(457);
				match(VAR);
				}
				break;
			case 3:
				{
				setState(458);
				function_call();
				}
				break;
			}
			setState(461);
			match(RPAREN);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode SQ() { return getToken(MyParser.SQ, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode ATOM() { return getToken(MyParser.ATOM, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(SQ);
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(464);
					list();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(SQ);
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(468);
					equation();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(SQ);
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(472);
					match(ATOM);
					}
					break;
				}
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

	public static final String _serializedATN =
		"\u0004\u0001?\u01de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0003\u0000X\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001]\b\u0001\u000b\u0001"+
		"\f\u0001^\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u008c\b\u0002\n\u0002\f\u0002\u008f"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0097\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u009d\b\u0003\u000b\u0003\f\u0003\u009e\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a6\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004"+
		"\u0004\u0004\u00ae\b\u0004\u000b\u0004\f\u0004\u00af\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00ba\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c3\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00cd\b\n\n\n\f\n\u00d0\t\n"+
		"\u0001\n\u0001\n\u0005\n\u00d4\b\n\n\n\f\n\u00d7\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00e0\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e9"+
		"\b\r\n\r\f\r\u00ec\t\r\u0001\u000e\u0001\u000e\u0005\u000e\u00f0\b\u000e"+
		"\n\u000e\f\u000e\u00f3\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0100\b\u0010\u0005\u0010\u0102\b\u0010"+
		"\n\u0010\f\u0010\u0105\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u010b\b\u0011\n\u0011\f\u0011\u010e\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0115\b\u0012"+
		"\n\u0012\f\u0012\u0118\t\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u011c"+
		"\b\u0012\u000b\u0012\f\u0012\u011d\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0124\b\u0013\u0001\u0013\u0005\u0013\u0127\b"+
		"\u0013\n\u0013\f\u0013\u012a\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016"+
		"\u013a\b\u0016\u000b\u0016\f\u0016\u013b\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0140\b\u0017\n\u0017\f\u0017\u0143\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0147\b\u0018\n\u0018\f\u0018\u014a\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u014e\b\u0019\n\u0019\f\u0019\u0151\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0155\b\u001a\n\u001a\f\u001a\u0158\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0164\b\u001d\n"+
		"\u001d\f\u001d\u0167\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u016d\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0004!\u017a\b!\u000b"+
		"!\f!\u017b\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u0185\b\"\n\"\f\"\u0188\t\"\u0001\"\u0001\"\u0005\"\u018c\b\"\n\"\f"+
		"\"\u018f\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u0198"+
		"\b#\n#\f#\u019b\t#\u0001#\u0001#\u0005#\u019f\b#\n#\f#\u01a2\t#\u0001"+
		"$\u0001$\u0001$\u0005$\u01a7\b$\n$\f$\u01aa\t$\u0001$\u0001$\u0004$\u01ae"+
		"\b$\u000b$\f$\u01af\u0001%\u0001%\u0001%\u0005%\u01b5\b%\n%\f%\u01b8\t"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0003(\u01c4\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u01cc"+
		"\b)\u0001)\u0001)\u0001*\u0001*\u0003*\u01d2\b*\u0001*\u0001*\u0003*\u01d6"+
		"\b*\u0001*\u0001*\u0003*\u01da\b*\u0003*\u01dc\b*\u0001*\u0000\u0000+"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRT\u0000\b\u0001\u0000\u0005\t\u0001"+
		"\u0000\u000b\u0010\u0001\u0000\u0011\u0013\u0001\u0000\u0012\u0013\u0001"+
		"\u0000\u0011\u0012\u0001\u000045\u0002\u0000\u0011\u0011\u0013\u0013\u0002"+
		"\u0000\u0012\u0012\u0014\u0014\u0215\u0000W\u0001\u0000\u0000\u0000\u0002"+
		"\\\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006\u0092"+
		"\u0001\u0000\u0000\u0000\b\u00a0\u0001\u0000\u0000\u0000\n\u00b1\u0001"+
		"\u0000\u0000\u0000\f\u00b4\u0001\u0000\u0000\u0000\u000e\u00bb\u0001\u0000"+
		"\u0000\u0000\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00c4\u0001\u0000"+
		"\u0000\u0000\u0014\u00c8\u0001\u0000\u0000\u0000\u0016\u00d8\u0001\u0000"+
		"\u0000\u0000\u0018\u00dc\u0001\u0000\u0000\u0000\u001a\u00e1\u0001\u0000"+
		"\u0000\u0000\u001c\u00ed\u0001\u0000\u0000\u0000\u001e\u00f6\u0001\u0000"+
		"\u0000\u0000 \u00fa\u0001\u0000\u0000\u0000\"\u0108\u0001\u0000\u0000"+
		"\u0000$\u010f\u0001\u0000\u0000\u0000&\u011f\u0001\u0000\u0000\u0000("+
		"\u012b\u0001\u0000\u0000\u0000*\u012f\u0001\u0000\u0000\u0000,\u0133\u0001"+
		"\u0000\u0000\u0000.\u013d\u0001\u0000\u0000\u00000\u0144\u0001\u0000\u0000"+
		"\u00002\u014b\u0001\u0000\u0000\u00004\u0152\u0001\u0000\u0000\u00006"+
		"\u0159\u0001\u0000\u0000\u00008\u015c\u0001\u0000\u0000\u0000:\u0160\u0001"+
		"\u0000\u0000\u0000<\u0168\u0001\u0000\u0000\u0000>\u016e\u0001\u0000\u0000"+
		"\u0000@\u0171\u0001\u0000\u0000\u0000B\u0174\u0001\u0000\u0000\u0000D"+
		"\u017d\u0001\u0000\u0000\u0000F\u0190\u0001\u0000\u0000\u0000H\u01a3\u0001"+
		"\u0000\u0000\u0000J\u01b1\u0001\u0000\u0000\u0000L\u01b9\u0001\u0000\u0000"+
		"\u0000N\u01be\u0001\u0000\u0000\u0000P\u01c3\u0001\u0000\u0000\u0000R"+
		"\u01c5\u0001\u0000\u0000\u0000T\u01db\u0001\u0000\u0000\u0000VX\u0003"+
		"\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0005\u0000\u0000\u0001Z\u0001\u0001\u0000"+
		"\u0000\u0000[]\u0003\u0004\u0002\u0000\\[\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\u0003\u0001\u0000\u0000\u0000`\u008d\u0005\u0001\u0000\u0000a\u008c"+
		"\u0003\u0004\u0002\u0000b\u008c\u0003\u0006\u0003\u0000c\u008c\u0003\b"+
		"\u0004\u0000d\u008c\u0003\n\u0005\u0000e\u008c\u0003\f\u0006\u0000f\u008c"+
		"\u0003\u000e\u0007\u0000g\u008c\u0003\u0010\b\u0000h\u008c\u0003\u0012"+
		"\t\u0000i\u008c\u0003\u0014\n\u0000j\u008c\u0003\u0016\u000b\u0000k\u008c"+
		"\u0003\u0018\f\u0000l\u008c\u0003\u001a\r\u0000m\u008c\u0003\u001e\u000f"+
		"\u0000n\u008c\u0003 \u0010\u0000o\u008c\u0003\"\u0011\u0000p\u008c\u0003"+
		"$\u0012\u0000q\u008c\u0003&\u0013\u0000r\u008c\u0003(\u0014\u0000s\u008c"+
		"\u0003*\u0015\u0000t\u008c\u0003,\u0016\u0000u\u008c\u0003.\u0017\u0000"+
		"v\u008c\u00030\u0018\u0000w\u008c\u00032\u0019\u0000x\u008c\u00034\u001a"+
		"\u0000y\u008c\u00036\u001b\u0000z\u008c\u00038\u001c\u0000{\u008c\u0003"+
		":\u001d\u0000|\u008c\u0003<\u001e\u0000}\u008c\u0003>\u001f\u0000~\u008c"+
		"\u0003@ \u0000\u007f\u008c\u0003B!\u0000\u0080\u008c\u0003D\"\u0000\u0081"+
		"\u008c\u0003F#\u0000\u0082\u008c\u0003H$\u0000\u0083\u008c\u0003J%\u0000"+
		"\u0084\u008c\u0003L&\u0000\u0085\u008c\u0003R)\u0000\u0086\u008c\u0003"+
		"T*\u0000\u0087\u008c\u0005\u0014\u0000\u0000\u0088\u008c\u0005\u0013\u0000"+
		"\u0000\u0089\u008c\u0005\u0012\u0000\u0000\u008a\u008c\u0005\u0011\u0000"+
		"\u0000\u008ba\u0001\u0000\u0000\u0000\u008bb\u0001\u0000\u0000\u0000\u008b"+
		"c\u0001\u0000\u0000\u0000\u008bd\u0001\u0000\u0000\u0000\u008be\u0001"+
		"\u0000\u0000\u0000\u008bf\u0001\u0000\u0000\u0000\u008bg\u0001\u0000\u0000"+
		"\u0000\u008bh\u0001\u0000\u0000\u0000\u008bi\u0001\u0000\u0000\u0000\u008b"+
		"j\u0001\u0000\u0000\u0000\u008bk\u0001\u0000\u0000\u0000\u008bl\u0001"+
		"\u0000\u0000\u0000\u008bm\u0001\u0000\u0000\u0000\u008bn\u0001\u0000\u0000"+
		"\u0000\u008bo\u0001\u0000\u0000\u0000\u008bp\u0001\u0000\u0000\u0000\u008b"+
		"q\u0001\u0000\u0000\u0000\u008br\u0001\u0000\u0000\u0000\u008bs\u0001"+
		"\u0000\u0000\u0000\u008bt\u0001\u0000\u0000\u0000\u008bu\u0001\u0000\u0000"+
		"\u0000\u008bv\u0001\u0000\u0000\u0000\u008bw\u0001\u0000\u0000\u0000\u008b"+
		"x\u0001\u0000\u0000\u0000\u008by\u0001\u0000\u0000\u0000\u008bz\u0001"+
		"\u0000\u0000\u0000\u008b{\u0001\u0000\u0000\u0000\u008b|\u0001\u0000\u0000"+
		"\u0000\u008b}\u0001\u0000\u0000\u0000\u008b~\u0001\u0000\u0000\u0000\u008b"+
		"\u007f\u0001\u0000\u0000\u0000\u008b\u0080\u0001\u0000\u0000\u0000\u008b"+
		"\u0081\u0001\u0000\u0000\u0000\u008b\u0082\u0001\u0000\u0000\u0000\u008b"+
		"\u0083\u0001\u0000\u0000\u0000\u008b\u0084\u0001\u0000\u0000\u0000\u008b"+
		"\u0085\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b"+
		"\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091"+
		"\u0005\u0001\u0000\u0000\u0000\u0092\u0096\u0007\u0000\u0000\u0000\u0093"+
		"\u0097\u0005\u0012\u0000\u0000\u0094\u0097\u0005\u0013\u0000\u0000\u0095"+
		"\u0097\u0003\u0006\u0003\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u009c\u0001\u0000\u0000\u0000\u0098\u009d\u0005\u0012\u0000\u0000\u0099"+
		"\u009d\u0005\u0013\u0000\u0000\u009a\u009d\u0003\u0006\u0003\u0000\u009b"+
		"\u009d\u0003\u0004\u0002\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u0007\u0001\u0000\u0000\u0000\u00a0\u00a5\u0007\u0001\u0000\u0000\u00a1"+
		"\u00a6\u0005\u0012\u0000\u0000\u00a2\u00a6\u0005\u0013\u0000\u0000\u00a3"+
		"\u00a6\u0003\u0006\u0003\u0000\u00a4\u00a6\u0003\b\u0004\u0000\u00a5\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00ad"+
		"\u0001\u0000\u0000\u0000\u00a7\u00ac\u0005\u0012\u0000\u0000\u00a8\u00ac"+
		"\u0005\u0013\u0000\u0000\u00a9\u00ac\u0003\u0006\u0003\u0000\u00aa\u00ac"+
		"\u0003\b\u0004\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\t\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u001b\u0000\u0000\u00b2\u00b3\u0005\u0014"+
		"\u0000\u0000\u00b3\u000b\u0001\u0000\u0000\u0000\u00b4\u00b9\u0005\u0019"+
		"\u0000\u0000\u00b5\u00ba\u0005\u0014\u0000\u0000\u00b6\u00ba\u0003\u0004"+
		"\u0002\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000\u00b8\u00ba\u0003\u0004"+
		"\u0002\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\r\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005\u001a\u0000\u0000\u00bc\u00bd\u0005\u0014\u0000"+
		"\u0000\u00bd\u000f\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u001c\u0000"+
		"\u0000\u00bf\u00c2\u0007\u0002\u0000\u0000\u00c0\u00c3\u0005\u0014\u0000"+
		"\u0000\u00c1\u00c3\u0003\u0004\u0002\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u0011\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u001d\u0000\u0000\u00c5\u00c6\u0005\u0013\u0000"+
		"\u0000\u00c6\u00c7\u0003\u0004\u0002\u0000\u00c7\u0013\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005\u001e\u0000\u0000\u00c9\u00ca\u0005\u0013\u0000"+
		"\u0000\u00ca\u00ce\u0005\u0001\u0000\u0000\u00cb\u00cd\u0005\u0013\u0000"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d5\u0005\u0002\u0000\u0000\u00d2\u00d4\u0003\u0004\u0002"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u0015\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u001f\u0000\u0000\u00d9\u00da\u0005\u0013\u0000"+
		"\u0000\u00da\u00db\u0003\u0004\u0002\u0000\u00db\u0017\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005 \u0000\u0000\u00dd\u00df\u0005\u0013\u0000\u0000"+
		"\u00de\u00e0\u0003\u0004\u0002\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u0019\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005!\u0000\u0000\u00e2\u00e3\u0007\u0003\u0000\u0000\u00e3"+
		"\u00ea\u0003\u001c\u000e\u0000\u00e4\u00e9\u0005\u0012\u0000\u0000\u00e5"+
		"\u00e9\u0005\u0014\u0000\u0000\u00e6\u00e9\u0003\u0004\u0002\u0000\u00e7"+
		"\u00e9\u0003\u001a\r\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e8\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u001b"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f1"+
		"\u0005\u0001\u0000\u0000\u00ee\u00f0\u0007\u0004\u0000\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0002\u0000\u0000\u00f5\u001d\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\"\u0000\u0000\u00f7\u00f8\u0005\u0013\u0000\u0000\u00f8\u00f9\u0003"+
		"\u0004\u0002\u0000\u00f9\u001f\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"%\u0000\u0000\u00fb\u00fc\u0005\u0013\u0000\u0000\u00fc\u0103\u0005\u0001"+
		"\u0000\u0000\u00fd\u00ff\u0005\u0013\u0000\u0000\u00fe\u0100\u0003\u0004"+
		"\u0002\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0002"+
		"\u0000\u0000\u0107!\u0001\u0000\u0000\u0000\u0108\u010c\u0005&\u0000\u0000"+
		"\u0109\u010b\u0003\u0004\u0002\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d#\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0005\'\u0000\u0000\u0110\u011b"+
		"\u0003\u0004\u0002\u0000\u0111\u0112\u0005\u0001\u0000\u0000\u0112\u0116"+
		"\u0003\u0004\u0002\u0000\u0113\u0115\u0003\u0004\u0002\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\u0002\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0111"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e%\u0001"+
		"\u0000\u0000\u0000\u011f\u0123\u0005(\u0000\u0000\u0120\u0124\u0005\u0013"+
		"\u0000\u0000\u0121\u0124\u0003\b\u0004\u0000\u0122\u0124\u0003\u0004\u0002"+
		"\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0128\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0003\u0004\u0002\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\'\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012c\u0005)\u0000\u0000\u012c"+
		"\u012d\u0003\u0004\u0002\u0000\u012d\u012e\u0003\u0004\u0002\u0000\u012e"+
		")\u0001\u0000\u0000\u0000\u012f\u0130\u0005*\u0000\u0000\u0130\u0131\u0003"+
		"\u0004\u0002\u0000\u0131\u0132\u0003\u0004\u0002\u0000\u0132+\u0001\u0000"+
		"\u0000\u0000\u0133\u0139\u0005+\u0000\u0000\u0134\u0135\u0005\u0001\u0000"+
		"\u0000\u0135\u0136\u0003\u0004\u0002\u0000\u0136\u0137\u0003\u0004\u0002"+
		"\u0000\u0137\u0138\u0005\u0002\u0000\u0000\u0138\u013a\u0001\u0000\u0000"+
		"\u0000\u0139\u0134\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c-\u0001\u0000\u0000\u0000\u013d\u0141\u0005,\u0000\u0000\u013e"+
		"\u0140\u0003\u0004\u0002\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0001\u0000\u0000\u0000\u0142/\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0148\u0005-\u0000\u0000\u0145\u0147\u0003"+
		"\u0004\u0002\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u014a\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u01491\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u014f\u0005.\u0000\u0000\u014c\u014e\u0003\u0004\u0002"+
		"\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u01503\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000"+
		"\u0152\u0156\u0005/\u0000\u0000\u0153\u0155\u0003\u0004\u0002\u0000\u0154"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"5\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u00050\u0000\u0000\u015a\u015b\u0003\u0004\u0002\u0000\u015b7\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u00051\u0000\u0000\u015d\u015e\u0005\u0013\u0000"+
		"\u0000\u015e\u015f\u0003\u0004\u0002\u0000\u015f9\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u00052\u0000\u0000\u0161\u0165\u0005\u0013\u0000\u0000\u0162"+
		"\u0164\u0003\u0004\u0002\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164"+
		"\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166;\u0001\u0000\u0000\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u0169\u00053\u0000\u0000\u0169\u016a\u0007"+
		"\u0005\u0000\u0000\u016a\u016c\u0005\u0014\u0000\u0000\u016b\u016d\u0005"+
		"\u0011\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d=\u0001\u0000\u0000\u0000\u016e\u016f\u00056\u0000"+
		"\u0000\u016f\u0170\u0003\u0004\u0002\u0000\u0170?\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u00057\u0000\u0000\u0172\u0173\u0003\u0004\u0002\u0000\u0173"+
		"A\u0001\u0000\u0000\u0000\u0174\u0179\u00058\u0000\u0000\u0175\u0176\u0005"+
		"\u0001\u0000\u0000\u0176\u0177\u0005\u0013\u0000\u0000\u0177\u0178\u0005"+
		"\u0013\u0000\u0000\u0178\u017a\u0005\u0002\u0000\u0000\u0179\u0175\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017cC\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u00059\u0000\u0000\u017e\u0186\u0005\u0001\u0000"+
		"\u0000\u017f\u0180\u0005\u0001\u0000\u0000\u0180\u0181\u0005\u0013\u0000"+
		"\u0000\u0181\u0182\u0003\u0004\u0002\u0000\u0182\u0183\u0005\u0002\u0000"+
		"\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u017f\u0001\u0000\u0000"+
		"\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000"+
		"\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018d\u0005\u0002\u0000"+
		"\u0000\u018a\u018c\u0003\u0004\u0002\u0000\u018b\u018a\u0001\u0000\u0000"+
		"\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018eE\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0191\u0005:\u0000\u0000\u0191"+
		"\u0199\u0005\u0001\u0000\u0000\u0192\u0193\u0005\u0001\u0000\u0000\u0193"+
		"\u0194\u0005\u0013\u0000\u0000\u0194\u0195\u0003\u0004\u0002\u0000\u0195"+
		"\u0196\u0005\u0002\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197"+
		"\u0192\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019c\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c"+
		"\u01a0\u0005\u0002\u0000\u0000\u019d\u019f\u0003\u0004\u0002\u0000\u019e"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"G\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0005;\u0000\u0000\u01a4\u01a8\u0005\u0001\u0000\u0000\u01a5\u01a7\u0007"+
		"\u0003\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ad\u0005\u0002\u0000\u0000\u01ac\u01ae\u0003"+
		"\u0004\u0002\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b0I\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005<\u0000"+
		"\u0000\u01b2\u01b6\u0003\u0004\u0002\u0000\u01b3\u01b5\u0005\u0013\u0000"+
		"\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7K\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0005\u0001\u0000\u0000\u01ba\u01bb\u0005>\u0000\u0000\u01bb"+
		"\u01bc\u0007\u0006\u0000\u0000\u01bc\u01bd\u0005\u0002\u0000\u0000\u01bd"+
		"M\u0001\u0000\u0000\u0000\u01be\u01bf\u0007\u0007\u0000\u0000\u01bfO\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0007\u0006\u0000\u0000\u01c1\u01c4\u0003"+
		"N\'\u0000\u01c2\u01c4\u0003\u0004\u0002\u0000\u01c3\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4Q\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0005\u0001\u0000\u0000\u01c6\u01c7\u0005?\u0000\u0000"+
		"\u01c7\u01cb\u0005\u0013\u0000\u0000\u01c8\u01cc\u0005\u0013\u0000\u0000"+
		"\u01c9\u01cc\u0005\u0011\u0000\u0000\u01ca\u01cc\u0003P(\u0000\u01cb\u01c8"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0005\u0002\u0000\u0000\u01ceS\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005"+
		"\u0003\u0000\u0000\u01d0\u01d2\u0003\u0004\u0002\u0000\u01d1\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01dc\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d5\u0005\u0003\u0000\u0000\u01d4\u01d6\u0003"+
		"\u0006\u0003\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d6\u01dc\u0001\u0000\u0000\u0000\u01d7\u01d9\u0005"+
		"\u0003\u0000\u0000\u01d8\u01da\u0005\u0012\u0000\u0000\u01d9\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc\u0001"+
		"\u0000\u0000\u0000\u01db\u01cf\u0001\u0000\u0000\u0000\u01db\u01d3\u0001"+
		"\u0000\u0000\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01dcU\u0001\u0000"+
		"\u0000\u0000.W^\u008b\u008d\u0096\u009c\u009e\u00a5\u00ab\u00af\u00b9"+
		"\u00c2\u00ce\u00d5\u00df\u00e8\u00ea\u00f1\u00ff\u0103\u010c\u0116\u011d"+
		"\u0123\u0128\u013b\u0141\u0148\u014f\u0156\u0165\u016c\u017b\u0186\u018d"+
		"\u0199\u01a0\u01a8\u01af\u01b6\u01c3\u01cb\u01d1\u01d5\u01d9\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}