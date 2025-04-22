package Javaweek4lv1;
import java.util.Scanner;
public class Athleterunning {

    // Method to compute the number of rounds
    public static double computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // in meters (5 km)
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the three sides
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate and display number of rounds
        double rounds = computeRounds(side1, side2, side3);
        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.%n", rounds);

        scanner.close();
    }
}