import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends StrLangBaseVisitor<String> {

   
   HashMap<String,String> assingmentMap = new HashMap<>();
   private Scanner sc = new Scanner(System.in) ;



   @Override public String visitProgram(StrLangParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitStat(StrLangParser.StatContext ctx) {
      if (ctx.print() != null){
         return visit(ctx.print());
      }else if (ctx.assignment() != null){
         return visit(ctx.assignment());
      }
      return null;
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String id = ctx.ID().getText();
      String value = visit(ctx.expr());
      if (value != null && id!=null){
         assingmentMap.put(id,value);
      }else{
         System.out.println("Error: Value is null");
      }
      return null;
   }

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String result = visit(ctx.expr());

      if (result != null){
         System.out.println(result);
      }else{
         System.out.println("Error: Value is null");
      }

      return null;
   }


   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = ctx.STRING().getText();

      return res.substring(1, res.length()-1);
      
   }

   @Override public String visitExprID(StrLangParser.ExprIDContext ctx) {
      String id = ctx.ID().getText();

      if(assingmentMap.containsKey(id)){
         return assingmentMap.get(id);
      }else{
         System.out.println("Error: ID not found");
      }
      return "";
   }

    @Override
    public String visitExprInput(StrLangParser.ExprInputContext ctx) {
        String prompt = visit(ctx.expr());
        prompt = prompt.replaceAll("\"", ""); 
        System.out.print(prompt);

        String input = "";
        
         input = sc.next();
        return input;
    }


   @Override public String visitExprParent(StrLangParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprConcat(StrLangParser.ExprConcatContext ctx){
      String left = visit(ctx.expr(0));
      String right = visit(ctx.expr(1));
      return left + right;
   }


   @Override public String visitExprRemov(StrLangParser.ExprRemovContext ctx){
      String left = visit(ctx.expr(0));
      String right = visit(ctx.expr(1));
      return left.replace(right, "");
   }

   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx){
      String s = visit(ctx.expr());
      return s.trim();
   }

   @Override public String visitExprSub(StrLangParser.ExprSubContext ctx){
      String s = visit(ctx.expr(0));
      String e1= visit(ctx.expr(1));
      String e2 = visit(ctx.expr(2));
      return s.replace(e1, e2);
   }
}