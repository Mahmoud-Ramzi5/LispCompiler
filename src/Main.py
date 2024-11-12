from antlr4 import *
from MyLexer import MyLexer  # Replace with the name of your generated lexer class


def main():
    # Specify the path to your test file
    input_file = "D:/U Projects/lispCompilerPython/src/test.txt"

    # Create an input stream from the test file
    try:
        input_stream = FileStream(input_file, encoding="utf-8")
    except IOError as e:
        raise RuntimeError(f"Failed to open file: {e}")

    # Create a lexer instance
    lexer = MyLexer(input_stream)

    # Create a token stream from the lexer
    tokens = CommonTokenStream(lexer)

    # Print the tokens
    tokens.fill()
    for token in tokens.getTokens(0, len(tokens.tokens) - 1):
        print(token)


if __name__ == "__main__":
    main()
