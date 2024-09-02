grammar BigIntCalc;

program: stat* EOF;

stat: print
    | assigment
    ;

print: 'show' expression ';';

assigment: expression '->' ID ';';

expression: NUMBER                                              #NumberExpr
          | ID                                                  #IdExpr
          | '(' expression ')'                                  #ParenExpr
          | expression op = ( '*' | 'div' ) expression          #MultiDividExpr
          | expression 'mod' expression                         #RestoExpr
          | expression op = ( '+' | '-' ) expression            #MaisMenosExpr
          ;

NUMBER: [0-9]+ ;
ID: [a-zA-Z] [a-zA-Z0-9]*;
COMMENT: '#' .*? '\n' -> skip;
WS: [ \t\r\n]+ ->skip;
ERROR: .;