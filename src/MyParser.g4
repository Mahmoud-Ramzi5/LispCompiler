parser grammar MyParser;
options { tokenVocab=MyLexer; }
file : (COMMENT)*lists? EOF;
lists : list+;
list : LPAR (ATOM|SYMBOL|STRING|equation|conditional_equation|list|reserved|literal)* RPAR;
equation: (PLUS|MINUS|MULT|DIV|PERC)  (NUMBER|SYMBOL|equation)  ((NUMBER|SYMBOL|equation) )+ ;
conditional_equation: (EQUALS|NOT_EQUALS|GREATER_THAN|GREATER_OR_EQUAL_THAN|LESS_THAN|LESS_OR_EQUAL_THAN)  (NUMBER|SYMBOL|equation|conditional_equation)  ((NUMBER|SYMBOL|equation|conditional_equation) )+ ;
define_function : LPAR DEFUN SYMBOL (LPAR (SYMBOL)* RPAR | list) (ATOM|list|STRING|define_function)* RPAR;
literal : SQ list? | SQ equation? | SQ ATOM?;
if_condition : LPAR IF (SYMBOL|conditional_equation) (list)* RPAR;
reserved : (T|WRITE_LINE|WRITE|IF|DEFUN|TYPE_OF|TYPE|SETQ|DEFVAR|PRINT|CASE|CLASS|NOT|OR|AND|LOOP|COND|LET_STAR|LET|NIL|LAMBDA|EXPORT|IMPORT|BLOCK|CATCH|THROW|THROW|DO|DEFPARAMETER|DEFCONSTANT|DEFGENERIC|DEFSTRUCT|DEFMETHOD|DEFCLASS|DEFMACRO|RETURN_FROM|RETURN|FORMAT|FUNCTION|DECLARE|GO|WHEN|UNLESS|HANDLER_BIND|RESTART_BIND|HANDLER_CASE|RESTART_CASE|WITH_ACCESSORS|WITH_SLOTS|SLOT_VALUE|INITIALIZE_INSTANCE|MAKE_INSTANCE|PROGN|VALUES|USE_PACKAGE|IN_PACKAGE|DEFPACKAGE|WITH_TIMEOUT|WITH_STREAM|WITH_OUTPUT_TO_STRING|WITH_INPUT_FROM_STRING|WITH_OUTPUT_TO_FILE|WITH_OPEN_FILE|DEFTYPE|DECLAIM|TAGBODY|LETREC|LETF) ;
