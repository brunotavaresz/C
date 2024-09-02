import java.util.Stack;
import java.util.Scanner;

public class calculadoraRPN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> pilha = new Stack<>();

        System.out.print("Insira a expressão RPN: ");
        String entrada = scanner.nextLine();
        String[] tokens = entrada.split(" ");

        for (String token : tokens) {
            if (isOperando(token)) {
                pilha.push(Double.parseDouble(token));
            } else if (isOperador(token)) {
                if (pilha.size() < 2) {
                    System.out.println("Erro sintático: Operador sem operandos suficientes na pilha.");
                    return;
                }

                double operando2 = pilha.pop();
                double operando1 = pilha.pop();
                double resultado = realizarOperacao(operando1, operando2, token);
                pilha.push(resultado);
            } else {
                System.out.println("Erro: Token não reconhecido - " + token);
                return;
            }

            System.out.println("Pilha: " + pilha);
        }

        scanner.close();
    }

    private static boolean isOperando(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static double realizarOperacao(double operando1, double operando2, String operador) {
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                if (operando2 != 0) {
                    return operando1 / operando2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    System.exit(1);
                }
            default:
                System.out.println("Erro: Operador não reconhecido - " + operador);
                System.exit(1);
                return 0; // Nunca alcançado
        }
    }
}
