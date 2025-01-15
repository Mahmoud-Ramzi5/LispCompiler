from antlr4 import *

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


def print_parse(tree, level):
    # This function will print the tree with indentation to represent the structure
    if tree is None:
        return

    # Check if the node is a terminal (leaf) node or a non-terminal (internal) node
    if isinstance(tree, TerminalNode):
        # If it's a terminal node, print its text
        print("  " * level + str(tree.getText()))
    else:
        # If it's a non-terminal node, print its text and recursively print its children
        print("  " * level + str(tree.getText()))

        # Recursively print all children (if any)
        for child in tree.getChildren():
            print_parse(child, level + 1)


def extract_node(tree, parser, variable_values={}):
    if isinstance(tree, TerminalNode):
        print("TerminalNode")

    elif hasattr(tree, "getChildren"):
        rule_name = parser.ruleNames[tree.getRuleIndex()]  # Get rule name from parser
        if rule_name == "function_arguments":
            for child in tree.getChildren():
                child_token = child.getSymbol()
                child_text = child.getText().strip()
                child_type = parser.symbolicNames[child_token.type]
                if child_type in ["VAR", "ATOM"]:
                    variable_values[child_text] = 0

        for child in tree.getChildren():
            extract_node(child, parser, variable_values)
    return
