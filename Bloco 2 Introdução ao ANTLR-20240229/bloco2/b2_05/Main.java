import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> numberlist = NumbersMain.Antlr4Main();
        // System.out.println("test" +numberlist);
        Scanner myObj = new Scanner(System.in);

        while(myObj.hasNextLine()){

            String input = myObj.nextLine();  // Read user input
            String[] numbers = input.split("[ -]");

            for (int i = 0; i < numbers.length; i++) {
                if(numberlist.get(numbers[i]) == null){
                    System.out.print(numbers[i]);

                }else{
                    System.out.print(numberlist.get(numbers[i]));            
                }  
                System.out.print(" ");
            }
            System.out.println();

        }

        myObj.close();

        // String teste = "eight million two hundred thousand five hundred twenty-four";
        // ArrayList<String> specialNumbers = new ArrayList<String>(Arrays.asList("hundred", "thousand", "million"));
        

        // String[] splittedWords = teste.split("[ -]");
        // int number = 0;

        // for (int i = 0; i < splittedWords.length-1; i++) {
        //     if (specialNumbers.contains(splittedWords[i+1])){
        //         number += (numberlist.get(splittedWords[i])*numberlist.get(splittedWords[i+1]));
        //         i++;
        //     }else{
        //         number += numberlist.get(splittedWords[i]);
        //     }
        //     System.out.println(number);
        // }
        // number = numberlist.get(splittedWords[splittedWords.length-2]);

        // System.out.println(number);
    }
}