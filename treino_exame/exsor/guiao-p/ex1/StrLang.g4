grammar StrLang;

program: stat* EOF;

stat: print
    | assigment;

print: 'print' expression;

assigment: ID ':' expression;

expression: STRING                                      #StringExpr
         |  ID                                          #IdExpr
         |  '(' expression ')'                          #ParenExpr
         |  'input''(' expression ')'                   #InputExpr
         |  expression '+' expression                   #AddExpr
         |  expression '-' expression                   #SubExpr
         |  'trim' expression                           #TrimExpr
         |  expression '/' expression '/' expression    #SubstitureExpr
         ;

ID: [a-zA-Z0-9]+;
STRING: '"' .*? '"';
COMMENT: '//' .*? '\n' ->skip;
WS: [ \t\r\n]+ -> skip;




