grammar JavaBlyat;

programma: STRING;


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