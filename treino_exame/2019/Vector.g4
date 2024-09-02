grammar Vector;

program: stat* EOF;

stat: print
    | assigment
    ;

print: 'show' expression';';

assigment: expression '->' ID';';

expression: ARRAY                             #ExprArray
          | ID                                #ExprId
          | NUMBER                            #ExprNumber
          | expression '*' expression         #ExprMulti
          | expression '.' expression         #ExprDivid
          | expression '+' expression         #ExprAdd
          | expression '-' expression         #ExprSub
          | '+' expression                    #ExprUniAdd
          | '-' expression                    #ExprUniSub
          | '(' expression ')'                #ExprParen
          ;


NUMBER: [0-9] (('.' [0-9])+)?; 

ARRAY: '[' NUMBER (',' NUMBER)* ']'; 

ID: [a-z][a-z0-9]*;

COMMENT: '#' .*? '\n' -> skip;
WS: [ \t\n\r]+ -> skip;
