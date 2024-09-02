import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class execute extends ComplexosBaseVisitor<NumberComplex> {

   HashMap<String,NumberComplex> vars = new HashMap<>();
   private static Scanner in = new Scanner(System.in);

   @Override public NumberComplex visitProgram(ComplexosParser.ProgramContext ctx) {
      NumberComplex res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public NumberComplex visitStat(ComplexosParser.StatContext ctx) {
      NumberComplex res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public NumberComplex visitPrint(ComplexosParser.PrintContext ctx) {
      NumberComplex res = visit(ctx.expression());
      if (res != null) {
         System.out.println(res);
      }

      return res;
   }

   @Override public NumberComplex visitAssigment(ComplexosParser.AssigmentContext ctx) {
      NumberComplex res = visit(ctx.expression());
      String id = ctx.ID().getText();
      if (id != null && res != null) {
         vars.put(id,res);
      }

      return res;
   }

   @Override public NumberComplex visitIdExpr(ComplexosParser.IdExprContext ctx) {
      NumberComplex res = null;
      String id = ctx.ID().getText();
      if (id != null) {
         if (!vars.containsKey(id)) {
            System.err.println("ERRO: Variável não definida!");
            return null;
         }
      }

      return vars.get(id);
   }

   @Override public NumberComplex visitMultiExpr(ComplexosParser.MultiExprContext ctx) {
      NumberComplex res1 = visit(ctx.expression(0));
      NumberComplex res2 = visit(ctx.expression(1));

      NumberComplex res3 = res1.multiply(res2);

      return res3; 
   }

   @Override public NumberComplex visitComplexExpr(ComplexosParser.ComplexExprContext ctx) {
      String res = ctx.COMPLEX().getText();

      return new NumberComplex(res);
   }

   @Override public NumberComplex visitNumberExpr(ComplexosParser.NumberExprContext ctx) {
      String res = ctx.NUMBER().getText();
      Integer result  = Integer.parseInt(res);

      return new NumberComplex(result);
   }

   @Override public NumberComplex visitUniMenosExpr(ComplexosParser.UniMenosExprContext ctx) {
      NumberComplex res1 = visit(ctx.expression());

      NumberComplex result = new NumberComplex(-res1.getReal(), -res1.getImaginary()) ;

      return result;
   }

   @Override public NumberComplex visitInputExpr(ComplexosParser.InputExprContext ctx) {
      NumberComplex res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public NumberComplex visitDividExpr(ComplexosParser.DividExprContext ctx) {
      NumberComplex res1 = visit(ctx.expression(0));
      NumberComplex res2 = visit(ctx.expression(1));

      NumberComplex result = res1.divide(res2);

      return result;
   }

   @Override public NumberComplex visitMenosExpr(ComplexosParser.MenosExprContext ctx) {
      NumberComplex res1 = visit(ctx.expression(0));
      NumberComplex res2 = visit(ctx.expression(1));

      NumberComplex result = res1.subtract(res2);

      return result;
   }

   @Override public NumberComplex visitMaisExpr(ComplexosParser.MaisExprContext ctx) {
      NumberComplex res1 = visit(ctx.expression(0));
      NumberComplex res2 = visit(ctx.expression(1));

      NumberComplex result = res1.add(res2);

      return result;
   }

   @Override public NumberComplex visitParenExpr(ComplexosParser.ParenExprContext ctx) {
      NumberComplex res = visit(ctx.expression());

      return res;
   }
}
