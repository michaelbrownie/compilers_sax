grammar JavaBlyat;

programma: statement* EOF;

//Statements
statement: if_statement
         | new_variable
         | new_variable_declaration
         | change_variable
         | while_loop
         | print;

//IF statement
if_statement: 'ifblyat' '(' expr=expression ')' statementBlock=statement_block elseif_block* else_block?;
elseif_block: 'elseifblyat' '(' expr=expression ')' statementBlock=statement_block;
else_block: 'elseblyat' statementBlock=statement_block;

//Variables
new_variable: DATATYPES ID IS expr=value_expression SEMICOLON;
new_variable_declaration: DATATYPES ID SEMICOLON;
change_variable: id=ID IS expr=value_expression SEMICOLON;

//While loop
while_loop: 'whileblyat' '(' expression ')' statement_block;

//Print
print: 'consoleblyat.log(' ID ')' SEMICOLON #printId
     | 'consoleblyat.log(' STRING ')' SEMICOLON #printString
     | 'consoleblyat.log(' value_expression ')' SEMICOLON #printString;

statement_block: '{' statement* '}' #statementBlock;

expression: leftExpression=expression (EQUAL | NOTEQUAL) rightExpression=expression #equalExpressions
           | leftExpression=expression (SMALLERTHAN | BIGGERTHAN | SMALLERTHANEQUAL | BIGGERTHANEQUAL) rightExpression=expression #compareExpressions
           | leftExpression=expression (OR | AND) rightExpression=expression #orAndandExpressions
           | NOT rightExpression=expression #notExpression
           | literal #literalExpr;

value_expression: leftExpression=value_expression operator=(PLUS | MIN | KEER | GEDEELD) rightExpression=value_expression #calcValueExpression
  | literal #literalValueExp;

literal: PARENTHESESLEFT (expression | value_expression) PARENTHESESRIGHT #literalExpression
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

DATATYPES: ('stringblyat' | 'intblyat' | 'booleanblyat');

STRING: '"'(~[\\"])*?'"';
INT: [0-9]+;
BOOLEAN: 'trueblyat' | 'falseblyat';
ID: [a-zA-Z] [A-Za-z0-9]*;
WS: [ \t\r\n]+ -> skip;