import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class execute extends TesteBaseVisitor<ArrayList<Double>> {

   HashMap<String, ArrayList<Double>> var = new HashMap<>();

   @Override public ArrayList<Double> visitProgram(TesteParser.ProgramContext ctx) {
      ArrayList<Double> res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ArrayList<Double> visitStat(TesteParser.StatContext ctx) {
      if (ctx.print() != null) {
         return visit(ctx.print());
      }

      if(ctx.assigment() != null) {
         return visit(ctx.assigment());
      }

      return null;
   }

   @Override public ArrayList<Double> visitPrint(TesteParser.PrintContext ctx) {
      ArrayList<Double> res = visit(ctx.expression());

      if(res != null) {
         System.out.println(res);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
      
   }

   @Override public ArrayList<Double> visitAssigment(TesteParser.AssigmentContext ctx) {
      ArrayList<Double> res = visit(ctx.expression());
      String id = ctx.ID().getText();

      if( id != null && res != null) {
         var.put(id, res);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public ArrayList<Double> visitArrayExpr(TesteParser.ArrayExprContext ctx) {
      String res = ctx.ARRAY().getText();
      String result = res.substring(1, res.length() - 1);
      String[] parts = result.split(",");

      ArrayList<Double> array = new ArrayList<>();

      for (String part : parts) {
         Double num = Double.parseDouble(part);
         array.add(num);
      }

      return array;
   }

   @Override public ArrayList<Double> visitIdExpr(TesteParser.IdExprContext ctx) {
      String id = ctx.ID().getText();

      if(var.containsKey(id)) {
         return var.get(id);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public ArrayList<Double> visitMultiExpr(TesteParser.MultiExprContext ctx) {
      ArrayList<Double> res1 = visit(ctx.expression(0));
      ArrayList<Double> res2 = visit(ctx.expression(1));

      ArrayList<Double> array = new ArrayList<>();

      if (res1.size() == 1) {
         for (int i = 0; i < res2.size() ; i++) {
            array.add(res1.get(0) * res2.get(i));
         }
      }
      else if (res2.size() == 1) {
         for (int i = 0; i < res1.size() ; i++) {
            array.add(res1.get(i) * res2.get(0));
         }
      } 
      else if (res2.size() == 1 && res1.size() == 1) {
         array.add(res1.get(0) * res2.get(0));
      }
      else {
         System.err.println("ERROR");
      }

      return array;
   }

   @Override public ArrayList<Double> visitInternoExpr(TesteParser.InternoExprContext ctx) {
      ArrayList<Double> res1 = visit(ctx.expression(0));
      ArrayList<Double> res2 = visit(ctx.expression(1));

      ArrayList<Double> array = new ArrayList<>();

      Double sum1 = 0.0;
      Double sum2 = 0.0;

      for (Double i : res1) {
         sum1 = sum1 + i;
      }

      for (Double j : res2) {
         sum2 = sum2 + j;
      }

      Double sum3 = sum1 + sum2;

      array.add(sum3);

      return array;
   }

   @Override public ArrayList<Double> visitUniMenosExpr(TesteParser.UniMenosExprContext ctx) {
      ArrayList<Double> res = visit(ctx.expression());

      ArrayList<Double> array = new ArrayList<>();

      for ( Double i : res) {
         Double num = -i;
         array.add(-i);
      }

      return array;
   }

   @Override public ArrayList<Double> visitMenosExpr(TesteParser.MenosExprContext ctx) {
      ArrayList<Double> res1 = visit(ctx.expression(0));
      ArrayList<Double> res2 = visit(ctx.expression(1));

      ArrayList<Double> array = new ArrayList<>();

      for (int i = 0 ; i < Math.min(res1.size(), res2.size()) ; i++) {
         array.add(res1.get(i) - res2.get(i));
      }

      return array;
   }

   @Override public ArrayList<Double> visitUniMaisExpr(TesteParser.UniMaisExprContext ctx) {

      ArrayList<Double> res = visit(ctx.expression());

      ArrayList<Double> array = new ArrayList<>();

      for (Double i : res) {
         Double num = i;
         array.add(i);
      }

      return array;
   }

   @Override public ArrayList<Double> visitMaisExpr(TesteParser.MaisExprContext ctx) {
      ArrayList<Double> res1 = visit(ctx.expression(0));
      ArrayList<Double> res2 = visit(ctx.expression(1));

      ArrayList<Double> array = new ArrayList<>();

      for (int i = 0 ; i < Math.min(res1.size(), res2.size()) ; i++) {
         array.add(res1.get(i) + res2.get(i));
      }

      return array;
   }

   @Override public ArrayList<Double> visitParenExpr(TesteParser.ParenExprContext ctx) {
      ArrayList<Double> res = visit(ctx.expression());

      return res;
   }

   @Override public ArrayList<Double> visitDecimalExpr(TesteParser.DecimalExprContext ctx) {
      String result = ctx.DECIMAL().getText();

      ArrayList<Double> array = new ArrayList<>();

      Double number = Double.parseDouble(result);

      array.add(number);

      return array;
   }
}
