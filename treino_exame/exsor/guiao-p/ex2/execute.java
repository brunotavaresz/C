import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class execute extends FracLangBaseVisitor<Fraction> {

   HashMap<String, Fraction> var = new HashMap<>();

   @Override public Fraction visitProgram(FracLangParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitStat(FracLangParser.StatContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction result = visit(ctx.expression());

      if (result != null) {
         System.out.println(result);
      }
      else {
         System.err.println("Error");
      }

      return result;
   }

   @Override public Fraction visitAssigment(FracLangParser.AssigmentContext ctx) {
      Fraction result = visit(ctx.expression());
      String id = ctx.ID().getText();

      if (result != null && id != null) {
         var.put(id, result);
      }
      else {
         System.out.println("Error");
      }

      return result;
   }

   @Override public Fraction visitExprFrac(FracLangParser.ExprFracContext ctx) {
      String fraction = ctx.FRACTION().getText();
      Fraction result = new Fraction(fraction);

      if (result == null) {
         System.out.println("invalid fraction");
         return null;
      }

      return result;
   }

   @Override public Fraction visitExprUniMais(FracLangParser.ExprUniMaisContext ctx) {
      Fraction result = visit(ctx.expression());
      return result;
   }

   @Override public Fraction visitExprUniMenos(FracLangParser.ExprUniMenosContext ctx) {
      Fraction result = visit(ctx.expression());
      result = new Fraction(-result.num(), result.den());
      return result;
   }

   @Override public Fraction visitExprParen(FracLangParser.ExprParenContext ctx) {
      Fraction result = visit(ctx.expression());

      return result;
   }

   @Override public Fraction visitExprSub(FracLangParser.ExprSubContext ctx) {
      Fraction e1 = visit(ctx.expression(0));
      Fraction e2 = visit(ctx.expression(1));

      Fraction result = new Fraction((e1.num() * e2.den()) - (e2.num() * e1.den()) , (e1.den() * e2.den()));

      return result;
   }

   @Override public Fraction visitExprMul(FracLangParser.ExprMulContext ctx) {
      Fraction e1 = visit(ctx.expression(0));
      Fraction e2 = visit(ctx.expression(1));

      Fraction result = new Fraction( (e1.num() * e2.num()) , (e1.den() * e2.den()) );

      return result;
   }

   @Override public Fraction visitExprId(FracLangParser.ExprIdContext ctx) {
      String id = ctx.ID().getText();

      if (var.containsKey(id)) {
         return var.get(id);
      }
      else {
         System.out.println("Error");
      }

      return null;
   }

   @Override public Fraction visitExprAdd(FracLangParser.ExprAddContext ctx) {
      Fraction e1 = visit(ctx.expression(0));
      Fraction e2 = visit(ctx.expression(1));

      Fraction result = new Fraction((e1.num() * e2.den()) + (e2.num() * e1.den()) , (e1.den() * e2.den()));

      return result;
   }

   @Override public Fraction visitExprDiv(FracLangParser.ExprDivContext ctx) {
      Fraction e1 = visit(ctx.expression(0));
      Fraction e2 = visit(ctx.expression(1));

      Fraction result = new Fraction( (e1.num() * e2.den()) , (e1.den() / e2.num()) );

      return result;
   }
}
