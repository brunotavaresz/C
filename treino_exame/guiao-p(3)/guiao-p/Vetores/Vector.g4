grammar Vector;

program: stat* EOF;

stat: print
    | assigment
    ;

print: 'show' expression ';';

assigment: expression '->' ID ';';

expression: ARRAY                               #ExprArray
          | ID                                  #ExprId
          | NUMBER                              #ExprNumber
          | '(' expression ')'                  #ExprParen
          | '+' expression                      #ExprUniMais
          | '-' expression                      #ExprUniMenos
          | expression '*' expression           #ExprMulti
          | expression '.' expression           #ExprDivid
          | expression '+' expression           #ExprMais
          | expression '-' expression           #ExprMenos
          ;

ARRAY: '[' [0-9]+ (',' [0-9]+)* ']';
ID: [a-z][a-z0-9]*;
NUMBER: [0-9]+ ('.' [0-9]+)*;
COMMENT: '#' .*? '\n' -> skip;
WS: [ \t\n\r]+ -> skip;