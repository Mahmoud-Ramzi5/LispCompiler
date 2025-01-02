from antlr4 import *

import sys
from AST import AST
from antlr4.tree.Tree import TerminalNodeImpl
from antlr4.tree.Tree import ParseTree
from antlr4.tree.Trees import Trees

from MyLexer import MyLexer
from MyParser import MyParser
from MyParserVisitor import MyParserVisitor


def main():
    # if len(sys.argv) != 2:
    #     print("Usage: python expression_app.py <file_name>")
    #     sys.exit(1)
    # file_name = sys.argv[1]

    file_name = "testLisp.lisp"

    # Step 1: Parse the input file
    parser = get_parser(file_name)

    if not parser:
        print("Failed to create parser.")
        sys.exit(1)

    # Step 2: Build the parse tree (starting from 'prog')
    prog_context = parser.prog()
    print(prog_context.toStringTree(recog=parser))
    dump(prog_context, ruleNames=parser.ruleNames)  # pretty printed version

    # Step 3: Convert parse tree to AST using the visitor
    visitor = MyParserVisitor()
    print("hi this is run Ok")

    ast = visitor.visit(prog_context)
    print(ast)

    # Step 4: Pretty print the AST
    if ast:
        print(ast.pretty_print(""))

    # Step 5: Handle semantic errors
    # if visitor.semantics_errors:
    #     for error in visitor.semantics_errors:
    #         print(error)


def get_parser(file_name):
    """Creates and returns the ExprParser for the given file."""
    try:
        # Read the input file
        input_stream = FileStream(file_name, encoding="utf-8")

        # Create lexer and token stream
        lexer = MyLexer(input_stream)
        tokens = CommonTokenStream(lexer)

        # Create parser
        return MyParser(tokens)
    except Exception as e:
        print(f"Error creating parser: {e}")
        return None


def dump(node, depth=0, ruleNames=None):
    depthStr = '. ' * depth
    if isinstance(node, TerminalNodeImpl):
        print(f'{depthStr}{node.symbol}')
    else:
        print(f'{depthStr}{Trees.getNodeText(node, ruleNames)}')
        for child in node.children:
            dump(child, depth + 1, ruleNames)


# def main():
#     # Specify the path to your test file
#     input_file = "testLisp.lisp"
#
#     # Create an input stream from the test file
#     try:
#         input_stream = FileStream(input_file, encoding="utf-8")
#     except IOError as e:
#         raise RuntimeError(f"Failed to open file: {e}")
#
#     # Create a lexer instance
#     lexer = MyLexer(input_stream)
#
#     # Create a token stream from the lexer
#     tokens = CommonTokenStream(lexer)
#
#     # Print the tokens
#     tokens.fill()
#     for token in tokens.getTokens(0, len(tokens.tokens) - 1):
#         print(token)


if __name__ == "__main__":
    main()
