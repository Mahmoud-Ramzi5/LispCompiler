lexer grammar MyLexer;

DATATYPES : 'integer'|'float'|'double-float'|'short-float'|'character'|'string'|'symbol'|'list'|'array'|'cons'|'null';

T: 't';
USE : 'use';
WRITE: 'write';
WRITE_LINE: 'write-line';
PRINT: 'print';
DEFVAR: 'defvar';
SETQ: 'setq';
TYPE: 'type';
SPECIAL: 'special';
INLINE: 'inline';
TYPE_OF: 'type-of';
DEFUN: 'defun';
IF: 'if';
COND: 'cond';
LOOP: 'loop';
AND: 'and';
OR: 'or';
NOT: 'not';
CLASS: 'class';
CASE: 'case';
DO: 'do';
THROW: 'throw';
CATCH: 'catch';
BLOCK: 'block';
IMPORT_FROM : 'import_from';
IMPORT: 'import';
EXPORT: 'export';
LAMBDA: 'lambda';
NIL: 'nil';
LET: 'let';
LET_STAR: 'let*';
UNLESS: 'unless';
WHEN: 'when';
GO: 'go';
DECLARE: 'declare';
FUNCTION: 'function';
FORMAT: 'format';
RETURN: 'return';
RETURN_FROM: 'return-from';
DEFMACRO: 'defmacro';
DEFCLASS: 'defclass';
DEFMETHOD: 'defmethod';
DEFSTRUCT: 'defstruct';
DEFGENERIC: 'defgeneric';
DEFCONSTANT: 'defconstant';
DEFPARAMETER: 'defparameter';

DEFPACKAGE: 'defpackage';
IN_PACKAGE: 'in-package';
USE_PACKAGE: 'use-package';

VALUES: 'values';
PROGN: 'progn';

MAKE_INSTANCE: 'make-instance';
INITIALIZE_INSTANCE: 'initialize-instance';
SLOT_VALUE: 'slot-value';
WITH_SLOTS: 'with-slots';
WITH_ACCESSORS: 'with-accessors';

RESTART_CASE: 'restart-case';
HANDLER_CASE: 'handler-case';
RESTART_BIND: 'restart-bind';
HANDLER_BIND: 'handler-bind';

LETF: 'letf';
LETREC: 'letrec';
TAGBODY: 'tagbody';

DECLAIM: 'declaim';
DEFTYPE: 'deftype';

WITH_OPEN_FILE: 'with-open-file';
WITH_OUTPUT_TO_FILE: 'with-output-to-file';
WITH_INPUT_FROM_STRING: 'with-input-from-string';
WITH_OUTPUT_TO_STRING: 'with-output-to-string';

WITH_STREAM: 'with-stream';
WITH_TIMEOUT: 'with-timeout';

SHADOW : 'shadow';
NICKNAMES : 'nicknames';
DOCUMENTATION : 'documentation';

LPAREN : '('; // OPEN_PAREN
RPAREN : ')'; // OPEN_PAREN
SQ : '\'';  // Single Quote
DQ : '"';  // Double Quote
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
PERC : '%';

COLON : ':';

EQUALS : '=';
NOT_EQUALS : '/=';
LESS_THAN : '<';
LESS_OR_EQUAL_THAN : '<=';
GREATER_THAN : '>';
GREATER_OR_EQUAL_THAN : '>=';

VAR : MULT SYMBOL MULT;
ATOM : (LETTER | NUMBER)+;
SYMBOL : LETTER(LETTER | NUMBER | '-')+;
STRING: DQ ( ~[\\"] | ESCAPE_CHAR )* DQ;

INT : NUMBER+;

COMMENT : (';' | ';;') ~[\r\n]* -> skip;
MULTIPLE_COMMENT : '||#' .*? '#||' -> skip;
WS : [ \r\n\t]+ -> skip;

fragment ESCAPE_CHAR: '\\' [0btnfr"'\\];
fragment LETTER : [a-zA-Z];
fragment NUMBER : [0-9];
