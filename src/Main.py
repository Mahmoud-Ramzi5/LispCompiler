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


def add_nodes_to_graph(tree, parser, graph, parent=None, variable_values={}):
    """
    Recursively traverse the parse tree and add nodes to the Graphviz graph.
    :param tree: The current node in the parse tree.
    :param parser: The parser instance used to get rule names.
    :param graph: The Graphviz Digraph instance.
    :param parent: The parent node (for connecting edges).
    :param variable_values: A dictionary mapping variable names to their values for evaluation.
    """
    node_id = id(tree)  # Unique identifier for each node
    if isinstance(tree, TerminalNode):  # TerminalNode (leaf node)
        # to make parse tree not ast tree: just comment the three lines below
        token_text = tree.getText().strip()
        if not token_text or token_text in ["(", ")", "[", "]", "<", ">", ":"]:  # Skip empty or irrelevant nodes
            return

        # to make parse tree
        # var = tree.getSymbol()
        # text = tree.getText().strip()
        # type = parser.symbolicNames[var.type]
        # label=f"{type}={text}"

        # Terminal node: Use the token text as the label
        graph.node(str(node_id), label=token_text , shape='ellipse', color='black')
    else:
        # Non-terminal node: Use the rule name as the label
        rule_name = parser.ruleNames[tree.getRuleIndex()]  # Get rule name from parser

        # TODO tried to print output of code some issues remained unfixed
        if rule_name == "equation":
            equation_text = extract_equation_text(tree, variable_values)
            result = evaluate_equation(tree, variable_values)
            print(f"Equation detected: ({equation_text}) the result is {result}")
        # elif rule_name == "conditional_equation":
        #     print(f"Conditional Equation detected: {equation_text}")
        # elif rule_name == "if_condition":
        #     print(f"If condition detected: {equation_text}")
        # elif rule_name == "print_block":
        #     print(f"Print block detected: {equation_text}")

        graph.node(str(node_id), label=rule_name, shape='box', color='blue')

    if parent:
        graph.edge(str(parent), str(node_id))  # Add edge from parent to this node

    # Recursively add child nodes only if the current node has children
    if hasattr(tree, 'getChildren'):  # Only non-terminal nodes have getChildren()
        for child in tree.getChildren():
            add_nodes_to_graph(child, parser, graph, node_id, variable_values)

def extract_node(tree, parser, variable_values={}):
    if isinstance(tree, TerminalNode):
        print('TerminalNode')

    elif hasattr(tree, 'getChildren'):
        rule_name = parser.ruleNames[tree.getRuleIndex()]  # Get rule name from parser
        if rule_name == 'function_arguments':
            for child in tree.getChildren():
                child_token = child.getSymbol()
                child_text = child.getText().strip()
                child_type = parser.symbolicNames[child_token.type]
                if child_type in ['VAR', 'ATOM']:
                    variable_values[child_text] = 0

        for child in tree.getChildren():
            extract_node(child, parser, variable_values)
    return


def extract_equation_text(tree, variable_values={}):
    if isinstance(tree, TerminalNode):
        token_text = tree.getText().strip()
        if token_text.isdigit():
            return str(int(token_text))  # Convert to string
        elif token_text in variable_values:
            return str(variable_values[token_text])  # Return variable value as string
        else:
            return token_text  # Return variable name as is

    elif hasattr(tree, 'getChildren'):
        return " ".join(str(extract_equation_text(child, variable_values)) for child in tree.getChildren())

    return ""

def evaluate_equation(tree, variable_values={}):
    """
    Recursively evaluate an arithmetic equation from the parse tree in a Lisp context.
    :param tree: The current node in the parse tree.
    :param variable_values: A dictionary mapping variable names to their values.
    :return: The result of the evaluated arithmetic expression.
    """
    if isinstance(tree, TerminalNode):
        token_text = tree.getText()
        if token_text.isdigit():
            return int(token_text)  # Return integer value
        elif token_text in variable_values:
            return variable_values[token_text]  # Return variable value
        elif token_text in ['+', '-', '*', '/']:
            return token_text
        # else:
        #     raise ValueError(f"Undefined variable: {token_text}")

    elif hasattr(tree, 'getChildren'):
        children_values = [evaluate_equation(child, variable_values) for child in tree.getChildren()]

        operator = children_values.pop(0)  # Get the operator from the current node
        if operator == '+':
            return sum(children_values)
        elif operator == '-':
            return children_values[0] - sum(children_values[1:])
        elif operator == '*':
            result = 1
            for value in children_values:
                result *= value
            return result
        elif operator == '/':
            result = children_values[0]
            for value in children_values[1:]:
                result /= value
            return result
        # else:
        #     raise ValueError(f"Unsupported operator: {operator}")

    return 0


# def extract_conditional_equation_text(tree):
#     """
#     Recursively extract the full text of an equation from the parse tree.
#     :param tree: The current node in the parse tree.
#     :return: A string representing the equation.
#     """
#     if isinstance(tree, TerminalNode):
#         return tree.getText().strip()  # Terminal nodes contain tokens
#     elif hasattr(tree, 'getChildren'):
#         return " ".join(extract_conditional_equation_text(child) for child in tree.getChildren())
#     return ""

# def extract_print_block_text(tree):
#     """
#     Recursively extract the full text of an equation from the parse tree.
#     :param tree: The current node in the parse tree.
#     :return: A string representing the equation.
#     """
#     if isinstance(tree, TerminalNode):
#         return tree.getText().strip()  # Terminal nodes contain tokens
#     elif hasattr(tree, 'getChildren'):
#         return " ".join(extract_print_block_text(child) for child in tree.getChildren())
#     return ""


def main():
    # if len(sys.argv) != 2:
    #     print("Usage: python expression_app.py <file_name>")
    #     sys.exit(1)
    # file_name = sys.argv[1]

    file_name = "addFunctionTest.txt"

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
    variable_values = {}

    # Add nodes to the graph recursively
    add_nodes_to_graph(tree, parser, graph,variable_values=variable_values)

    # Render the tree to a file (e.g., in PDF or PNG format)
    # output_file = 'parse_tree'
    output_file = 'ast_tree'
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
