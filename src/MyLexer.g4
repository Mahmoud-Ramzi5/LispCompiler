lexer grammar MyLexer;

LPAREN: '('; // OPEN_PAREN
RPAREN: ')'; // OPEN_PAREN
SQ: '\''; // Single Quote
DQ: '"'; // Double Quote
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
PERC: '%';
COLON: ':';
EQUALS: '=';
NOT_EQUALS: '/=';
LESS_THAN: '<';
LESS_OR_EQUAL_THAN: '<=';
GREATER_THAN: '>';
GREATER_OR_EQUAL_THAN: '>=';

USE: 'use';

WRITE: 'write';
WRITE_LINE: 'write-line';
PRINT: 'print';

DEFPARAMETER: 'defparameter';
DEFCONSTANT: 'defconstant';
DEFMACRO: 'defmacro';
DEFTYPE: 'deftype';
DEFVAR: 'defvar';
DEFUN: 'defun';

SETQ: 'setq';
SETF: 'setf';
SET: 'set';

DEFCLASS: 'defclass';
CLASS: 'class';
CASE: 'case';

IF: 'if';
WHEN: 'when';
UNLESS: 'unless';
COND: 'cond';
LOOP: 'loop';
DO: 'do'; // While Loop
AND: 'and';
OR: 'or';
NOT: 'not';

THROW: 'throw';
CATCH: 'catch';

FORMAT: 'format';
T: 't';
NIL: 'nil';

TYPE: 'type';
TYPE_OF: 'type-of';
DECLAIM: 'declaim';

LET: 'let';
LET_STAR: 'let*';
LAMBDA: 'lambda';

FUNCTION: 'function';

RETURN: 'return';
RETURN_FROM: 'return-from';

DATATYPES:
	'integer'
	| 'float'
	| 'double-float'
	| 'short-float'
	| 'character'
	| 'string'
	| 'symbol'
	| 'list'
	| 'array'
	| 'cons'
	| 'null'
	;

VAR: MULT SYMBOL MULT;
ATOM: (LETTER | NUMBER)+;
SYMBOL: LETTER (LETTER | NUMBER | '-')+;
STRING: DQ ( ~[\\"] | ESCAPE_CHAR)* DQ;
COMMENT: (';' | ';;') ~[\r\n]* -> skip;
MULTIPLE_COMMENT: '#' .*? '#' -> skip;
WS: [ \r\n\t]+ -> skip;

fragment ESCAPE_CHAR: '\\' [0btnfr"'\\];
fragment LETTER: [a-zA-Z];
fragment NUMBER: [0-9];