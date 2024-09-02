import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")

public class Execute extends NumbersBaseListener {

   public HashMap<String, Integer> map = new HashMap<>();

   @Override public void enterExpr(NumbersParser.ExprContext ctx) {
      map.put(ctx.Word().getText(), Integer.parseInt(ctx.Number().getText()));
   }

   
}
