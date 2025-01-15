from antlr4 import *
from graphviz import Digraph


class ASTPDFBuilder:
    def __init__(self, base_tree, parser):
        self.base_tree = base_tree
        self.parser = parser
        self.graph = None

    def add_nodes_to_graph(self, tree, type, parent=None):
        """
        Recursively traverse the parse tree and add nodes to the Graphviz graph.
        :param tree: The current node in the parse tree.
        :param type: Tree type (ast_tree or parse_tree).
        :param parent: The parent node (for connecting edges).
        """
        node_id = id(tree)  # Unique identifier for each node
        if isinstance(tree, TerminalNode):  # TerminalNode (leaf node)
            # Terminal node: Use the token text as the label
            token_text = tree.getText().strip()
            if type == "ast_tree":
                # to not ast tree:
                if token_text in [
                    "(",
                    ")",
                    "[",
                    "]",
                    "<",
                    ">",
                    ":",
                ]:
                    # Skip empty or irrelevant nodes
                    return
                else:
                    self.graph.node(
                        str(node_id),
                        label=f"{token_text}",
                        shape="ellipse",
                        color="black",
                    )

            elif type == "parse_tree":
                # to make parse tree
                token = tree.getSymbol()
                token_type = self.parser.symbolicNames[token.type]
                self.graph.node(
                    str(node_id),
                    label=f"{token_type}: {token_text}",
                    shape="ellipse",
                    color="black",
                )
            else:
                return
        else:
            # Non-terminal node: Use the rule name as the label
            rule_name = self.parser.ruleNames[
                tree.getRuleIndex()
            ]  # Get rule name from parser

            self.graph.node(str(node_id), label=rule_name, shape="box", color="blue")

        if parent:
            self.graph.edge(
                str(parent), str(node_id)
            )  # Add edge from parent to this node

        # Recursively add child nodes only if the current node has children
        if hasattr(tree, "getChildren"):  # Only non-terminal nodes have getChildren()
            for child in tree.getChildren():
                self.add_nodes_to_graph(child, type, node_id)

    def create_pdf_tree(self, type):
        # Create a Graphviz Digraph instance
        self.graph = Digraph(comment=type)

        # Add nodes to the graph recursively
        self.add_nodes_to_graph(self.base_tree, type)

        # Render the tree to a file (e.g., in PDF or PNG format)
        output_file = f"pdfs/{type}"
        self.graph.render(output_file, view=True)  # This will create a 'tree.pdf' file
        print(f"Tree visualized in {output_file}.pdf")
        return
