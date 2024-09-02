import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class exercicio1_04 {

    public static void main(String[] args) {
        try {
            // carrega o mapa de números do arquivo
            Map<String, String> numberMap = loadNumberMap("numbers.txt");

            // Cria um BufferedReader para ler a entrada do usuário 
            BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.println("Enter a sentence:");
            String input = reader.readLine();

            /// Divide a entrada em palavras
            String[] words = input.split("\\s+");

            // Traduz cada palavra e imprime a tradução
            for (String word : words) {
                String translatedWord = numberMap.getOrDefault(word.toLowerCase(), word); // Obtém a tradução da palavra ou a própria palavra se não houver tradução 
                System.out.print(translatedWord + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<String, String> loadNumberMap(String fileName) throws IOException {
        Map<String, String> numberMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        // Lê cada linha do arquivo e adiciona a tradução ao mapa
        String line;
        while ((line = reader.readLine()) != null) { 
            String[] parts = line.split(" - "); // Divide a linha em duas partes separadas por " - "
            if (parts.length == 2) {
                numberMap.put(parts[1].toLowerCase(), parts[0]); // Adiciona a tradução ao mapa, com a palavra em minúsculas como chave e a tradução como valor
            }
        }
        reader.close();
        return numberMap;
    }    
}
