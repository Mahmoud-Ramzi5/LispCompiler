lexer grammar MyLexer;

T: 't';
WRITE: 'write';
WRITE_LINE: 'write-line';
PRINT: 'print';
DEFVAR: 'defvar';
SETQ: 'setq';
TYPE: 'type';
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

LPAR : '('; // OPEN_PAREN
RPAR : ')'; // OPEN_PAREN
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
PERC : '%';

EQUALS : '=';
NOT_EQUALS : '/=';
LESS_THAN : '<';
LESS_OR_EQUAL_THAN : '<=';
GREATER_THAN : '>';
GREATER_OR_EQUAL_THAN : '>=';

ATOM : (LETTER | NUMBER)+? | '\''(LETTER | NUMBER)+? ;
SYMBOL : LETTER(LETTER | NUMBER)?;
STRING : '"' .*? '"' ;
COMMENT : ';' ~[\r\n]* -> skip;
MULTIPLE_COMMENT : '||#' .*? '#||' -> skip;
IF_CONDITION : LPAR IF (SYMBOL|CONDITIONAL_EQUATION) (LIST)* RPAR;
DEFINE_FUNCTION : LPAR DEFUN SYMBOL '(' (SYMBOL)* ')' (LIST)* RPAR;
EQUATION: LPAR (PLUS|MINUS|MULT|DIV|PERC)' '(NUMBER|SYMBOL|EQUATION)' '((NUMBER|SYMBOL|EQUATION)' ')+ RPAR;
CONDITIONAL_EQUATION: LPAR (EQUALS|NOT_EQUALS|GREATER_THAN|GREATER_OR_EQUAL_THAN|LESS_THAN|LESS_OR_EQUAL_THAN)' '(NUMBER|SYMBOL|EQUATION|CONDITIONAL_EQUATION)' '((NUMBER|SYMBOL|EQUATION|CONDITIONAL_EQUATION)' ')+ RPAR;
LIST : LPAR (LIST|ATOM|SYMBOL|STRING|EQUATION)* RPAR;
WS : [ \r\n\t]+ -> skip;

//BLOCK : '(' 'block' SYMBOL '(' (LIST)* RESERVED SYMBOL NUMBER ')';

fragment LETTER : [a-zA-Z] ;
fragment NUMBER : [0-9];
