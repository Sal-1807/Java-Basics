package JavaMethodsLv1;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Taking user input
            System.out.print("Enter Principal: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter Rate of Interest: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = scanner.nextDouble();

            // Calculating Simple Interest
            double simpleInterest = calculateSimpleInterest(principal, rate, time);

            // Displaying the result
            System.out.println("The Simple Interest is " + simpleInterest + 
                               " for Principal " + principal + 
                               ", Rate of Interest " + rate + 
                               " and Time " + time);
        }
    }

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Formula to calculate Simple Interest
        return (principal * rate * time) / 100;
    }
}
