package Javaweek3lv1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        // Make sure the user enters a positive integer
        if (number > 0) {
            String[] results = new String[number + 1];
        // Loop through the numbers from 0 to the user input and check if they are divisible by 3, 5, or both
            for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
            }
          // Print the results
            for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}
