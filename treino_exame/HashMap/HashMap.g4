grammar HashMap;

program: stat* EOF;

stat: assignment
    | print
    | mapInsert
    ;

assignment: ID ':' expression ';';

print: 'print' expression ';';

mapInsert: ID '[' expression ']' ':' expression ';';

expression: mapLiteral                      #ExprMapLiteral
          | STRING                          #ExprString
          | ID                              #ExprID
          | expression '[' expression ']'   #ExprMapAcess
          ;


mapLiteral: '{' STRING ':' STRING (',' STRING ':' STRING)* '}';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' .*? '"';
COMMENT: '//' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;

