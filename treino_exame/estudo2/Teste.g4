grammar Teste;

program: stat* EOF;

stat: print
    | assigment
    ;

print: 'show' expression ';';

assigment: expression '->' ID ';';

expression: ARRAY                           #ArrayExpr
          | DECIMAL                         #DecimalExpr
          | ID                              #IdExpr
          | '(' expression ')'              #ParenExpr
          | expression '*' expression       #MultiExpr
          | expression '.' expression       #InternoExpr
          | '+' expression                  #UniMaisExpr
          | '-' expression                  #UniMenosExpr
          | expression '+' expression       #MaisExpr
          | expression '-' expression       #MenosExpr
          ;

ARRAY: '[' [0-9]+ (',' [0-9]+)* ']' ;

DECIMAL: [0-9]+ ('.' [0-9]+)? ;

ID: [a-zA-Z] [a-zA-Z0-9]*;

COMMENT: '#' .*? '\n' ->skip;
WS: [ \t\r\n]+ -> skip;
ERROR: .;
