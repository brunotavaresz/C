import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class execute extends LangComplexBaseVisitor<String> {

    // HashMap para armazenar variáveis e seus valores
    private HashMap<String, String> var = new HashMap<>();

    @Override
    public String visitProgram(LangComplexParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitStat(LangComplexParser.StatContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDisplay(LangComplexParser.DisplayContext ctx) {
        String result = visit(ctx.expression());
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("ERROR");
        }
        return null;
    }

    @Override
    public String visitAssigment(LangComplexParser.AssigmentContext ctx) {
        String id = ctx.ID().getText();
        String result = visit(ctx.expression());
        if (id != null && result != null) {
            var.put(id, result);
        } else {
            System.out.println("ERROR");
        }
        return null;
    }

    @Override
    public String visitComplexExpr(LangComplexParser.ComplexExprContext ctx) {
        return visit(ctx.complex_number());
    }

    @Override
    public String visitIdExpr(LangComplexParser.IdExprContext ctx) {
        String id = ctx.ID().getText();
        String value = var.get(id);
        if (value != null) {
            return value;
        } else {
            System.out.println("ERROR: Undefined variable " + id);
            return null;
        }
    }

    @Override
    public String visitComplex_number(LangComplexParser.Complex_numberContext ctx) {
        String complex1 = ctx.COMPLEX(0) != null ? ctx.COMPLEX(0).getText() : "";
        String complex2 = ctx.COMPLEX(1) != null ? ctx.COMPLEX(1).getText() : "";
        String op = ctx.getChildCount() > 2 ? ctx.getChild(1).getText() : "";
        String imaginaryUnit = ctx.getChildCount() > 2 ? "i" : (ctx.getChild(1) != null && ctx.getChild(1).getText().equals("i") ? "i" : "");
        return complex1 + op + complex2 + imaginaryUnit;
    }
}
