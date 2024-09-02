grammar Hello; 
main : conversation* EOF;
conversation : greetings | bye ;
greetings: 'hello' ID;
ID: [a-zA-Z]+; 
bye : 'bye' ID+ ;
WS: [ \t\r\n]+ -> skip; 