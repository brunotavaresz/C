import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class execute extends TextProcBaseVisitor<String> {

   HashMap<String,String> var = new HashMap<>();

   @Override public String visitProgram(TextProcParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(TextProcParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrint(TextProcParser.PrintContext ctx) {
      String result = visit(ctx.expression());

      System.out.println(result);

      return null;
   }

   @Override public String visitAssignment(TextProcParser.AssignmentContext ctx) {
      String res = visit(ctx.expression());
      String id = ctx.ID().getText();

      var.put(id, res);

      return null;
   }

   @Override public String visitStringExpr(TextProcParser.StringExprContext ctx) {
      String res = ctx.STRING().getText();

      return res.substring(1, res.length()-1);
   }

   @Override public String visitIdExpr(TextProcParser.IdExprContext ctx) {
      String id = ctx.ID().getText();

      return var.get(id);
   }

   @Override public String visitNumberExpr(TextProcParser.NumberExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitGrepExpr(TextProcParser.GrepExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPipeExpr(TextProcParser.PipeExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitMaisExpr(TextProcParser.MaisExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitWordExpr(TextProcParser.WordExprContext ctx) {
      String res = ctx.WORD().getText();

      return res;
   }

   @Override public String visitParenExpr(TextProcParser.ParenExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitNlExpr(TextProcParser.NlExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitReplaceExpr(TextProcParser.ReplaceExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
