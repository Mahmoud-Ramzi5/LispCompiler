from antlr4 import *


class AST:
    def __init__(self, base_tree, parser):
        self.base_tree = base_tree
        self.parser = parser

    def __str__(self, indent=""):
        return self.visitAst(self.base_tree, indent)

    def visitAst(self, tree, indent=""):
        """
        Recursively return the AST tree with indentation.
        :param tree: The parse tree (or subtree)
        :param indent: The current indentation level (for visual hierarchy)
        """
        if isinstance(tree, TerminalNode):  # Check if it's a terminal node
            # For terminal nodes, return token name followed by token value
            token = tree.getSymbol()
            token_text = tree.getText().strip()
            token_type = self.parser.symbolicNames[token.type]

            if token_text not in ["(", ")", "[", "]", "<", ">", ":"]:
                return (
                    f"{indent} {token_type}: {token_text} \n"  # Print the text (token)
                )
            return ""
        else:
            # For non-terminal nodes, return the rule name (rule index in the grammar)
            rule_name = self.parser.ruleNames[
                tree.getRuleIndex()
            ]  # Get rule name from parser
            str_val = f"{indent} {rule_name} \n"  # Print the rule name
            for child in tree.getChildren():
                str_val += self.visitAst(
                    child, indent + "  "
                )  # Increase indentation for child nodes
            return str_val

    def solve_equation(self, tree, variable_values={}):
        """
        Recursively evaluate an arithmetic equation from the parse tree in a Lisp context.
        :param tree: The current node in the parse tree.
        :param variable_values: A dictionary mapping variable names to their values.
        :return: The result of the extracted arithmetic expression.
        """
        if isinstance(tree, TerminalNode):  # TerminalNode (leaf node)
            return
        else:
            # Non-terminal node: Use the rule name as the label
            rule_name = self.parser.ruleNames[
                tree.getRuleIndex()
            ]  # Get rule name from parser

            # TODO tried to print output of code some issues remained unfixed
            if rule_name == "equation":
                equation_text = self.extract_equation(tree, variable_values)
                result = self.evaluate_equation(tree, variable_values)
                print(f"Equation detected: ({equation_text}) the result is {result}")
            # elif rule_name == "conditional_equation":
            #     print(f"Conditional Equation detected: {equation_text}")
            # elif rule_name == "if_condition":
            #     print(f"If condition detected: {equation_text}")
            # elif rule_name == "print_block":
            #     print(f"Print block detected: {equation_text}")

        # Recursively add child nodes only if the current node has children
        if hasattr(tree, "getChildren"):  # Only non-terminal nodes have getChildren()
            for child in tree.getChildren():
                self.solve_equation(child, variable_values)

    def extract_equation(self, tree, variable_values={}):
        """
        Recursively evaluate an arithmetic equation from the parse tree in a Lisp context.
        :param tree: The current node in the parse tree.
        :param variable_values: A dictionary mapping variable names to their values.
        :return: The result of the extracted arithmetic expression.
        """
        if isinstance(tree, TerminalNode):
            token_text = tree.getText().strip()
            if token_text.isdigit():
                return str(int(token_text))  # Convert to string
            elif token_text in variable_values:
                return str(
                    variable_values[token_text]
                )  # Return variable value as string
            else:
                return token_text  # Return variable name as is

        elif hasattr(tree, "getChildren"):
            return " ".join(
                str(self.extract_equation(child, variable_values))
                for child in tree.getChildren()
            )

        return ""

    def evaluate_equation(self, tree, variable_values={}):
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
            elif token_text in ["+", "-", "*", "/"]:
                return token_text
            # else:
            #     raise ValueError(f"Undefined variable: {token_text}")

        elif hasattr(tree, "getChildren"):
            children_values = [
                self.evaluate_equation(child, variable_values)
                for child in tree.getChildren()
            ]

            operator = children_values.pop(0)  # Get the operator from the current node
            if operator == "+":
                return sum(children_values)
            elif operator == "-":
                return children_values[0] - sum(children_values[1:])
            elif operator == "*":
                result = 1
                for value in children_values:
                    result *= value
                return result
            elif operator == "/":
                result = children_values[0]
                for value in children_values[1:]:
                    result /= value
                return result
            # else:
            #     raise ValueError(f"Unsupported operator: {operator}")

        return 0

    # def extract_conditional_equation_text(self, tree):
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

    # def extract_print_block_text(self, tree):
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
