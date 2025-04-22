package Javaweek1lv2;
import java.util.Scanner;

public class Dividing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the first and second number from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
         // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        // Output the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
        scanner.close();
    }
}