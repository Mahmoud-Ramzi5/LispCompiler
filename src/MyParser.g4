parser grammar MyParser;
options { tokenVocab=MyLexer; }
prog : lists? EOF;
lists : list+;
list : LPAREN
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
    | defvar_block
    | setq_block
    | cond_block
    | loop_block
    | let_block
    | let_star_block
    | unless_block
    | when_block
    | lambda_block
    | function_block
    | defmacro_block
    | case_block
    | tagbody_block
    | throw_block
    | catch_block
    | with_open_file_block
    | with_output_to_file_block
    | with_input_from_string_block
    | with_output_to_string_block
    | with_stream_block
    | with_timeout_block
    | type_block
    | type_of_block
    | class_block
    | not_block
    | or_block
    | and_block
    | import_block
    | export_block
    | do_block
    | defparameter_block
    | defconstant_block
    | defgeneric_block
    | defstruct_block
    | defmethod_block
    | defclass_block
    | fuction_block
    | progn_block
    | valus_block
    | use_package_block
    | deftype_block
    | declaim_block
    | letrec_blokc
    | declare_block
    | go_block
    | handler_bind_block
    | restart_bind_block
    | handler_case_block
    | restart_case_block
    | with_accessors_block
    | with_slots_block
    | slot_value_block
    | initialize_instance_block
    | make_instance_block
    | block_block
    | return_block
    | return_from_block
    | defpackage_block
    | in_package_block
    | define_function
    | inline_function
    | if_condition
    | format_block
    | literal
    )* RPAREN;

equation: (PLUS|MINUS|MULT|DIV|PERC)  (ATOM|SYMBOL|equation)  (ATOM|SYMBOL|equation|list)+ ;
conditional_equation: (EQUALS|NOT_EQUALS|GREATER_THAN|GREATER_OR_EQUAL_THAN|LESS_THAN|LESS_OR_EQUAL_THAN)  (ATOM|SYMBOL|equation|conditional_equation)  ((ATOM|SYMBOL|equation|conditional_equation) )+ ;
function_arguments: LPAREN (ATOM|VAR)* RPAREN;
define_function : DEFUN (ATOM|SYMBOL) function_arguments (ATOM|STRING|list|define_function)*;
inline_function : DECLARE LPAREN INLINE (VAR|SYMBOL) RPAREN;
if_condition : IF (SYMBOL|conditional_equation| list) (list)* ;

literal : SQ list? | SQ equation? | SQ ATOM?;
format_block: FORMAT (T|NIL) STRING VAR?;



print_block: PRINT STRING;
write_block: WRITE (STRING|list|(SQ list));
write_line_block: WRITE_LINE STRING;
defvar_block: DEFVAR SYMBOL list?;
setq_block: SETQ SYMBOL list;
cond_block: COND (LPAREN list list RPAREN)+;
loop_block: LOOP list*;
let_block: LET LPAREN (LPAREN SYMBOL list RPAREN)* RPAREN list*;
let_star_block: LET_STAR LPAREN (LPAREN SYMBOL list RPAREN)* RPAREN list*;
unless_block: UNLESS list list;
when_block: WHEN list list;
lambda_block: LAMBDA LPAREN (ATOM|SYMBOL)* RPAREN list+;
function_block: FUNCTION SYMBOL;
defmacro_block: DEFMACRO SYMBOL LPAREN SYMBOL* RPAREN list*;
case_block:CASE list (LPAREN list list* RPAREN)+;
tagbody_block:TAGBODY list*;
throw_block:THROW SYMBOL list;
catch_block:CATCH SYMBOL list*;
with_open_file_block:WITH_OPEN_FILE LPAREN SYMBOL list RPAREN list*;
with_output_to_file_block:WITH_OUTPUT_TO_FILE LPAREN SYMBOL list RPAREN list*;
with_input_from_string_block:WITH_INPUT_FROM_STRING LPAREN SYMBOL list RPAREN list*;
with_output_to_string_block:WITH_OUTPUT_TO_STRING LPAREN SYMBOL list RPAREN list*;
with_stream_block:WITH_STREAM LPAREN SYMBOL list RPAREN list*;
with_timeout_block:WITH_TIMEOUT LPAREN ATOM RPAREN list*;
type_block: TYPE list;
type_of_block: TYPE_OF list;
class_block: CLASS list*;
not_block: NOT list;
or_block: OR list*;
and_block: AND list*;
import_block: IMPORT LPAREN SYMBOL* RPAREN;
export_block: EXPORT LPAREN SYMBOL* RPAREN;
do_block: DO list*;
defparameter_block: DEFPARAMETER (ATOM|SYMBOL|VAR) (STRING|list);
defconstant_block: DEFCONSTANT SYMBOL list;
defgeneric_block: DEFGENERIC SYMBOL LPAREN SYMBOL* RPAREN list*;
defstruct_block: DEFSTRUCT SYMBOL LPAREN (SYMBOL list?)* RPAREN;
defmethod_block: DEFMETHOD SYMBOL LPAREN SYMBOL* RPAREN list*;
defclass_block: DEFCLASS SYMBOL LPAREN (SYMBOL list?)* RPAREN;
fuction_block: FUNCTION SYMBOL;
progn_block: PROGN list*;
valus_block: VALUES list*;
use_package_block: USE_PACKAGE LPAREN (ATOM|SYMBOL)* RPAREN;
deftype_block: DEFTYPE SYMBOL list;
declaim_block: DECLAIM (LPAREN SYMBOL SYMBOL RPAREN)+;
letrec_blokc: LETREC LPAREN (LPAREN SYMBOL list RPAREN)* RPAREN list*;
declare_block: DECLARE (LPAREN SYMBOL SYMBOL RPAREN)+;
go_block: GO SYMBOL;
handler_bind_block: HANDLER_BIND LPAREN (SYMBOL list)+ RPAREN list*;
restart_bind_block: RESTART_BIND LPAREN (SYMBOL list)+ RPAREN list*;
handler_case_block: HANDLER_CASE LPAREN (SYMBOL list)+ RPAREN list*;
restart_case_block: RESTART_CASE LPAREN (SYMBOL list)+ RPAREN list*;
with_accessors_block: WITH_ACCESSORS LPAREN SYMBOL* RPAREN list*;
with_slots_block: WITH_SLOTS LPAREN SYMBOL* RPAREN list*;
slot_value_block: SLOT_VALUE SYMBOL SYMBOL;
initialize_instance_block: INITIALIZE_INSTANCE SYMBOL (LPAREN SYMBOL list RPAREN)*;
make_instance_block: MAKE_INSTANCE SYMBOL (LPAREN SYMBOL list RPAREN)*;





function_call : (VAR|SYMBOL) value|list;

block_block: BLOCK SYMBOL list;
return_block : LPAREN RETURN (SYMBOL|VAR|function_call|) RPAREN;
return_from_block : LPAREN RETURN_FROM SYMBOL (SYMBOL|VAR|function_call|) RPAREN;

defpackage_block : DEFPACKAGE COLON SYMBOL LPAREN (COLON (USE|EXPORT|IMPORT_FROM|SHADOW|NICKNAMES)*|(DOCUMENTATION STRING))RPAREN;
in_package_block : IN_PACKAGE COLON SYMBOL;


value : STRING | INT ;
binding_list : LPAREN (SYMBOL|VAR) value RPAREN (binding_list)?;
global_variable : LPAREN DEFPARAMETER (SYMBOL|VAR) value STRING? RPAREN | LPAREN DEFVAR (SYMBOL|VAR) value STRING? RPAREN | LPAREN SETQ (value|(SYMBOL|VAR) list)+ RPAREN |
LPAREN DECLARE LPAREN SPECIAL (SYMBOL|VAR)+ RPAREN RPAREN | LPAREN DECLARE LPAREN TYPE DATATYPES (SYMBOL|VAR)+ RPAREN RPAREN|LPAREN DECLARE (LPAREN TYPE DATATYPES (SYMBOL|VAR) RPAREN)+ RPAREN;
local_variable : LET LPAREN binding_list RPAREN | LET_STAR LPAREN binding_list RPAREN | SETQ (value|SYMBOL|VAR list)+|DECLARE LPAREN TYPE DATATYPES (SYMBOL|VAR)+ RPAREN|DECLARE (LPAREN TYPE DATATYPES (SYMBOL|VAR) RPAREN)+;
redefine : LETF define_function | LETF LET LPAREN binding_list RPAREN;