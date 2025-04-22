package Javaweek2lv1;

import java.util.Scanner;

public class sumofnn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        // Enter a number
        while (true) {
            System.out.print("Enter a number: ");
            if (!scanner.hasNextDouble()) { // Prevents invalid input crash
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
                continue;
            }

            double number = scanner.nextDouble();

            // Sum of natural numbers
            if (number <= 0) {
                break;
            }

            total += number;
        }

        // Output
        System.out.println("The total sum is: " + total);

        // Prevent the window from closing immediately
        System.out.println("Press Enter to exit...");
        scanner.next(); // Consume leftover newline

        scanner.close(); // Close the scanner
    }
}
