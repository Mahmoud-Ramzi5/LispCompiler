from antlr4 import *

import sys
from AST import AST
from MyLexer import MyLexer
from MyParser import MyParser
from ASTPDFBuilder import ASTPDFBuilder


def main():
    # if len(sys.argv) != 2:
    #     print("Usage: python expression_app.py <file_name>")
    #     sys.exit(1)
    # file_name = sys.argv[1]

    file_name = "tests/Test.txt"

    # Step 1: Parse the input file
    parser = get_parser(file_name)

    if not parser:
        print("Failed to create parser.")
        sys.exit(1)

    # Step 2: Build the parse tree (starting from 'prog')
    tree = parser.prog()
    ast = AST(tree, parser)
    # print("AST")
    # print(ast)

    # solve simple equations
    ast.solve_equation(tree, variable_values={"x": 5, "y": 10})

    # Create a Graphviz Digraph instance
    PDF = ASTPDFBuilder(tree, parser)
    # Parse Tree
    # PDF.create_pdf_tree("parse_tree")

    # AST Tree
    # PDF.create_pdf_tree('ast_tree')

    return


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


if __name__ == "__main__":
    main()
