grammar TextProc;

program: stat* EOF;

stat: print
    | assignment
    ;

print: 'output' (expression) (',' expression)* ';';

assignment: ID '=' expression ';';

expression: STRING                              #StringExpr
          | ID                          #IdExpr
          | WORD                        #WordExpr
          | NUMBER                      #NumberExpr
          | NL                          #NlExpr
          | '(' expression ')'          #ParenExpr
          | expression '|' expression   #PipeExpr
          | '+' expression              #MaisExpr
          | 'replace' expression expression #ReplaceExpr
          | 'grep' expression               #GrepExpr
          ;

STRING: '"' .*? '"';
ID: '$' [a-zA-Z0-9]+;
WORD: [a-zA-Z]+;
NUMBER: [0-9]+;
NL: ( 'nl' | 'nL' | 'NL' | 'Nl' ) ;
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;