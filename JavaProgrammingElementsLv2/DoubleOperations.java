package JavaProgrammingElementsLv2;
import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input values for a, b, and c
        System.out.print("Enter value for a: ");
        double a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        double b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        double c = scanner.nextInt();

        // Performing double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / (double) b;
        double result4 = a % b + c;

        // Printing the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}