grammar FracLang;

program : stat* EOF;

stat: display
    | assignment;

display: 'display' expression ';';
assignment: ID '<=' expression ';';

expression: op = ('+' | '-') expression                 # UnaryExpression
          | expression op = ('*' | ':') expression      # MultiplicativeExpression
          | expression op = ('+' | '-') expression      # AdditiveExpression
          | '(' expression ')'                          # ParenthesizedExpression
          | FRACTION                                    # FractionExpression
          | ID                                          # IdentifierExpression
          ;

ID: [a-z]+;
FRACTION: [0-9]+ ('/' [0-9]+)?;
STRING: '"' .*? '"';
WS: [ \t\n\r]+ -> skip;
COMMENT: '--' .*? '\n' -> skip;
