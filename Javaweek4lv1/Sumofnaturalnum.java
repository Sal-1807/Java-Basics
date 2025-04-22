package Javaweek4lv1;
import java.util.Scanner;
public class Sumofnaturalnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = calculateSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
// Method to calculate the sum of the first n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
