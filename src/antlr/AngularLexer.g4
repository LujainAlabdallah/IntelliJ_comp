

lexer grammar AngularLexer;

SLASH_GREATER_THAN:'/>';
SLASH_LESS_THAN:'</';
DL:'{{';
DR:'}}';
OPEN_APP: 'app-';
CLOSE_APP: '</app-';
NGFOR: 'ngFor';
H1:'h1';
IMG:'img';
BUTTON:'button';
P:'p';
SRC:'src';
ALT :'alt';
STYLE:'style';
CLICK:'click';
SHOW_DETAILS:'show details';
INJECTABLE:'@Injectable' ;
CONSTRUCTOR:'constructor';
NUMBER: [0-9]+('.'[0-9]+)?;
LENGTH: [0-9]+ (('px' | 'em' | 'rem' | '%'))?;
COLOR: '#' [0-9a-fA-F]{3,6} | 'rgb' '(' NUMBER ',' NUMBER ',' NUMBER ')' | 'rgba''(' NUMBER ',' NUMBER ',' NUMBER ',' FLOAT ')';
DIV:'div';
NEW:'new';
GREATER_THAN: '>';
LESS_THAN: '<';
REQUIRED:'required';
INPUT: '@Input';
OUTPUT: '@Output';
ANY:'any';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';
PERIOD: '.';
QUESTION_MARK:'?';
HASH_TAG:'#';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';

CONSTANT: 'const';
VARIABLE: 'let' | 'var';
IMPORT: 'import';
EXPORT: 'export';

ARRAY_LITarayERAL: LEFT_BRACKET (  IDENTIFIER | NUMBER | STRING (COMMA IDENTIFIER | NUMBER | STRING)*)* RIGHT_BRACKET;
// Other common Angular keywords
NG_MODULE: 'NgModule';
COMPONENT: '@Component';
DIRECTIVE: 'Directive';
PIPE: 'Pipe';
SERVICE: 'Service';
PROVIDER: 'Provider';
ROUTER: 'Router';
SELECTOR:'selector';
IMPORTS:'imports';
TEMPLATEURL:'templateUrl';
STYLEURL:'styleUrl';
STANDALONE:'standalone';

ASSIGN: '=';

// Define other lexer rules for identifiers, numbers, etc.


INTEGER: '0' | [1-9][0-9];
FLOAT: [0-9]+ '.'[0-9]+;
NULL:'null';
BOOLEAN:'true'|'false';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';

// Skip whitespaces and comments
WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '/' .? '/' -> skip;
SingleLineComment: '//'~[\r\n\u2028\u2029] -> channel(HIDDEN);
NEWLINE: '\r'? '\n' | '\r';


STRING: '"' (~["])* '"' | '\'' (~['])* '\'' ;



// Catch-all rule for any characters not matched
OTHER: . -> skip;

// Define lexer rules for reserved words related to loops and control flow

FOR_LOOP: 'for';
WHILE_LOOP: 'while';
IF_CONDITION: 'if';
ELSE_CONDITION: 'else';
SWITCH_CASE: 'switch';
CASE_CONDITION: 'case';
BREAK_KEYWORD: 'break';
CONTINUE_KEYWORD: 'continue';

// Other common control flow keywords
RETURN_KEYWORD: 'return';

// Define lexer rules for reserved words related to classes and OOP

CLASS_KEYWORD: 'class';
EXTENDS_KEYWORD: 'extends';
IMPLEMENTS_KEYWORD: 'implements';

PUBLIC_ACCESS: 'public';
PRIVATE_ACCESS: 'private';
PROTECTED_ACCESS: 'protected';
STATIC_KEYWORD: 'static';
SUPER_KEYWORD: 'super';
THIS_KEYWORD: 'this';
FROM: 'from';
// Other common OOP keywords
GETTER_KEYWORD: 'get';
SETTER_KEYWORD: 'set';

// Define lexer rules for print commands

CONSOLE_LOG: 'console.log';
PRINT_FUNCTION: 'print';
CUSTOM_PRINT_FUNCTION: 'myCustomPrintFunction';

// Define lexer rules for functions
FUNCTION_KEYWORD: 'function';
ARROW_FUNCTION: '=>';
ASYNC_KEYWORD: 'async';

// Define lexer rules for comparison operations

EQUALS: '==';
NOT_EQUALS: '!=';

GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';

// Define lexer rules for mathematical operations


// Define lexer rules for logical operations

LOGICAL_AND: '&&';
LOGICAL_OR: '|';
LOGICAL_NOT: '!';
LOGICAL_NOT_PERIOD:'!.';

// Define lexer rules for assignment, increment, and decrement operations

PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
INCREMENT: '++';
DECREMENT: '--';
MULTIPLY_ASSIGN: '*=';
DIVIDE_ASSIGN: '/=';
MODULUS_ASSIGN: '%=';
POWER_ASSIGN: '**=';
RIGHT_SHIFT_ARITHMETIC_ASSIGN: '>>=';
LEFT_SHIFT_ARITHMETIC_ASSIGN: '<<=';
RIGHT_SHIFT_LOGICAL_ASSIGN: '>>>=';
BIT_AND_ASSIGN: '&=';
BIT_XOR_ASSIGN: '^=';
BIT_OR_ASSIGN: '|=';
NULLCOALESCE: '??';
IDENTIFIER: [A-Za-z]+ ;

