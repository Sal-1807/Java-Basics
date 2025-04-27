package JavaProgrammingElementsLv2;
import java.util.Scanner;

public class HeightofSquareTrianglePerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = scanner.nextDouble();

        // Calculate area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // Convert base and height to centimeters
        double baseInCm = baseInInches * 2.54;
        double heightInCm = heightInInches * 2.54;

        // Calculate area in square centimeters
        double areaInSquareCm = 0.5 * baseInCm * heightInCm;

        // Output the results
        System.out.println("Area of the triangle:");
        System.out.println("In square inches: " + areaInSquareInches);
        System.out.println("In square centimeters: " + areaInSquareCm);

        // Convert height to feet and inches
        int heightInFeet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;

        // Output height in cm, feet, and inches
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + remainingInches);
        scanner.close();
    }
}