grammar FracLang;

program: stat* EOF;

stat: display
    | assigment
    ;

display: 'display' expression ';';

assigment: ID '<=' expression ';';

expression: '+' expression  #ExprUniMais
          | '-' expression  #ExprUniMenos
          | FRACTION        #ExprFrac
          | ID              #ExprId
          | expression '+' expression  #ExprAdd
          | expression '-' expression  #ExprSub
          | expression '*' expression  #ExprMul
          | expression ':' expression  #ExprDiv
          | '(' expression ')'         #ExprParen
          ;

FRACTION: [0-9]+ ('/' [0-9]+)?;
ID: [a-z]+;
COMMENT: '--' .*? '\n' -> skip;
WS: [ \t\n\r]+ -> skip;

