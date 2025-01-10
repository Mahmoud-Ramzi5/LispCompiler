class ASTNode:
    def __init__(self, node_type, children=None, value=None):
        self.node_type = node_type
        self.children = children if children is not None else []
        self.value = value
class ListNode(ASTNode):
    def __init__(self, children=None):
        super().__init__("List", children)
class EquationNode(ASTNode):
    def __init__(self, operator, operands):
        super().__init__("Equation")
        self.operator = operator
        self.operands = operands

class PrintNode(ASTNode):
    def __init__(self,string):
        super().__init__("Print or Write Line",None,string)
        self.string = string
class WriteNode(ASTNode):
    def __init__(self,string):
        super().__init__("Write",None,string)
        self.string = string
class IfConditionNode(ASTNode):
    def __init__(self, condition):
        super().__init__("IfCondition",None,condition)
        self.condition = condition
class FunctionDeclareNode(ASTNode):
    def __init__(self):
        super().__init__("Function Declare",None,"defun")

class FunctionNameNode(ASTNode):
    def __init__(self,name):
        super.__init__("Function Name",None,name)
        self.name = name
class FunctionArgumentsNode(ASTNode):
    def __init__(self,llist):
        super().__init__("Function Arguments",None,llist)
        self.list = llist

class LoopNode(ASTNode):
    def __init__(self,):
        pass








