package JavaArrayLv2;
import java.util.Scanner;
public class Reversenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        // Store the digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        // Create an array to store the digits in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }
        // Display the reversed array
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        scanner.close();
    }
}
