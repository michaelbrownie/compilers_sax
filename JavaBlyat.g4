grammar JavaBlyat;

programma: STRING;


EQUAL: '==';
NOTEQUAL: '!=';
SMALLERTHAN: '<';
BIGGERTHAN: '>';
SMALLERTHANEQUAL: '<=';
BIGGERTHANEQUAL: '>=';

DATATYPES: ('stringblyat' | 'intblyat' | 'booleanblyat');

STRING: '"'(~[\\"])*?'"';
INT: [0-9]+;
BOOLEAN: 'trueblyat' | 'falseblyat';
ID: [a-zA-Z] [A-Za-z0-9]*;
WS: [ \t\r\n]+ -> skip;