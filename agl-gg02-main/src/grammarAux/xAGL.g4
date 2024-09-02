grammar xAGL;

program: statement+ ;

statement:
    moveCommand
    | refreshCommand
    | assignment
    | loop
    ;

assignment: ID '.' ID '=' expression ';';

loop: 'for' ID 'in' INT '..' INT 'do' '{' statement* '}' ;

refreshCommand: 'refresh' ID ('after' time)? ';';

moveCommand: 'move' ID 'by' vector ';';

waitCommand: 'wait' 'mouse' 'click';

propertyBlock: 'with' ID 'do' '{' assignment* '}' ;

expression:
    '-'? (
        INT
        | BOOL
        | FLOAT
        | STRING
        | point
        | vector
        | time
        | ID
        | waitCommand
    );

point: '(' expression ',' expression ')' ;
BOOL: 'true' | 'false' ;
vector: point | ID ;

time: INT ('ms' | 's') ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;
INT: [0-9]+ ;
FLOAT: [0-9]+ '.' [0-9]+ ;
STRING: '"' .*? '"' ;

LINE_COMMENT: '#' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '#(' .*? '#)' -> skip ;
WS: [ \t\r\n]+ -> skip ;
