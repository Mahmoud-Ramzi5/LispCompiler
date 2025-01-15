# Generated from MyParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MyParser import MyParser
else:
    from MyParser import MyParser

# This class defines a complete generic visitor for a parse tree produced by MyParser.

class MyParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MyParser#prog.
    def visitProg(self, ctx:MyParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#lists.
    def visitLists(self, ctx:MyParser.ListsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#list.
    def visitList(self, ctx:MyParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#equation.
    def visitEquation(self, ctx:MyParser.EquationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#conditional_equation.
    def visitConditional_equation(self, ctx:MyParser.Conditional_equationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#print_block.
    def visitPrint_block(self, ctx:MyParser.Print_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#write_block.
    def visitWrite_block(self, ctx:MyParser.Write_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#write_line_block.
    def visitWrite_line_block(self, ctx:MyParser.Write_line_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#defparameter_block.
    def visitDefparameter_block(self, ctx:MyParser.Defparameter_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#defconstant_block.
    def visitDefconstant_block(self, ctx:MyParser.Defconstant_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#defmacro_block.
    def visitDefmacro_block(self, ctx:MyParser.Defmacro_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#deftype_block.
    def visitDeftype_block(self, ctx:MyParser.Deftype_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#defvar_block.
    def visitDefvar_block(self, ctx:MyParser.Defvar_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#define_function.
    def visitDefine_function(self, ctx:MyParser.Define_functionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#function_arguments.
    def visitFunction_arguments(self, ctx:MyParser.Function_argumentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#setq_block.
    def visitSetq_block(self, ctx:MyParser.Setq_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#defclass_block.
    def visitDefclass_block(self, ctx:MyParser.Defclass_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#class_block.
    def visitClass_block(self, ctx:MyParser.Class_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#case_block.
    def visitCase_block(self, ctx:MyParser.Case_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#if_condition.
    def visitIf_condition(self, ctx:MyParser.If_conditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#when_block.
    def visitWhen_block(self, ctx:MyParser.When_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#unless_block.
    def visitUnless_block(self, ctx:MyParser.Unless_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#cond_block.
    def visitCond_block(self, ctx:MyParser.Cond_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#loop_block.
    def visitLoop_block(self, ctx:MyParser.Loop_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#do_block.
    def visitDo_block(self, ctx:MyParser.Do_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#and_block.
    def visitAnd_block(self, ctx:MyParser.And_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#or_block.
    def visitOr_block(self, ctx:MyParser.Or_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#not_block.
    def visitNot_block(self, ctx:MyParser.Not_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#throw_block.
    def visitThrow_block(self, ctx:MyParser.Throw_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#catch_block.
    def visitCatch_block(self, ctx:MyParser.Catch_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#format_block.
    def visitFormat_block(self, ctx:MyParser.Format_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#type_block.
    def visitType_block(self, ctx:MyParser.Type_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#type_of_block.
    def visitType_of_block(self, ctx:MyParser.Type_of_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#declaim_block.
    def visitDeclaim_block(self, ctx:MyParser.Declaim_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#let_block.
    def visitLet_block(self, ctx:MyParser.Let_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#let_star_block.
    def visitLet_star_block(self, ctx:MyParser.Let_star_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#lambda_block.
    def visitLambda_block(self, ctx:MyParser.Lambda_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#function_block.
    def visitFunction_block(self, ctx:MyParser.Function_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#return_block.
    def visitReturn_block(self, ctx:MyParser.Return_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#value.
    def visitValue(self, ctx:MyParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#function_call.
    def visitFunction_call(self, ctx:MyParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#return_from_block.
    def visitReturn_from_block(self, ctx:MyParser.Return_from_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MyParser#literal.
    def visitLiteral(self, ctx:MyParser.LiteralContext):
        return self.visitChildren(ctx)



del MyParser