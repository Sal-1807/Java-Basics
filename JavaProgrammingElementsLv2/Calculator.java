package JavaProgrammingElementsLv2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first and second number from the user
        System.out.print("Enter the first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float number2 = scanner.nextFloat();

        // Calculate the addition, subtraction, multiplication and division
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Output the result
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                            + number1 + " and " + number2 + " is " 
                            + addition + ", " + subtraction + ", " 
                            + multiplication + ", and " + division);
        
        scanner.close();
    }
}