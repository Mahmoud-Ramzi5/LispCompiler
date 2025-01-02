class AST:
    def __init__(self, payload, children=None):
        self.payload = payload
        self.children = children if children is not None else []

    def pretty_print(self, indent=""):
        result = f"{indent}{self.payload}\n"
        for child in self.children:
            result += child.pretty_print(indent + "  ")
        return result