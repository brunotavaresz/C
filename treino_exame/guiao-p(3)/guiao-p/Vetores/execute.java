import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class execute extends VectorBaseVisitor<ArrayList<Double>> {

   HashMap<String, ArrayList<Double>> var = new HashMap<>();

   @Override public ArrayList<Double> visitProgram(VectorParser.ProgramContext ctx) {
      ArrayList<Double> res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public ArrayList<Double> visitStat(VectorParser.StatContext ctx) {
      if(ctx.print() != null) {
         return visit(ctx.print());
      }

      if(ctx.assigment() != null) {
         return visit(ctx.assigment());
      }

      return null;
   }

   @Override public ArrayList<Double> visitPrint(VectorParser.PrintContext ctx) {
      ArrayList<Double> result = visit(ctx.expression());

      if(result != null) {
         System.out.println(result);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public ArrayList<Double> visitAssigment(VectorParser.AssigmentContext ctx) {
      ArrayList<Double> result = visit(ctx.expression());
      String id = ctx.ID().getText();

      if(id != null && result != null) {
         var.put(id, result);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public ArrayList<Double> visitExprMulti(VectorParser.ExprMultiContext ctx) {
      ArrayList<Double> e1 = visit(ctx.expression(0));
      ArrayList<Double> e2 = visit(ctx.expression(1));

      ArrayList<Double> array = new ArrayList<>();

      if (e1.size() == 1) {
         for (Double i : e2) {
            array.add(e1.get(0) * i);
         }
      }
      else if (e2.size() == 1) {
         for (Double i : e1) {
            array.add(e2.get(0) * i);
         }
      }
      else if (e1.size() == 1 && e2.size() == 1) {
         array.add(e1.get(0) * e2.get(0));
      }

      return array;
   }

   @Override public ArrayList<Double> visitExprParen(VectorParser.ExprParenContext ctx) {
      ArrayList<Double> res = visit(ctx.expression());

      return res;
   }

   @Override public ArrayList<Double> visitExprUniMais(VectorParser.ExprUniMaisContext ctx) {
      ArrayList<Double> result = visit(ctx.expression());
      ArrayList<Double> array = new ArrayList<>();

      for (Double i : result) {
         array.add(i);
      }

      return array;
   }

   @Override public ArrayList<Double> visitExprUniMenos(VectorParser.ExprUniMenosContext ctx) {
      ArrayList<Double> result = visit(ctx.expression());
      ArrayList<Double> array = new ArrayList<>();

      for (Double i : result) {
         array.add(-i);
      }

      return array;
   }

   @Override public ArrayList<Double> visitExprMais(VectorParser.ExprMaisContext ctx) {
      ArrayList<Double> e1 = visit(ctx.expression(0));
      ArrayList<Double> e2 = visit(ctx.expression(1));

      ArrayList<Double> array =  new ArrayList<>();
      

      for (int i = 0 ; i < Math.min(e1.size(), e2.size()) ; i++) {
         array.add(e1.get(i) + e2.get(i));
      }

      return array;
   }

   @Override public ArrayList<Double> visitExprDivid(VectorParser.ExprDividContext ctx) {
      Double sum1 = 1.0;
      Double sum2 = 1.0;
      ArrayList<Double> e1 = visit(ctx.expression(0));
      ArrayList<Double> e2 = visit(ctx.expression(1));

      ArrayList<Double> array = new ArrayList<>();

      for (Double i : e1) {
         sum1 = sum1 * i;
      }
      for (Double j: e2) {
         sum2 = sum2 * j;
      }
      
      array.add(sum1+sum2);

      return array;
   }

   @Override public ArrayList<Double> visitExprMenos(VectorParser.ExprMenosContext ctx) {
      ArrayList<Double> e1 = visit(ctx.expression(0));
      ArrayList<Double> e2 = visit(ctx.expression(1));

      ArrayList<Double> array =  new ArrayList<>();
      

      for (int i = 0 ; i < Math.min(e1.size(), e2.size()) ; i++) {
         array.add(e1.get(i) - e2.get(i));
      }

      return array;
   }

   @Override public ArrayList<Double> visitExprNumber(VectorParser.ExprNumberContext ctx) {
      String res = ctx.NUMBER().getText();
      Double number = Double.parseDouble(res);

      ArrayList<Double> array = new ArrayList<>();

      array.add(number);

      return array;
   }

   @Override public ArrayList<Double> visitExprArray(VectorParser.ExprArrayContext ctx) {
      String res = ctx.ARRAY().getText();
      ArrayList<Double> array =  new ArrayList<>();

      String result = res.substring(1, res.length() - 1);
      String[] parts = result.split(",");

      for (String part : parts) {
         array.add(Double.parseDouble(part));
      }

      return array;
   }

   @Override public ArrayList<Double> visitExprId(VectorParser.ExprIdContext ctx) {
      String id = ctx.ID().getText();

      if(id != null) {
         return var.get(id);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }
}
