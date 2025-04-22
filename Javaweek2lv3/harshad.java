package Javaweek2lv3;
import java.util.Scanner;


public class harshad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
      // A Harshad number is an integer that is divisible by the sum of its digits.
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
        scanner.close();
    }
}
