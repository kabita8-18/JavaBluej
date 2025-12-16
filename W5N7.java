import java.util.*;

/**
 * Write a description of class W5N7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class W5N7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char choice = 'y';

        while (choice == 'y') {

            System.out.print("Enter the first number: ");
            double number1 = scan.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scan.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char op = scan.next().charAt(0);

            double result = 0;

            switch (op) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue? (y/n): ");
            choice = scan.next().charAt(0);
        }

        scan.close();
    }

        
        
        
        
    }