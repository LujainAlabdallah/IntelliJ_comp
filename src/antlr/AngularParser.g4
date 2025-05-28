
parser grammar AngularParser;


options { tokenVocab=AngularLexer; }


// Define parser rules for the Angular component code
program: all* |EOF;


importStatements:IMPORT LEFT_BRACE IDENTIFIER* (COMMA IDENTIFIER*)* RIGHT_BRACE FROM STRING SEMICOLON ;
service: INJECTABLE LEFT_PAREN LEFT_BRACE IDENTIFIER* COLON STRING RIGHT_BRACE RIGHT_PAREN ;
componentDeclaration:COMPONENT LEFT_PAREN LEFT_BRACE component_metadata*  RIGHT_BRACE RIGHT_PAREN ;
component_metadata:  SELECTOR COLON STRING COMMA* #SELECTOR1
                        | STANDALONE COLON BOOLEAN COMMA* #STANDLONE
                        | IMPORTS COLON LEFT_BRACKET  IDENTIFIER* (COMMA IDENTIFIER*)* RIGHT_BRACKET COMMA*#IMPORTS
                        | TEMPLATEURL COLON html COMMA *#TEMPLATEURL
                        | STYLEURL COLON style COMMA *#STYLEURL
                        ;
html:
STRING
|htmlDocument;
style:
stylesheet
|STRING;
all:service  #SERVICE1
    |class #CLASS1
    |componentDeclaration # COMPONENTDECLARATION1
    |importStatements #IMPORTSTATEMENT1
    |assignment #ASSIGMENT1
    |functionCall #FUNCTIONCALL1
    | methodCall #METHODCALL1
    | loopStatement #LOOPSTATEMENT1
    | returnStatement #RETURNSTATEMENT1
    |print #PRINT1
    |constructor #CONSTRUCTOR1
    |method #METHOD1
    |any_type #AnyType1
    | vif #VIF1
    ;
vif:IF_CONDITION LEFT_PAREN expression RIGHT_PAREN LEFT_BRACE statement* RIGHT_BRACE (ELSE_CONDITION LEFT_BRACE statement* RIGHT_BRACE)?;
htmlDocument
    : element*|EOF
    ;
element
    : divElement #DIVELEMENT1
    | headerElement #HEADERELEMENT1
    | componentElement #COMPONENTELEMENT1
    | imageElement #IMAGEELEMENT1
    | buttonElement #BUTTONELEMENT1
    | paragraphElement #PARAGRAPHELEMENT1
    | ngForElement #NGFORELEMENT1
    ;
divElement
    : LESS_THAN DIV div element*  SLASH_LESS_THAN DIV GREATER_THAN COMMA;
div: attributes ( elementContent* GREATER_THAN  )
   | GREATER_THAN  ;
headerElement
    : LESS_THAN H1 GREATER_THAN interpolation SLASH_LESS_THAN H1 GREATER_THAN
    ;
imageElement
    : LESS_THAN IMG image
    ;
image:attributes SLASH_GREATER_THAN | SLASH_GREATER_THAN;
buttonElement
    :LESS_THAN BUTTON button STRING SLASH_GREATER_THAN BUTTON GREATER_THAN
    ;
    button:attributes GREATER_THAN | GREATER_THAN;
paragraphElement
    : LESS_THAN P GREATER_THAN  interpolation SLASH_LESS_THAN P GREATER_THAN
    ;
 ngForElement
     :LESS_THAN DIV  MULTIPLY  NGFOR ASSIGN STRING GREATER_THAN elementContent SLASH_LESS_THAN DIV GREATER_THAN
     ;
componentElement
    : LESS_THAN OPEN_APP IDENTIFIER* compElement
    | LESS_THAN DIV MULTIPLY NGFOR ASSIGN STRING GREATER_THAN elementContent SLASH_LESS_THAN DIV GREATER_THAN
    ;
    compElement:attributes GREATER_THAN | GREATER_THAN CLOSE_APP IDENTIFIER* GREATER_THAN;
elementContent
    : IDENTIFIER #IDENTIFIER1
    | STRING #STRING
    | interpolation #INTERPOLATION1
    ;
attributes
    : (attribute)*
    ;
attribute
    : classAttribute #CLASSATTRIBUTE1
    | srcAttribute #SCRATTRIBUTE1
    | altAttribute #ALTATTRIBUTE1
    | styleAttribute #STYLEATTRIBUTE1
    | clickAttribute #CLICKATTRIBUTE1
    | propertyBinding #PROPERTYBINDING1
    | eventBinding #EVENTBINDING1
    ;
classAttribute
    : CLASS_KEYWORD ASSIGN STRING
    ;
srcAttribute
    : SRC ASSIGN STRING
    ;
altAttribute
    : ALT ASSIGN STRING
    ;
styleAttribute
    : STYLE ASSIGN STRING
    ;
clickAttribute
    : LEFT_PAREN CLICK RIGHT_PAREN ASSIGN STRING
    ;
propertyBinding
    : LEFT_BRACKET IDENTIFIER* RIGHT_BRACKET ASSIGN STRING
    ;
eventBinding
    : LEFT_PAREN IDENTIFIER* RIGHT_PAREN ASSIGN STRING
    ;


    /////////////

expression:
 |IDENTIFIER* (LOGICAL_NOT_PERIOD? IDENTIFIER*)? (NULLCOALESCE STRING)?
 |IDENTIFIER* (LOGICAL_NOT? PERIOD IDENTIFIER*)* (NULLCOALESCE expression)?
 |STRING
 |BOOLEAN
 |NULL
 |term
 |term((PLUS|MINUS)term)*
;
interpolation
    : DL expression DR
    ;

stylesheet: rule*;

// CSS rule
rule: selector LEFT_BRACE declaration* RIGHT_BRACE;

// Selector
selector: IDENTIFIER* (COMMA IDENTIFIER*)*;

// Declaration



declaration: IDENTIFIER* MINUS? IDENTIFIER*  COLON any_type* SEMICOLON;
class:  EXPORT CLASS_KEYWORD IDENTIFIER* LEFT_BRACE classMember* RIGHT_BRACE;
//classBody: classMember* #CLASSMEMBER1
        // | classmem  #CLASSMEM1
         //;
classmem:(VARIABLE IDENTIFIER* (ASSIGN|COLON) (any_type) SEMICOLON)*
 (FUNCTION_KEYWORD* IDENTIFIER* LEFT_PAREN (VARIABLE* IDENTIFIER* COLON any_type)* RIGHT_PAREN LEFT_BRACE function_body RIGHT_BRACE)*;




////////////////////////////

function_body: ( methodCall
               | assignment
               | statement
               )*;

classMember: inputProperty #INPUTPROPERTY1
           | outputProperty #OUTPUTPROPRTY1
           | method         #METHOD2
           |loopStatement  #LOOPSTATEMENT2
           |vif             #VIF2
           |constructor     #CONSTRUCTOR2
           ;
 constructor: CONSTRUCTOR LEFT_PAREN IDENTIFIER* COLON? IDENTIFIER* (COMMA*IDENTIFIER* COLON IDENTIFIER*)* RIGHT_PAREN LEFT_BRACE methodCall* RIGHT_BRACE ;
inputProperty: INPUT LEFT_PAREN LEFT_BRACE  REQUIRED COLON BOOLEAN RIGHT_BRACE RIGHT_PAREN IDENTIFIER* COLON ANY SEMICOLON;
outputProperty: OUTPUT LEFT_PAREN RIGHT_PAREN  IDENTIFIER* COLON IDENTIFIER* LESS_THAN ANY GREATER_THAN ASSIGN NEW IDENTIFIER* LEFT_PAREN RIGHT_PAREN SEMICOLON;

method: IDENTIFIER* LEFT_PAREN RIGHT_PAREN LEFT_BRACE statement* RIGHT_BRACE ;
statement: functionCall #FUNCTIONCALL2
         | methodCall  #METHODCALL2
         | assignment  #ASSIGMENT2
         | vif          #VIF3
         | loopStatement #LOOPSTATEMENT3
         | returnStatement #RETURNSTATEMENT2
         |any_type      #ANYTYPE2
         |print        # PRINT2
         ;
print: CONSOLE_LOG LEFT_PAREN STRING RIGHT_PAREN SEMICOLON ;

functionCall:
IDENTIFIER* LEFT_PAREN arguments
|any_type RIGHT_PAREN SEMICOLON;
methodCall: THIS_KEYWORD PERIOD IDENTIFIER* PERIOD IDENTIFIER* LEFT_PAREN THIS_KEYWORD PERIOD arguments RIGHT_PAREN SEMICOLON| THIS_KEYWORD PERIOD IDENTIFIER* ASSIGN any_type*;
arguments: expression (COMMA expression)* ;
assignment: IDENTIFIER* ASSIGN expression SEMICOLON
|IDENTIFIER* ASSIGN any_type*
;

loopStatement: FOR_LOOP LEFT_PAREN assignment SEMICOLON expression SEMICOLON assignment RIGHT_PAREN LEFT_BRACE statement* RIGHT_BRACE ;
returnStatement: RETURN_KEYWORD expression SEMICOLON ;



term: factor ((MULTIPLY|DIVIDE) factor)*;
factor: NUMBER #NUMBER
| BOOLEAN #BOOLEAN
| NULL #NULL
| IDENTIFIER * #IDENTIFIER
| LEFT_PAREN expression RIGHT_PAREN #EXPRESSION1
;
// Any type






any_type: LENGTH
| COLOR
|IDENTIFIER
| NUMBER
| STRING
|ANY
| LEFT_BRACKET product (COMMA product*)* RIGHT_BRACKET
;
product: LEFT_BRACE IDENTIFIER* COLON NUMBER* COMMA IDENTIFIER* COLON STRING COMMA IDENTIFIER* COLON STRING RIGHT_BRACE;




