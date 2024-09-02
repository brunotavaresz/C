import java.math.BigInteger;
import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class execute extends BigIntCalcBaseVisitor<BigInteger> {

   HashMap<String,BigInteger> var =  new HashMap<>();

   @Override public BigInteger visitProgram(BigIntCalcParser.ProgramContext ctx) {
      BigInteger res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public BigInteger visitStat(BigIntCalcParser.StatContext ctx) {
      if(ctx.print() != null) {
         return visit(ctx.print());
      }
      if (ctx.assigment() != null) {
         return visit(ctx.assigment());
      }

      return null;
   }

   @Override public BigInteger visitPrint(BigIntCalcParser.PrintContext ctx) {
      BigInteger result = visit(ctx.expression());
      
      if(result != null) {
         System.out.println(result);
      }
      else {
         System.err.println("ERROR");
      }

      return result;
   }

   @Override public BigInteger visitAssigment(BigIntCalcParser.AssigmentContext ctx) {
      BigInteger result = visit(ctx.expression());
      String id = ctx.ID().getText();

      if (id != null && result != null) {
         var.put(id, result);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public BigInteger visitIdExpr(BigIntCalcParser.IdExprContext ctx) {
      String id = ctx.ID().getText();

      if (var.containsKey(id)) {
         return var.get(id);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public BigInteger visitNumberExpr(BigIntCalcParser.NumberExprContext ctx) {
      String res = ctx.NUMBER().getText();

      BigInteger result = new BigInteger(res);

      return result;
   }

   @Override public BigInteger visitMultiDividExpr(BigIntCalcParser.MultiDividExprContext ctx) {
      BigInteger result = null;
      BigInteger e1 = visit(ctx.expression(0));
      BigInteger e2 = visit(ctx.expression(1));

      switch (ctx.op.getText()) {
         case "*":
            result = e1.multiply(e2);
            break;
         
         case "div":
            result = e1.divide(e2);
            break;
      }

      return result;
   }

   @Override public BigInteger visitParenExpr(BigIntCalcParser.ParenExprContext ctx) {
      BigInteger res = visit(ctx.expression());

      return res;
   }

   @Override public BigInteger visitMaisMenosExpr(BigIntCalcParser.MaisMenosExprContext ctx) {
      BigInteger result = null;
      BigInteger e1 = visit(ctx.expression(0));
      BigInteger e2 = visit(ctx.expression(1));

      switch (ctx.op.getText()) {
         case "+":
            result = e1.add(e2);
            break;
         
         case "-":
            result = e1.subtract(e2);
            break;
      }

      return result;
   }

   @Override public BigInteger visitRestoExpr(BigIntCalcParser.RestoExprContext ctx) {
      BigInteger result = null;
      BigInteger e1 = visit(ctx.expression(0));
      BigInteger e2 = visit(ctx.expression(1));

      result = e1.mod(e2);

      return result;
   }
}
