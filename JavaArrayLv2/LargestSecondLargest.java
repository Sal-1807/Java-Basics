package JavaArrayLv2;
import java.util.Scanner;
public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit]; // Array to store digits
        int index = 0;
      // Extract digits from the number
        while (number != 0) {
            if (index == maxDigit) {
            break;
            }
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        int largest = 0;
        int secondLargest = 0;
     // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
            secondLargest = largest;
            largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
            secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        scanner.close();
    }
}
