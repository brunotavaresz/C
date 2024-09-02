import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        Map<String, Integer> variaveis = new HashMap<>(); // Cria um HashMap para armazenar as variáveis

        while (true) {
            System.out.print(">> ");
            String linha = scanner.nextLine(); // Lê a linha de entrada do usuário

            if (linha.equals("exit")) {
                System.out.println("Saindo da calculadora.");
                break;
            }

            processarLinha(linha, variaveis); 
        }

        scanner.close();
    }

    private static void processarLinha(String linha, Map<String, Integer> variaveis) { 
        String[] tokens = linha.split(" "); // Divide a linha em tokens separados por espaços

        if (tokens.length == 3 && tokens[1].equals("=")) { // Se a linha contém uma atribuição de variável (ex.: x = 5)
            // Definir variável
            String nomeVariavel = tokens[0]; // O primeiro token é o nome da variável
            int valor = Integer.parseInt(tokens[2]); // O terceiro token é o valor da variável
            variaveis.put(nomeVariavel, valor); // Adiciona a variável ao HashMap
        } else {
            int resultado = avaliarExpressao(tokens, variaveis); // Avalia a expressão
            System.out.println("Resultado: " + resultado); // Imprime o resultado da expressão
        }
    }

    private static int avaliarExpressao(String[] tokens, Map<String, Integer> variaveis) {
        int resultado = 0;
        String operador = "";
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) { // Se o token é um operador
                operador = token; // Define o operador para ser usado na próxima iteração
            } else {
                if (variaveis.containsKey(token)) { // Se o token é uma variável
                    int valorVariavel = variaveis.get(token); // Obtém o valor da variável
                    switch (operador) { // Realiza a operação com o valor da variável
                        case "":
                            resultado = valorVariavel;
                            break;
                        case "+":
                            resultado += valorVariavel;
                            break;
                        case "-":
                            resultado -= valorVariavel;
                            break;
                        case "*":
                            resultado *= valorVariavel;
                            break;
                        case "/":
                            resultado /= valorVariavel;
                            break;
                    }
                } else {
                    try {
                        int valor = Integer.parseInt(token); // Se o token é um número
                        switch (operador) { // Realiza a operação com o número
                            case "":
                                resultado = valor;
                                break;
                            case "+":
                                resultado += valor;
                                break;
                            case "-":
                                resultado -= valor;
                                break;
                            case "*":
                                resultado *= valor;
                                break;
                            case "/":
                                resultado /= valor;
                                break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Variável ou número não reconhecido - " + token);
                    }
                }
            }
        }
        return resultado;
    }
}
