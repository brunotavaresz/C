import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class AGLCompiler extends AGLBaseVisitor<ST> {
   private STGroup templates = new STGroupFile("aglTemplates.stg");
   HashMap<String, String> declared_vars = new HashMap<>();

   HashMap<String, HashMap<String, String>> objects = new HashMap<>();
   HashMap<String, String> converter = new HashMap<>();

   public AGLCompiler() {

   };

   @Override
   public ST visitProgram(AGLParser.ProgramContext ctx) {
      ST res = templates.getInstanceOf("main");
      for (AGLParser.StatementContext sc : ctx.statement()) {
         res.add("stat", visit(sc));
      }

      return res;
      // return res;
   }

   @Override
   public ST visitImportCommand(AGLParser.ImportCommandContext ctx) {
      String fileName = ctx.STRING().getText().replace("\"", "");
      System.out.println("Calling xAGLMain.py with file: " + fileName);
      try {
         // Chamar o script para processar o arquivo xAGL
         ProcessBuilder pb = new ProcessBuilder("python3", "xAGLMain.py", fileName);
         pb.directory(new File(".")); // se estiver na pasta grammar!
         Process process = pb.start();
         BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
         String line;
         while ((line = reader.readLine()) != null) {
            System.out.println(line);
         }
         process.waitFor();
         System.out.println("Finished calling xAGLMain.py.");
      } catch (IOException | InterruptedException e) {
         e.printStackTrace();
      }
      return null;
   }

   @Override
   public ST visitDeclaration(AGLParser.DeclarationContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitInstantiationWithProperties(AGLParser.InstantiationWithPropertiesContext ctx) {
      ST res = null;
      String var_name = ctx.ID().getText();
      visit(ctx.type());
      StringBuilder sb = new StringBuilder();
      String value = "";
      int number_of_assignments = ctx.assignment().size();

      if (ctx.type().getText().equals("View")) {
         res = templates.getInstanceOf("instanciate_view");

         for (int i = 0; i < number_of_assignments; i++) {
            String assignment = visit(ctx.assignment(i)).render();

            if (i == number_of_assignments - 1) {
               sb.append(assignment);
            } else {
               sb.append(assignment + ",");
            }

         }

         res.add("value", sb.toString());
         res.add("var", var_name);
         res.add("type", ctx.type().getText());
         declared_vars.put("View", var_name);
      }

      return res;
   }

   @Override
   public ST visitInstantiationWithExpression(AGLParser.InstantiationWithExpressionContext ctx) {
      ST res = null;
      String var_name = ctx.ID().getText();
      visit(ctx.type());
      String value = "";

      if (ctx.expression() != null) {
         value = ctx.expression().getText();

      }

      if (ctx.expression().waitCommand() != null) {

         res = templates.getInstanceOf("declaration_wait_for_mouse");

         res.add("var", var_name);

         return res;

      }

      if (ctx.type().getText().equals("Number") || ctx.type().getText().equals("String")
            || ctx.type().getText().equals("Integer")) {

         res = templates.getInstanceOf("instanciate_simples");
         res.add("var", var_name);
         switch (ctx.type().getText()) {
            case "Number":
               res.add("type", "float");
               break;

            case "String":
               res.add("type", "str");
               break;
            case "Integer":
               res.add("type", "int");
               break;
            default:
               break;
         }

         res.add("value", value);
         declared_vars.put(var_name, value);

      }
      if (ctx.type().getText().equals("Point")) {
         res = templates.getInstanceOf("instanciate_point_vector");
         res.add("var", var_name);
         res.add("type", "Point");
         res.add("value", value);

         declared_vars.put(var_name, value);
      }
      if (ctx.type().getText().equals("Vector")) {
         res = templates.getInstanceOf("instanciate_point_vector");
         res.add("var", var_name);
         res.add("type", "Vector");
         res.add("value", value);

         declared_vars.put(var_name, value);
      }
      if (ctx.type().getText().equals("Time")) {
         res = templates.getInstanceOf("instanciate_simples");
         value = ctx.expression().getText();
         res.add("var", var_name);
         res.add("type", "Time");

         res.add("value", '"' + value + '"');

         declared_vars.put(var_name, value);
      }

      return res;
      // return res;
   }

   @Override
   public ST visitInstantiationAtPoint(AGLParser.InstantiationAtPointContext ctx) {
      ST res = null;

      visit(ctx.type());
      StringBuilder sb = new StringBuilder();
      String value = "";
      int number_of_assignments = ctx.assignment().size();

      res = templates.getInstanceOf("instanciate_at_point_with_reference");

      res.add("var", ctx.ID(0).getText());

      switch (ctx.type().getText()) {
         case "Line":
            res.add("type", "line");

            break;

         case "Rectangle":
            res.add("type", "rectangle");

            break;

         case "Ellipse":
            res.add("type", "ellipse");

            break;

         case "Arc":
            res.add("type", "arc");

            break;

         case "ArcChord":
            res.add("type", "arcchord");

            break;

         case "PieSlice":
            res.add("type", "pieslice");

            break;
         case "Dot":
            res.add("type", "dot");

            break;
         case "Text":
            res.add("type", "text");

            break;
         case "PolyLine":
            res.add("type", "polyline");

            break;
         case "Spline":
            res.add("type", "spline");

            break;
         case "Polygon":
            res.add("type", "polygon");

            break;
         case "Blob":
            res.add("type", "polygon");

            break;
         default:
            break;
      }
      if (ctx.ID(1) != null) {
         String id = ctx.ID(1).getText();
         value = declared_vars.get(id);
         sb.append(id + ".value");
         // ir ao map das variaveis

      }
      if (ctx.point() != null) {
         String write_expr = ctx.point().getText();

         sb.append(write_expr);

      }
      if (number_of_assignments > 1) {
         sb.append(",");
      }
      String type = ctx.type().getText();

      for (int i = 0; i < number_of_assignments; i++) {
         String assignment = visit(ctx.assignment(i)).render();

         if (i == 0 && number_of_assignments > 1 && !type.equals("Text") && !type.equals("PolyLine")
               && !type.equals("Spline") && !type.equals("Polygon") && !type.equals("Blob")) {

            continue;
         }
         if (i == 1 && !type.equals("Text") && !type.equals("PolyLine") && !type.equals("Spline")
               && !type.equals("Polygon") && !type.equals("Blob")) {
            sb.append(converter.get("length") + ",");
         }
         if (i == number_of_assignments - 1
               || ((type.equals("PolyLine") || type.equals("Spline") || type.equals("Polygon") || type.equals("Blob"))
                     && i == number_of_assignments - 2)) {// como o polyline e o Spline tem numero de points indefenido
                                                          // é mais dificil
            if (number_of_assignments == 1 || ((type.equals("PolyLine") || type.equals("Spline")
                  || type.equals("Polygon") || type.equals("Blob")) && i == number_of_assignments - 1)) {
               sb.append(",");
            }

            sb.append(assignment);
         } else {
            sb.append(assignment + ",");
         }

      }
      if (type.equals("Spline") || type.equals("Blob")) {

         sb.append(",smooth=True");
      }
      res.add("value", sb.toString());
      res.add("view", declared_vars.get("View"));
      res.add("typeobject", ctx.type().getText());
      return res;
      // return res;
   }

   // deve estar completo
   @Override
   public ST visitReferenceCommand(AGLParser.ReferenceCommandContext ctx) {
      ST res = null;

      visit(ctx.type());
      StringBuilder sb = new StringBuilder();
      String value = "";
      int number_of_assignments = ctx.assignment().size();

      res = templates.getInstanceOf("instanciate_at_point");

      switch (ctx.type().getText()) {
         case "Line":
            res.add("type", "line");
            sb.append("Line.converter(");
            break;

         case "Rectangle":
            res.add("type", "line");
            sb.append("Rectangle.converter(");
            break;

         case "Ellipse":
            res.add("type", "oval");
            sb.append("Ellipse.converter(");
            break;

         case "Arc":
            res.add("type", "arc");
            sb.append("Arc.converter(");
            break;

         case "ArcChord":
            res.add("type", "arc");
            sb.append("ArcChord.converter(");
            break;

         case "PieSlice":
            res.add("type", "arc");
            sb.append("PieSlice.converter(");
            break;
         case "Dot":
            res.add("type", "rectangle");
            sb.append("Dot.converter(");
            break;
         case "Text":
            res.add("type", "text");

            break;
         case "PolyLine":
            res.add("type", "line");
            sb.append("PolyLine.converter(");
            break;
         case "Spline":
            res.add("type", "line");
            sb.append("Spline.converter(");
            break;
         case "Polygon":
            res.add("type", "polygon");
            sb.append("Polygon.converter(");
            break;
         case "Blob":
            res.add("type", "polygon");
            sb.append("Blob.converter(");
            break;
         default:
            break;
      }
      if (ctx.ID() != null) {
         String id = ctx.ID().toString();
         value = declared_vars.get(id);
         sb.append(value);
         // ir ao map das variaveis

      }
      if (ctx.point() != null) {
         String write_expr = ctx.point().getText();

         sb.append(write_expr.toString());

      }
      if (number_of_assignments > 1) {
         sb.append(",");
      }
      String type = ctx.type().getText();

      for (int i = 0; i < number_of_assignments; i++) {
         String assignment = visit(ctx.assignment(i)).render();

         if (i == 0 && number_of_assignments > 1 && !type.equals("Text") && !type.equals("Blob")) {

            continue;
         }
         if (i == 1 && !type.equals("Text") && !type.equals("PolyLine") && !type.equals("Spline")
               && !type.equals("Polygon") && !type.equals("Blob")) {
            sb.append(converter.get("length") + ")" + ",");
         }
         if (i == number_of_assignments - 1
               || ((type.equals("PolyLine") || type.equals("Spline") || type.equals("Polygon") || type.equals("Blob"))
                     && i == number_of_assignments - 2)) {// como o polyline e o Spline tem numero de points indefenido
                                                          // é mais dificil
            if (number_of_assignments == 1 || ((type.equals("PolyLine") || type.equals("Spline")
                  || type.equals("Polygon") || type.equals("Blob")) && i == number_of_assignments - 1)) {
               sb.append("),");
            }
            sb.append(assignment);
         } else {
            sb.append(assignment + ",");
         }

      }
      if (type.equals("Spline") || type.equals("Blob")) {

         sb.append(",smooth=True");
      }
      res.add("value", sb.toString());
      res.add("view", declared_vars.get("View"));
      return res;
      // return res;
   }

   @Override
   public ST visitAssignment(AGLParser.AssignmentContext ctx) {
      ST res = null;
      String var_name = ctx.ID().getText();

      String value = "";
      if (ctx.expression() != null) {
         value = ctx.expression().getText();

      }
      if (ctx.expression().waitCommand() != null) {
         value = "getMouse(";
         value += declared_vars.get("View") + ".canvas";
         value += ")";
      }

      res = templates.getInstanceOf("assignment");
      if (var_name.equals("length")) {
         converter.put(var_name, value.toString());
      }
      res.add("var", var_name);
      res.add("value", value);

      return res;
      // return res;
   }

   @Override
   public ST visitPropertyChange(AGLParser.PropertyChangeContext ctx) {
      ST res = null;
      res = templates.getInstanceOf("properties_change");
      String var = ctx.ID(0).getText();
      res.add("var", var);
      res.add("atributo", ctx.ID(1).getText());
      res.add("view", declared_vars.get("View"));

      res.add("expression", ctx.expression().getText());

      return res;
      // return res;
   }

   @Override
   public ST visitLoop(AGLParser.LoopContext ctx) {
      ST res = null;
      res = templates.getInstanceOf("Loop");
      int num_int = ctx.ID().size();

      String var_loop = ctx.ID(0).getText();
      res.add("var_loop", var_loop);

      if (ctx.ID().size() == 1) {
         res.add("inicial", ctx.INT(0).getText());
         res.add("final", ctx.INT(1).getText());
      }

      if (ctx.ID().size() == 2) {
         if (ctx.ID(1) != null) {
            res.add("inicial", ctx.ID(1).getText());
            res.add("final", ctx.INT(0).getText());
         } else {
            res.add("inicial", ctx.INT(0).getText());
            res.add("final", ctx.ID(1).getText());
         }
      }
      if (ctx.ID().size() == 3) {
         res.add("inicial", ctx.ID(1).getText());
         res.add("final", ctx.ID(2).getText());
      }

      int expression_amount = ctx.statement().size();
      String for_loop_statements = "";

      for (int i = 0; i < expression_amount; i++) {
         for_loop_statements += visit(ctx.statement(i)).render() + "\n";
      }

      res.add("statments", for_loop_statements);

      return res;
   }

   @Override
   public ST visitPropertyBlock(AGLParser.PropertyBlockContext ctx) {
      ST res = null;

      res = templates.getInstanceOf("property_block_change");
      StringBuilder sb = new StringBuilder();
      res.add("view", declared_vars.get("View"));
      res.add("var", ctx.ID().getText());
      int number_atr = ctx.assignment().size();

      for (int i = 0; i < number_atr; i++) {
         String assignment = visit(ctx.assignment(i)).render();

         if (i == number_atr - 1) {

            sb.append(assignment);
         } else {
            sb.append(assignment + ",");
         }

      }
      res.add("statments", sb.toString());
      return res;
      // return res;
   }

   @Override
   public ST visitCloseCommand(AGLParser.CloseCommandContext ctx) {
      ST res = null;
      res = templates.getInstanceOf("close");
      res.add("view", declared_vars.get("View"));
      return res;
      // return res;
   }

   @Override
   public ST visitRefreshCommand(AGLParser.RefreshCommandContext ctx) {
      ST res = null;
      res = templates.getInstanceOf("refresh");
      res.add("view", declared_vars.get("View"));
      if (ctx.time() != null) {

         for (int i = 0; i < ctx.time().getText().length(); i++) {
            if (ctx.time().getText().charAt(i) == 's') {
               String time = ctx.time().getText().split("s")[0];

               int timea = Integer.parseInt(time) * 1000;

               res.add("time", timea);
               return res;
            }
            if (ctx.time().getText().charAt(i) == 'm') {
               String time = ctx.time().getText().split("m")[0];

               res.add("time", time);
               return res;
            }
         }

      }
      return res;
   }

   @Override
   public ST visitPrintCommand(AGLParser.PrintCommandContext ctx) {
      ST res = templates.getInstanceOf("print");
      StringBuilder sb = new StringBuilder();

      if (ctx.ID() != null) {
         String id = ctx.ID().toString();
         String value = declared_vars.get(id);
         res.add("value", id);
         // ir ao map das variaveis

      }
      if (ctx.STRING() != null) {
         String write_expr = ctx.STRING().toString();

         res.add("value", write_expr.toString());

      }

      return res;

   }

   @Override
   public ST visitMoveCommand(AGLParser.MoveCommandContext ctx) {
      ST res = null;

      if (ctx.ID().getText() != null) {
         if (ctx.ID().getText().equals(declared_vars.get("View"))) {
            res = templates.getInstanceOf("move_view");
            res.add("view", declared_vars.get("View"));
         } else {
            res = templates.getInstanceOf("move_object");
            res.add("var", ctx.ID().getText());
            res.add("view", declared_vars.get("View"));
         }

      }
      if (ctx.vector() != null) {
         String expre = ctx.vector().getText();
         res.add("expression", expre);

      }
      return res;
      // return res;
   }

   @Override
   public ST visitConditional(AGLParser.ConditionalContext ctx) {
      ST res = null;
      res = templates.getInstanceOf("condi");
      String ifcond = visit(ctx.ifBlock()).render();
      if (ctx.elseBlock().getText() != null) {
         String elsecond = visit(ctx.elseBlock()).render();
         res.add("elseblock", elsecond);
      }

      res.add("ifblock", ifcond);

      return res;
      // return res;
   }

   @Override
   public ST visitIfBlock(AGLParser.IfBlockContext ctx) {
      ST res = null;
      StringBuilder sb = new StringBuilder();
      res = templates.getInstanceOf("ifcond");

      if (ctx.ID().size() == 0) {
         res.add("first", ctx.expression(0).getText());
         res.add("second", ctx.expression(1).getText());
      }

      if (ctx.ID().size() == 1) {
         if (ctx.ID(1) != null) {
            res.add("first", ctx.ID(0).getText());
            res.add("second", ctx.expression(0).getText());
         } else {
            res.add("first", ctx.expression(0).getText());
            res.add("second", ctx.ID(0).getText());
         }
      }
      if (ctx.ID().size() == 2) {
         res.add("first", ctx.ID(0).getText());
         res.add("second", ctx.ID(1).getText());
      }

      int number_sta = ctx.statement().size();

      for (int i = 0; i < number_sta; i++) {
         String sta = visit(ctx.statement(i)).render();

         if (i == number_sta - 1) {

            sb.append(sta);
         }

      }
      res.add("statments", sb.toString());

      return res;
      // return res;
   }

   @Override
   public ST visitElseBlock(AGLParser.ElseBlockContext ctx) {
      ST res = null;
      StringBuilder sb = new StringBuilder();
      res = templates.getInstanceOf("elsecond");

      int number_sta = ctx.statement().size();

      for (int i = 0; i < number_sta; i++) {
         String sta = visit(ctx.statement(i)).render();

         if (i == number_sta - 1) {

            sb.append(sta);
         }

      }
      res.add("statments", sb.toString());

      return res;
      // return res;
   }

   @Override
   public ST visitType(AGLParser.TypeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitView(AGLParser.ViewContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitExpression(AGLParser.ExpressionContext ctx) {
      ST res = null;

      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitPoint(AGLParser.PointContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public ST visitVector(AGLParser.VectorContext ctx) {
      ST res = null;
      if (ctx.ID().getText() != null) {
         return visitChildren(ctx);
      } else {
         return visitChildren(ctx);
      }
      // return res;
   }

   @Override
   public ST visitTime(AGLParser.TimeContext ctx) {
      ST res = null;
      return visitChildren(ctx);
      // return res;
   }
}
