grammar LangComplex;

program: stat* EOF;

stat: display
    | assigment
    ;

display: 'display' expression ';';

assigment: ID '<=' expression ';';

expression: complex_number  #ComplexExpr
          | ID              #IdExpr
          ;

complex_number: COMPLEX (('+' | '-') COMPLEX?)? 'i'?
              | COMPLEX? 'i'
              ;

COMPLEX: [0-9]+ ('.' [0-9]+)?;
ID: [a-z][a-zA-Z-0-9]*;
COMMENT: '*COM*' .*? '\n' -> skip;
WS: [ \t\n\r]+ -> skip;