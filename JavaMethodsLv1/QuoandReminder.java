package JavaMethodsLv1;
import java.util.Scanner;
public class QuoandReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int divisor = scanner.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);

        scanner.close();
    }
// Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
