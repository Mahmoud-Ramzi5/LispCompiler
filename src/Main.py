from antlr4 import *

import sys
from AST import AST
from antlr4.tree.Tree import TerminalNodeImpl
from antlr4.tree.Tree import ParseTree
from antlr4.tree.Trees import Trees
from graphviz import Digraph

from MyLexer import MyLexer
from MyParser import MyParser
from MyParserVisitor import MyParserVisitor


def print_parse(tree, level):
    # This function will print the tree with indentation to represent the structure
    if tree is None:
        return

    # Check if the node is a terminal (leaf) node or a non-terminal (internal) node
    if isinstance(tree, TerminalNode):
        # If it's a terminal node, print its text
        print('  ' * level + str(tree.getText()))
    else:
        # If it's a non-terminal node, print its text and recursively print its children
        print('  ' * level + str(tree.getText()))

        # Recursively print all children (if any)
        for child in tree.getChildren():
            print_parse(child, level + 1)


def print_ast(tree, parser, indent=""):
    """
    Recursively print the AST tree with indentation.
    :param tree: The parse tree (or subtree)
    :param parser: The parser object to get rule names
    :param indent: The current indentation level (for visual hierarchy)
    """
    if isinstance(tree, TerminalNode):  # Check if it's a terminal node
        if tree.getText() not in ['(', ')']:
            print(f"{indent}{tree.getText()}")  # Print the text (token)
    else:
        # For non-terminal nodes, print the rule name (rule index in the grammar)
        rule_name = parser.ruleNames[tree.getRuleIndex()]  # Get rule name from parser
        print(f"{indent}{rule_name}")  # Print the rule name
        for child in tree.getChildren():
            print_ast(child, parser, indent + "  ")  # Increase indentation for child nodes


def add_nodes_to_graph(tree, parser, graph, parent=None):
    """
    Recursively traverse the parse tree and add nodes to the Graphviz graph.
    :param tree: The current node in the parse tree.
    :param graph: The Graphviz Digraph instance.
    :param parent: The parent node (for connecting edges).
    """
    node_id = id(tree)  # Unique identifier for each node

    if isinstance(tree, TerminalNode):  # TerminalNode (leaf node)
        # Terminal node: Use the token text as the label\
        token_text = tree.getText().strip()
        if not token_text or token_text in ["(", ")"]:  # Skip empty or irrelevant nodes
            return
        graph.node(str(node_id), label=token_text, shape='ellipse', color='black')
    else:
        # Non-terminal node: Use the rule name as the label
        rule_name = parser.ruleNames[tree.getRuleIndex()]  # Get rule name from parser
        # rule_name = tree.getText() if tree.getText() else "UNKNOWN"
        graph.node(str(node_id), label=rule_name, shape='box', color='blue')

    if parent:
        graph.edge(str(parent), str(node_id))  # Add edge from parent to this node

    # Recursively add child nodes only if the current node has children
    if hasattr(tree, 'getChildren'):  # Only non-terminal nodes have getChildren()
        for child in tree.getChildren():
            add_nodes_to_graph(child, parser, graph, node_id)


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
    # prog_context = parser.prog()
    tree = parser.prog()

    # # Print the parse tree
    # print_parse(tree, 0)
    # # print(tree.toStringTree(recog=parser))
    #
    # print("Parse Tree:")
    # print_ast(tree, parser)

    # Create a Graphviz Digraph instance
    graph = Digraph(comment='Parse Tree')

    # Add nodes to the graph recursively
    add_nodes_to_graph(tree, parser, graph)

    # Render the tree to a file (e.g., in PDF or PNG format)
    output_file = 'parse_tree'
    graph.render(output_file, view=True)  # This will create a 'parse_tree.pdf' file
    print(f"Parse tree visualized in {output_file}.pdf")
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
