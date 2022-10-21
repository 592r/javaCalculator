package CalculatorOperations;
import java.awt.*;
import java.util.Scanner;

public class Operations {
    
    public static void Cases(String input, Scanner myScanner) {

            switch (input) {

                case "help":
                    PrintHelp();
                    break;

                case "add":
                    AddTwoNumbers(myScanner);
                    break;

                case "subtract":
                    SubtractTwoNumbers(myScanner);
                    break;
                    
                case "clear":
                    
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    
                    break;

                case "multiply":

                    System.out.println("multiplies a number");

                    break;

                default:
                    System.out.println("Invalid command");
                    break;
                }
    }
    

    public static void PrintHelp(){

        System.out.println("help - Prints all the commands that you can use");
        System.out.println("add - Add two numbers together");
        System.out.println("subtract - subtract two numbers together");
        System.out.println("clear - clears the page");
    }

    public static void AddTwoNumbers (Scanner scanner) {
        String stringNumber1;
        String stringNumber2;

        System.out.println("Enter the first number you want to add");
        stringNumber1 = scanner.nextLine();

        System.out.println("Enter the second number you want to add");
        stringNumber2 = scanner.nextLine();

        try {
            int number1 = Integer.valueOf(stringNumber1);
            int number2 = Integer.valueOf(stringNumber2);

            int answer = number1+number2;
            System.out.println(answer);

        } catch (Exception e) {
            System.out.println("Please input numbers next time");
        }
    }

    public static void SubtractTwoNumbers(Scanner scanner){
            String stringNumber1;
            String stringNumber2;

            System.out.println("Enter the first number you want to subtract");
            stringNumber1 = scanner.nextLine();

            System.out.println("Enter the second number you want to subtract");
            stringNumber2 = scanner.nextLine();

            try {
                int number1 = Integer.valueOf(stringNumber1);
                int number2 = Integer.valueOf(stringNumber2);

                int answer = number1-number2;
                System.out.println(answer);

            } catch (Exception e) {
                System.out.println("Please input numbers next time");
            }

    }

    public static void MultiplyTwoNumbers(Scanner scanner){
        String stringNumber1;
        String stringNumber2;

        System.out.println("Enter the first number you want to multiply");
        stringNumber1 = scanner.nextLine();

        System.out.println("Enter the second number you want to multiply");
        stringNumber2 = scanner.nextLine();

        try {
            int number1 = Integer.valueOf(stringNumber1);
            int number2 = Integer.valueOf(stringNumber2);

            int answer = number1*number2;
            System.out.println(answer);

        } catch (Exception e) {
            System.out.println("Please input numbers next time");
        }

    }
    
}