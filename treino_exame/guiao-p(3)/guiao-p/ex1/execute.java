import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class execute extends StrLangBaseVisitor<String> {

   HashMap<String,String> var = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(StrLangParser.StatContext ctx) {
      if (ctx.print() != null) {
         return visit(ctx.print());
      }
      else if (ctx.assigment() != null) {
         return visit(ctx.assigment());
      }

      return null;
   }

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String result = visit(ctx.expression());

      if(result != null) {
         System.out.println(result);
      }
      else {
         System.err.println("ERROR");
      }

      return result;
   }

   @Override public String visitAssigment(StrLangParser.AssigmentContext ctx) {
      String id = ctx.ID().getText();
      String result = visit(ctx.expression());

      if(id != null && result != null) {
         var.put(id, result);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public String visitExprParen(StrLangParser.ExprParenContext ctx) {
      String result = visit(ctx.expression());

      return result;
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String texto = ctx.STRING().getText();

      return texto.substring(1, texto.length() - 1);
   }

   @Override public String visitExprMais(StrLangParser.ExprMaisContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));

      return e1 + e2;
   }

   @Override public String visitExprMenos(StrLangParser.ExprMenosContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));

      return e1.replace(e2, "");
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      String result = visit(ctx.expression());
      result = result.replaceAll("\"", "");

      System.out.print(result);

      String prompt = sc.next();

      return prompt;
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
      String e1 = visit(ctx.expression());

      return e1.trim();
   }

   @Override public String visitExprId(StrLangParser.ExprIdContext ctx) {
      String id = ctx.ID().getText();

      if( id != null) {
         return var.get(id);
      }
      else {
         System.err.println("ERROR");
      }

      return null;
   }

   @Override public String visitExprConca(StrLangParser.ExprConcaContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));
      String e3 = visit(ctx.expression(2));

      return e1.replace(e2,e3);
   }
}
