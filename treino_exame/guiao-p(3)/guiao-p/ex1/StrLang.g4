grammar StrLang;

program: stat* EOF;

stat: print
    | assigment
    ;

print: 'print' expression;

assigment: ID ':' expression;

expression: STRING                                          #ExprString
         |  ID                                              #ExprId
         |  '(' expression ')'                              #ExprParen
         |  'input' '(' expression ')'                      #ExprInput
         |  expression '+' expression                       #ExprMais
         |  expression '-' expression                       #ExprMenos
         |  'trim' expression                               #ExprTrim
         |  expression '/' expression '/' expression        #ExprConca
         ;

STRING: '"' .*? '"';
ID: [a-z][a-zA-Z0-9]*;
COMMENT: '//' .*? '\n' -> skip;
WS: [ \t\r\n]+ ->skip;