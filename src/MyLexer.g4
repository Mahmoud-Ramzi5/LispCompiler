lexer grammar MyLexer;

ATOM : (LETTER | NUMBER)+? ;
SYMBOL : LETTER(LETTER | NUMBER)?;
STRING : '"' .*? '"' ;
COMMENT : ';' ~[\r\n]* -> skip;
MULTIPLECOMMENT : '||#' .*? '#||' -> skip;
EQUATION: '('(PLUS|MINUS|MULT|DIV|PERC)' '(NUMBER|SYMBOL|EQUATION)' '((NUMBER|SYMBOL|EQUATION)' ')+')';
CONDITIONALEQUATION: '('(EQUALS|NOTEQUALS|GREATERTHAN|GREATEROREQUALTHAN|LESSTHAN|LESSOREQUALTHAN)' '(NUMBER|SYMBOL|EQUATION|CONDITIONALEQUATION)' '((NUMBER|SYMBOL|EQUATION|CONDITIONALEQUATION)' ')+')';
COMMAND:'(' RESERVED (STRING|SYMBOL)+')';
LIST : OPE (LIST|ATOM|SYMBOL|STRING|EQUATION|COMMAND|RESERVED)* CLO;

OPE:'(';
CLO:')';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
PERC: '%';

EQUALS : '=';
NOTEQUALS : '/=';
GREATERTHAN : '>';
GREATEROREQUALTHAN : '>=';
LESSTHAN : '<';
LESSOREQUALTHAN : '<=';



WS : [ \r\n\t]+ -> skip;

RESERVED : ('write' | 'write-line' | 'print' | 'defvar' | 'setq' | 'type-of' | 'defmacro' | 'format' | 'let'|'return from'|'defun'|'defmacro'|'defvar'|'defparameter'|'defclass'|'defmethod'|'defgeneric'|'defstruct'|'defconstant'|'defpackage'|'in-package'|'use-package'|'export'|'import'|'lambda'|'let'|'let*'|'setq'|'setf'|'if'|'cond'|'case'|'when'|'unless'|'do'|'loop'|'dotimes'|'dolist'|'quote'|'quasiquote'|'unquote'|'unquote-splicing'|'macrolet'|'labels'|'flet'|'multiple-value-bind'|'multiple-value-list'|'return'|'return-from'|'values'|'progn'|'and'|'or'|'not'|'nil'|'t'|'declare'|'function'|'type'|'class'|'format'|'print'|'princ'|'prn'|'with-slots'|'with-accessors'|'slot-value'|'initialize-instance'|'make-instance'|'catch'|'throw'|'block'|'restart-case'|'restart-bind'|'handler-bind'|'handler-case'|'letrec'|'letf'|'tagbody'|'go'|'declaim'|'deftype'|'locally'|'with-open-file'|'with-input-from-string'|'with-output-to-string'|'with-output-to-file'|'with-stream'|'with-timeout'|'let-syntax'|'defsyntax'|'syntax'|'syntax-quote'|'syntax-unquote'|'syntax-unquote-splicing'|'values'|'progn'|'and'|'or'|'not'|'nil'|'t'|'defgeneric'|'defmethod'|'defclass'|'defstruct'|'defvar'|'defparameter'|'defun'|'setq'|'setf'|'let'|'let*'|'lambda'|'if'|'cond'|'case'|'when'|'unless'|'do'|'loop'|'dotimes'|'dolist'|'quote'|'quasiquote'|'unquote'|'unquote-splicing'|'macrolet'|'labels'|'flet'|'multiple-value-bind'|'multiple-value-list'|'return'|'return-from'|'values'|'progn'|'and'|'or'|'not'|'nil'|'t'|'declare'|'function'|'type'|'class'|'format'|'print'|'princ'|'prn'|'with-slots'|'with-accessors'|'slot-value'|'initialize-instance'|'make-instance'|'defpackage'|'in-package'|'use-package'|'export'|'import'|'package'|'loop'|'tagbody'|'go'|'catch'|'throw'|'block'|'restart-case'|'restart-bind'|'handler-bind'|'handler-case'|'letrec'|'letf'|'defconstant'|'defstruct'|'declaim'|'deftype'|'defparameter'|'defun'|'defvar'|'setq'|'setf'|'defconstant'|'declare'|'locally'|'letf'|'letrec'|'with-open-file'|'with-input-from-string'|'with-output-to-string'|'with-output-to-file'|'with-stream'|'with-timeout'|'let-syntax'|'defsyntax'|'syntax'|'syntax-quote'|'syntax-unquote'|'syntax-unquote-splicing'|'values'|'progn'|'return'|'return-from'|'values'|'progn'|'let'|'let*'|'setq'|'setf'|'if'|'cond'|'case'|'when'|'unless'|'do'|'loop'|'dotimes'|'dolist'|'defun'|'defmacro'|'defvar'|'defparameter'|'quote'|'quasiquote'|'unquote'|'unquote-splicing'|'macrolet'|'labels'|'flet'|'multiple-value-bind'|'multiple-value-list'|'return'|'return-from'|'values'|'progn'|'and'|'or'|'not'|'nil'|'t'|'declare'|'function'|'type'|'class'|'format'|'print'|'princ'|'prn'|'defclass'|'defmethod'|'defgeneric'|'with-slots'|'with-accessors'|'slot-value'|'initialize-instance'|'make-instance'|'defpackage'|'in-package'|'use-package'|'export'|'import'|'package'|'loop'|'tagbody'|'go'|'catch'|'throw'|'block'|'restart-case'|'restart-bind'|'handler-bind'|'handler-case'|'letrec'|'letf'|'defconstant'|'defstruct'|'defgeneric'|'defmethod'|'with-slots'|'with-accessors'|'declaim'|'deftype'|'defparameter'|'defun'|'defvar'|'setq'|'setf'|'defconstant'|'declare'|'locally'|'letf'|'letrec'|'with-open-file'|'with-input-from-string'|'with-output-to-string'|'with-output-to-file'|'with-stream'|'with-timeout'|'let-syntax'|'defsyntax'|'syntax'|'syntax-quote'|'syntax-unquote'|'syntax-unquote-splicing'|'values'|'progn'|'and'|'or'|'not'|'nil'|'t'|'declare'|'function'|'type'|'class'|'format'|'print'|'princ'|'prn'|'defclass'|'defmethod'|'defgeneric'|'with-slots'|'with-accessors'|'slot-value'|'initialize-instance'|'make-instance'|'defpackage'|'in-package'|'use-package'|'export'|'import'|'package'|'loop'|'tagbody'|'go'|'catch'|'throw'|'block'|'restart-case'|'restart-bind'|'handler-bind'|'handler-case'|'letrec'|'letf'|'defconstant'|'defstruct'|'defgeneric'|'defmethod'|'with-slots'|'with-accessors'|'declaim'|'deftype'|'defparameter'|'defun'|'defvar'|'setq'|'setf'|'defconstant'|'declare'|'locally'|'letf'|'letrec'|'with-open-file'|'with-input-from-string'|'with-output-to-string'|'with-output-to-file'|'with-stream'|'with-timeout'|'let-syntax'|'defsyntax'|'syntax'|'syntax-quote'|'syntax-unquote'|'syntax-unquote-splicing'|'values'|'progn');
FUNCTION : '(' 'defun' SYMBOL '(' (SYMBOL)* ')' (LIST)* ')';
IFCONDITION : '(' 'if' (SYMBOL|CONDITIONALEQUATION) (LIST)* ')';
//BLOCK : '(' 'block' SYMBOL '(' (LIST)* RESERVED SYMBOL NUMBER ')';

fragment LETTER : [a-zA-Z] ;
fragment NUMBER : [0-9];
