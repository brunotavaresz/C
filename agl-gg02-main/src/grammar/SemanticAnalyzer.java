import java.util.HashMap;
import java.util.Map;

public class SemanticAnalyzer extends AGLBaseVisitor<Void> {
    private Map<String, String> declared_vars;
    private String[] validViewProperties = { "width", "height", "title", "background" };
    private String[] validShapeProperties = { "length", "fill", "start", "extent", "outline" };
    private String[] validTextProperties = { "fill", "text" };
    private String[] validDotProperties = { "fill" };

    public SemanticAnalyzer() {
        declared_vars = new HashMap<>();
    }

    @Override
    public Void visitProgram(AGLParser.ProgramContext ctx) {
        for (AGLParser.StatementContext statementCtx : ctx.statement()) {
            visitStatement(statementCtx);
        }
        return null;
    }

    @Override
    public Void visitDeclaration(AGLParser.DeclarationContext ctx) {
        String varName = ctx.ID().getText();
        if (declared_vars.containsKey(varName)) {
            System.out.println("Error: Variable " + varName + " already declared.");
        } else {
            String varType = ctx.type().getText();
            declared_vars.put(varName, varType);
        }
        return null;
    }

    @Override
    public Void visitInstantiationWithProperties(AGLParser.InstantiationWithPropertiesContext ctx) {
        String varName = ctx.ID().getText();
        String type = ctx.type().getText();

        if (!isValidType(type)) {
            System.out.println("Error: Invalid type '" + type + "'.");
        } else {
            // Variável declarada, podemos prosseguir com a atribuição de propriedades
            declared_vars.put(varName, type);
            for (AGLParser.AssignmentContext assignmentCtx : ctx.assignment()) {
                String propertyName = assignmentCtx.ID().getText();
                if (!isValidProperty(type, propertyName)) {
                    System.out.println("Error: Invalid property '" + propertyName + "' for type '" + type + "'.");
                }
            }
        }

        return null;
    }

    @Override
    public Void visitInstantiationWithExpression(AGLParser.InstantiationWithExpressionContext ctx) {
        String varName = ctx.ID().getText();
        String type = ctx.type().getText();

        System.out.println("Debug: Visiting instantiation with expression.");
        System.out.println("Debug: Variable name: " + varName + ", Type: " + type);

        if (!isValidType(type)) {
            System.out.println("Error: Invalid type '" + type + "'.");
        } else {
            AGLParser.ExpressionContext expressionCtx = ctx.expression();
            if (expressionCtx != null) {
                System.out.println("Debug: Expression is not null.");
                if (expressionCtx.ID() != null) {
                    String exprVarName = expressionCtx.ID().getText();
                    if (!declared_vars.containsKey(exprVarName)) {
                        System.out.println("Error: Variable " + exprVarName + " not declared1.");
                        return null;
                    }
                    String exprVarType = declared_vars.get(exprVarName);
                    if (!type.equals(exprVarType)) {
                        System.out.println("Error: Type mismatch. Cannot assign " + exprVarType + " to " + type);
                        return null;
                    }
                } else if (expressionCtx.INT() != null || expressionCtx.FLOAT() != null) {
                    System.out.println("Debug: Expression is an INT or FLOAT.");
                    if (!type.equals("Integer") && !type.equals("Number")) {
                        System.out.println("Error: Type mismatch. Cannot assign number to " + type);
                        return null;
                    }
                } else if (expressionCtx.STRING() != null) {
                    // Verifica se o tipo é Point e se é um comando de espera válido
                    if (type.equals("Point")) {
                        if (expressionCtx.point() != null) {
                            // A expressão é um ponto, permitir
                            return null;
                        } else if (expressionCtx.waitCommand() != null) {
                            // Se for um comando de espera válido, permitir
                            return null;
                        } else {
                            // Caso contrário, é um tipo inválido
                            System.out.println("Error: Type mismatch. Cannot assign string to " + type);
                            return null;
                        }
                    }
                    // Verifica se o tipo não é uma String
                    if (!type.equals("String")) {
                        System.out.println("Error: Type mismatch. Cannot assign string to " + type);
                        return null;
                    }
                } else if (expressionCtx.point() != null) {
                    System.out.println("Debug: Expression is a POINT.");
                    if (!type.equals("Point")) {
                        System.out.println("Error: Type mismatch. Cannot assign point to " + type);
                        return null;
                    }
                } else if (expressionCtx.vector() != null) {
                    System.out.println("Debug: Expression is a VECTOR.");
                    if (!type.equals("Vector")) {
                        System.out.println("Error: Type mismatch. Cannot assign vector to " + type);
                        return null;
                    }
                } else if (expressionCtx.time() != null) {
                    System.out.println("Debug: Expression is a TIME.");
                    if (!type.equals("Time")) {
                        System.out.println("Error: Type mismatch. Cannot assign time to " + type);
                        return null;
                    }
                } else {
                    System.out.println("Error: Unsupported expression type for assignment.");
                    return null;
                }

                // Adicionar a variável ao mapa de variáveis declaradas.
                declared_vars.put(varName, type);
                System.out.println("Debug: Variable " + varName + " declared with type " + type);
            } else {
                System.out.println("Error: Expression context is null.");
            }
        }

        return null;
    }

    @Override
    public Void visitReferenceCommand(AGLParser.ReferenceCommandContext ctx) {
        // Obter o tipo de objeto
        String objectType = ctx.type().getText();

        // Verificar se a posição é especificada por um ponto ou uma variável
        String position = "";
        if (ctx.point() != null) {
            position = ctx.point().getText();
        } else {
            position = ctx.ID().getText();
            if (!declared_vars.containsKey(position)) {
                System.out.println("Error: Position " + position + " not declared2.");
                return null;
            }
        }

        // Verificar se o tipo de objeto é válido
        if (!isValidType(objectType)) {
            System.out.println("Error: Invalid object type '" + objectType + "'.");
            return null;
        }

        // Verificar e imprimir as propriedades especificadas
        for (AGLParser.AssignmentContext assignmentCtx : ctx.assignment()) {
            String propertyName = assignmentCtx.ID().getText();

            // Verificar se a propriedade é válida para o tipo de objeto
            if (!isValidProperty(objectType, propertyName)) {
                System.out.println(
                        "Error: Invalid property '" + propertyName + "' for object type '" + objectType + "'.");
            }
        }

        return null;
    }

    @Override
    public Void visitAssignment(AGLParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();

        // Verifica se o contexto é um PropertyBlockContext
        if (ctx.getParent() instanceof AGLParser.PropertyBlockContext) {
            AGLParser.PropertyBlockContext parentBlock = (AGLParser.PropertyBlockContext) ctx.getParent();
            String blockName = parentBlock.ID().getText();
            if (declared_vars.containsKey(blockName)) {
                String blockType = declared_vars.get(blockName);
                if (isValidProperty(blockType, varName)) {
                    // Propriedade válida para o tipo de bloco, não precisa de declaração
                    return null;
                } else {
                    // Propriedade inválida para o tipo de bloco
                    System.out.println("Error: Invalid property '" + varName + "' for block type '" + blockType + "'.");
                    return null;
                }
            } else {
                // Tipo de bloco não declarado
                System.out.println("Error: Block " + blockName + " not declared.");
                return null;
            }
        } else if (ctx.getParent() instanceof AGLParser.ReferenceCommandContext) {
            // Se o contexto é um ReferenceCommandContext, verifica se as propriedades se
            // aplicam ao tipo de objeto
            AGLParser.ReferenceCommandContext parentReferenceCommand = (AGLParser.ReferenceCommandContext) ctx
                    .getParent();
            String objectType = parentReferenceCommand.type().getText();

            if (!isValidType(objectType)) {
                System.out.println("Error: Invalid object type '" + objectType + "'.");
                return null;
            }

            for (AGLParser.AssignmentContext assignmentCtx : parentReferenceCommand.assignment()) {
                String propertyName = assignmentCtx.ID().getText();
                if (!isValidProperty(objectType, propertyName)) {
                    System.out.println(
                            "Error: Invalid property '" + propertyName + "' for object type '" + objectType + "'.");
                }
            }

            return null;
        } else if (ctx.getParent() instanceof AGLParser.InstantiationWithPropertiesContext) {
            // Se o contexto é uma instanciação com propriedades, verifique se a propriedade
            // é válida para o tipo de instância
            AGLParser.InstantiationWithPropertiesContext parentInstantiation = (AGLParser.InstantiationWithPropertiesContext) ctx
                    .getParent();
            String instantiationName = parentInstantiation.ID().getText();
            String instantiationType = parentInstantiation.type().getText();
            if (!declared_vars.containsKey(instantiationName)) {
                System.out.println("Error: Instantiation " + instantiationName + " not declared.");
                return null;
            }
            String varType = declared_vars.get(instantiationName);
            if (!varType.equals(instantiationType)) {
                System.out.println("Error: Type mismatch. Cannot assign " + instantiationType + " to " + varType);
                return null;
            }
            // Verifica se a propriedade é válida para o tipo de instância
            if (!isValidProperty(instantiationType, varName)) {
                System.out.println("Error: Invalid property '" + varName + "' for instantiation type '"
                        + instantiationType + "'.");
                return null;
            }
        } // verifica se se trata de um refferenceCommand e efetua as verificações
          // necessárias
        else {
            // Trata-se de uma declaração fora de um bloco de propriedades ou de uma
            // instância
            // Verifique se a variável está declarada
            if (!declared_vars.containsKey(varName)) {
                System.out.println("Error: Variable " + varName + " not declared.");
                return null;
            }
            String varType = declared_vars.get(varName);
            AGLParser.ExpressionContext exprCtx = ctx.expression();

            // Adiciona verificação para garantir que exprCtx não é nulo
            if (exprCtx != null) {
                // Verifique se a expressão é uma ID
                if (exprCtx.ID() != null) {
                    String exprVarName = exprCtx.ID().getText();
                    if (!declared_vars.containsKey(exprVarName)) {
                        System.out.println("Error: Variable " + exprVarName + " not declared.");
                        return null;
                    }
                    String exprVarType = declared_vars.get(exprVarName);
                    if (!varType.equals(exprVarType)) {
                        System.out.println("Error: Type mismatch. Cannot assign " + exprVarType + " to " + varType);
                        return null;
                    }
                } else if (exprCtx.INT() != null || exprCtx.FLOAT() != null) {
                    if (!varType.equals("Integer") && !varType.equals("Number")) {
                        System.out.println("Error: Type mismatch. Cannot assign number to " + varType);
                        return null;
                    }
                } else if (exprCtx.STRING() != null) {
                    if (!varType.equals("String")) {
                        System.out.println("Error: Type mismatch. Cannot assign string to " + varType);
                        return null;
                    }
                } else if (exprCtx.point() != null) {
                    if (!varType.equals("Point")) {
                        System.out.println("Error: Type mismatch. Cannot assign point to " + varType);
                        return null;
                    }
                } else if (exprCtx.vector() != null) {
                    if (!varType.equals("Vector")) {
                        System.out.println("Error: Type mismatch. Cannot assign vector to " + varType);
                        return null;
                    }
                } else if (exprCtx.time() != null) {
                    if (!varType.equals("Time")) {
                        System.out.println("Error: Type mismatch. Cannot assign time to " + varType);
                        return null;
                    }
                } else {
                    System.out.println("Error: Unsupported expression type for assignment.");
                    return null;
                }
            }
        }

        return null;
    }

    @Override
    public Void visitPropertyBlock(AGLParser.PropertyBlockContext ctx) {
        String blockName = ctx.ID().getText();
        if (!declared_vars.containsKey(blockName)) {
            System.out.println("Error: Block " + blockName + " not declared7.");
            return null;
        }

        String blockType = declared_vars.get(blockName);
        for (AGLParser.AssignmentContext assignmentCtx : ctx.assignment()) {
            String propertyName = assignmentCtx.ID().getText();
            if (!isValidProperty(blockType, propertyName)) {
                System.out
                        .println("Error: Invalid property '" + propertyName + "' for block type '" + blockType + "'.");
            }
        }

        return null;
    }

    @Override
    public Void visitRefreshCommand(AGLParser.RefreshCommandContext ctx) {
        String variable = ctx.ID().getText();
        if (!declared_vars.containsKey(variable)) {
            System.out.println("Error: Variable " + variable + " not declared8.");
            return null;
        }

        String type = declared_vars.get(variable);
        if (!type.equals("View")) {
            System.out.println("Error: Invalid view type '" + type + "' for refresh command.");
        }
        return null;
    }

    @Override
    public Void visitLoop(AGLParser.LoopContext ctx) {
        String loopVar = ctx.ID(0).getText();
        if (!declared_vars.containsKey(loopVar)) {
            System.out.println("Error: Loop variable " + loopVar + " not declared9.");
        }
        return null;
    }

    private boolean isValidType(String type) {
        return type.equals("View") || type.equals("Line") || type.equals("Rectangle") || type.equals("Ellipse") ||
                type.equals("Arc") || type.equals("ArcChord") || type.equals("PieSlice") || type.equals("Text") ||
                type.equals("Dot") || type.equals("Time") || type.equals("Point") || type.equals("Number");
    }

    private boolean isValidProperty(String type, String property) {
        switch (type) {
            case "View":
                return contains(validViewProperties, property);
            case "Line":
            case "Rectangle":
            case "Ellipse":
            case "Arc":
            case "ArcChord":
            case "PieSlice":
                return contains(validShapeProperties, property);
            case "Text":
                return contains(validTextProperties, property);
            case "Dot":
                return contains(validDotProperties, property);
            default:
                return false;
        }
    }

    private boolean isValidWaitCommand(AGLParser.InstantiationWithExpressionContext ctx) {
        AGLParser.ExpressionContext expressionCtx = ctx.expression();
        return expressionCtx != null && expressionCtx.waitCommand() != null;
    }

    private boolean contains(String[] array, String key) {
        for (String s : array) {
            if (s.equals(key)) {
                return true;
            }
        }
        return false;
    }
}
