import sys
from antlr4 import *
from xAGLLexer import xAGLLexer
from xAGLParser import xAGLParser
from xAGLInterpreter import xAGLInterpreter

def main(argv):
   input_stream = FileStream(argv)
   lexer = xAGLLexer(input_stream)
   stream = CommonTokenStream(lexer)
   parser = xAGLParser(stream)
   tree = parser.program()

   visitor0 = xAGLInterpreter()
   if parser.getNumberOfSyntaxErrors() == 0:
      visitor0.visit(tree)

if __name__ == '__main__':
   #main(sys.argv)
   #main(sys.argv[1])
   if len(sys.argv) != 2:
      print("Usage: python3 main.py <file.xagl>")
   else:
      main(sys.argv[1])