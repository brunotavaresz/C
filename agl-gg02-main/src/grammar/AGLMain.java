import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import java.util.*;

public class AGLMain {
    public static void main(String[] args) {
        try {

            // criar um CharStream que lê da entrada padrão
            CharStream input = CharStreams.fromFileName(args[0]);
            // criar um lexer que utiliza o CharStream de entrada
            System.out.println("AGL Compiler");
            AGLLexer lexer = new AGLLexer(input);

            // criar um buffer de tokens extraídos pelo lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // criar um parser que utiliza o buffer de tokens
            AGLParser parser = new AGLParser(tokens);
            // substituir o listener de erro
            // parser.removeErrorListeners(); // remover ConsoleErrorListener
            // parser.addErrorListener(new ErrorHandlingListener());
            // começar a análise sintática na regra 'program'
            ST result = null;
            ParseTree tree = parser.program();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                // imprimir a árvore estilo LISP
                // System.out.println(tree.toStringTree(parser));

                SemanticAnalyzer checker = new SemanticAnalyzer();
                checker.visit(tree);

                if (!ErrorHandling.error()) {
                    AGLCompiler compiler = new AGLCompiler();
                    result = compiler.visit(tree);
                    String filename = args[0].split("/")[3].replace(".agl", "");
                    try {
                        File directory = new File("../../Results");
                        File file = new File(directory, filename + ".py");
                        try (FileWriter writer = new FileWriter(file, false)) {
                            writer.write(result.render());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    ErrorHandling.reset();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (RecognitionException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
