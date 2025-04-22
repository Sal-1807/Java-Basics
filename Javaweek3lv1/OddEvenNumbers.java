package Javaweek3lv1;
import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        if (number <= 0) {     //Enter a valid natural number
            System.out.println("Error: Please enter a natural number greater than 0.");
        }
       // Initialize two arrays to store odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
       // for loop for finding  the even numbers and odd numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
            evenNumbers[evenIndex++] = i;
            } else {
            oddNumbers[oddIndex++] = i;
            }
        }
     // print the odd and even numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
