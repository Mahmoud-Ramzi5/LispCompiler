// Generated from d:/Projects/U Projects/lispCompilerPython/src/MyParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#lists}.
	 * @param ctx the parse tree
	 */
	void enterLists(MyParser.ListsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#lists}.
	 * @param ctx the parse tree
	 */
	void exitLists(MyParser.ListsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MyParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(MyParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(MyParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#conditional_equation}.
	 * @param ctx the parse tree
	 */
	void enterConditional_equation(MyParser.Conditional_equationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#conditional_equation}.
	 * @param ctx the parse tree
	 */
	void exitConditional_equation(MyParser.Conditional_equationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(MyParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(MyParser.Function_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#define_function}.
	 * @param ctx the parse tree
	 */
	void enterDefine_function(MyParser.Define_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#define_function}.
	 * @param ctx the parse tree
	 */
	void exitDefine_function(MyParser.Define_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#inline_function}.
	 * @param ctx the parse tree
	 */
	void enterInline_function(MyParser.Inline_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#inline_function}.
	 * @param ctx the parse tree
	 */
	void exitInline_function(MyParser.Inline_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(MyParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(MyParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#format_block}.
	 * @param ctx the parse tree
	 */
	void enterFormat_block(MyParser.Format_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#format_block}.
	 * @param ctx the parse tree
	 */
	void exitFormat_block(MyParser.Format_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#print_block}.
	 * @param ctx the parse tree
	 */
	void enterPrint_block(MyParser.Print_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#print_block}.
	 * @param ctx the parse tree
	 */
	void exitPrint_block(MyParser.Print_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#write_block}.
	 * @param ctx the parse tree
	 */
	void enterWrite_block(MyParser.Write_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#write_block}.
	 * @param ctx the parse tree
	 */
	void exitWrite_block(MyParser.Write_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#write_line_block}.
	 * @param ctx the parse tree
	 */
	void enterWrite_line_block(MyParser.Write_line_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#write_line_block}.
	 * @param ctx the parse tree
	 */
	void exitWrite_line_block(MyParser.Write_line_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defvar_block}.
	 * @param ctx the parse tree
	 */
	void enterDefvar_block(MyParser.Defvar_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defvar_block}.
	 * @param ctx the parse tree
	 */
	void exitDefvar_block(MyParser.Defvar_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#setq_block}.
	 * @param ctx the parse tree
	 */
	void enterSetq_block(MyParser.Setq_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#setq_block}.
	 * @param ctx the parse tree
	 */
	void exitSetq_block(MyParser.Setq_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void enterCond_block(MyParser.Cond_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#cond_block}.
	 * @param ctx the parse tree
	 */
	void exitCond_block(MyParser.Cond_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#loop_block}.
	 * @param ctx the parse tree
	 */
	void enterLoop_block(MyParser.Loop_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#loop_block}.
	 * @param ctx the parse tree
	 */
	void exitLoop_block(MyParser.Loop_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#let_block}.
	 * @param ctx the parse tree
	 */
	void enterLet_block(MyParser.Let_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#let_block}.
	 * @param ctx the parse tree
	 */
	void exitLet_block(MyParser.Let_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#let_star_block}.
	 * @param ctx the parse tree
	 */
	void enterLet_star_block(MyParser.Let_star_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#let_star_block}.
	 * @param ctx the parse tree
	 */
	void exitLet_star_block(MyParser.Let_star_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#unless_block}.
	 * @param ctx the parse tree
	 */
	void enterUnless_block(MyParser.Unless_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#unless_block}.
	 * @param ctx the parse tree
	 */
	void exitUnless_block(MyParser.Unless_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#when_block}.
	 * @param ctx the parse tree
	 */
	void enterWhen_block(MyParser.When_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#when_block}.
	 * @param ctx the parse tree
	 */
	void exitWhen_block(MyParser.When_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#lambda_block}.
	 * @param ctx the parse tree
	 */
	void enterLambda_block(MyParser.Lambda_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#lambda_block}.
	 * @param ctx the parse tree
	 */
	void exitLambda_block(MyParser.Lambda_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(MyParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(MyParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defmacro_block}.
	 * @param ctx the parse tree
	 */
	void enterDefmacro_block(MyParser.Defmacro_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defmacro_block}.
	 * @param ctx the parse tree
	 */
	void exitDefmacro_block(MyParser.Defmacro_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#case_block}.
	 * @param ctx the parse tree
	 */
	void enterCase_block(MyParser.Case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#case_block}.
	 * @param ctx the parse tree
	 */
	void exitCase_block(MyParser.Case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#tagbody_block}.
	 * @param ctx the parse tree
	 */
	void enterTagbody_block(MyParser.Tagbody_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#tagbody_block}.
	 * @param ctx the parse tree
	 */
	void exitTagbody_block(MyParser.Tagbody_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#throw_block}.
	 * @param ctx the parse tree
	 */
	void enterThrow_block(MyParser.Throw_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#throw_block}.
	 * @param ctx the parse tree
	 */
	void exitThrow_block(MyParser.Throw_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#catch_block}.
	 * @param ctx the parse tree
	 */
	void enterCatch_block(MyParser.Catch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#catch_block}.
	 * @param ctx the parse tree
	 */
	void exitCatch_block(MyParser.Catch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_open_file_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_open_file_block(MyParser.With_open_file_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_open_file_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_open_file_block(MyParser.With_open_file_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_output_to_file_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_output_to_file_block(MyParser.With_output_to_file_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_output_to_file_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_output_to_file_block(MyParser.With_output_to_file_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_input_from_string_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_input_from_string_block(MyParser.With_input_from_string_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_input_from_string_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_input_from_string_block(MyParser.With_input_from_string_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_output_to_string_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_output_to_string_block(MyParser.With_output_to_string_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_output_to_string_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_output_to_string_block(MyParser.With_output_to_string_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_stream_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_stream_block(MyParser.With_stream_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_stream_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_stream_block(MyParser.With_stream_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_timeout_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_timeout_block(MyParser.With_timeout_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_timeout_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_timeout_block(MyParser.With_timeout_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#type_block}.
	 * @param ctx the parse tree
	 */
	void enterType_block(MyParser.Type_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#type_block}.
	 * @param ctx the parse tree
	 */
	void exitType_block(MyParser.Type_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#type_of_block}.
	 * @param ctx the parse tree
	 */
	void enterType_of_block(MyParser.Type_of_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#type_of_block}.
	 * @param ctx the parse tree
	 */
	void exitType_of_block(MyParser.Type_of_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#class_block}.
	 * @param ctx the parse tree
	 */
	void enterClass_block(MyParser.Class_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#class_block}.
	 * @param ctx the parse tree
	 */
	void exitClass_block(MyParser.Class_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#not_block}.
	 * @param ctx the parse tree
	 */
	void enterNot_block(MyParser.Not_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#not_block}.
	 * @param ctx the parse tree
	 */
	void exitNot_block(MyParser.Not_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#or_block}.
	 * @param ctx the parse tree
	 */
	void enterOr_block(MyParser.Or_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#or_block}.
	 * @param ctx the parse tree
	 */
	void exitOr_block(MyParser.Or_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#and_block}.
	 * @param ctx the parse tree
	 */
	void enterAnd_block(MyParser.And_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#and_block}.
	 * @param ctx the parse tree
	 */
	void exitAnd_block(MyParser.And_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#import_block}.
	 * @param ctx the parse tree
	 */
	void enterImport_block(MyParser.Import_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#import_block}.
	 * @param ctx the parse tree
	 */
	void exitImport_block(MyParser.Import_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#export_block}.
	 * @param ctx the parse tree
	 */
	void enterExport_block(MyParser.Export_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#export_block}.
	 * @param ctx the parse tree
	 */
	void exitExport_block(MyParser.Export_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#do_block}.
	 * @param ctx the parse tree
	 */
	void enterDo_block(MyParser.Do_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#do_block}.
	 * @param ctx the parse tree
	 */
	void exitDo_block(MyParser.Do_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defparameter_block}.
	 * @param ctx the parse tree
	 */
	void enterDefparameter_block(MyParser.Defparameter_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defparameter_block}.
	 * @param ctx the parse tree
	 */
	void exitDefparameter_block(MyParser.Defparameter_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defconstant_block}.
	 * @param ctx the parse tree
	 */
	void enterDefconstant_block(MyParser.Defconstant_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defconstant_block}.
	 * @param ctx the parse tree
	 */
	void exitDefconstant_block(MyParser.Defconstant_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defgeneric_block}.
	 * @param ctx the parse tree
	 */
	void enterDefgeneric_block(MyParser.Defgeneric_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defgeneric_block}.
	 * @param ctx the parse tree
	 */
	void exitDefgeneric_block(MyParser.Defgeneric_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defstruct_block}.
	 * @param ctx the parse tree
	 */
	void enterDefstruct_block(MyParser.Defstruct_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defstruct_block}.
	 * @param ctx the parse tree
	 */
	void exitDefstruct_block(MyParser.Defstruct_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defmethod_block}.
	 * @param ctx the parse tree
	 */
	void enterDefmethod_block(MyParser.Defmethod_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defmethod_block}.
	 * @param ctx the parse tree
	 */
	void exitDefmethod_block(MyParser.Defmethod_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defclass_block}.
	 * @param ctx the parse tree
	 */
	void enterDefclass_block(MyParser.Defclass_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defclass_block}.
	 * @param ctx the parse tree
	 */
	void exitDefclass_block(MyParser.Defclass_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#fuction_block}.
	 * @param ctx the parse tree
	 */
	void enterFuction_block(MyParser.Fuction_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#fuction_block}.
	 * @param ctx the parse tree
	 */
	void exitFuction_block(MyParser.Fuction_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#progn_block}.
	 * @param ctx the parse tree
	 */
	void enterProgn_block(MyParser.Progn_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#progn_block}.
	 * @param ctx the parse tree
	 */
	void exitProgn_block(MyParser.Progn_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#valus_block}.
	 * @param ctx the parse tree
	 */
	void enterValus_block(MyParser.Valus_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#valus_block}.
	 * @param ctx the parse tree
	 */
	void exitValus_block(MyParser.Valus_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#use_package_block}.
	 * @param ctx the parse tree
	 */
	void enterUse_package_block(MyParser.Use_package_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#use_package_block}.
	 * @param ctx the parse tree
	 */
	void exitUse_package_block(MyParser.Use_package_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#deftype_block}.
	 * @param ctx the parse tree
	 */
	void enterDeftype_block(MyParser.Deftype_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#deftype_block}.
	 * @param ctx the parse tree
	 */
	void exitDeftype_block(MyParser.Deftype_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#declaim_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclaim_block(MyParser.Declaim_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#declaim_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclaim_block(MyParser.Declaim_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#letrec_blokc}.
	 * @param ctx the parse tree
	 */
	void enterLetrec_blokc(MyParser.Letrec_blokcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#letrec_blokc}.
	 * @param ctx the parse tree
	 */
	void exitLetrec_blokc(MyParser.Letrec_blokcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(MyParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(MyParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#go_block}.
	 * @param ctx the parse tree
	 */
	void enterGo_block(MyParser.Go_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#go_block}.
	 * @param ctx the parse tree
	 */
	void exitGo_block(MyParser.Go_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#handler_bind_block}.
	 * @param ctx the parse tree
	 */
	void enterHandler_bind_block(MyParser.Handler_bind_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#handler_bind_block}.
	 * @param ctx the parse tree
	 */
	void exitHandler_bind_block(MyParser.Handler_bind_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#restart_bind_block}.
	 * @param ctx the parse tree
	 */
	void enterRestart_bind_block(MyParser.Restart_bind_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#restart_bind_block}.
	 * @param ctx the parse tree
	 */
	void exitRestart_bind_block(MyParser.Restart_bind_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#handler_case_block}.
	 * @param ctx the parse tree
	 */
	void enterHandler_case_block(MyParser.Handler_case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#handler_case_block}.
	 * @param ctx the parse tree
	 */
	void exitHandler_case_block(MyParser.Handler_case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#restart_case_block}.
	 * @param ctx the parse tree
	 */
	void enterRestart_case_block(MyParser.Restart_case_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#restart_case_block}.
	 * @param ctx the parse tree
	 */
	void exitRestart_case_block(MyParser.Restart_case_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_accessors_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_accessors_block(MyParser.With_accessors_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_accessors_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_accessors_block(MyParser.With_accessors_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#with_slots_block}.
	 * @param ctx the parse tree
	 */
	void enterWith_slots_block(MyParser.With_slots_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#with_slots_block}.
	 * @param ctx the parse tree
	 */
	void exitWith_slots_block(MyParser.With_slots_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#slot_value_block}.
	 * @param ctx the parse tree
	 */
	void enterSlot_value_block(MyParser.Slot_value_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#slot_value_block}.
	 * @param ctx the parse tree
	 */
	void exitSlot_value_block(MyParser.Slot_value_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#initialize_instance_block}.
	 * @param ctx the parse tree
	 */
	void enterInitialize_instance_block(MyParser.Initialize_instance_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#initialize_instance_block}.
	 * @param ctx the parse tree
	 */
	void exitInitialize_instance_block(MyParser.Initialize_instance_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#make_instance_block}.
	 * @param ctx the parse tree
	 */
	void enterMake_instance_block(MyParser.Make_instance_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#make_instance_block}.
	 * @param ctx the parse tree
	 */
	void exitMake_instance_block(MyParser.Make_instance_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MyParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MyParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#block_block}.
	 * @param ctx the parse tree
	 */
	void enterBlock_block(MyParser.Block_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#block_block}.
	 * @param ctx the parse tree
	 */
	void exitBlock_block(MyParser.Block_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#return_block}.
	 * @param ctx the parse tree
	 */
	void enterReturn_block(MyParser.Return_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#return_block}.
	 * @param ctx the parse tree
	 */
	void exitReturn_block(MyParser.Return_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#return_from_block}.
	 * @param ctx the parse tree
	 */
	void enterReturn_from_block(MyParser.Return_from_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#return_from_block}.
	 * @param ctx the parse tree
	 */
	void exitReturn_from_block(MyParser.Return_from_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#defpackage_block}.
	 * @param ctx the parse tree
	 */
	void enterDefpackage_block(MyParser.Defpackage_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#defpackage_block}.
	 * @param ctx the parse tree
	 */
	void exitDefpackage_block(MyParser.Defpackage_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#in_package_block}.
	 * @param ctx the parse tree
	 */
	void enterIn_package_block(MyParser.In_package_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#in_package_block}.
	 * @param ctx the parse tree
	 */
	void exitIn_package_block(MyParser.In_package_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void enterBinding_list(MyParser.Binding_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#binding_list}.
	 * @param ctx the parse tree
	 */
	void exitBinding_list(MyParser.Binding_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#global_variable}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_variable(MyParser.Global_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#global_variable}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_variable(MyParser.Global_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable(MyParser.Local_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#local_variable}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable(MyParser.Local_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#redefine}.
	 * @param ctx the parse tree
	 */
	void enterRedefine(MyParser.RedefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#redefine}.
	 * @param ctx the parse tree
	 */
	void exitRedefine(MyParser.RedefineContext ctx);
}