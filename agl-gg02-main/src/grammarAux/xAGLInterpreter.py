from antlr4 import *
from xAGLParser import xAGLParser
from xAGLVisitor import xAGLVisitor

class xAGLInterpreter(xAGLVisitor):
   def __init__(self):
      self.variables = {}

   def visitProgram(self, ctx:xAGLParser.ProgramContext):
      return self.visitChildren(ctx)

   def visitStatement(self, ctx:xAGLParser.StatementContext):
      return self.visitChildren(ctx)

   def visitAssignment(self, ctx:xAGLParser.AssignmentContext):
      obj = ctx.ID(0).getText()
      prop = ctx.ID(1).getText()
      value = self.visit(ctx.expression()) if ctx.expression() else "wait mouse click"
      print(f"Setting {obj}.{prop} to {value}")
      self.variables[f"{obj}.{prop}"] = value
      return self.visitChildren(ctx)

   def visitLoop(self, ctx:xAGLParser.LoopContext):
      id = ctx.ID().getText()
      start = int(ctx.INT(0).getText())
      end = int(ctx.INT(1).getText())
      print(f"Looping from {start} to {end} with variable {id}")
      for i in range(start, end + 1):
         print(f"Iteration {i}")
         self.visitChildren(ctx)
      return None

   def visitRefreshCommand(self, ctx:xAGLParser.RefreshCommandContext):
      id = ctx.ID().getText()
      if ctx.time():
         time_value = int(ctx.time().INT().getText())
         time_unit = ctx.time().getChild(1).getText()
         print(f"Refreshing {id} after {time_value} {time_unit}")
      else:
         print(f"Refreshing {id}")
      return None

   def visitMoveCommand(self, ctx:xAGLParser.MoveCommandContext):
      id = ctx.ID().getText()
      if ctx.vector().point() is not None:
         point_ctx = ctx.vector().point()
         x = self.visit(point_ctx.expression(0))
         y = self.visit(point_ctx.expression(1))
         print(f"Moving {id} by ({x}, {y})")
      else:
         vector_id = ctx.vector().ID().getText()
         print(f"Moving {id} by {vector_id}")
      return None

   def visitWaitCommand(self, ctx:xAGLParser.WaitCommandContext):
      print("Waiting for mouse click")
      return None

   def visitPropertyBlock(self, ctx:xAGLParser.PropertyBlockContext):
      id = ctx.ID().getText()
      print(f"Property block with {id}")
      return self.visitChildren(ctx)

   def visitExpression(self, ctx:xAGLParser.ExpressionContext):
      if ctx.INT():
         return int(ctx.INT().getText())
      elif ctx.FLOAT():
         return float(ctx.FLOAT().getText())
      elif ctx.STRING():
         return ctx.STRING().getText().strip('"')
      elif ctx.BOOL():
         return ctx.BOOL().getText() == 'true'
      elif ctx.point():
         return self.visit(ctx.point())
      elif ctx.vector():
         return self.visit(ctx.vector())
      elif ctx.time():
         return self.visit(ctx.time())
      elif ctx.ID():
         return ctx.ID().getText()
      elif ctx.waitCommand():
         return "wait mouse click"
      return None

   def visitPoint(self, ctx:xAGLParser.PointContext):
      x = self.visit(ctx.expression(0))
      y = self.visit(ctx.expression(1))
      return (x, y)

   def visitVector(self, ctx:xAGLParser.VectorContext):
      if ctx.point() is not None:
         return self.visit(ctx.point())
      return ctx.ID().getText()

   def visitTime(self, ctx:xAGLParser.TimeContext):
      time_value = int(ctx.INT().getText())
      time_unit = ctx.getChild(1).getText()
      return f"{time_value} {time_unit}"

