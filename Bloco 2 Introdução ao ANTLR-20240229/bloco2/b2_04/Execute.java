@SuppressWarnings("CheckReturnValue")
public class Execute extends PrefixCalculatorBaseVisitor<String> {

   @Override public String visitProgram(PrefixCalculatorParser.ProgramContext ctx) {
      String res = null;
      
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStat(PrefixCalculatorParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprSuffix(PrefixCalculatorParser.ExprSuffixContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExprNumber(PrefixCalculatorParser.ExprNumberContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
