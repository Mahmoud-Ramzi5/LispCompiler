# Generated from MyParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MyParser import MyParser
else:
    from MyParser import MyParser

# This class defines a complete listener for a parse tree produced by MyParser.
class MyParserListener(ParseTreeListener):

    # Enter a parse tree produced by MyParser#prog.
    def enterProg(self, ctx:MyParser.ProgContext):
        pass

    # Exit a parse tree produced by MyParser#prog.
    def exitProg(self, ctx:MyParser.ProgContext):
        pass


    # Enter a parse tree produced by MyParser#lists.
    def enterLists(self, ctx:MyParser.ListsContext):
        pass

    # Exit a parse tree produced by MyParser#lists.
    def exitLists(self, ctx:MyParser.ListsContext):
        pass


    # Enter a parse tree produced by MyParser#list.
    def enterList(self, ctx:MyParser.ListContext):
        pass

    # Exit a parse tree produced by MyParser#list.
    def exitList(self, ctx:MyParser.ListContext):
        pass


    # Enter a parse tree produced by MyParser#equation.
    def enterEquation(self, ctx:MyParser.EquationContext):
        pass

    # Exit a parse tree produced by MyParser#equation.
    def exitEquation(self, ctx:MyParser.EquationContext):
        pass


    # Enter a parse tree produced by MyParser#conditional_equation.
    def enterConditional_equation(self, ctx:MyParser.Conditional_equationContext):
        pass

    # Exit a parse tree produced by MyParser#conditional_equation.
    def exitConditional_equation(self, ctx:MyParser.Conditional_equationContext):
        pass


    # Enter a parse tree produced by MyParser#define_function.
    def enterDefine_function(self, ctx:MyParser.Define_functionContext):
        pass

    # Exit a parse tree produced by MyParser#define_function.
    def exitDefine_function(self, ctx:MyParser.Define_functionContext):
        pass


    # Enter a parse tree produced by MyParser#inline_function.
    def enterInline_function(self, ctx:MyParser.Inline_functionContext):
        pass

    # Exit a parse tree produced by MyParser#inline_function.
    def exitInline_function(self, ctx:MyParser.Inline_functionContext):
        pass


    # Enter a parse tree produced by MyParser#if_condition.
    def enterIf_condition(self, ctx:MyParser.If_conditionContext):
        pass

    # Exit a parse tree produced by MyParser#if_condition.
    def exitIf_condition(self, ctx:MyParser.If_conditionContext):
        pass


    # Enter a parse tree produced by MyParser#literal.
    def enterLiteral(self, ctx:MyParser.LiteralContext):
        pass

    # Exit a parse tree produced by MyParser#literal.
    def exitLiteral(self, ctx:MyParser.LiteralContext):
        pass


    # Enter a parse tree produced by MyParser#format_block.
    def enterFormat_block(self, ctx:MyParser.Format_blockContext):
        pass

    # Exit a parse tree produced by MyParser#format_block.
    def exitFormat_block(self, ctx:MyParser.Format_blockContext):
        pass


    # Enter a parse tree produced by MyParser#print_block.
    def enterPrint_block(self, ctx:MyParser.Print_blockContext):
        pass

    # Exit a parse tree produced by MyParser#print_block.
    def exitPrint_block(self, ctx:MyParser.Print_blockContext):
        pass


    # Enter a parse tree produced by MyParser#write_block.
    def enterWrite_block(self, ctx:MyParser.Write_blockContext):
        pass

    # Exit a parse tree produced by MyParser#write_block.
    def exitWrite_block(self, ctx:MyParser.Write_blockContext):
        pass


    # Enter a parse tree produced by MyParser#write_line_block.
    def enterWrite_line_block(self, ctx:MyParser.Write_line_blockContext):
        pass

    # Exit a parse tree produced by MyParser#write_line_block.
    def exitWrite_line_block(self, ctx:MyParser.Write_line_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defvar_block.
    def enterDefvar_block(self, ctx:MyParser.Defvar_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defvar_block.
    def exitDefvar_block(self, ctx:MyParser.Defvar_blockContext):
        pass


    # Enter a parse tree produced by MyParser#setq_block.
    def enterSetq_block(self, ctx:MyParser.Setq_blockContext):
        pass

    # Exit a parse tree produced by MyParser#setq_block.
    def exitSetq_block(self, ctx:MyParser.Setq_blockContext):
        pass


    # Enter a parse tree produced by MyParser#cond_block.
    def enterCond_block(self, ctx:MyParser.Cond_blockContext):
        pass

    # Exit a parse tree produced by MyParser#cond_block.
    def exitCond_block(self, ctx:MyParser.Cond_blockContext):
        pass


    # Enter a parse tree produced by MyParser#loop_block.
    def enterLoop_block(self, ctx:MyParser.Loop_blockContext):
        pass

    # Exit a parse tree produced by MyParser#loop_block.
    def exitLoop_block(self, ctx:MyParser.Loop_blockContext):
        pass


    # Enter a parse tree produced by MyParser#let_block.
    def enterLet_block(self, ctx:MyParser.Let_blockContext):
        pass

    # Exit a parse tree produced by MyParser#let_block.
    def exitLet_block(self, ctx:MyParser.Let_blockContext):
        pass


    # Enter a parse tree produced by MyParser#let_star_block.
    def enterLet_star_block(self, ctx:MyParser.Let_star_blockContext):
        pass

    # Exit a parse tree produced by MyParser#let_star_block.
    def exitLet_star_block(self, ctx:MyParser.Let_star_blockContext):
        pass


    # Enter a parse tree produced by MyParser#unless_block.
    def enterUnless_block(self, ctx:MyParser.Unless_blockContext):
        pass

    # Exit a parse tree produced by MyParser#unless_block.
    def exitUnless_block(self, ctx:MyParser.Unless_blockContext):
        pass


    # Enter a parse tree produced by MyParser#when_block.
    def enterWhen_block(self, ctx:MyParser.When_blockContext):
        pass

    # Exit a parse tree produced by MyParser#when_block.
    def exitWhen_block(self, ctx:MyParser.When_blockContext):
        pass


    # Enter a parse tree produced by MyParser#lambda_block.
    def enterLambda_block(self, ctx:MyParser.Lambda_blockContext):
        pass

    # Exit a parse tree produced by MyParser#lambda_block.
    def exitLambda_block(self, ctx:MyParser.Lambda_blockContext):
        pass


    # Enter a parse tree produced by MyParser#function_block.
    def enterFunction_block(self, ctx:MyParser.Function_blockContext):
        pass

    # Exit a parse tree produced by MyParser#function_block.
    def exitFunction_block(self, ctx:MyParser.Function_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defmacro_block.
    def enterDefmacro_block(self, ctx:MyParser.Defmacro_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defmacro_block.
    def exitDefmacro_block(self, ctx:MyParser.Defmacro_blockContext):
        pass


    # Enter a parse tree produced by MyParser#case_block.
    def enterCase_block(self, ctx:MyParser.Case_blockContext):
        pass

    # Exit a parse tree produced by MyParser#case_block.
    def exitCase_block(self, ctx:MyParser.Case_blockContext):
        pass


    # Enter a parse tree produced by MyParser#tagbody_block.
    def enterTagbody_block(self, ctx:MyParser.Tagbody_blockContext):
        pass

    # Exit a parse tree produced by MyParser#tagbody_block.
    def exitTagbody_block(self, ctx:MyParser.Tagbody_blockContext):
        pass


    # Enter a parse tree produced by MyParser#throw_block.
    def enterThrow_block(self, ctx:MyParser.Throw_blockContext):
        pass

    # Exit a parse tree produced by MyParser#throw_block.
    def exitThrow_block(self, ctx:MyParser.Throw_blockContext):
        pass


    # Enter a parse tree produced by MyParser#catch_block.
    def enterCatch_block(self, ctx:MyParser.Catch_blockContext):
        pass

    # Exit a parse tree produced by MyParser#catch_block.
    def exitCatch_block(self, ctx:MyParser.Catch_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_open_file_block.
    def enterWith_open_file_block(self, ctx:MyParser.With_open_file_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_open_file_block.
    def exitWith_open_file_block(self, ctx:MyParser.With_open_file_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_output_to_file_block.
    def enterWith_output_to_file_block(self, ctx:MyParser.With_output_to_file_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_output_to_file_block.
    def exitWith_output_to_file_block(self, ctx:MyParser.With_output_to_file_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_input_from_string_block.
    def enterWith_input_from_string_block(self, ctx:MyParser.With_input_from_string_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_input_from_string_block.
    def exitWith_input_from_string_block(self, ctx:MyParser.With_input_from_string_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_output_to_string_block.
    def enterWith_output_to_string_block(self, ctx:MyParser.With_output_to_string_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_output_to_string_block.
    def exitWith_output_to_string_block(self, ctx:MyParser.With_output_to_string_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_stream_block.
    def enterWith_stream_block(self, ctx:MyParser.With_stream_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_stream_block.
    def exitWith_stream_block(self, ctx:MyParser.With_stream_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_timeout_block.
    def enterWith_timeout_block(self, ctx:MyParser.With_timeout_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_timeout_block.
    def exitWith_timeout_block(self, ctx:MyParser.With_timeout_blockContext):
        pass


    # Enter a parse tree produced by MyParser#type_block.
    def enterType_block(self, ctx:MyParser.Type_blockContext):
        pass

    # Exit a parse tree produced by MyParser#type_block.
    def exitType_block(self, ctx:MyParser.Type_blockContext):
        pass


    # Enter a parse tree produced by MyParser#type_of_block.
    def enterType_of_block(self, ctx:MyParser.Type_of_blockContext):
        pass

    # Exit a parse tree produced by MyParser#type_of_block.
    def exitType_of_block(self, ctx:MyParser.Type_of_blockContext):
        pass


    # Enter a parse tree produced by MyParser#class_block.
    def enterClass_block(self, ctx:MyParser.Class_blockContext):
        pass

    # Exit a parse tree produced by MyParser#class_block.
    def exitClass_block(self, ctx:MyParser.Class_blockContext):
        pass


    # Enter a parse tree produced by MyParser#not_block.
    def enterNot_block(self, ctx:MyParser.Not_blockContext):
        pass

    # Exit a parse tree produced by MyParser#not_block.
    def exitNot_block(self, ctx:MyParser.Not_blockContext):
        pass


    # Enter a parse tree produced by MyParser#or_block.
    def enterOr_block(self, ctx:MyParser.Or_blockContext):
        pass

    # Exit a parse tree produced by MyParser#or_block.
    def exitOr_block(self, ctx:MyParser.Or_blockContext):
        pass


    # Enter a parse tree produced by MyParser#and_block.
    def enterAnd_block(self, ctx:MyParser.And_blockContext):
        pass

    # Exit a parse tree produced by MyParser#and_block.
    def exitAnd_block(self, ctx:MyParser.And_blockContext):
        pass


    # Enter a parse tree produced by MyParser#import_block.
    def enterImport_block(self, ctx:MyParser.Import_blockContext):
        pass

    # Exit a parse tree produced by MyParser#import_block.
    def exitImport_block(self, ctx:MyParser.Import_blockContext):
        pass


    # Enter a parse tree produced by MyParser#export_block.
    def enterExport_block(self, ctx:MyParser.Export_blockContext):
        pass

    # Exit a parse tree produced by MyParser#export_block.
    def exitExport_block(self, ctx:MyParser.Export_blockContext):
        pass


    # Enter a parse tree produced by MyParser#do_block.
    def enterDo_block(self, ctx:MyParser.Do_blockContext):
        pass

    # Exit a parse tree produced by MyParser#do_block.
    def exitDo_block(self, ctx:MyParser.Do_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defparameter_block.
    def enterDefparameter_block(self, ctx:MyParser.Defparameter_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defparameter_block.
    def exitDefparameter_block(self, ctx:MyParser.Defparameter_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defconstant_block.
    def enterDefconstant_block(self, ctx:MyParser.Defconstant_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defconstant_block.
    def exitDefconstant_block(self, ctx:MyParser.Defconstant_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defgeneric_block.
    def enterDefgeneric_block(self, ctx:MyParser.Defgeneric_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defgeneric_block.
    def exitDefgeneric_block(self, ctx:MyParser.Defgeneric_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defstruct_block.
    def enterDefstruct_block(self, ctx:MyParser.Defstruct_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defstruct_block.
    def exitDefstruct_block(self, ctx:MyParser.Defstruct_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defmethod_block.
    def enterDefmethod_block(self, ctx:MyParser.Defmethod_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defmethod_block.
    def exitDefmethod_block(self, ctx:MyParser.Defmethod_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defclass_block.
    def enterDefclass_block(self, ctx:MyParser.Defclass_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defclass_block.
    def exitDefclass_block(self, ctx:MyParser.Defclass_blockContext):
        pass


    # Enter a parse tree produced by MyParser#fuction_block.
    def enterFuction_block(self, ctx:MyParser.Fuction_blockContext):
        pass

    # Exit a parse tree produced by MyParser#fuction_block.
    def exitFuction_block(self, ctx:MyParser.Fuction_blockContext):
        pass


    # Enter a parse tree produced by MyParser#progn_block.
    def enterProgn_block(self, ctx:MyParser.Progn_blockContext):
        pass

    # Exit a parse tree produced by MyParser#progn_block.
    def exitProgn_block(self, ctx:MyParser.Progn_blockContext):
        pass


    # Enter a parse tree produced by MyParser#valus_block.
    def enterValus_block(self, ctx:MyParser.Valus_blockContext):
        pass

    # Exit a parse tree produced by MyParser#valus_block.
    def exitValus_block(self, ctx:MyParser.Valus_blockContext):
        pass


    # Enter a parse tree produced by MyParser#use_package_block.
    def enterUse_package_block(self, ctx:MyParser.Use_package_blockContext):
        pass

    # Exit a parse tree produced by MyParser#use_package_block.
    def exitUse_package_block(self, ctx:MyParser.Use_package_blockContext):
        pass


    # Enter a parse tree produced by MyParser#deftype_block.
    def enterDeftype_block(self, ctx:MyParser.Deftype_blockContext):
        pass

    # Exit a parse tree produced by MyParser#deftype_block.
    def exitDeftype_block(self, ctx:MyParser.Deftype_blockContext):
        pass


    # Enter a parse tree produced by MyParser#declaim_block.
    def enterDeclaim_block(self, ctx:MyParser.Declaim_blockContext):
        pass

    # Exit a parse tree produced by MyParser#declaim_block.
    def exitDeclaim_block(self, ctx:MyParser.Declaim_blockContext):
        pass


    # Enter a parse tree produced by MyParser#letrec_blokc.
    def enterLetrec_blokc(self, ctx:MyParser.Letrec_blokcContext):
        pass

    # Exit a parse tree produced by MyParser#letrec_blokc.
    def exitLetrec_blokc(self, ctx:MyParser.Letrec_blokcContext):
        pass


    # Enter a parse tree produced by MyParser#declare_block.
    def enterDeclare_block(self, ctx:MyParser.Declare_blockContext):
        pass

    # Exit a parse tree produced by MyParser#declare_block.
    def exitDeclare_block(self, ctx:MyParser.Declare_blockContext):
        pass


    # Enter a parse tree produced by MyParser#go_block.
    def enterGo_block(self, ctx:MyParser.Go_blockContext):
        pass

    # Exit a parse tree produced by MyParser#go_block.
    def exitGo_block(self, ctx:MyParser.Go_blockContext):
        pass


    # Enter a parse tree produced by MyParser#handler_bind_block.
    def enterHandler_bind_block(self, ctx:MyParser.Handler_bind_blockContext):
        pass

    # Exit a parse tree produced by MyParser#handler_bind_block.
    def exitHandler_bind_block(self, ctx:MyParser.Handler_bind_blockContext):
        pass


    # Enter a parse tree produced by MyParser#restart_bind_block.
    def enterRestart_bind_block(self, ctx:MyParser.Restart_bind_blockContext):
        pass

    # Exit a parse tree produced by MyParser#restart_bind_block.
    def exitRestart_bind_block(self, ctx:MyParser.Restart_bind_blockContext):
        pass


    # Enter a parse tree produced by MyParser#handler_case_block.
    def enterHandler_case_block(self, ctx:MyParser.Handler_case_blockContext):
        pass

    # Exit a parse tree produced by MyParser#handler_case_block.
    def exitHandler_case_block(self, ctx:MyParser.Handler_case_blockContext):
        pass


    # Enter a parse tree produced by MyParser#restart_case_block.
    def enterRestart_case_block(self, ctx:MyParser.Restart_case_blockContext):
        pass

    # Exit a parse tree produced by MyParser#restart_case_block.
    def exitRestart_case_block(self, ctx:MyParser.Restart_case_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_accessors_block.
    def enterWith_accessors_block(self, ctx:MyParser.With_accessors_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_accessors_block.
    def exitWith_accessors_block(self, ctx:MyParser.With_accessors_blockContext):
        pass


    # Enter a parse tree produced by MyParser#with_slots_block.
    def enterWith_slots_block(self, ctx:MyParser.With_slots_blockContext):
        pass

    # Exit a parse tree produced by MyParser#with_slots_block.
    def exitWith_slots_block(self, ctx:MyParser.With_slots_blockContext):
        pass


    # Enter a parse tree produced by MyParser#slot_value_block.
    def enterSlot_value_block(self, ctx:MyParser.Slot_value_blockContext):
        pass

    # Exit a parse tree produced by MyParser#slot_value_block.
    def exitSlot_value_block(self, ctx:MyParser.Slot_value_blockContext):
        pass


    # Enter a parse tree produced by MyParser#initialize_instance_block.
    def enterInitialize_instance_block(self, ctx:MyParser.Initialize_instance_blockContext):
        pass

    # Exit a parse tree produced by MyParser#initialize_instance_block.
    def exitInitialize_instance_block(self, ctx:MyParser.Initialize_instance_blockContext):
        pass


    # Enter a parse tree produced by MyParser#make_instance_block.
    def enterMake_instance_block(self, ctx:MyParser.Make_instance_blockContext):
        pass

    # Exit a parse tree produced by MyParser#make_instance_block.
    def exitMake_instance_block(self, ctx:MyParser.Make_instance_blockContext):
        pass


    # Enter a parse tree produced by MyParser#function_call.
    def enterFunction_call(self, ctx:MyParser.Function_callContext):
        pass

    # Exit a parse tree produced by MyParser#function_call.
    def exitFunction_call(self, ctx:MyParser.Function_callContext):
        pass


    # Enter a parse tree produced by MyParser#block_block.
    def enterBlock_block(self, ctx:MyParser.Block_blockContext):
        pass

    # Exit a parse tree produced by MyParser#block_block.
    def exitBlock_block(self, ctx:MyParser.Block_blockContext):
        pass


    # Enter a parse tree produced by MyParser#return_block.
    def enterReturn_block(self, ctx:MyParser.Return_blockContext):
        pass

    # Exit a parse tree produced by MyParser#return_block.
    def exitReturn_block(self, ctx:MyParser.Return_blockContext):
        pass


    # Enter a parse tree produced by MyParser#return_from_block.
    def enterReturn_from_block(self, ctx:MyParser.Return_from_blockContext):
        pass

    # Exit a parse tree produced by MyParser#return_from_block.
    def exitReturn_from_block(self, ctx:MyParser.Return_from_blockContext):
        pass


    # Enter a parse tree produced by MyParser#defpackage_block.
    def enterDefpackage_block(self, ctx:MyParser.Defpackage_blockContext):
        pass

    # Exit a parse tree produced by MyParser#defpackage_block.
    def exitDefpackage_block(self, ctx:MyParser.Defpackage_blockContext):
        pass


    # Enter a parse tree produced by MyParser#in_package_block.
    def enterIn_package_block(self, ctx:MyParser.In_package_blockContext):
        pass

    # Exit a parse tree produced by MyParser#in_package_block.
    def exitIn_package_block(self, ctx:MyParser.In_package_blockContext):
        pass


    # Enter a parse tree produced by MyParser#value.
    def enterValue(self, ctx:MyParser.ValueContext):
        pass

    # Exit a parse tree produced by MyParser#value.
    def exitValue(self, ctx:MyParser.ValueContext):
        pass


    # Enter a parse tree produced by MyParser#binding_list.
    def enterBinding_list(self, ctx:MyParser.Binding_listContext):
        pass

    # Exit a parse tree produced by MyParser#binding_list.
    def exitBinding_list(self, ctx:MyParser.Binding_listContext):
        pass


    # Enter a parse tree produced by MyParser#global_variable.
    def enterGlobal_variable(self, ctx:MyParser.Global_variableContext):
        pass

    # Exit a parse tree produced by MyParser#global_variable.
    def exitGlobal_variable(self, ctx:MyParser.Global_variableContext):
        pass


    # Enter a parse tree produced by MyParser#local_variable.
    def enterLocal_variable(self, ctx:MyParser.Local_variableContext):
        pass

    # Exit a parse tree produced by MyParser#local_variable.
    def exitLocal_variable(self, ctx:MyParser.Local_variableContext):
        pass


    # Enter a parse tree produced by MyParser#redefine.
    def enterRedefine(self, ctx:MyParser.RedefineContext):
        pass

    # Exit a parse tree produced by MyParser#redefine.
    def exitRedefine(self, ctx:MyParser.RedefineContext):
        pass



del MyParser