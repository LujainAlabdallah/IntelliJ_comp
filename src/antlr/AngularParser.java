// Generated from C:/Users/muzaic/Desktop/comp/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SLASH_GREATER_THAN=1, SLASH_LESS_THAN=2, DL=3, DR=4, OPEN_APP=5, CLOSE_APP=6, 
		NGFOR=7, H1=8, IMG=9, BUTTON=10, P=11, SRC=12, ALT=13, STYLE=14, CLICK=15, 
		SHOW_DETAILS=16, INJECTABLE=17, CONSTRUCTOR=18, NUMBER=19, LENGTH=20, 
		COLOR=21, DIV=22, NEW=23, GREATER_THAN=24, LESS_THAN=25, REQUIRED=26, 
		INPUT=27, OUTPUT=28, ANY=29, COMMA=30, SEMICOLON=31, COLON=32, PERIOD=33, 
		QUESTION_MARK=34, HASH_TAG=35, LEFT_PAREN=36, RIGHT_PAREN=37, LEFT_BRACE=38, 
		RIGHT_BRACE=39, LEFT_BRACKET=40, RIGHT_BRACKET=41, CONSTANT=42, VARIABLE=43, 
		IMPORT=44, EXPORT=45, ARRAY_LITarayERAL=46, NG_MODULE=47, COMPONENT=48, 
		DIRECTIVE=49, PIPE=50, SERVICE=51, PROVIDER=52, ROUTER=53, SELECTOR=54, 
		IMPORTS=55, TEMPLATEURL=56, STYLEURL=57, STANDALONE=58, ASSIGN=59, INTEGER=60, 
		FLOAT=61, NULL=62, BOOLEAN=63, PLUS=64, MINUS=65, MULTIPLY=66, DIVIDE=67, 
		MODULO=68, WHITESPACE=69, COMMENT=70, SingleLineComment=71, NEWLINE=72, 
		STRING=73, OTHER=74, FOR_LOOP=75, WHILE_LOOP=76, IF_CONDITION=77, ELSE_CONDITION=78, 
		SWITCH_CASE=79, CASE_CONDITION=80, BREAK_KEYWORD=81, CONTINUE_KEYWORD=82, 
		RETURN_KEYWORD=83, CLASS_KEYWORD=84, EXTENDS_KEYWORD=85, IMPLEMENTS_KEYWORD=86, 
		PUBLIC_ACCESS=87, PRIVATE_ACCESS=88, PROTECTED_ACCESS=89, STATIC_KEYWORD=90, 
		SUPER_KEYWORD=91, THIS_KEYWORD=92, FROM=93, GETTER_KEYWORD=94, SETTER_KEYWORD=95, 
		CONSOLE_LOG=96, PRINT_FUNCTION=97, CUSTOM_PRINT_FUNCTION=98, FUNCTION_KEYWORD=99, 
		ARROW_FUNCTION=100, ASYNC_KEYWORD=101, EQUALS=102, NOT_EQUALS=103, GREATER_THAN_OR_EQUAL=104, 
		LESS_THAN_OR_EQUAL=105, LOGICAL_AND=106, LOGICAL_OR=107, LOGICAL_NOT=108, 
		LOGICAL_NOT_PERIOD=109, PLUS_ASSIGN=110, MINUS_ASSIGN=111, INCREMENT=112, 
		DECREMENT=113, MULTIPLY_ASSIGN=114, DIVIDE_ASSIGN=115, MODULUS_ASSIGN=116, 
		POWER_ASSIGN=117, RIGHT_SHIFT_ARITHMETIC_ASSIGN=118, LEFT_SHIFT_ARITHMETIC_ASSIGN=119, 
		RIGHT_SHIFT_LOGICAL_ASSIGN=120, BIT_AND_ASSIGN=121, BIT_XOR_ASSIGN=122, 
		BIT_OR_ASSIGN=123, NULLCOALESCE=124, IDENTIFIER=125;
	public static final int
		RULE_program = 0, RULE_importStatements = 1, RULE_service = 2, RULE_componentDeclaration = 3, 
		RULE_component_metadata = 4, RULE_html = 5, RULE_style = 6, RULE_all = 7, 
		RULE_vif = 8, RULE_htmlDocument = 9, RULE_element = 10, RULE_divElement = 11, 
		RULE_div = 12, RULE_headerElement = 13, RULE_imageElement = 14, RULE_image = 15, 
		RULE_buttonElement = 16, RULE_button = 17, RULE_paragraphElement = 18, 
		RULE_ngForElement = 19, RULE_componentElement = 20, RULE_compElement = 21, 
		RULE_elementContent = 22, RULE_attributes = 23, RULE_attribute = 24, RULE_classAttribute = 25, 
		RULE_srcAttribute = 26, RULE_altAttribute = 27, RULE_styleAttribute = 28, 
		RULE_clickAttribute = 29, RULE_propertyBinding = 30, RULE_eventBinding = 31, 
		RULE_expression = 32, RULE_interpolation = 33, RULE_stylesheet = 34, RULE_rule = 35, 
		RULE_selector = 36, RULE_declaration = 37, RULE_class = 38, RULE_classmem = 39, 
		RULE_function_body = 40, RULE_classMember = 41, RULE_constructor = 42, 
		RULE_inputProperty = 43, RULE_outputProperty = 44, RULE_method = 45, RULE_statement = 46, 
		RULE_print = 47, RULE_functionCall = 48, RULE_methodCall = 49, RULE_arguments = 50, 
		RULE_assignment = 51, RULE_loopStatement = 52, RULE_returnStatement = 53, 
		RULE_term = 54, RULE_factor = 55, RULE_any_type = 56, RULE_product = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatements", "service", "componentDeclaration", "component_metadata", 
			"html", "style", "all", "vif", "htmlDocument", "element", "divElement", 
			"div", "headerElement", "imageElement", "image", "buttonElement", "button", 
			"paragraphElement", "ngForElement", "componentElement", "compElement", 
			"elementContent", "attributes", "attribute", "classAttribute", "srcAttribute", 
			"altAttribute", "styleAttribute", "clickAttribute", "propertyBinding", 
			"eventBinding", "expression", "interpolation", "stylesheet", "rule", 
			"selector", "declaration", "class", "classmem", "function_body", "classMember", 
			"constructor", "inputProperty", "outputProperty", "method", "statement", 
			"print", "functionCall", "methodCall", "arguments", "assignment", "loopStatement", 
			"returnStatement", "term", "factor", "any_type", "product"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/>'", "'</'", "'{{'", "'}}'", "'app-'", "'</app-'", "'ngFor'", 
			"'h1'", "'img'", "'button'", "'p'", "'src'", "'alt'", "'style'", "'click'", 
			"'show details'", "'@Injectable'", "'constructor'", null, null, null, 
			"'div'", "'new'", "'>'", "'<'", "'required'", "'@Input'", "'@Output'", 
			"'any'", "','", "';'", "':'", "'.'", "'?'", "'#'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'const'", null, "'import'", "'export'", null, "'NgModule'", 
			"'@Component'", "'Directive'", "'Pipe'", "'Service'", "'Provider'", "'Router'", 
			"'selector'", "'imports'", "'templateUrl'", "'styleUrl'", "'standalone'", 
			"'='", null, null, "'null'", null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			null, null, null, null, null, null, "'for'", "'while'", "'if'", "'else'", 
			"'switch'", "'case'", "'break'", "'continue'", "'return'", "'class'", 
			"'extends'", "'implements'", "'public'", "'private'", "'protected'", 
			"'static'", "'super'", "'this'", "'from'", "'get'", "'set'", "'console.log'", 
			"'print'", "'myCustomPrintFunction'", "'function'", "'=>'", "'async'", 
			"'=='", "'!='", "'>='", "'<='", "'&&'", "'|'", "'!'", "'!.'", "'+='", 
			"'-='", "'++'", "'--'", "'*='", "'/='", "'%='", "'**='", "'>>='", "'<<='", 
			"'>>>='", "'&='", "'^='", "'|='", "'??'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SLASH_GREATER_THAN", "SLASH_LESS_THAN", "DL", "DR", "OPEN_APP", 
			"CLOSE_APP", "NGFOR", "H1", "IMG", "BUTTON", "P", "SRC", "ALT", "STYLE", 
			"CLICK", "SHOW_DETAILS", "INJECTABLE", "CONSTRUCTOR", "NUMBER", "LENGTH", 
			"COLOR", "DIV", "NEW", "GREATER_THAN", "LESS_THAN", "REQUIRED", "INPUT", 
			"OUTPUT", "ANY", "COMMA", "SEMICOLON", "COLON", "PERIOD", "QUESTION_MARK", 
			"HASH_TAG", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "CONSTANT", "VARIABLE", "IMPORT", "EXPORT", 
			"ARRAY_LITarayERAL", "NG_MODULE", "COMPONENT", "DIRECTIVE", "PIPE", "SERVICE", 
			"PROVIDER", "ROUTER", "SELECTOR", "IMPORTS", "TEMPLATEURL", "STYLEURL", 
			"STANDALONE", "ASSIGN", "INTEGER", "FLOAT", "NULL", "BOOLEAN", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "WHITESPACE", "COMMENT", "SingleLineComment", 
			"NEWLINE", "STRING", "OTHER", "FOR_LOOP", "WHILE_LOOP", "IF_CONDITION", 
			"ELSE_CONDITION", "SWITCH_CASE", "CASE_CONDITION", "BREAK_KEYWORD", "CONTINUE_KEYWORD", 
			"RETURN_KEYWORD", "CLASS_KEYWORD", "EXTENDS_KEYWORD", "IMPLEMENTS_KEYWORD", 
			"PUBLIC_ACCESS", "PRIVATE_ACCESS", "PROTECTED_ACCESS", "STATIC_KEYWORD", 
			"SUPER_KEYWORD", "THIS_KEYWORD", "FROM", "GETTER_KEYWORD", "SETTER_KEYWORD", 
			"CONSOLE_LOG", "PRINT_FUNCTION", "CUSTOM_PRINT_FUNCTION", "FUNCTION_KEYWORD", 
			"ARROW_FUNCTION", "ASYNC_KEYWORD", "EQUALS", "NOT_EQUALS", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN_OR_EQUAL", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "LOGICAL_NOT_PERIOD", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "INCREMENT", "DECREMENT", "MULTIPLY_ASSIGN", 
			"DIVIDE_ASSIGN", "MODULUS_ASSIGN", "POWER_ASSIGN", "RIGHT_SHIFT_ARITHMETIC_ASSIGN", 
			"LEFT_SHIFT_ARITHMETIC_ASSIGN", "RIGHT_SHIFT_LOGICAL_ASSIGN", "BIT_AND_ASSIGN", 
			"BIT_XOR_ASSIGN", "BIT_OR_ASSIGN", "NULLCOALESCE", "IDENTIFIER"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<AllContext> all() {
			return getRuleContexts(AllContext.class);
		}
		public AllContext all(int i) {
			return getRuleContext(AllContext.class,i);
		}
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576796172610306048L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 4503599636284437L) != 0)) {
					{
					{
					setState(116);
					all();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(EOF);
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
	public static class ImportStatementsContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementsContext importStatements() throws RecognitionException {
		ImportStatementsContext _localctx = new ImportStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IMPORT);
			setState(126);
			match(LEFT_BRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(127);
				match(IDENTIFIER);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(133);
				match(COMMA);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(134);
					match(IDENTIFIER);
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(RIGHT_BRACE);
			setState(146);
			match(FROM);
			setState(147);
			match(STRING);
			setState(148);
			match(SEMICOLON);
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
	public static class ServiceContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitService(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitService(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_service);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(INJECTABLE);
			setState(151);
			match(LEFT_PAREN);
			setState(152);
			match(LEFT_BRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(153);
				match(IDENTIFIER);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(COLON);
			setState(160);
			match(STRING);
			setState(161);
			match(RIGHT_BRACE);
			setState(162);
			match(RIGHT_PAREN);
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public List<Component_metadataContext> component_metadata() {
			return getRuleContexts(Component_metadataContext.class);
		}
		public Component_metadataContext component_metadata(int i) {
			return getRuleContext(Component_metadataContext.class,i);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(COMPONENT);
			setState(165);
			match(LEFT_PAREN);
			setState(166);
			match(LEFT_BRACE);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558446353793941504L) != 0)) {
				{
				{
				setState(167);
				component_metadata();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(RIGHT_BRACE);
			setState(174);
			match(RIGHT_PAREN);
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
	public static class Component_metadataContext extends ParserRuleContext {
		public Component_metadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_metadata; }
	 
		public Component_metadataContext() { }
		public void copyFrom(Component_metadataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SELECTOR1Context extends Component_metadataContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public SELECTOR1Context(Component_metadataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSELECTOR1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSELECTOR1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSELECTOR1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STANDLONEContext extends Component_metadataContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public STANDLONEContext(Component_metadataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTANDLONE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTANDLONE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTANDLONE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STYLEURLContext extends Component_metadataContext {
		public TerminalNode STYLEURL() { return getToken(AngularParser.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public STYLEURLContext(Component_metadataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTYLEURL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTYLEURL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTYLEURL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IMPORTSContext extends Component_metadataContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(AngularParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(AngularParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public IMPORTSContext(Component_metadataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIMPORTS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIMPORTS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIMPORTS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TEMPLATEURLContext extends Component_metadataContext {
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TEMPLATEURLContext(Component_metadataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTEMPLATEURL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTEMPLATEURL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTEMPLATEURL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Component_metadataContext component_metadata() throws RecognitionException {
		Component_metadataContext _localctx = new Component_metadataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_component_metadata);
		int _la;
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SELECTOR1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(SELECTOR);
				setState(177);
				match(COLON);
				setState(178);
				match(STRING);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STANDALONE:
				_localctx = new STANDLONEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(STANDALONE);
				setState(186);
				match(COLON);
				setState(187);
				match(BOOLEAN);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IMPORTS:
				_localctx = new IMPORTSContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(IMPORTS);
				setState(195);
				match(COLON);
				setState(196);
				match(LEFT_BRACKET);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(197);
					match(IDENTIFIER);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(204);
						match(IDENTIFIER);
						}
						}
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(RIGHT_BRACKET);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(216);
					match(COMMA);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TEMPLATEURL:
				_localctx = new TEMPLATEURLContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(TEMPLATEURL);
				setState(223);
				match(COLON);
				setState(224);
				html();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(225);
					match(COMMA);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STYLEURL:
				_localctx = new STYLEURLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(STYLEURL);
				setState(232);
				match(COLON);
				setState(233);
				style();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_html);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(STRING);
				}
				break;
			case EOF:
			case LESS_THAN:
			case COMMA:
			case RIGHT_BRACE:
			case SELECTOR:
			case IMPORTS:
			case TEMPLATEURL:
			case STYLEURL:
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				htmlDocument();
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
	public static class StyleContext extends ParserRuleContext {
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_style);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
			case LEFT_BRACE:
			case RIGHT_BRACE:
			case SELECTOR:
			case IMPORTS:
			case TEMPLATEURL:
			case STYLEURL:
			case STANDALONE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				stylesheet();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(STRING);
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
	public static class AllContext extends ParserRuleContext {
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
	 
		public AllContext() { }
		public void copyFrom(AllContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class COMPONENTDECLARATION1Context extends AllContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public COMPONENTDECLARATION1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCOMPONENTDECLARATION1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCOMPONENTDECLARATION1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCOMPONENTDECLARATION1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RETURNSTATEMENT1Context extends AllContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RETURNSTATEMENT1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRETURNSTATEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRETURNSTATEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRETURNSTATEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SERVICE1Context extends AllContext {
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public SERVICE1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSERVICE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSERVICE1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSERVICE1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnyType1Context extends AllContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public AnyType1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnyType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnyType1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnyType1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FUNCTIONCALL1Context extends AllContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FUNCTIONCALL1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFUNCTIONCALL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFUNCTIONCALL1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFUNCTIONCALL1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PRINT1Context extends AllContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PRINT1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPRINT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPRINT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPRINT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LOOPSTATEMENT1Context extends AllContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LOOPSTATEMENT1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLOOPSTATEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLOOPSTATEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLOOPSTATEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class METHOD1Context extends AllContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public METHOD1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMETHOD1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMETHOD1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMETHOD1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class METHODCALL1Context extends AllContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public METHODCALL1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMETHODCALL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMETHODCALL1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMETHODCALL1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CONSTRUCTOR1Context extends AllContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public CONSTRUCTOR1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCONSTRUCTOR1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCONSTRUCTOR1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCONSTRUCTOR1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VIF1Context extends AllContext {
		public VifContext vif() {
			return getRuleContext(VifContext.class,0);
		}
		public VIF1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVIF1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVIF1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVIF1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ASSIGMENT1Context extends AllContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ASSIGMENT1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterASSIGMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitASSIGMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitASSIGMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IMPORTSTATEMENT1Context extends AllContext {
		public ImportStatementsContext importStatements() {
			return getRuleContext(ImportStatementsContext.class,0);
		}
		public IMPORTSTATEMENT1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIMPORTSTATEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIMPORTSTATEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIMPORTSTATEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CLASS1Context extends AllContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public CLASS1Context(AllContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCLASS1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCLASS1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCLASS1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_all);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new SERVICE1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				service();
				}
				break;
			case 2:
				_localctx = new CLASS1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				class_();
				}
				break;
			case 3:
				_localctx = new COMPONENTDECLARATION1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				componentDeclaration();
				}
				break;
			case 4:
				_localctx = new IMPORTSTATEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				importStatements();
				}
				break;
			case 5:
				_localctx = new ASSIGMENT1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				assignment();
				}
				break;
			case 6:
				_localctx = new FUNCTIONCALL1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				functionCall();
				}
				break;
			case 7:
				_localctx = new METHODCALL1Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				methodCall();
				}
				break;
			case 8:
				_localctx = new LOOPSTATEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(257);
				loopStatement();
				}
				break;
			case 9:
				_localctx = new RETURNSTATEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				returnStatement();
				}
				break;
			case 10:
				_localctx = new PRINT1Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(259);
				print();
				}
				break;
			case 11:
				_localctx = new CONSTRUCTOR1Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(260);
				constructor();
				}
				break;
			case 12:
				_localctx = new METHOD1Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(261);
				method();
				}
				break;
			case 13:
				_localctx = new AnyType1Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(262);
				any_type();
				}
				break;
			case 14:
				_localctx = new VIF1Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(263);
				vif();
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
	public static class VifContext extends ParserRuleContext {
		public TerminalNode IF_CONDITION() { return getToken(AngularParser.IF_CONDITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> LEFT_BRACE() { return getTokens(AngularParser.LEFT_BRACE); }
		public TerminalNode LEFT_BRACE(int i) {
			return getToken(AngularParser.LEFT_BRACE, i);
		}
		public List<TerminalNode> RIGHT_BRACE() { return getTokens(AngularParser.RIGHT_BRACE); }
		public TerminalNode RIGHT_BRACE(int i) {
			return getToken(AngularParser.RIGHT_BRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_CONDITION() { return getToken(AngularParser.ELSE_CONDITION, 0); }
		public VifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VifContext vif() throws RecognitionException {
		VifContext _localctx = new VifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF_CONDITION);
			setState(267);
			match(LEFT_PAREN);
			setState(268);
			expression();
			setState(269);
			match(RIGHT_PAREN);
			setState(270);
			match(LEFT_BRACE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576461921075068928L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 4503599636284437L) != 0)) {
				{
				{
				setState(271);
				statement();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(RIGHT_BRACE);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_CONDITION) {
				{
				setState(278);
				match(ELSE_CONDITION);
				setState(279);
				match(LEFT_BRACE);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576461921075068928L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 4503599636284437L) != 0)) {
					{
					{
					setState(280);
					statement();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(RIGHT_BRACE);
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
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlDocument);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESS_THAN:
			case COMMA:
			case RIGHT_BRACE:
			case SELECTOR:
			case IMPORTS:
			case TEMPLATEURL:
			case STYLEURL:
			case STANDALONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LESS_THAN) {
					{
					{
					setState(289);
					element();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(EOF);
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
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NGFORELEMENT1Context extends ElementContext {
		public NgForElementContext ngForElement() {
			return getRuleContext(NgForElementContext.class,0);
		}
		public NGFORELEMENT1Context(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNGFORELEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNGFORELEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNGFORELEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DIVELEMENT1Context extends ElementContext {
		public DivElementContext divElement() {
			return getRuleContext(DivElementContext.class,0);
		}
		public DIVELEMENT1Context(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDIVELEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDIVELEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDIVELEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IMAGEELEMENT1Context extends ElementContext {
		public ImageElementContext imageElement() {
			return getRuleContext(ImageElementContext.class,0);
		}
		public IMAGEELEMENT1Context(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIMAGEELEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIMAGEELEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIMAGEELEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class COMPONENTELEMENT1Context extends ElementContext {
		public ComponentElementContext componentElement() {
			return getRuleContext(ComponentElementContext.class,0);
		}
		public COMPONENTELEMENT1Context(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCOMPONENTELEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCOMPONENTELEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCOMPONENTELEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BUTTONELEMENT1Context extends ElementContext {
		public ButtonElementContext buttonElement() {
			return getRuleContext(ButtonElementContext.class,0);
		}
		public BUTTONELEMENT1Context(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBUTTONELEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBUTTONELEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBUTTONELEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HEADERELEMENT1Context extends ElementContext {
		public HeaderElementContext headerElement() {
			return getRuleContext(HeaderElementContext.class,0);
		}
		public HEADERELEMENT1Context(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHEADERELEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHEADERELEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHEADERELEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PARAGRAPHELEMENT1Context extends ElementContext {
		public ParagraphElementContext paragraphElement() {
			return getRuleContext(ParagraphElementContext.class,0);
		}
		public PARAGRAPHELEMENT1Context(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPARAGRAPHELEMENT1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPARAGRAPHELEMENT1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPARAGRAPHELEMENT1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_element);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new DIVELEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				divElement();
				}
				break;
			case 2:
				_localctx = new HEADERELEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				headerElement();
				}
				break;
			case 3:
				_localctx = new COMPONENTELEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				componentElement();
				}
				break;
			case 4:
				_localctx = new IMAGEELEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				imageElement();
				}
				break;
			case 5:
				_localctx = new BUTTONELEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				buttonElement();
				}
				break;
			case 6:
				_localctx = new PARAGRAPHELEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				paragraphElement();
				}
				break;
			case 7:
				_localctx = new NGFORELEMENT1Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(304);
				ngForElement();
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
	public static class DivElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> DIV() { return getTokens(AngularParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(AngularParser.DIV, i);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public TerminalNode SLASH_LESS_THAN() { return getToken(AngularParser.SLASH_LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DivElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivElementContext divElement() throws RecognitionException {
		DivElementContext _localctx = new DivElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_divElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(LESS_THAN);
			setState(308);
			match(DIV);
			setState(309);
			div();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LESS_THAN) {
				{
				{
				setState(310);
				element();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(SLASH_LESS_THAN);
			setState(317);
			match(DIV);
			setState(318);
			match(GREATER_THAN);
			setState(319);
			match(COMMA);
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
	public static class DivContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public List<ElementContentContext> elementContent() {
			return getRuleContexts(ElementContentContext.class);
		}
		public ElementContentContext elementContent(int i) {
			return getRuleContext(ElementContentContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_div);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				attributes();
				{
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DL || _la==STRING || _la==IDENTIFIER) {
					{
					{
					setState(322);
					elementContent();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(GREATER_THAN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(GREATER_THAN);
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
	public static class HeaderElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> H1() { return getTokens(AngularParser.H1); }
		public TerminalNode H1(int i) {
			return getToken(AngularParser.H1, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public TerminalNode SLASH_LESS_THAN() { return getToken(AngularParser.SLASH_LESS_THAN, 0); }
		public HeaderElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHeaderElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHeaderElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHeaderElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderElementContext headerElement() throws RecognitionException {
		HeaderElementContext _localctx = new HeaderElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_headerElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LESS_THAN);
			setState(334);
			match(H1);
			setState(335);
			match(GREATER_THAN);
			setState(336);
			interpolation();
			setState(337);
			match(SLASH_LESS_THAN);
			setState(338);
			match(H1);
			setState(339);
			match(GREATER_THAN);
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
	public static class ImageElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode IMG() { return getToken(AngularParser.IMG, 0); }
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ImageElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImageElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImageElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImageElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageElementContext imageElement() throws RecognitionException {
		ImageElementContext _localctx = new ImageElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imageElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(LESS_THAN);
			setState(342);
			match(IMG);
			setState(343);
			image();
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
	public static class ImageContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode SLASH_GREATER_THAN() { return getToken(AngularParser.SLASH_GREATER_THAN, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_image);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				attributes();
				setState(346);
				match(SLASH_GREATER_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(SLASH_GREATER_THAN);
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
	public static class ButtonElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> BUTTON() { return getTokens(AngularParser.BUTTON); }
		public TerminalNode BUTTON(int i) {
			return getToken(AngularParser.BUTTON, i);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SLASH_GREATER_THAN() { return getToken(AngularParser.SLASH_GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ButtonElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterButtonElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitButtonElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitButtonElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonElementContext buttonElement() throws RecognitionException {
		ButtonElementContext _localctx = new ButtonElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_buttonElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LESS_THAN);
			setState(352);
			match(BUTTON);
			setState(353);
			button();
			setState(354);
			match(STRING);
			setState(355);
			match(SLASH_GREATER_THAN);
			setState(356);
			match(BUTTON);
			setState(357);
			match(GREATER_THAN);
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
	public static class ButtonContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_button);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				attributes();
				setState(360);
				match(GREATER_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(GREATER_THAN);
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
	public static class ParagraphElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> P() { return getTokens(AngularParser.P); }
		public TerminalNode P(int i) {
			return getToken(AngularParser.P, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public TerminalNode SLASH_LESS_THAN() { return getToken(AngularParser.SLASH_LESS_THAN, 0); }
		public ParagraphElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraphElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParagraphElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParagraphElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParagraphElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphElementContext paragraphElement() throws RecognitionException {
		ParagraphElementContext _localctx = new ParagraphElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_paragraphElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(LESS_THAN);
			setState(366);
			match(P);
			setState(367);
			match(GREATER_THAN);
			setState(368);
			interpolation();
			setState(369);
			match(SLASH_LESS_THAN);
			setState(370);
			match(P);
			setState(371);
			match(GREATER_THAN);
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
	public static class NgForElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public List<TerminalNode> DIV() { return getTokens(AngularParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(AngularParser.DIV, i);
		}
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public ElementContentContext elementContent() {
			return getRuleContext(ElementContentContext.class,0);
		}
		public TerminalNode SLASH_LESS_THAN() { return getToken(AngularParser.SLASH_LESS_THAN, 0); }
		public NgForElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngForElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgForElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgForElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgForElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForElementContext ngForElement() throws RecognitionException {
		NgForElementContext _localctx = new NgForElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ngForElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(LESS_THAN);
			setState(374);
			match(DIV);
			setState(375);
			match(MULTIPLY);
			setState(376);
			match(NGFOR);
			setState(377);
			match(ASSIGN);
			setState(378);
			match(STRING);
			setState(379);
			match(GREATER_THAN);
			setState(380);
			elementContent();
			setState(381);
			match(SLASH_LESS_THAN);
			setState(382);
			match(DIV);
			setState(383);
			match(GREATER_THAN);
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
	public static class ComponentElementContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode OPEN_APP() { return getToken(AngularParser.OPEN_APP, 0); }
		public CompElementContext compElement() {
			return getRuleContext(CompElementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DIV() { return getTokens(AngularParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(AngularParser.DIV, i);
		}
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public ElementContentContext elementContent() {
			return getRuleContext(ElementContentContext.class,0);
		}
		public TerminalNode SLASH_LESS_THAN() { return getToken(AngularParser.SLASH_LESS_THAN, 0); }
		public ComponentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentElementContext componentElement() throws RecognitionException {
		ComponentElementContext _localctx = new ComponentElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_componentElement);
		int _la;
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(LESS_THAN);
				setState(386);
				match(OPEN_APP);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(387);
					match(IDENTIFIER);
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				compElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(LESS_THAN);
				setState(395);
				match(DIV);
				setState(396);
				match(MULTIPLY);
				setState(397);
				match(NGFOR);
				setState(398);
				match(ASSIGN);
				setState(399);
				match(STRING);
				setState(400);
				match(GREATER_THAN);
				setState(401);
				elementContent();
				setState(402);
				match(SLASH_LESS_THAN);
				setState(403);
				match(DIV);
				setState(404);
				match(GREATER_THAN);
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
	public static class CompElementContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(AngularParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(AngularParser.GREATER_THAN, i);
		}
		public TerminalNode CLOSE_APP() { return getToken(AngularParser.CLOSE_APP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public CompElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompElementContext compElement() throws RecognitionException {
		CompElementContext _localctx = new CompElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compElement);
		int _la;
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				attributes();
				setState(409);
				match(GREATER_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(GREATER_THAN);
				setState(412);
				match(CLOSE_APP);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(413);
					match(IDENTIFIER);
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(GREATER_THAN);
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
	public static class ElementContentContext extends ParserRuleContext {
		public ElementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementContent; }
	 
		public ElementContentContext() { }
		public void copyFrom(ElementContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDENTIFIER1Context extends ElementContentContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IDENTIFIER1Context(ElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIDENTIFIER1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIDENTIFIER1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIDENTIFIER1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INTERPOLATION1Context extends ElementContentContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public INTERPOLATION1Context(ElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterINTERPOLATION1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitINTERPOLATION1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitINTERPOLATION1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STRINGContext extends ElementContentContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public STRINGContext(ElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContentContext elementContent() throws RecognitionException {
		ElementContentContext _localctx = new ElementContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elementContent);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IDENTIFIER1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				_localctx = new STRINGContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(STRING);
				}
				break;
			case DL:
				_localctx = new INTERPOLATION1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				interpolation();
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
	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1168231133184L) != 0) || _la==CLASS_KEYWORD) {
				{
				{
				setState(427);
				attribute();
				}
				}
				setState(432);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EVENTBINDING1Context extends AttributeContext {
		public EventBindingContext eventBinding() {
			return getRuleContext(EventBindingContext.class,0);
		}
		public EVENTBINDING1Context(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEVENTBINDING1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEVENTBINDING1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEVENTBINDING1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CLASSATTRIBUTE1Context extends AttributeContext {
		public ClassAttributeContext classAttribute() {
			return getRuleContext(ClassAttributeContext.class,0);
		}
		public CLASSATTRIBUTE1Context(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCLASSATTRIBUTE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCLASSATTRIBUTE1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCLASSATTRIBUTE1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SCRATTRIBUTE1Context extends AttributeContext {
		public SrcAttributeContext srcAttribute() {
			return getRuleContext(SrcAttributeContext.class,0);
		}
		public SCRATTRIBUTE1Context(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSCRATTRIBUTE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSCRATTRIBUTE1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSCRATTRIBUTE1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PROPERTYBINDING1Context extends AttributeContext {
		public PropertyBindingContext propertyBinding() {
			return getRuleContext(PropertyBindingContext.class,0);
		}
		public PROPERTYBINDING1Context(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPROPERTYBINDING1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPROPERTYBINDING1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPROPERTYBINDING1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STYLEATTRIBUTE1Context extends AttributeContext {
		public StyleAttributeContext styleAttribute() {
			return getRuleContext(StyleAttributeContext.class,0);
		}
		public STYLEATTRIBUTE1Context(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSTYLEATTRIBUTE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSTYLEATTRIBUTE1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSTYLEATTRIBUTE1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CLICKATTRIBUTE1Context extends AttributeContext {
		public ClickAttributeContext clickAttribute() {
			return getRuleContext(ClickAttributeContext.class,0);
		}
		public CLICKATTRIBUTE1Context(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCLICKATTRIBUTE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCLICKATTRIBUTE1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCLICKATTRIBUTE1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ALTATTRIBUTE1Context extends AttributeContext {
		public AltAttributeContext altAttribute() {
			return getRuleContext(AltAttributeContext.class,0);
		}
		public ALTATTRIBUTE1Context(AttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterALTATTRIBUTE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitALTATTRIBUTE1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitALTATTRIBUTE1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_attribute);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new CLASSATTRIBUTE1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				classAttribute();
				}
				break;
			case 2:
				_localctx = new SCRATTRIBUTE1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				srcAttribute();
				}
				break;
			case 3:
				_localctx = new ALTATTRIBUTE1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				altAttribute();
				}
				break;
			case 4:
				_localctx = new STYLEATTRIBUTE1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				styleAttribute();
				}
				break;
			case 5:
				_localctx = new CLICKATTRIBUTE1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				clickAttribute();
				}
				break;
			case 6:
				_localctx = new PROPERTYBINDING1Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				propertyBinding();
				}
				break;
			case 7:
				_localctx = new EVENTBINDING1Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(439);
				eventBinding();
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
	public static class ClassAttributeContext extends ParserRuleContext {
		public TerminalNode CLASS_KEYWORD() { return getToken(AngularParser.CLASS_KEYWORD, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ClassAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAttributeContext classAttribute() throws RecognitionException {
		ClassAttributeContext _localctx = new ClassAttributeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(CLASS_KEYWORD);
			setState(443);
			match(ASSIGN);
			setState(444);
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
	public static class SrcAttributeContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(AngularParser.SRC, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SrcAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srcAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSrcAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSrcAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSrcAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcAttributeContext srcAttribute() throws RecognitionException {
		SrcAttributeContext _localctx = new SrcAttributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_srcAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(SRC);
			setState(447);
			match(ASSIGN);
			setState(448);
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
	public static class AltAttributeContext extends ParserRuleContext {
		public TerminalNode ALT() { return getToken(AngularParser.ALT, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public AltAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAltAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAltAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAltAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltAttributeContext altAttribute() throws RecognitionException {
		AltAttributeContext _localctx = new AltAttributeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_altAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(ALT);
			setState(451);
			match(ASSIGN);
			setState(452);
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
	public static class StyleAttributeContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(AngularParser.STYLE, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public StyleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttributeContext styleAttribute() throws RecognitionException {
		StyleAttributeContext _localctx = new StyleAttributeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_styleAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(STYLE);
			setState(455);
			match(ASSIGN);
			setState(456);
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
	public static class ClickAttributeContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode CLICK() { return getToken(AngularParser.CLICK, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public ClickAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clickAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClickAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClickAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClickAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClickAttributeContext clickAttribute() throws RecognitionException {
		ClickAttributeContext _localctx = new ClickAttributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_clickAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LEFT_PAREN);
			setState(459);
			match(CLICK);
			setState(460);
			match(RIGHT_PAREN);
			setState(461);
			match(ASSIGN);
			setState(462);
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
	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(AngularParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(AngularParser.RIGHT_BRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_propertyBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(LEFT_BRACKET);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(465);
				match(IDENTIFIER);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(RIGHT_BRACKET);
			setState(472);
			match(ASSIGN);
			setState(473);
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
	public static class EventBindingContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public EventBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventBindingContext eventBinding() throws RecognitionException {
		EventBindingContext _localctx = new EventBindingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_eventBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(LEFT_PAREN);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(476);
				match(IDENTIFIER);
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
			match(RIGHT_PAREN);
			setState(483);
			match(ASSIGN);
			setState(484);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode NULLCOALESCE() { return getToken(AngularParser.NULLCOALESCE, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode LOGICAL_NOT_PERIOD() { return getToken(AngularParser.LOGICAL_NOT_PERIOD, 0); }
		public List<TerminalNode> PERIOD() { return getTokens(AngularParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(AngularParser.PERIOD, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LOGICAL_NOT() { return getTokens(AngularParser.LOGICAL_NOT); }
		public TerminalNode LOGICAL_NOT(int i) {
			return getToken(AngularParser.LOGICAL_NOT, i);
		}
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						match(IDENTIFIER);
						}
						} 
					}
					setState(492);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOGICAL_NOT_PERIOD) {
						{
						setState(493);
						match(LOGICAL_NOT_PERIOD);
						}
					}

					setState(499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(496);
							match(IDENTIFIER);
							}
							} 
						}
						setState(501);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					}
					}
					break;
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULLCOALESCE) {
					{
					setState(504);
					match(NULLCOALESCE);
					setState(505);
					match(STRING);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(508);
						match(IDENTIFIER);
						}
						} 
					}
					setState(513);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PERIOD || _la==LOGICAL_NOT) {
					{
					{
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOGICAL_NOT) {
						{
						setState(514);
						match(LOGICAL_NOT);
						}
					}

					setState(517);
					match(PERIOD);
					setState(521);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(518);
							match(IDENTIFIER);
							}
							} 
						}
						setState(523);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					}
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULLCOALESCE) {
					{
					setState(529);
					match(NULLCOALESCE);
					setState(530);
					expression();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(536);
				term();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(537);
				term();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(538);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(539);
					term();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode DL() { return getToken(AngularParser.DL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DR() { return getToken(AngularParser.DR, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(DL);
			setState(548);
			expression();
			setState(549);
			match(DR);
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
	public static class StylesheetContext extends ParserRuleContext {
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_stylesheet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(551);
					rule_();
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
	public static class RuleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			selector();
			setState(558);
			match(LEFT_BRACE);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON || _la==MINUS || _la==IDENTIFIER) {
				{
				{
				setState(559);
				declaration();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			match(RIGHT_BRACE);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(567);
				match(IDENTIFIER);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(573);
				match(COMMA);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(574);
					match(IDENTIFIER);
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(584);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public List<Any_typeContext> any_type() {
			return getRuleContexts(Any_typeContext.class);
		}
		public Any_typeContext any_type(int i) {
			return getRuleContext(Any_typeContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585);
					match(IDENTIFIER);
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(591);
				match(MINUS);
				}
			}

			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(594);
				match(IDENTIFIER);
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			match(COLON);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1100052168704L) != 0) || _la==STRING || _la==IDENTIFIER) {
				{
				{
				setState(601);
				any_type();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(SEMICOLON);
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode CLASS_KEYWORD() { return getToken(AngularParser.CLASS_KEYWORD, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(EXPORT);
			setState(610);
			match(CLASS_KEYWORD);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(611);
				match(IDENTIFIER);
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			match(LEFT_BRACE);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460821425815552L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 1125899906842629L) != 0)) {
				{
				{
				setState(618);
				classMember();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			match(RIGHT_BRACE);
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
	public static class ClassmemContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(AngularParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(AngularParser.VARIABLE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(AngularParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(AngularParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(AngularParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(AngularParser.RIGHT_PAREN, i);
		}
		public List<TerminalNode> LEFT_BRACE() { return getTokens(AngularParser.LEFT_BRACE); }
		public TerminalNode LEFT_BRACE(int i) {
			return getToken(AngularParser.LEFT_BRACE, i);
		}
		public List<Function_bodyContext> function_body() {
			return getRuleContexts(Function_bodyContext.class);
		}
		public Function_bodyContext function_body(int i) {
			return getRuleContext(Function_bodyContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACE() { return getTokens(AngularParser.RIGHT_BRACE); }
		public TerminalNode RIGHT_BRACE(int i) {
			return getToken(AngularParser.RIGHT_BRACE, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(AngularParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(AngularParser.ASSIGN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<Any_typeContext> any_type() {
			return getRuleContexts(Any_typeContext.class);
		}
		public Any_typeContext any_type(int i) {
			return getRuleContext(Any_typeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> FUNCTION_KEYWORD() { return getTokens(AngularParser.FUNCTION_KEYWORD); }
		public TerminalNode FUNCTION_KEYWORD(int i) {
			return getToken(AngularParser.FUNCTION_KEYWORD, i);
		}
		public ClassmemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classmem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassmem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassmem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassmem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassmemContext classmem() throws RecognitionException {
		ClassmemContext _localctx = new ClassmemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classmem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(626);
				match(VARIABLE);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(627);
					match(IDENTIFIER);
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(633);
				_la = _input.LA(1);
				if ( !(_la==COLON || _la==ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(634);
				any_type();
				}
				setState(635);
				match(SEMICOLON);
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_PAREN || _la==FUNCTION_KEYWORD || _la==IDENTIFIER) {
				{
				{
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION_KEYWORD) {
					{
					{
					setState(642);
					match(FUNCTION_KEYWORD);
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(648);
					match(IDENTIFIER);
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(654);
				match(LEFT_PAREN);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON || _la==VARIABLE || _la==IDENTIFIER) {
					{
					{
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VARIABLE) {
						{
						{
						setState(655);
						match(VARIABLE);
						}
						}
						setState(660);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(661);
						match(IDENTIFIER);
						}
						}
						setState(666);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(667);
					match(COLON);
					setState(668);
					any_type();
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				match(RIGHT_PAREN);
				setState(675);
				match(LEFT_BRACE);
				setState(676);
				function_body();
				setState(677);
				match(RIGHT_BRACE);
				}
				}
				setState(683);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576461921075068928L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 4503599636284437L) != 0)) {
				{
				setState(687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(684);
					methodCall();
					}
					break;
				case 2:
					{
					setState(685);
					assignment();
					}
					break;
				case 3:
					{
					setState(686);
					statement();
					}
					break;
				}
				}
				setState(691);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ASSIContext extends ClassMemberContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ASSIContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterASSI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitASSI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitASSI(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VIF2Context extends ClassMemberContext {
		public VifContext vif() {
			return getRuleContext(VifContext.class,0);
		}
		public VIF2Context(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVIF2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVIF2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVIF2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OUTPUTPROPRTY1Context extends ClassMemberContext {
		public OutputPropertyContext outputProperty() {
			return getRuleContext(OutputPropertyContext.class,0);
		}
		public OUTPUTPROPRTY1Context(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOUTPUTPROPRTY1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOUTPUTPROPRTY1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOUTPUTPROPRTY1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INPUTPROPERTY1Context extends ClassMemberContext {
		public InputPropertyContext inputProperty() {
			return getRuleContext(InputPropertyContext.class,0);
		}
		public INPUTPROPERTY1Context(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterINPUTPROPERTY1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitINPUTPROPERTY1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitINPUTPROPERTY1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class METHOD2Context extends ClassMemberContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public METHOD2Context(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMETHOD2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMETHOD2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMETHOD2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LOOPSTATEMENT2Context extends ClassMemberContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LOOPSTATEMENT2Context(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLOOPSTATEMENT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLOOPSTATEMENT2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLOOPSTATEMENT2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CONSTRUCTOR2Context extends ClassMemberContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public CONSTRUCTOR2Context(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCONSTRUCTOR2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCONSTRUCTOR2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCONSTRUCTOR2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classMember);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new INPUTPROPERTY1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				inputProperty();
				}
				break;
			case 2:
				_localctx = new OUTPUTPROPRTY1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				outputProperty();
				}
				break;
			case 3:
				_localctx = new METHOD2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				method();
				}
				break;
			case 4:
				_localctx = new LOOPSTATEMENT2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				loopStatement();
				}
				break;
			case 5:
				_localctx = new VIF2Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(696);
				vif();
				}
				break;
			case 6:
				_localctx = new CONSTRUCTOR2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(697);
				constructor();
				}
				break;
			case 7:
				_localctx = new ASSIContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(698);
				assignment();
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constructor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(CONSTRUCTOR);
			setState(702);
			match(LEFT_PAREN);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(703);
					match(IDENTIFIER);
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(709);
				match(COLON);
				}
				break;
			}
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712);
					match(IDENTIFIER);
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==COLON || _la==IDENTIFIER) {
				{
				{
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(718);
					match(COMMA);
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(724);
					match(IDENTIFIER);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(COLON);
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(731);
						match(IDENTIFIER);
						}
						} 
					}
					setState(736);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
			match(RIGHT_PAREN);
			setState(743);
			match(LEFT_BRACE);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==THIS_KEYWORD) {
				{
				{
				setState(744);
				methodCall();
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			match(RIGHT_BRACE);
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
	public static class InputPropertyContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(AngularParser.INPUT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode REQUIRED() { return getToken(AngularParser.REQUIRED, 0); }
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public InputPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputPropertyContext inputProperty() throws RecognitionException {
		InputPropertyContext _localctx = new InputPropertyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inputProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(INPUT);
			setState(753);
			match(LEFT_PAREN);
			setState(754);
			match(LEFT_BRACE);
			setState(755);
			match(REQUIRED);
			setState(756);
			match(COLON);
			setState(757);
			match(BOOLEAN);
			setState(758);
			match(RIGHT_BRACE);
			setState(759);
			match(RIGHT_PAREN);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(760);
				match(IDENTIFIER);
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(766);
			match(COLON);
			setState(767);
			match(ANY);
			setState(768);
			match(SEMICOLON);
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
	public static class OutputPropertyContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(AngularParser.OUTPUT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(AngularParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(AngularParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(AngularParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(AngularParser.RIGHT_PAREN, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(AngularParser.LESS_THAN, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode GREATER_THAN() { return getToken(AngularParser.GREATER_THAN, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public OutputPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOutputProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOutputProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOutputProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputPropertyContext outputProperty() throws RecognitionException {
		OutputPropertyContext _localctx = new OutputPropertyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outputProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(OUTPUT);
			setState(771);
			match(LEFT_PAREN);
			setState(772);
			match(RIGHT_PAREN);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(773);
				match(IDENTIFIER);
				}
				}
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(779);
			match(COLON);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(780);
				match(IDENTIFIER);
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
			match(LESS_THAN);
			setState(787);
			match(ANY);
			setState(788);
			match(GREATER_THAN);
			setState(789);
			match(ASSIGN);
			setState(790);
			match(NEW);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(791);
				match(IDENTIFIER);
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797);
			match(LEFT_PAREN);
			setState(798);
			match(RIGHT_PAREN);
			setState(799);
			match(SEMICOLON);
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
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(801);
				match(IDENTIFIER);
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(807);
			match(LEFT_PAREN);
			setState(808);
			match(RIGHT_PAREN);
			setState(809);
			match(LEFT_BRACE);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576461921075068928L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 4503599636284437L) != 0)) {
				{
				{
				setState(810);
				statement();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816);
			match(RIGHT_BRACE);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LOOPSTATEMENT3Context extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LOOPSTATEMENT3Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLOOPSTATEMENT3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLOOPSTATEMENT3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLOOPSTATEMENT3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class METHODCALL2Context extends StatementContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public METHODCALL2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMETHODCALL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMETHODCALL2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMETHODCALL2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RETURNSTATEMENT2Context extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public RETURNSTATEMENT2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRETURNSTATEMENT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRETURNSTATEMENT2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRETURNSTATEMENT2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ASSIGMENT2Context extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ASSIGMENT2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterASSIGMENT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitASSIGMENT2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitASSIGMENT2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ANYTYPE2Context extends StatementContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public ANYTYPE2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterANYTYPE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitANYTYPE2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitANYTYPE2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VIF3Context extends StatementContext {
		public VifContext vif() {
			return getRuleContext(VifContext.class,0);
		}
		public VIF3Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVIF3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVIF3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVIF3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FUNCTIONCALL2Context extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FUNCTIONCALL2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFUNCTIONCALL2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFUNCTIONCALL2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFUNCTIONCALL2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PRINT2Context extends StatementContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PRINT2Context(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPRINT2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPRINT2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPRINT2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statement);
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new FUNCTIONCALL2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				functionCall();
				}
				break;
			case 2:
				_localctx = new METHODCALL2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				methodCall();
				}
				break;
			case 3:
				_localctx = new ASSIGMENT2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				assignment();
				}
				break;
			case 4:
				_localctx = new VIF3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				vif();
				}
				break;
			case 5:
				_localctx = new LOOPSTATEMENT3Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(822);
				loopStatement();
				}
				break;
			case 6:
				_localctx = new RETURNSTATEMENT2Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(823);
				returnStatement();
				}
				break;
			case 7:
				_localctx = new ANYTYPE2Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(824);
				any_type();
				}
				break;
			case 8:
				_localctx = new PRINT2Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(825);
				print();
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode CONSOLE_LOG() { return getToken(AngularParser.CONSOLE_LOG, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(CONSOLE_LOG);
			setState(829);
			match(LEFT_PAREN);
			setState(830);
			match(STRING);
			setState(831);
			match(RIGHT_PAREN);
			setState(832);
			match(SEMICOLON);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functionCall);
		int _la;
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(834);
					match(IDENTIFIER);
					}
					}
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(840);
				match(LEFT_PAREN);
				setState(841);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				any_type();
				setState(843);
				match(RIGHT_PAREN);
				setState(844);
				match(SEMICOLON);
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
	public static class MethodCallContext extends ParserRuleContext {
		public List<TerminalNode> THIS_KEYWORD() { return getTokens(AngularParser.THIS_KEYWORD); }
		public TerminalNode THIS_KEYWORD(int i) {
			return getToken(AngularParser.THIS_KEYWORD, i);
		}
		public List<TerminalNode> PERIOD() { return getTokens(AngularParser.PERIOD); }
		public TerminalNode PERIOD(int i) {
			return getToken(AngularParser.PERIOD, i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public List<Any_typeContext> any_type() {
			return getRuleContexts(Any_typeContext.class);
		}
		public Any_typeContext any_type(int i) {
			return getRuleContext(Any_typeContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_methodCall);
		int _la;
		try {
			int _alt;
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				match(THIS_KEYWORD);
				setState(849);
				match(PERIOD);
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(850);
					match(IDENTIFIER);
					}
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(856);
				match(PERIOD);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(857);
					match(IDENTIFIER);
					}
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(863);
				match(LEFT_PAREN);
				setState(864);
				match(THIS_KEYWORD);
				setState(865);
				match(PERIOD);
				setState(866);
				arguments();
				setState(867);
				match(RIGHT_PAREN);
				setState(868);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(THIS_KEYWORD);
				setState(871);
				match(PERIOD);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(872);
					match(IDENTIFIER);
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(878);
				match(ASSIGN);
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(879);
						any_type();
						}
						} 
					}
					setState(884);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			expression();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(888);
				match(COMMA);
				setState(889);
				expression();
				}
				}
				setState(894);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<Any_typeContext> any_type() {
			return getRuleContexts(Any_typeContext.class);
		}
		public Any_typeContext any_type(int i) {
			return getRuleContext(Any_typeContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(895);
					match(IDENTIFIER);
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
				match(ASSIGN);
				setState(902);
				expression();
				setState(903);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(905);
					match(IDENTIFIER);
					}
					}
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(911);
				match(ASSIGN);
				setState(915);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(912);
						any_type();
						}
						} 
					}
					setState(917);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP() { return getToken(AngularParser.FOR_LOOP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(FOR_LOOP);
			setState(921);
			match(LEFT_PAREN);
			setState(922);
			assignment();
			setState(923);
			match(SEMICOLON);
			setState(924);
			expression();
			setState(925);
			match(SEMICOLON);
			setState(926);
			assignment();
			setState(927);
			match(RIGHT_PAREN);
			setState(928);
			match(LEFT_BRACE);
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576461921075068928L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 4503599636284437L) != 0)) {
				{
				{
				setState(929);
				statement();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
			match(RIGHT_BRACE);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(AngularParser.RETURN_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(RETURN_KEYWORD);
			setState(938);
			expression();
			setState(939);
			match(SEMICOLON);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(AngularParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(AngularParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(AngularParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(AngularParser.DIVIDE, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			factor();
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(942);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(943);
				factor();
				}
				}
				setState(948);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NUMBERContext extends FactorContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public NUMBERContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNUMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNUMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNUMBER(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NULLContext extends FactorContext {
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public NULLContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNULL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNULL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNULL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EXPRESSION1Context extends FactorContext {
		public TerminalNode LEFT_PAREN() { return getToken(AngularParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(AngularParser.RIGHT_PAREN, 0); }
		public EXPRESSION1Context(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEXPRESSION1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEXPRESSION1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEXPRESSION1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDENTIFIERContext extends FactorContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public IDENTIFIERContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BOOLEANContext extends FactorContext {
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public BOOLEANContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBOOLEAN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBOOLEAN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBOOLEAN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_factor);
		try {
			int _alt;
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new NUMBERContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new BOOLEANContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(BOOLEAN);
				}
				break;
			case 3:
				_localctx = new NULLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				match(NULL);
				}
				break;
			case 4:
				_localctx = new IDENTIFIERContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(955);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(952);
						match(IDENTIFIER);
						}
						} 
					}
					setState(957);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 5:
				_localctx = new EXPRESSION1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(958);
				match(LEFT_PAREN);
				setState(959);
				expression();
				setState(960);
				match(RIGHT_PAREN);
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
	public static class Any_typeContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(AngularParser.LENGTH, 0); }
		public TerminalNode COLOR() { return getToken(AngularParser.COLOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(AngularParser.LEFT_BRACKET, 0); }
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(AngularParser.RIGHT_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAny_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAny_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_any_type);
		int _la;
		try {
			setState(986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LENGTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(LENGTH);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(COLOR);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				match(STRING);
				}
				break;
			case ANY:
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
				match(ANY);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 7);
				{
				setState(970);
				match(LEFT_BRACKET);
				setState(971);
				product();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(972);
					match(COMMA);
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LEFT_BRACE) {
						{
						{
						setState(973);
						product();
						}
						}
						setState(978);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(984);
				match(RIGHT_BRACKET);
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
	public static class ProductContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(AngularParser.LEFT_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(AngularParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(AngularParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AngularParser.NUMBER, i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(LEFT_BRACE);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(989);
				match(IDENTIFIER);
				}
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(995);
			match(COLON);
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(996);
				match(NUMBER);
				}
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1002);
			match(COMMA);
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1003);
				match(IDENTIFIER);
				}
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1009);
			match(COLON);
			setState(1010);
			match(STRING);
			setState(1011);
			match(COMMA);
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1012);
				match(IDENTIFIER);
				}
				}
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018);
			match(COLON);
			setState(1019);
			match(STRING);
			setState(1020);
			match(RIGHT_BRACE);
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
		"\u0004\u0001}\u03ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0005\u0000v\b\u0000"+
		"\n\u0000\f\u0000y\t\u0000\u0001\u0000\u0003\u0000|\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0081\b\u0001\n\u0001\f\u0001\u0084"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0088\b\u0001\n\u0001\f\u0001"+
		"\u008b\t\u0001\u0005\u0001\u008d\b\u0001\n\u0001\f\u0001\u0090\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u009b\b\u0002\n\u0002"+
		"\f\u0002\u009e\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u00a9\b\u0003\n\u0003\f\u0003\u00ac\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b5"+
		"\b\u0004\n\u0004\f\u0004\u00b8\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00be\b\u0004\n\u0004\f\u0004\u00c1\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c7\b\u0004\n"+
		"\u0004\f\u0004\u00ca\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ce"+
		"\b\u0004\n\u0004\f\u0004\u00d1\t\u0004\u0005\u0004\u00d3\b\u0004\n\u0004"+
		"\f\u0004\u00d6\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00da\b\u0004"+
		"\n\u0004\f\u0004\u00dd\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00e3\b\u0004\n\u0004\f\u0004\u00e6\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ec\b\u0004\n\u0004"+
		"\f\u0004\u00ef\t\u0004\u0003\u0004\u00f1\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00f5\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00f9\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0109\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0111\b\b\n\b\f\b\u0114\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u011a\b\b\n\b\f\b\u011d\t\b\u0001"+
		"\b\u0003\b\u0120\b\b\u0001\t\u0005\t\u0123\b\t\n\t\f\t\u0126\t\t\u0001"+
		"\t\u0003\t\u0129\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0132\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0138\b\u000b\n\u000b\f\u000b\u013b\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u0144\b\f"+
		"\n\f\f\f\u0147\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u014c\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u015e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u016c\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0185\b\u0014\n\u0014"+
		"\f\u0014\u0188\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0197\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u019f\b\u0015\n\u0015\f\u0015\u01a2\t\u0015\u0001\u0015\u0003\u0015\u01a5"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01aa\b\u0016"+
		"\u0001\u0017\u0005\u0017\u01ad\b\u0017\n\u0017\f\u0017\u01b0\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01b9\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u01d3\b\u001e\n\u001e\f\u001e"+
		"\u01d6\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u01de\b\u001f\n\u001f\f\u001f\u01e1\t\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u01e9"+
		"\b \n \f \u01ec\t \u0001 \u0003 \u01ef\b \u0001 \u0005 \u01f2\b \n \f"+
		" \u01f5\t \u0003 \u01f7\b \u0001 \u0001 \u0003 \u01fb\b \u0001 \u0005"+
		" \u01fe\b \n \f \u0201\t \u0001 \u0003 \u0204\b \u0001 \u0001 \u0005 "+
		"\u0208\b \n \f \u020b\t \u0005 \u020d\b \n \f \u0210\t \u0001 \u0001 "+
		"\u0003 \u0214\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u021d\b \n \f \u0220\t \u0003 \u0222\b \u0001!\u0001!\u0001!\u0001!"+
		"\u0001\"\u0005\"\u0229\b\"\n\"\f\"\u022c\t\"\u0001#\u0001#\u0001#\u0005"+
		"#\u0231\b#\n#\f#\u0234\t#\u0001#\u0001#\u0001$\u0005$\u0239\b$\n$\f$\u023c"+
		"\t$\u0001$\u0001$\u0005$\u0240\b$\n$\f$\u0243\t$\u0005$\u0245\b$\n$\f"+
		"$\u0248\t$\u0001%\u0005%\u024b\b%\n%\f%\u024e\t%\u0001%\u0003%\u0251\b"+
		"%\u0001%\u0005%\u0254\b%\n%\f%\u0257\t%\u0001%\u0001%\u0005%\u025b\b%"+
		"\n%\f%\u025e\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005&\u0265\b&\n&"+
		"\f&\u0268\t&\u0001&\u0001&\u0005&\u026c\b&\n&\f&\u026f\t&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0005\'\u0275\b\'\n\'\f\'\u0278\t\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0005\'\u027e\b\'\n\'\f\'\u0281\t\'\u0001\'\u0005\'\u0284"+
		"\b\'\n\'\f\'\u0287\t\'\u0001\'\u0005\'\u028a\b\'\n\'\f\'\u028d\t\'\u0001"+
		"\'\u0001\'\u0005\'\u0291\b\'\n\'\f\'\u0294\t\'\u0001\'\u0005\'\u0297\b"+
		"\'\n\'\f\'\u029a\t\'\u0001\'\u0001\'\u0005\'\u029e\b\'\n\'\f\'\u02a1\t"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u02a8\b\'\n\'\f\'\u02ab"+
		"\t\'\u0001(\u0001(\u0001(\u0005(\u02b0\b(\n(\f(\u02b3\t(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02bc\b)\u0001*\u0001*\u0001"+
		"*\u0005*\u02c1\b*\n*\f*\u02c4\t*\u0001*\u0003*\u02c7\b*\u0001*\u0005*"+
		"\u02ca\b*\n*\f*\u02cd\t*\u0001*\u0005*\u02d0\b*\n*\f*\u02d3\t*\u0001*"+
		"\u0005*\u02d6\b*\n*\f*\u02d9\t*\u0001*\u0001*\u0005*\u02dd\b*\n*\f*\u02e0"+
		"\t*\u0005*\u02e2\b*\n*\f*\u02e5\t*\u0001*\u0001*\u0001*\u0005*\u02ea\b"+
		"*\n*\f*\u02ed\t*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u02fa\b+\n+\f+\u02fd\t+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u0307\b,\n,\f,\u030a\t,\u0001"+
		",\u0001,\u0005,\u030e\b,\n,\f,\u0311\t,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u0319\b,\n,\f,\u031c\t,\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0005-\u0323\b-\n-\f-\u0326\t-\u0001-\u0001-\u0001-\u0001-\u0005-\u032c"+
		"\b-\n-\f-\u032f\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0003.\u033b\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00050\u0344\b0\n0\f0\u0347\t0\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u034f\b0\u00011\u00011\u00011\u00051\u0354\b1\n1\f1\u0357"+
		"\t1\u00011\u00011\u00051\u035b\b1\n1\f1\u035e\t1\u00011\u00011\u00011"+
		"\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u036a\b1\n1\f"+
		"1\u036d\t1\u00011\u00011\u00051\u0371\b1\n1\f1\u0374\t1\u00031\u0376\b"+
		"1\u00012\u00012\u00012\u00052\u037b\b2\n2\f2\u037e\t2\u00013\u00053\u0381"+
		"\b3\n3\f3\u0384\t3\u00013\u00013\u00013\u00013\u00013\u00053\u038b\b3"+
		"\n3\f3\u038e\t3\u00013\u00013\u00053\u0392\b3\n3\f3\u0395\t3\u00033\u0397"+
		"\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00054\u03a3\b4\n4\f4\u03a6\t4\u00014\u00014\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00056\u03b1\b6\n6\f6\u03b4\t6\u00017\u00017\u0001"+
		"7\u00017\u00057\u03ba\b7\n7\f7\u03bd\t7\u00017\u00017\u00017\u00017\u0003"+
		"7\u03c3\b7\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00058\u03cf\b8\n8\f8\u03d2\t8\u00058\u03d4\b8\n8\f8\u03d7\t"+
		"8\u00018\u00018\u00038\u03db\b8\u00019\u00019\u00059\u03df\b9\n9\f9\u03e2"+
		"\t9\u00019\u00019\u00059\u03e6\b9\n9\f9\u03e9\t9\u00019\u00019\u00059"+
		"\u03ed\b9\n9\f9\u03f0\t9\u00019\u00019\u00019\u00019\u00059\u03f6\b9\n"+
		"9\f9\u03f9\t9\u00019\u00019\u00019\u00019\u00019\u0000\u0000:\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0003\u0001\u0000@"+
		"A\u0002\u0000  ;;\u0001\u0000BC\u0467\u0000{\u0001\u0000\u0000\u0000\u0002"+
		"}\u0001\u0000\u0000\u0000\u0004\u0096\u0001\u0000\u0000\u0000\u0006\u00a4"+
		"\u0001\u0000\u0000\u0000\b\u00f0\u0001\u0000\u0000\u0000\n\u00f4\u0001"+
		"\u0000\u0000\u0000\f\u00f8\u0001\u0000\u0000\u0000\u000e\u0108\u0001\u0000"+
		"\u0000\u0000\u0010\u010a\u0001\u0000\u0000\u0000\u0012\u0128\u0001\u0000"+
		"\u0000\u0000\u0014\u0131\u0001\u0000\u0000\u0000\u0016\u0133\u0001\u0000"+
		"\u0000\u0000\u0018\u014b\u0001\u0000\u0000\u0000\u001a\u014d\u0001\u0000"+
		"\u0000\u0000\u001c\u0155\u0001\u0000\u0000\u0000\u001e\u015d\u0001\u0000"+
		"\u0000\u0000 \u015f\u0001\u0000\u0000\u0000\"\u016b\u0001\u0000\u0000"+
		"\u0000$\u016d\u0001\u0000\u0000\u0000&\u0175\u0001\u0000\u0000\u0000("+
		"\u0196\u0001\u0000\u0000\u0000*\u01a4\u0001\u0000\u0000\u0000,\u01a9\u0001"+
		"\u0000\u0000\u0000.\u01ae\u0001\u0000\u0000\u00000\u01b8\u0001\u0000\u0000"+
		"\u00002\u01ba\u0001\u0000\u0000\u00004\u01be\u0001\u0000\u0000\u00006"+
		"\u01c2\u0001\u0000\u0000\u00008\u01c6\u0001\u0000\u0000\u0000:\u01ca\u0001"+
		"\u0000\u0000\u0000<\u01d0\u0001\u0000\u0000\u0000>\u01db\u0001\u0000\u0000"+
		"\u0000@\u0221\u0001\u0000\u0000\u0000B\u0223\u0001\u0000\u0000\u0000D"+
		"\u022a\u0001\u0000\u0000\u0000F\u022d\u0001\u0000\u0000\u0000H\u023a\u0001"+
		"\u0000\u0000\u0000J\u024c\u0001\u0000\u0000\u0000L\u0261\u0001\u0000\u0000"+
		"\u0000N\u027f\u0001\u0000\u0000\u0000P\u02b1\u0001\u0000\u0000\u0000R"+
		"\u02bb\u0001\u0000\u0000\u0000T\u02bd\u0001\u0000\u0000\u0000V\u02f0\u0001"+
		"\u0000\u0000\u0000X\u0302\u0001\u0000\u0000\u0000Z\u0324\u0001\u0000\u0000"+
		"\u0000\\\u033a\u0001\u0000\u0000\u0000^\u033c\u0001\u0000\u0000\u0000"+
		"`\u034e\u0001\u0000\u0000\u0000b\u0375\u0001\u0000\u0000\u0000d\u0377"+
		"\u0001\u0000\u0000\u0000f\u0396\u0001\u0000\u0000\u0000h\u0398\u0001\u0000"+
		"\u0000\u0000j\u03a9\u0001\u0000\u0000\u0000l\u03ad\u0001\u0000\u0000\u0000"+
		"n\u03c2\u0001\u0000\u0000\u0000p\u03da\u0001\u0000\u0000\u0000r\u03dc"+
		"\u0001\u0000\u0000\u0000tv\u0003\u000e\u0007\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x|\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005"+
		"\u0000\u0000\u0001{w\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u0001\u0001\u0000\u0000\u0000}~\u0005,\u0000\u0000~\u0082\u0005&\u0000"+
		"\u0000\u007f\u0081\u0005}\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u008e\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0089\u0005\u001e\u0000\u0000"+
		"\u0086\u0088\u0005}\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u0085\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0092\u0005\'\u0000\u0000\u0092\u0093"+
		"\u0005]\u0000\u0000\u0093\u0094\u0005I\u0000\u0000\u0094\u0095\u0005\u001f"+
		"\u0000\u0000\u0095\u0003\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0011"+
		"\u0000\u0000\u0097\u0098\u0005$\u0000\u0000\u0098\u009c\u0005&\u0000\u0000"+
		"\u0099\u009b\u0005}\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005 \u0000\u0000\u00a0\u00a1"+
		"\u0005I\u0000\u0000\u00a1\u00a2\u0005\'\u0000\u0000\u00a2\u00a3\u0005"+
		"%\u0000\u0000\u00a3\u0005\u0001\u0000\u0000\u0000\u00a4\u00a5\u00050\u0000"+
		"\u0000\u00a5\u00a6\u0005$\u0000\u0000\u00a6\u00aa\u0005&\u0000\u0000\u00a7"+
		"\u00a9\u0003\b\u0004\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\'\u0000\u0000\u00ae\u00af\u0005"+
		"%\u0000\u0000\u00af\u0007\u0001\u0000\u0000\u0000\u00b0\u00b1\u00056\u0000"+
		"\u0000\u00b1\u00b2\u0005 \u0000\u0000\u00b2\u00b6\u0005I\u0000\u0000\u00b3"+
		"\u00b5\u0005\u001e\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00f1\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005:\u0000\u0000\u00ba\u00bb"+
		"\u0005 \u0000\u0000\u00bb\u00bf\u0005?\u0000\u0000\u00bc\u00be\u0005\u001e"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00f1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u00057\u0000\u0000\u00c3\u00c4\u0005 \u0000\u0000"+
		"\u00c4\u00c8\u0005(\u0000\u0000\u00c5\u00c7\u0005}\u0000\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00d4"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cf"+
		"\u0005\u001e\u0000\u0000\u00cc\u00ce\u0005}\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00db\u0005"+
		")\u0000\u0000\u00d8\u00da\u0005\u001e\u0000\u0000\u00d9\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00f1\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u00058\u0000"+
		"\u0000\u00df\u00e0\u0005 \u0000\u0000\u00e0\u00e4\u0003\n\u0005\u0000"+
		"\u00e1\u00e3\u0005\u001e\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00f1\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u00059\u0000\u0000\u00e8"+
		"\u00e9\u0005 \u0000\u0000\u00e9\u00ed\u0003\f\u0006\u0000\u00ea\u00ec"+
		"\u0005\u001e\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00b0\u0001\u0000\u0000\u0000\u00f0\u00b9"+
		"\u0001\u0000\u0000\u0000\u00f0\u00c2\u0001\u0000\u0000\u0000\u00f0\u00de"+
		"\u0001\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f1\t\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f5\u0005I\u0000\u0000\u00f3\u00f5\u0003\u0012"+
		"\t\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u000b\u0001\u0000\u0000\u0000\u00f6\u00f9\u0003D\"\u0000"+
		"\u00f7\u00f9\u0005I\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\r\u0001\u0000\u0000\u0000\u00fa\u0109"+
		"\u0003\u0004\u0002\u0000\u00fb\u0109\u0003L&\u0000\u00fc\u0109\u0003\u0006"+
		"\u0003\u0000\u00fd\u0109\u0003\u0002\u0001\u0000\u00fe\u0109\u0003f3\u0000"+
		"\u00ff\u0109\u0003`0\u0000\u0100\u0109\u0003b1\u0000\u0101\u0109\u0003"+
		"h4\u0000\u0102\u0109\u0003j5\u0000\u0103\u0109\u0003^/\u0000\u0104\u0109"+
		"\u0003T*\u0000\u0105\u0109\u0003Z-\u0000\u0106\u0109\u0003p8\u0000\u0107"+
		"\u0109\u0003\u0010\b\u0000\u0108\u00fa\u0001\u0000\u0000\u0000\u0108\u00fb"+
		"\u0001\u0000\u0000\u0000\u0108\u00fc\u0001\u0000\u0000\u0000\u0108\u00fd"+
		"\u0001\u0000\u0000\u0000\u0108\u00fe\u0001\u0000\u0000\u0000\u0108\u00ff"+
		"\u0001\u0000\u0000\u0000\u0108\u0100\u0001\u0000\u0000\u0000\u0108\u0101"+
		"\u0001\u0000\u0000\u0000\u0108\u0102\u0001\u0000\u0000\u0000\u0108\u0103"+
		"\u0001\u0000\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0108\u0105"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u000f\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0005M\u0000\u0000\u010b\u010c\u0005$\u0000\u0000\u010c\u010d\u0003@"+
		" \u0000\u010d\u010e\u0005%\u0000\u0000\u010e\u0112\u0005&\u0000\u0000"+
		"\u010f\u0111\u0003\\.\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u011f\u0005\'\u0000\u0000\u0116\u0117"+
		"\u0005N\u0000\u0000\u0117\u011b\u0005&\u0000\u0000\u0118\u011a\u0003\\"+
		".\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0005\'\u0000\u0000\u011f\u0116\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0011\u0001\u0000\u0000\u0000"+
		"\u0121\u0123\u0003\u0014\n\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0129\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0005\u0000\u0000\u0001\u0128"+
		"\u0124\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u0013\u0001\u0000\u0000\u0000\u012a\u0132\u0003\u0016\u000b\u0000\u012b"+
		"\u0132\u0003\u001a\r\u0000\u012c\u0132\u0003(\u0014\u0000\u012d\u0132"+
		"\u0003\u001c\u000e\u0000\u012e\u0132\u0003 \u0010\u0000\u012f\u0132\u0003"+
		"$\u0012\u0000\u0130\u0132\u0003&\u0013\u0000\u0131\u012a\u0001\u0000\u0000"+
		"\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u012c\u0001\u0000\u0000"+
		"\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0015\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0019\u0000"+
		"\u0000\u0134\u0135\u0005\u0016\u0000\u0000\u0135\u0139\u0003\u0018\f\u0000"+
		"\u0136\u0138\u0003\u0014\n\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0002\u0000\u0000\u013d"+
		"\u013e\u0005\u0016\u0000\u0000\u013e\u013f\u0005\u0018\u0000\u0000\u013f"+
		"\u0140\u0005\u001e\u0000\u0000\u0140\u0017\u0001\u0000\u0000\u0000\u0141"+
		"\u0145\u0003.\u0017\u0000\u0142\u0144\u0003,\u0016\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"\u0018\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u014c\u0005"+
		"\u0018\u0000\u0000\u014b\u0141\u0001\u0000\u0000\u0000\u014b\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u0019\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"\u0019\u0000\u0000\u014e\u014f\u0005\b\u0000\u0000\u014f\u0150\u0005\u0018"+
		"\u0000\u0000\u0150\u0151\u0003B!\u0000\u0151\u0152\u0005\u0002\u0000\u0000"+
		"\u0152\u0153\u0005\b\u0000\u0000\u0153\u0154\u0005\u0018\u0000\u0000\u0154"+
		"\u001b\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0019\u0000\u0000\u0156"+
		"\u0157\u0005\t\u0000\u0000\u0157\u0158\u0003\u001e\u000f\u0000\u0158\u001d"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0003.\u0017\u0000\u015a\u015b\u0005"+
		"\u0001\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015e\u0005"+
		"\u0001\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u001f\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u0019\u0000\u0000\u0160\u0161\u0005\n\u0000\u0000\u0161\u0162\u0003\""+
		"\u0011\u0000\u0162\u0163\u0005I\u0000\u0000\u0163\u0164\u0005\u0001\u0000"+
		"\u0000\u0164\u0165\u0005\n\u0000\u0000\u0165\u0166\u0005\u0018\u0000\u0000"+
		"\u0166!\u0001\u0000\u0000\u0000\u0167\u0168\u0003.\u0017\u0000\u0168\u0169"+
		"\u0005\u0018\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u016c"+
		"\u0005\u0018\u0000\u0000\u016b\u0167\u0001\u0000\u0000\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016c#\u0001\u0000\u0000\u0000\u016d\u016e\u0005"+
		"\u0019\u0000\u0000\u016e\u016f\u0005\u000b\u0000\u0000\u016f\u0170\u0005"+
		"\u0018\u0000\u0000\u0170\u0171\u0003B!\u0000\u0171\u0172\u0005\u0002\u0000"+
		"\u0000\u0172\u0173\u0005\u000b\u0000\u0000\u0173\u0174\u0005\u0018\u0000"+
		"\u0000\u0174%\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0019\u0000\u0000"+
		"\u0176\u0177\u0005\u0016\u0000\u0000\u0177\u0178\u0005B\u0000\u0000\u0178"+
		"\u0179\u0005\u0007\u0000\u0000\u0179\u017a\u0005;\u0000\u0000\u017a\u017b"+
		"\u0005I\u0000\u0000\u017b\u017c\u0005\u0018\u0000\u0000\u017c\u017d\u0003"+
		",\u0016\u0000\u017d\u017e\u0005\u0002\u0000\u0000\u017e\u017f\u0005\u0016"+
		"\u0000\u0000\u017f\u0180\u0005\u0018\u0000\u0000\u0180\'\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0005\u0019\u0000\u0000\u0182\u0186\u0005\u0005\u0000"+
		"\u0000\u0183\u0185\u0005}\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000"+
		"\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u0197\u0003*\u0015\u0000\u018a"+
		"\u018b\u0005\u0019\u0000\u0000\u018b\u018c\u0005\u0016\u0000\u0000\u018c"+
		"\u018d\u0005B\u0000\u0000\u018d\u018e\u0005\u0007\u0000\u0000\u018e\u018f"+
		"\u0005;\u0000\u0000\u018f\u0190\u0005I\u0000\u0000\u0190\u0191\u0005\u0018"+
		"\u0000\u0000\u0191\u0192\u0003,\u0016\u0000\u0192\u0193\u0005\u0002\u0000"+
		"\u0000\u0193\u0194\u0005\u0016\u0000\u0000\u0194\u0195\u0005\u0018\u0000"+
		"\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0181\u0001\u0000\u0000"+
		"\u0000\u0196\u018a\u0001\u0000\u0000\u0000\u0197)\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0003.\u0017\u0000\u0199\u019a\u0005\u0018\u0000\u0000\u019a"+
		"\u01a5\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0018\u0000\u0000\u019c"+
		"\u01a0\u0005\u0006\u0000\u0000\u019d\u019f\u0005}\u0000\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a5"+
		"\u0005\u0018\u0000\u0000\u01a4\u0198\u0001\u0000\u0000\u0000\u01a4\u019b"+
		"\u0001\u0000\u0000\u0000\u01a5+\u0001\u0000\u0000\u0000\u01a6\u01aa\u0005"+
		"}\u0000\u0000\u01a7\u01aa\u0005I\u0000\u0000\u01a8\u01aa\u0003B!\u0000"+
		"\u01a9\u01a6\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa-\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ad\u00030\u0018\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0"+
		"\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af/\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b9\u00032\u0019\u0000\u01b2\u01b9\u00034\u001a"+
		"\u0000\u01b3\u01b9\u00036\u001b\u0000\u01b4\u01b9\u00038\u001c\u0000\u01b5"+
		"\u01b9\u0003:\u001d\u0000\u01b6\u01b9\u0003<\u001e\u0000\u01b7\u01b9\u0003"+
		">\u001f\u0000\u01b8\u01b1\u0001\u0000\u0000\u0000\u01b8\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b3\u0001\u0000\u0000\u0000\u01b8\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b91\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0005T\u0000\u0000\u01bb\u01bc\u0005;\u0000\u0000\u01bc"+
		"\u01bd\u0005I\u0000\u0000\u01bd3\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"\f\u0000\u0000\u01bf\u01c0\u0005;\u0000\u0000\u01c0\u01c1\u0005I\u0000"+
		"\u0000\u01c15\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\r\u0000\u0000"+
		"\u01c3\u01c4\u0005;\u0000\u0000\u01c4\u01c5\u0005I\u0000\u0000\u01c57"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005\u000e\u0000\u0000\u01c7\u01c8"+
		"\u0005;\u0000\u0000\u01c8\u01c9\u0005I\u0000\u0000\u01c99\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0005$\u0000\u0000\u01cb\u01cc\u0005\u000f\u0000"+
		"\u0000\u01cc\u01cd\u0005%\u0000\u0000\u01cd\u01ce\u0005;\u0000\u0000\u01ce"+
		"\u01cf\u0005I\u0000\u0000\u01cf;\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005"+
		"(\u0000\u0000\u01d1\u01d3\u0005}\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005)\u0000\u0000"+
		"\u01d8\u01d9\u0005;\u0000\u0000\u01d9\u01da\u0005I\u0000\u0000\u01da="+
		"\u0001\u0000\u0000\u0000\u01db\u01df\u0005$\u0000\u0000\u01dc\u01de\u0005"+
		"}\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000"+
		"\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0005%\u0000\u0000\u01e3\u01e4\u0005;\u0000\u0000"+
		"\u01e4\u01e5\u0005I\u0000\u0000\u01e5?\u0001\u0000\u0000\u0000\u01e6\u0222"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005}\u0000\u0000\u01e8\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01f6\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ef\u0005"+
		"m\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f3\u0001\u0000\u0000\u0000\u01f0\u01f2\u0005}\u0000"+
		"\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f6\u01ee\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005|\u0000\u0000"+
		"\u01f9\u01fb\u0005I\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fb\u0222\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fe\u0005}\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0001\u0000\u0000\u0000\u0200\u020e\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0202\u0204\u0005l\u0000\u0000\u0203\u0202\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0209\u0005!\u0000\u0000\u0206\u0208\u0005}\u0000"+
		"\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000"+
		"\u0000\u020c\u0203\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000"+
		"\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0213\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0005|\u0000\u0000\u0212\u0214\u0003@ \u0000\u0213"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214"+
		"\u0222\u0001\u0000\u0000\u0000\u0215\u0222\u0005I\u0000\u0000\u0216\u0222"+
		"\u0005?\u0000\u0000\u0217\u0222\u0005>\u0000\u0000\u0218\u0222\u0003l"+
		"6\u0000\u0219\u021e\u0003l6\u0000\u021a\u021b\u0007\u0000\u0000\u0000"+
		"\u021b\u021d\u0003l6\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u0220"+
		"\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0001\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000\u0000\u0220\u021e"+
		"\u0001\u0000\u0000\u0000\u0221\u01e6\u0001\u0000\u0000\u0000\u0221\u01ea"+
		"\u0001\u0000\u0000\u0000\u0221\u01ff\u0001\u0000\u0000\u0000\u0221\u0215"+
		"\u0001\u0000\u0000\u0000\u0221\u0216\u0001\u0000\u0000\u0000\u0221\u0217"+
		"\u0001\u0000\u0000\u0000\u0221\u0218\u0001\u0000\u0000\u0000\u0221\u0219"+
		"\u0001\u0000\u0000\u0000\u0222A\u0001\u0000\u0000\u0000\u0223\u0224\u0005"+
		"\u0003\u0000\u0000\u0224\u0225\u0003@ \u0000\u0225\u0226\u0005\u0004\u0000"+
		"\u0000\u0226C\u0001\u0000\u0000\u0000\u0227\u0229\u0003F#\u0000\u0228"+
		"\u0227\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a"+
		"\u0228\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b"+
		"E\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0003H$\u0000\u022e\u0232\u0005&\u0000\u0000\u022f\u0231\u0003J%\u0000"+
		"\u0230\u022f\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000"+
		"\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000"+
		"\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0005\'\u0000\u0000\u0236G\u0001\u0000\u0000\u0000\u0237"+
		"\u0239\u0005}\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023c"+
		"\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0001\u0000\u0000\u0000\u023b\u0246\u0001\u0000\u0000\u0000\u023c\u023a"+
		"\u0001\u0000\u0000\u0000\u023d\u0241\u0005\u001e\u0000\u0000\u023e\u0240"+
		"\u0005}\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0243\u0001"+
		"\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001"+
		"\u0000\u0000\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001"+
		"\u0000\u0000\u0000\u0244\u023d\u0001\u0000\u0000\u0000\u0245\u0248\u0001"+
		"\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001"+
		"\u0000\u0000\u0000\u0247I\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0249\u024b\u0005}\u0000\u0000\u024a\u0249\u0001\u0000\u0000"+
		"\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000"+
		"\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024f\u0251\u0005A\u0000\u0000"+
		"\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000"+
		"\u0251\u0255\u0001\u0000\u0000\u0000\u0252\u0254\u0005}\u0000\u0000\u0253"+
		"\u0252\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258"+
		"\u025c\u0005 \u0000\u0000\u0259\u025b\u0003p8\u0000\u025a\u0259\u0001"+
		"\u0000\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001"+
		"\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025f\u0001"+
		"\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0260\u0005"+
		"\u001f\u0000\u0000\u0260K\u0001\u0000\u0000\u0000\u0261\u0262\u0005-\u0000"+
		"\u0000\u0262\u0266\u0005T\u0000\u0000\u0263\u0265\u0005}\u0000\u0000\u0264"+
		"\u0263\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266"+
		"\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267"+
		"\u0269\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0269"+
		"\u026d\u0005&\u0000\u0000\u026a\u026c\u0003R)\u0000\u026b\u026a\u0001"+
		"\u0000\u0000\u0000\u026c\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u0270\u0001"+
		"\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u0270\u0271\u0005"+
		"\'\u0000\u0000\u0271M\u0001\u0000\u0000\u0000\u0272\u0276\u0005+\u0000"+
		"\u0000\u0273\u0275\u0005}\u0000\u0000\u0274\u0273\u0001\u0000\u0000\u0000"+
		"\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0001\u0000\u0000\u0000"+
		"\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027a\u0007\u0001\u0000\u0000"+
		"\u027a\u027b\u0003p8\u0000\u027b\u027c\u0005\u001f\u0000\u0000\u027c\u027e"+
		"\u0001\u0000\u0000\u0000\u027d\u0272\u0001\u0000\u0000\u0000\u027e\u0281"+
		"\u0001\u0000\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u0280"+
		"\u0001\u0000\u0000\u0000\u0280\u02a9\u0001\u0000\u0000\u0000\u0281\u027f"+
		"\u0001\u0000\u0000\u0000\u0282\u0284\u0005c\u0000\u0000\u0283\u0282\u0001"+
		"\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0283\u0001"+
		"\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u028b\u0001"+
		"\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u028a\u0005"+
		"}\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u028a\u028d\u0001\u0000"+
		"\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000"+
		"\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028e\u029f\u0005$\u0000\u0000\u028f\u0291\u0005+\u0000\u0000"+
		"\u0290\u028f\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000\u0000\u0000"+
		"\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0298\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000\u0000"+
		"\u0295\u0297\u0005}\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297"+
		"\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298"+
		"\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a"+
		"\u0298\u0001\u0000\u0000\u0000\u029b\u029c\u0005 \u0000\u0000\u029c\u029e"+
		"\u0003p8\u0000\u029d\u0292\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000"+
		"\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a3\u0005%\u0000\u0000\u02a3\u02a4\u0005&\u0000\u0000"+
		"\u02a4\u02a5\u0003P(\u0000\u02a5\u02a6\u0005\'\u0000\u0000\u02a6\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a7\u0285\u0001\u0000\u0000\u0000\u02a8\u02ab"+
		"\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa"+
		"\u0001\u0000\u0000\u0000\u02aaO\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001"+
		"\u0000\u0000\u0000\u02ac\u02b0\u0003b1\u0000\u02ad\u02b0\u0003f3\u0000"+
		"\u02ae\u02b0\u0003\\.\u0000\u02af\u02ac\u0001\u0000\u0000\u0000\u02af"+
		"\u02ad\u0001\u0000\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b2Q\u0001\u0000\u0000\u0000\u02b3\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b4\u02bc\u0003V+\u0000\u02b5\u02bc\u0003X"+
		",\u0000\u02b6\u02bc\u0003Z-\u0000\u02b7\u02bc\u0003h4\u0000\u02b8\u02bc"+
		"\u0003\u0010\b\u0000\u02b9\u02bc\u0003T*\u0000\u02ba\u02bc\u0003f3\u0000"+
		"\u02bb\u02b4\u0001\u0000\u0000\u0000\u02bb\u02b5\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b6\u0001\u0000\u0000\u0000\u02bb\u02b7\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000"+
		"\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bcS\u0001\u0000\u0000\u0000\u02bd"+
		"\u02be\u0005\u0012\u0000\u0000\u02be\u02c2\u0005$\u0000\u0000\u02bf\u02c1"+
		"\u0005}\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c7\u0005 \u0000\u0000\u02c6\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02cb\u0001\u0000"+
		"\u0000\u0000\u02c8\u02ca\u0005}\u0000\u0000\u02c9\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02e3\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d0\u0005\u001e\u0000"+
		"\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d7\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d6\u0005}\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02da\u0001\u0000\u0000\u0000"+
		"\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da\u02de\u0005 \u0000\u0000\u02db"+
		"\u02dd\u0005}\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u02e0"+
		"\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df"+
		"\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000\u02e0\u02de"+
		"\u0001\u0000\u0000\u0000\u02e1\u02d1\u0001\u0000\u0000\u0000\u02e2\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005%\u0000\u0000\u02e7\u02eb\u0005"+
		"&\u0000\u0000\u02e8\u02ea\u0003b1\u0000\u02e9\u02e8\u0001\u0000\u0000"+
		"\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000"+
		"\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0001\u0000\u0000"+
		"\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ef\u0005\'\u0000\u0000"+
		"\u02efU\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005\u001b\u0000\u0000\u02f1"+
		"\u02f2\u0005$\u0000\u0000\u02f2\u02f3\u0005&\u0000\u0000\u02f3\u02f4\u0005"+
		"\u001a\u0000\u0000\u02f4\u02f5\u0005 \u0000\u0000\u02f5\u02f6\u0005?\u0000"+
		"\u0000\u02f6\u02f7\u0005\'\u0000\u0000\u02f7\u02fb\u0005%\u0000\u0000"+
		"\u02f8\u02fa\u0005}\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005 \u0000\u0000\u02ff\u0300"+
		"\u0005\u001d\u0000\u0000\u0300\u0301\u0005\u001f\u0000\u0000\u0301W\u0001"+
		"\u0000\u0000\u0000\u0302\u0303\u0005\u001c\u0000\u0000\u0303\u0304\u0005"+
		"$\u0000\u0000\u0304\u0308\u0005%\u0000\u0000\u0305\u0307\u0005}\u0000"+
		"\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000"+
		"\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000"+
		"\u0000\u0309\u030b\u0001\u0000\u0000\u0000\u030a\u0308\u0001\u0000\u0000"+
		"\u0000\u030b\u030f\u0005 \u0000\u0000\u030c\u030e\u0005}\u0000\u0000\u030d"+
		"\u030c\u0001\u0000\u0000\u0000\u030e\u0311\u0001\u0000\u0000\u0000\u030f"+
		"\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310"+
		"\u0312\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u0005\u0019\u0000\u0000\u0313\u0314\u0005\u001d\u0000\u0000\u0314"+
		"\u0315\u0005\u0018\u0000\u0000\u0315\u0316\u0005;\u0000\u0000\u0316\u031a"+
		"\u0005\u0017\u0000\u0000\u0317\u0319\u0005}\u0000\u0000\u0318\u0317\u0001"+
		"\u0000\u0000\u0000\u0319\u031c\u0001\u0000\u0000\u0000\u031a\u0318\u0001"+
		"\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031d\u0001"+
		"\u0000\u0000\u0000\u031c\u031a\u0001\u0000\u0000\u0000\u031d\u031e\u0005"+
		"$\u0000\u0000\u031e\u031f\u0005%\u0000\u0000\u031f\u0320\u0005\u001f\u0000"+
		"\u0000\u0320Y\u0001\u0000\u0000\u0000\u0321\u0323\u0005}\u0000\u0000\u0322"+
		"\u0321\u0001\u0000\u0000\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324"+
		"\u0322\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325"+
		"\u0327\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327"+
		"\u0328\u0005$\u0000\u0000\u0328\u0329\u0005%\u0000\u0000\u0329\u032d\u0005"+
		"&\u0000\u0000\u032a\u032c\u0003\\.\u0000\u032b\u032a\u0001\u0000\u0000"+
		"\u0000\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000"+
		"\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0331\u0005\'\u0000\u0000"+
		"\u0331[\u0001\u0000\u0000\u0000\u0332\u033b\u0003`0\u0000\u0333\u033b"+
		"\u0003b1\u0000\u0334\u033b\u0003f3\u0000\u0335\u033b\u0003\u0010\b\u0000"+
		"\u0336\u033b\u0003h4\u0000\u0337\u033b\u0003j5\u0000\u0338\u033b\u0003"+
		"p8\u0000\u0339\u033b\u0003^/\u0000\u033a\u0332\u0001\u0000\u0000\u0000"+
		"\u033a\u0333\u0001\u0000\u0000\u0000\u033a\u0334\u0001\u0000\u0000\u0000"+
		"\u033a\u0335\u0001\u0000\u0000\u0000\u033a\u0336\u0001\u0000\u0000\u0000"+
		"\u033a\u0337\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000"+
		"\u033a\u0339\u0001\u0000\u0000\u0000\u033b]\u0001\u0000\u0000\u0000\u033c"+
		"\u033d\u0005`\u0000\u0000\u033d\u033e\u0005$\u0000\u0000\u033e\u033f\u0005"+
		"I\u0000\u0000\u033f\u0340\u0005%\u0000\u0000\u0340\u0341\u0005\u001f\u0000"+
		"\u0000\u0341_\u0001\u0000\u0000\u0000\u0342\u0344\u0005}\u0000\u0000\u0343"+
		"\u0342\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345"+
		"\u0343\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346"+
		"\u0348\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348"+
		"\u0349\u0005$\u0000\u0000\u0349\u034f\u0003d2\u0000\u034a\u034b\u0003"+
		"p8\u0000\u034b\u034c\u0005%\u0000\u0000\u034c\u034d\u0005\u001f\u0000"+
		"\u0000\u034d\u034f\u0001\u0000\u0000\u0000\u034e\u0345\u0001\u0000\u0000"+
		"\u0000\u034e\u034a\u0001\u0000\u0000\u0000\u034fa\u0001\u0000\u0000\u0000"+
		"\u0350\u0351\u0005\\\u0000\u0000\u0351\u0355\u0005!\u0000\u0000\u0352"+
		"\u0354\u0005}\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0354\u0357"+
		"\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356"+
		"\u0001\u0000\u0000\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357\u0355"+
		"\u0001\u0000\u0000\u0000\u0358\u035c\u0005!\u0000\u0000\u0359\u035b\u0005"+
		"}\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035b\u035e\u0001\u0000"+
		"\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000"+
		"\u0000\u0000\u035d\u035f\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000"+
		"\u0000\u0000\u035f\u0360\u0005$\u0000\u0000\u0360\u0361\u0005\\\u0000"+
		"\u0000\u0361\u0362\u0005!\u0000\u0000\u0362\u0363\u0003d2\u0000\u0363"+
		"\u0364\u0005%\u0000\u0000\u0364\u0365\u0005\u001f\u0000\u0000\u0365\u0376"+
		"\u0001\u0000\u0000\u0000\u0366\u0367\u0005\\\u0000\u0000\u0367\u036b\u0005"+
		"!\u0000\u0000\u0368\u036a\u0005}\u0000\u0000\u0369\u0368\u0001\u0000\u0000"+
		"\u0000\u036a\u036d\u0001\u0000\u0000\u0000\u036b\u0369\u0001\u0000\u0000"+
		"\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036e\u0001\u0000\u0000"+
		"\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036e\u0372\u0005;\u0000\u0000"+
		"\u036f\u0371\u0003p8\u0000\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0374"+
		"\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373"+
		"\u0001\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000\u0374\u0372"+
		"\u0001\u0000\u0000\u0000\u0375\u0350\u0001\u0000\u0000\u0000\u0375\u0366"+
		"\u0001\u0000\u0000\u0000\u0376c\u0001\u0000\u0000\u0000\u0377\u037c\u0003"+
		"@ \u0000\u0378\u0379\u0005\u001e\u0000\u0000\u0379\u037b\u0003@ \u0000"+
		"\u037a\u0378\u0001\u0000\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000"+
		"\u037c\u037a\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000"+
		"\u037de\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037f"+
		"\u0381\u0005}\u0000\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0381\u0384"+
		"\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0382\u0383"+
		"\u0001\u0000\u0000\u0000\u0383\u0385\u0001\u0000\u0000\u0000\u0384\u0382"+
		"\u0001\u0000\u0000\u0000\u0385\u0386\u0005;\u0000\u0000\u0386\u0387\u0003"+
		"@ \u0000\u0387\u0388\u0005\u001f\u0000\u0000\u0388\u0397\u0001\u0000\u0000"+
		"\u0000\u0389\u038b\u0005}\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000"+
		"\u038b\u038e\u0001\u0000\u0000\u0000\u038c\u038a\u0001\u0000\u0000\u0000"+
		"\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038f\u0001\u0000\u0000\u0000"+
		"\u038e\u038c\u0001\u0000\u0000\u0000\u038f\u0393\u0005;\u0000\u0000\u0390"+
		"\u0392\u0003p8\u0000\u0391\u0390\u0001\u0000\u0000\u0000\u0392\u0395\u0001"+
		"\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0393\u0394\u0001"+
		"\u0000\u0000\u0000\u0394\u0397\u0001\u0000\u0000\u0000\u0395\u0393\u0001"+
		"\u0000\u0000\u0000\u0396\u0382\u0001\u0000\u0000\u0000\u0396\u038c\u0001"+
		"\u0000\u0000\u0000\u0397g\u0001\u0000\u0000\u0000\u0398\u0399\u0005K\u0000"+
		"\u0000\u0399\u039a\u0005$\u0000\u0000\u039a\u039b\u0003f3\u0000\u039b"+
		"\u039c\u0005\u001f\u0000\u0000\u039c\u039d\u0003@ \u0000\u039d\u039e\u0005"+
		"\u001f\u0000\u0000\u039e\u039f\u0003f3\u0000\u039f\u03a0\u0005%\u0000"+
		"\u0000\u03a0\u03a4\u0005&\u0000\u0000\u03a1\u03a3\u0003\\.\u0000\u03a2"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a6\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5"+
		"\u03a7\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a7"+
		"\u03a8\u0005\'\u0000\u0000\u03a8i\u0001\u0000\u0000\u0000\u03a9\u03aa"+
		"\u0005S\u0000\u0000\u03aa\u03ab\u0003@ \u0000\u03ab\u03ac\u0005\u001f"+
		"\u0000\u0000\u03ack\u0001\u0000\u0000\u0000\u03ad\u03b2\u0003n7\u0000"+
		"\u03ae\u03af\u0007\u0002\u0000\u0000\u03af\u03b1\u0003n7\u0000\u03b0\u03ae"+
		"\u0001\u0000\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000\u0000\u03b2\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3m\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b5\u03c3\u0005"+
		"\u0013\u0000\u0000\u03b6\u03c3\u0005?\u0000\u0000\u03b7\u03c3\u0005>\u0000"+
		"\u0000\u03b8\u03ba\u0005}\u0000\u0000\u03b9\u03b8\u0001\u0000\u0000\u0000"+
		"\u03ba\u03bd\u0001\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000"+
		"\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03c3\u0001\u0000\u0000\u0000"+
		"\u03bd\u03bb\u0001\u0000\u0000\u0000\u03be\u03bf\u0005$\u0000\u0000\u03bf"+
		"\u03c0\u0003@ \u0000\u03c0\u03c1\u0005%\u0000\u0000\u03c1\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c2\u03b5\u0001\u0000\u0000\u0000\u03c2\u03b6\u0001"+
		"\u0000\u0000\u0000\u03c2\u03b7\u0001\u0000\u0000\u0000\u03c2\u03bb\u0001"+
		"\u0000\u0000\u0000\u03c2\u03be\u0001\u0000\u0000\u0000\u03c3o\u0001\u0000"+
		"\u0000\u0000\u03c4\u03db\u0005\u0014\u0000\u0000\u03c5\u03db\u0005\u0015"+
		"\u0000\u0000\u03c6\u03db\u0005}\u0000\u0000\u03c7\u03db\u0005\u0013\u0000"+
		"\u0000\u03c8\u03db\u0005I\u0000\u0000\u03c9\u03db\u0005\u001d\u0000\u0000"+
		"\u03ca\u03cb\u0005(\u0000\u0000\u03cb\u03d5\u0003r9\u0000\u03cc\u03d0"+
		"\u0005\u001e\u0000\u0000\u03cd\u03cf\u0003r9\u0000\u03ce\u03cd\u0001\u0000"+
		"\u0000\u0000\u03cf\u03d2\u0001\u0000\u0000\u0000\u03d0\u03ce\u0001\u0000"+
		"\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d3\u03cc\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d7\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d8\u0001\u0000"+
		"\u0000\u0000\u03d7\u03d5\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005)\u0000"+
		"\u0000\u03d9\u03db\u0001\u0000\u0000\u0000\u03da\u03c4\u0001\u0000\u0000"+
		"\u0000\u03da\u03c5\u0001\u0000\u0000\u0000\u03da\u03c6\u0001\u0000\u0000"+
		"\u0000\u03da\u03c7\u0001\u0000\u0000\u0000\u03da\u03c8\u0001\u0000\u0000"+
		"\u0000\u03da\u03c9\u0001\u0000\u0000\u0000\u03da\u03ca\u0001\u0000\u0000"+
		"\u0000\u03dbq\u0001\u0000\u0000\u0000\u03dc\u03e0\u0005&\u0000\u0000\u03dd"+
		"\u03df\u0005}\u0000\u0000\u03de\u03dd\u0001\u0000\u0000\u0000\u03df\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e1\u03e3\u0001\u0000\u0000\u0000\u03e2\u03e0"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e7\u0005 \u0000\u0000\u03e4\u03e6\u0005"+
		"\u0013\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e9\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001"+
		"\u0000\u0000\u0000\u03e8\u03ea\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001"+
		"\u0000\u0000\u0000\u03ea\u03ee\u0005\u001e\u0000\u0000\u03eb\u03ed\u0005"+
		"}\u0000\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ed\u03f0\u0001\u0000"+
		"\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000"+
		"\u0000\u0000\u03ef\u03f1\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000"+
		"\u0000\u0000\u03f1\u03f2\u0005 \u0000\u0000\u03f2\u03f3\u0005I\u0000\u0000"+
		"\u03f3\u03f7\u0005\u001e\u0000\u0000\u03f4\u03f6\u0005}\u0000\u0000\u03f5"+
		"\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f9\u0001\u0000\u0000\u0000\u03f7"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8"+
		"\u03fa\u0001\u0000\u0000\u0000\u03f9\u03f7\u0001\u0000\u0000\u0000\u03fa"+
		"\u03fb\u0005 \u0000\u0000\u03fb\u03fc\u0005I\u0000\u0000\u03fc\u03fd\u0005"+
		"\'\u0000\u0000\u03fds\u0001\u0000\u0000\u0000ow{\u0082\u0089\u008e\u009c"+
		"\u00aa\u00b6\u00bf\u00c8\u00cf\u00d4\u00db\u00e4\u00ed\u00f0\u00f4\u00f8"+
		"\u0108\u0112\u011b\u011f\u0124\u0128\u0131\u0139\u0145\u014b\u015d\u016b"+
		"\u0186\u0196\u01a0\u01a4\u01a9\u01ae\u01b8\u01d4\u01df\u01ea\u01ee\u01f3"+
		"\u01f6\u01fa\u01ff\u0203\u0209\u020e\u0213\u021e\u0221\u022a\u0232\u023a"+
		"\u0241\u0246\u024c\u0250\u0255\u025c\u0266\u026d\u0276\u027f\u0285\u028b"+
		"\u0292\u0298\u029f\u02a9\u02af\u02b1\u02bb\u02c2\u02c6\u02cb\u02d1\u02d7"+
		"\u02de\u02e3\u02eb\u02fb\u0308\u030f\u031a\u0324\u032d\u033a\u0345\u034e"+
		"\u0355\u035c\u036b\u0372\u0375\u037c\u0382\u038c\u0393\u0396\u03a4\u03b2"+
		"\u03bb\u03c2\u03d0\u03d5\u03da\u03e0\u03e7\u03ee\u03f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}