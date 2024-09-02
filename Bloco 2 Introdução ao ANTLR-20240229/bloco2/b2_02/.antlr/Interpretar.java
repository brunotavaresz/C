@SuppressWarnings("CheckReturnValue")
public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override 
   public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
      //return res;
   }

   @Override 
   public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double res = 0.0;
      // Evaluate the expression
      if (ctx.expr() == null) return null;

      res = visit(ctx.expr());
      if (res == null) {
         System.out.println("Error: division by zero");
      } else {
         System.out.println(res);
      }
      return 0.0;
      //return res;
   }

   @Override 
   public Double visitExpSuffix(SuffixCalculatorParser.ExpSuffixContext ctx) {
      Double res = null;
      // Get the first operand
      Double op1 = visit(ctx.expr(0));
      // Get the second operand
      Double op2 = visit(ctx.expr(1));
      // Get the operator
      String op = ctx.op.getText();
      // Perform the operation
      switch (op) {
         case "+":
            res = op1 + op2;
            break;
         case "-":
            res = op1 - op2;
            break;
         case "*":
            res = op1 * op2;
            break;
         case "/":
            // check if the second operand is 0
            if (op2 == 0) {
               res = null;
            } else {
               res = op1 / op2;
            }
            break;
         default:
            System.out.println("Unknown operator: " + op);
            break;
      }
      return res;
      //return res;
   }

   @Override 
   public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      Double res = null;
      // Parse string to double and return
      res = Double.parseDouble(ctx.Number().getText());
      return res;
      //return res;
   }
}
