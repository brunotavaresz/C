grammar Complexos;

program: stat* EOF;

stat: print
     |assigment
     ;

print: 'output' expression ';';

assigment: expression '=>' ID ';';

expression: COMPLEX                         #ComplexExpr
          | ID                              #IdExpr
          | NUMBER                          #NumberExpr
          | STRING                          #StringExpr
          | '(' expression ')'              #ParenExpr
          | '-' expression                  #UniMenosExpr
          | expression '*' expression       #MultiExpr
          | expression ':' expression       #DividExpr
          | expression '+' expression       #MaisExpr
          | expression '-' expression       #MenosExpr
          | 'input' expression              #InputExpr
          ;

COMPLEX: NUMBER? ('+'|'-')? NUMBER? 'i' ;
NUMBER: [0-9]+ ;
ID: [a-zA-Z] [a-zA-Z0-9]*;
STRING: '"' .*? '"';
COMMENT: '#' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;
ERROR: .;