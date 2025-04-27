package JavaArrayLv2;
import java.util.Scanner;
public class frequencydigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] frequency = new int[10]; // Array to store frequency of digits

        // Process each digit of the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            frequency[digit]++; // Increment the frequency of the digit
            number /= 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
