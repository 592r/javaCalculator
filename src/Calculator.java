import java.util.Scanner;
import CalculatorOperations.Operations;

public class Calculator {

    public static void main(String args[]){
    


        System.out.println("Hello welcome to your java calculator");
        System.out.println("type \"help\" to get your options");

        Scanner myScanner = new Scanner(System.in);

        String input = "";

        while (!input.equals("exit")) {

            input = myScanner.nextLine();
            input = input.toLowerCase();

            Operations.Cases(input, myScanner);
        }

    }
}
    
    