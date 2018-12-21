grammar JavaBlyat;

program: statement* EOF;

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
new_variable: DATATYPES ID IS expr=calc_expression SEMICOLON;
new_variable_declaration: DATATYPES ID SEMICOLON;
change_variable: id=ID IS expr=calc_expression SEMICOLON;

//While loop
while_loop: 'whileblyat' '(' expression ')' statement_block;

//Print
print: 'cyka.blyat(' ID ')' SEMICOLON #printId
     | 'cyka.blyat(' STRING ')' SEMICOLON #printString
     | 'cyka.blyat(' calc_expression ')' SEMICOLON #printCalcExpression
     | 'cyka.blyat(' expression ')' SEMICOLON #printExpression;

statement_block: '{' statement* '}' #statementBlock;

expression: leftExpression=expression operator=(EQUAL | NOTEQUAL) rightExpression=expression #equalExpressions
           | leftExpression=expression operator=(SMALLERTHAN | BIGGERTHAN | SMALLERTHANEQUAL | BIGGERTHANEQUAL) rightExpression=expression #compareExpressions
           | leftExpression=expression operator=(OR | AND) rightExpression=expression #orAndandExpressions
           | operator=NOT rightExpression=expression #notExpression
           | literal #literalExpr;

calc_expression: leftExpression=calc_expression operator=(PLUS | MINUS | TIMES | DIVIDE) rightExpression=calc_expression #calcValueExpression
  | literal #literalValueExp;

literal: parenthesesleft=PARENTHESESLEFT (expression | calc_expression) parenthesesright=PARENTHESESRIGHT #literalExpression
 | STRING  #literalString
 | INT     #literalInt
 | BOOLEAN #literalBoolean
 | ID      #literalId;

//Rekenkundige expressies
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDE: '/';

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
COMMENT: '//' ~[\r\n]* -> skip;