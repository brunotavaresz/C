import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class execute extends StrLangBaseVisitor<String> {

   HashMap<String, String> var = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(StrLangParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String result = visit(ctx.expression());

      if (result != null) {
         System.out.println(result);
      }
      else {
         System.out.println("Error");
      }

      return null;
   }

   @Override public String visitAssigment(StrLangParser.AssigmentContext ctx) {
      String id = ctx.ID().getText();
      String value = visit(ctx.expression());

      if (id != null && value != null) {
         return var.put(id, value);
      }
      else {
         System.out.print("Error");
      }
      return null;
   }

   @Override public String visitTrimExpr(StrLangParser.TrimExprContext ctx) {
      String result = visit(ctx.expression());

      return result.trim();
   }

   @Override public String visitStringExpr(StrLangParser.StringExprContext ctx) {
      String result = ctx.STRING().getText();
      
      return result.substring(1, result.length() - 1);
   }

   @Override public String visitIdExpr(StrLangParser.IdExprContext ctx) {
      String id = ctx.ID().getText();

      if (id != null) {
         return var.get(id);
      }
      else {
         System.out.println("Error");
      }

      return null;
   }

   @Override public String visitInputExpr(StrLangParser.InputExprContext ctx) {
      String prompt = visit(ctx.expression());
      prompt = prompt.replaceAll("\"", "");
      System.err.print(prompt);

      String input = sc.next();

      return input;
   }

   @Override public String visitSubExpr(StrLangParser.SubExprContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));

      return e1.replace(e2, "");
   }

   @Override public String visitAddExpr(StrLangParser.AddExprContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));

      return e1 + e2;
   }

   @Override public String visitSubstitureExpr(StrLangParser.SubstitureExprContext ctx) {
      String e1 = visit(ctx.expression(0));
      String e2 = visit(ctx.expression(1));
      String e3 = visit(ctx.expression(2));

      return e1.replace(e2, e3);
   }

   @Override public String visitParenExpr(StrLangParser.ParenExprContext ctx) {
      String result = visit(ctx.expression());

      return result;
   }
}
