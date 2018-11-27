grammar JavaBlyat;

programma: function* statement* function*;

//Statements
statement: if_statement
         | new_variable
         | new_variable_declaration
         | change_variable
         | while_loop
         | print
         | call_function;

//IF statement
if_statement: 'ifblyat' '(' expr=expression ')' statementBlock=statement_block elseif_block* else_block?;
elseif_block: 'elseifblyat' '(' expr=expression ')' statementBlock=statement_block;
else_block: 'elseblyat' statementBlock=statement_block;

//Variables
new_variable: DATATYPES ID IS expr=calc_expression SEMICOLON;
new_variable_declaration: DATATYPES ID SEMICOLON;
change_variable: id=ID IS expr=calc_expression SEMICOLON;

//While loop
while_loop: 'whileblyat' '(' expression ')' statement_block;

//Print
print: 'cyka.blyat(' ID ')' SEMICOLON #printId
     | 'cyka.blyat(' STRING ')' SEMICOLON #printString
     | 'cyka.blyat(' calc_expression ')' SEMICOLON #printCalcExpression;

//Make functions
function: DATATYPES 'functionblyat' ID PARENTHESESLEFT function_argument? PARENTHESESRIGHT function_statement_block;
function_argument: (DATATYPES function_argument_types ',')* DATATYPES function_argument_types;
function_argument_types: STRING | INT | BOOLEAN | ID;
function_statement_block: '{' statement* (RETURN ID SEMICOLON)? '}';

//Call functions
call_function: ID PARENTHESESLEFT call_function_argument? PARENTHESESRIGHT SEMICOLON;
call_function_argument: (function_argument_types ',')* function_argument_types;

statement_block: '{' statement* '}' #statementBlock;

expression: leftExpression=expression (EQUAL | NOTEQUAL) rightExpression=expression #equalExpressions
           | leftExpression=expression (SMALLERTHAN | BIGGERTHAN | SMALLERTHANEQUAL | BIGGERTHANEQUAL) rightExpression=expression #compareExpressions
           | leftExpression=expression (OR | AND) rightExpression=expression #orAndandExpressions
           | NOT rightExpression=expression #notExpression
           | literal #literalExpr;

calc_expression: leftExpression=calc_expression operator=(PLUS | MIN | KEER | GEDEELD) rightExpression=calc_expression #calcValueExpression
  | literal #literalValueExp;

literal: PARENTHESESLEFT (expression | calc_expression) PARENTHESESRIGHT #literalExpression
 | STRING  #literalString
 | INT     #literalInt
 | BOOLEAN #literalBoolean
 | ID      #literalId;

//Rekenkundige expressies
PLUS: '+';
MIN: '-';
KEER: '*';
GEDEELD: '/';

//Logische expressies
EQUAL: '==';
NOTEQUAL: '!=';
SMALLERTHAN: '<';
BIGGERTHAN: '>';
SMALLERTHANEQUAL: '<=';
BIGGERTHANEQUAL: '>=';
OR: '||';
AND: '&&';
NOT: '!';

//Overig
PARENTHESESLEFT: '(';
PARENTHESESRIGHT: ')';
RETURN: 'returnblyat';
SEMICOLON: ';';
IS: '=';

DATATYPES: ('stringblyat' | 'intblyat' | 'booleanblyat' | 'voidblyat');

STRING: '"'(~[\\"])*?'"';
INT: [0-9]+;
BOOLEAN: 'trueblyat' | 'falseblyat';
ID: [a-zA-Z] [A-Za-z0-9]*;
WS: [ \t\r\n]+ -> skip;