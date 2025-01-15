parser grammar MyParser;

options {
	tokenVocab = MyLexer;
}

prog: lists? EOF;
lists: list+;
list:
	LPAREN (
		list
		| equation
		| conditional_equation
		| print_block
		| write_block
		| write_line_block
		| defparameter_block
		| defconstant_block
		| defmacro_block
		| deftype_block
		| defvar_block
		| define_function
		| setq_block
		| defclass_block
		| class_block
		| case_block
		| if_condition
		| when_block
		| unless_block
		| cond_block
		| loop_block
		| do_block
		| and_block
		| or_block
		| not_block
		| throw_block
		| catch_block
		| format_block
		| type_block
		| type_of_block
		| declaim_block
		| let_block
		| let_star_block
		| lambda_block
		| function_block
		| return_block
		| return_from_block
		| literal
		| STRING
		| SYMBOL
		| ATOM
		| VAR
	)* RPAREN;

equation: (PLUS | MINUS | MULT | DIV | PERC) (
		ATOM
		| SYMBOL
		| equation
	) (ATOM | SYMBOL | equation | list)+;

conditional_equation: (
		EQUALS
		| NOT_EQUALS
		| GREATER_THAN
		| GREATER_OR_EQUAL_THAN
		| LESS_THAN
		| LESS_OR_EQUAL_THAN
	) (ATOM | SYMBOL | equation | conditional_equation) (
		(ATOM | SYMBOL | equation | conditional_equation)
	)+;

print_block: PRINT STRING;

write_block: WRITE (STRING | list | (SQ list));

write_line_block: WRITE_LINE STRING;

defparameter_block:
	DEFPARAMETER (ATOM | SYMBOL | VAR) (STRING | list);

defconstant_block: DEFCONSTANT SYMBOL list;

defmacro_block: DEFMACRO SYMBOL LPAREN SYMBOL* RPAREN list*;

deftype_block: DEFTYPE SYMBOL list;

defvar_block: DEFVAR SYMBOL list?;

define_function:
	DEFUN (ATOM | SYMBOL) function_arguments (
		ATOM
		| STRING
		| list
		| define_function
	)*;

function_arguments: LPAREN (ATOM | VAR)* RPAREN;

setq_block: SETQ SYMBOL list;

defclass_block: DEFCLASS SYMBOL LPAREN (SYMBOL list?)* RPAREN;

class_block: CLASS list*;

case_block: CASE list (LPAREN list list* RPAREN)+;

if_condition: IF (SYMBOL | conditional_equation | list) (list)*;

when_block: WHEN list list;

unless_block: UNLESS list list;

cond_block: COND (LPAREN list list RPAREN)+;

loop_block: LOOP list*;

do_block: DO list*;

and_block: AND list*;

or_block: OR list*;

not_block: NOT list;

throw_block: THROW SYMBOL list;

catch_block: CATCH SYMBOL list*;

format_block: FORMAT (T | NIL) STRING VAR?;

type_block: TYPE list;

type_of_block: TYPE_OF list;

declaim_block: DECLAIM (LPAREN SYMBOL SYMBOL RPAREN)+;

let_block: LET LPAREN (LPAREN SYMBOL list RPAREN)* RPAREN list*;

let_star_block:
	LET_STAR LPAREN (LPAREN SYMBOL list RPAREN)* RPAREN list*;

lambda_block: LAMBDA LPAREN (ATOM | SYMBOL)* RPAREN list+;

function_block: FUNCTION list SYMBOL*;

return_block: LPAREN RETURN (SYMBOL | VAR) RPAREN;

value: ATOM | STRING;
function_call: (VAR | SYMBOL) value | list;
return_from_block:
	LPAREN RETURN_FROM SYMBOL (SYMBOL | VAR | function_call) RPAREN;

literal: SQ list? | SQ equation? | SQ ATOM?;