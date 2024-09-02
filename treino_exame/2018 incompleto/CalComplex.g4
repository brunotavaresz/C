grammar CalComplex;

program: stat* EOF;

stat: print
    | assigment
    ;

print: 'output' expression ';';

assigment: expression '=>' ID ';';

expression: COMPLEX                         #ExprComplex
          | ID                              #ExprId
          | '(' expression ')'              #ExprParen
          | '(' '-' expression ')'          #ExprParenMenos
          | expression '*' expression       #ExprMulti
          | expression ':' expression       #ExprDivid
          | expression '+' expression       #ExprMais
          | expression '-' expression       #ExprMenos
          ;

COMPLEX:  [0-9]+ ('+' | '-') [0-9]* 'i'
       |  [0-9]
       |  [0-9]* 'i'
       ;

ID:[a-z][a-zA-Z0-9]*;
COMMENT: '##' .*? '\n' ->skip;
WS: [ \t\n\r]+ ->skip;