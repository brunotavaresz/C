import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class execute extends HashMapBaseVisitor<HashMap<String, String>> {

    HashMap<String, HashMap<String, String>> var = new HashMap<>();

    @Override 
    public HashMap<String, String> visitProgram(HashMapParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override 
    public HashMap<String, String> visitStat(HashMapParser.StatContext ctx) {
        if (ctx.print() != null) {
            return visit(ctx.print());
        }
        if(ctx.assignment() != null) {
            return visit(ctx.assignment());
        }
        if(ctx.mapInsert() != null) {
            return visit(ctx.mapInsert());
        }
        return null;
    }

    @Override 
    public HashMap<String, String> visitAssignment(HashMapParser.AssignmentContext ctx) {
        HashMap<String, String> res = visit(ctx.expression());
        String id = ctx.ID().getText();

        if (res != null && id != null) {
            var.put(id, res);
        } else {
            System.err.println("ERROR");
        }
        return null;
    }

    @Override 
    public HashMap<String, String> visitPrint(HashMapParser.PrintContext ctx) {
        HashMap<String, String> res = visit(ctx.expression());

        if (res != null) {
            System.out.println(res);
        } else {
            System.err.println("ERROR");
        }
        return res;
    }

    @Override 
    public HashMap<String, String> visitMapInsert(HashMapParser.MapInsertContext ctx) {
        String id = ctx.ID().getText();
        HashMap<String, String> map = var.get(id);

        if (map == null) {
            System.err.println("ERROR: Map " + id + " not found.");
            return null;
        }

        String key = visit(ctx.expression(0)).values().iterator().next();
        String value = visit(ctx.expression(1)).values().iterator().next();

        map.put(key, value);
        return null;
    }

    @Override 
    public HashMap<String, String> visitExprMapAcess(HashMapParser.ExprMapAcessContext ctx) {
        String id = ctx.expression(0).getText();
        HashMap<String, String> map = var.get(id);

        if (map == null) {
            System.err.println("ERROR: Map " + id + " not found.");
            return null;
        }

        String key = visit(ctx.expression(1)).values().iterator().next();
        String value = map.get(key);

        HashMap<String, String> res = new HashMap<>();
        res.put(key, value);
        return res;
    }

    @Override 
    public HashMap<String, String> visitExprString(HashMapParser.ExprStringContext ctx) {
        HashMap<String, String> res = new HashMap<>();
        res.put("string", ctx.STRING().getText().replace("\"", ""));
        return res;
    }

    @Override 
    public HashMap<String, String> visitExprMapLiteral(HashMapParser.ExprMapLiteralContext ctx) {
        return visit(ctx.mapLiteral());
    }

    @Override 
    public HashMap<String, String> visitExprID(HashMapParser.ExprIDContext ctx) {
        return var.get(ctx.ID().getText());
    }

    @Override 
    public HashMap<String, String> visitMapLiteral(HashMapParser.MapLiteralContext ctx) {
        HashMap<String, String> res = new HashMap<>();
        int n = ctx.STRING().size();

        for (int i = 0; i < n; i += 2) {
            String key = ctx.STRING(i).getText().replace("\"", "");
            String value = ctx.STRING(i + 1).getText().replace("\"", "");
            res.put(key, value);
        }
        return res;
    }
}
