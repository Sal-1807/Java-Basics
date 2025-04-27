package JavaProgrammingElementsLv2;
import java.util.Scanner;

public class PerimeterofSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the perimeter from the user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Output the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        scanner.close();
    }
}