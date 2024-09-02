@SuppressWarnings("CheckReturnValue")
public class Executer extends CalculatorBaseVisitor<Double> {

   @Override
   public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Double visitStat(CalculatorParser.StatContext ctx) {
      Double res = (Double) visit(ctx.expr());
      if (res != null) {
         System.out.println("Resultado: " + res);
      }
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double res = null;
      Double a = visit(ctx.expr(0));

      Double b = visit(ctx.expr(1));

      String op = ctx.op.getText();

      switch (op) {
         case "+":
            res = a + b;
            break;
         case "-":
            res = a - b;
            break;
         default:
            System.out.println("Operador inválido");
      }
      return res;
   }

   @Override
   public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Double res = null;
      return visit(ctx.expr());
      // return res;
   }

   @Override
   public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Double res = null;
      return Double.parseDouble(ctx.Integer().getText());
      // return res;
   }

   @Override
   public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Double res = null;
      Double a = visit(ctx.expr(0));

      Double b = visit(ctx.expr(1));

      String op = ctx.op.getText();

      switch (op) {
         case "*":
            res = a * b;
            break;
         case "/":
            res = a / b;
            break;
         case "%":
            res = a % b;
            break;
         default:
            System.out.println("Operador inválido");
      }
      return res;
      // return res;
   }
}