grammar AGL;

program: statement* EOF;

statement:
	comment
	| declaration
	| referenceCommand
	| instantiation
	| assignment
	| propertyChange
	| refreshCommand
	| printCommand
	| loop
	| waitCommand
	| closeCommand
	| moveCommand
	| propertyBlock
	| conditional
	| importCommand; // adicionado para xAGL

comment: LINE_COMMENT | BLOCK_COMMENT;

declaration: type ID ('=' expression)?;

instantiation:
	ID ':' type 'with' '{' assignment* '}'						# instantiationWithProperties
	| ID ':' type '=' (BOOL | expression ) ';'	# instantiationWithExpression
	| ID ':' type 'at' (point | ID) 'with' '{' assignment* '}'	# instantiationAtPoint;

referenceCommand:
    type 'at' (point | ID) 'with' '{' assignment* '}' // Adicionado o ponto e o ponto e vírgula no final
;


assignment: ID '=' (expression | waitCommand) ';';

propertyChange: ID '.' ID '=' expression ';';

loop:
	'for' ID 'in' (ID | INT) '..' (ID | INT) 'do' '{' (
		statement
		| propertyBlock
	)* '}';

propertyBlock: 'with' ID 'do' '{' assignment* '}';

waitCommand: 'wait' 'mouse' 'click';

closeCommand: 'close' ID ';';

refreshCommand: 'refresh' ID ('after' time)? ';';

printCommand: 'print' (STRING | ID) ';';

moveCommand: 'move' ID 'by' vector ';';

conditional: ifBlock (elseBlock)?;

ifBlock:
	'if' (expression | ID) '==' (expression | ID) 'do' statement+;

elseBlock: 'else' 'do' statement+ 'end';

importCommand: 'import' STRING ';'; // adicionado para xAGL

type:
	view
	| 'Line'
	| 'Rectangle'
	| 'Ellipse'
	| 'Text'
	| 'Arc'
	| 'ArcChord'
	| 'PieSlice'
	| 'Integer'
	| 'Number'
	| 'String'
	| 'Point'
	| 'Vector'
	| 'Dot'
	| 'Time'
	| 'PolyLine'
	| 'Spline'
	| 'Polygon'
	| 'Blob'
	| 'Boolean';

view: 'View';

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
	); // Modified to include negative numbers

point: '(' (expression | ID) ',' (expression | ID) ')';
BOOL: 'true' | 'false';
vector: point | ID;

time: INT ('ms' | 's');

// Lexical rules

ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' .*? '"';

LINE_COMMENT: '#' ~[\r\n]* -> skip;
BLOCK_COMMENT: '#(' .*? '#)' -> skip;
WS: [ \t\r\n]+ -> skip;