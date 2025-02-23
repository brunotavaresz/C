grammar Teste;

program: stat* EOF;

stat: print
    | assigment
    ;

print: 'show' expression ';';

assigment: expression '->' ID ';';

expression: ARRAY
          | DECIMAL
          | ID
          ;

ARRAY: '[' [0-9]+ (',' [0-9]+)? ']' ;
DECIMAL: [0-9]+ ('.' [0-9]+)? ;
ID: [a-zA-Z] [a-zA-Z0-9]*;
COMMENT: ''
