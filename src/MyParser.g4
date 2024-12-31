parser grammar MyParser;
options { tokenVocab=MyLexer; }
file : lists? EOF;
lists : list+;
list : LPAR
    ( VAR
    | ATOM
    | SYMBOL
    | STRING
    | list
    | equation
    | conditional_equation
    | print_block
    | write_block
    | write_line_block
    | define_function
    | inline_function
    | reserved
    | literal
    )* RPAR;

equation: (PLUS|MINUS|MULT|DIV|PERC)  (ATOM|SYMBOL|equation)  (ATOM|SYMBOL|equation)+ ;
conditional_equation: (EQUALS|NOT_EQUALS|GREATER_THAN|GREATER_OR_EQUAL_THAN|LESS_THAN|LESS_OR_EQUAL_THAN)  (ATOM|SYMBOL|equation|conditional_equation)  ((ATOM|SYMBOL|equation|conditional_equation) )+ ;
define_function : DEFUN (VAR|SYMBOL) list (ATOM|STRING|list|define_function)*;
inline_function : DECLARE LPAR INLINE (VAR|SYMBOL) RPAR;

if_condition : LPAR IF (SYMBOL|conditional_equation) (list)* RPAR;

literal : SQ list? | SQ equation? | SQ ATOM?;
reserved : (T|IF|TYPE_OF|TYPE|SETQ|DEFVAR|PRINT|CASE|CLASS|NOT|OR|AND|LOOP|COND|LET_STAR|LET|NIL|LAMBDA|EXPORT|IMPORT|BLOCK|CATCH|THROW|THROW|DO|DEFPARAMETER|DEFCONSTANT|DEFGENERIC|DEFSTRUCT|DEFMETHOD|DEFCLASS|DEFMACRO|RETURN_FROM|RETURN|FORMAT|FUNCTION|DECLARE|GO|WHEN|UNLESS|HANDLER_BIND|RESTART_BIND|HANDLER_CASE|RESTART_CASE|WITH_ACCESSORS|WITH_SLOTS|SLOT_VALUE|INITIALIZE_INSTANCE|MAKE_INSTANCE|PROGN|VALUES|USE_PACKAGE|IN_PACKAGE|DEFPACKAGE|WITH_TIMEOUT|WITH_STREAM|WITH_OUTPUT_TO_STRING|WITH_INPUT_FROM_STRING|WITH_OUTPUT_TO_FILE|WITH_OPEN_FILE|DEFTYPE|DECLAIM|TAGBODY|LETREC|LETF) ;

format_block: FORMAT (T|NIL) ;



print_block: PRINT STRING;
write_block: WRITE (STRING|list|(SQ list));
write_line_block: WRITE_LINE STRING;


value : STRING | INT ;
binding_list : LPAR (SYMBOL|VAR) value RPAR (binding_list)?;
global_variable : LPAR DEFPARAMETER (SYMBOL|VAR) value STRING? RPAR | LPAR DEFVAR (SYMBOL|VAR) value STRING? RPAR | LPAR SETQ (value|(SYMBOL|VAR) list)+ RPAR |
LPAR DECLARE LPAR SPECIAL (SYMBOL|VAR)+ RPAR RPAR | LPAR DECLARE LPAR TYPE DATATYPES (SYMBOL|VAR)+ RPAR RPAR|LPAR DECLARE (LPAR TYPE DATATYPES (SYMBOL|VAR) RPAR)+ RPAR;
local_variable : LET LPAR binding_list RPAR | LET_STAR LPAR binding_list RPAR | SETQ (value|SYMBOL|VAR list)+|DECLARE LPAR TYPE DATATYPES (SYMBOL|VAR)+ RPAR|DECLARE (LPAR TYPE DATATYPES (SYMBOL|VAR) RPAR)+;
redefine : LETF define_function | LETF LET LPAR binding_list RPAR;