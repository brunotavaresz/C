grammar StrLang;

program: stat* EOF
        ;

stat: assignment
    | print
    ;

assignment: ID ':' expr
          ;

print: 'print' expr
        ;

expr: STRING                              #ExprString
    | ID                                  #ExprID
    | '(' expr ')'                        #ExprParent
    | 'input''(' expr ')'                 #ExprInput
    | expr '+' expr                  #ExprConcat
    | expr '-' expr                  #ExprRemov
    | 'trim' expr                         #ExprTrim
    | expr '/' expr '/' expr              #ExprSub
    ;


ID: [a-zA-Z0-9]+;
STRING: '"' (~["\r\n])* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;