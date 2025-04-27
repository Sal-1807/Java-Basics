
import java.util.Scanner;
public class collieaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input points
        System.out.println("Enter x1, y1:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter x2, y2:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter x3, y3:");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check collinearity using slope formula
        if (areCollinearUsingSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check collinearity using area of triangle formula
        if (areCollinearUsingArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the area of triangle formula.");
        } else {
            System.out.println("The points are not collinear using the area of triangle formula.");
        }

        scanner.close();
    }

    public static boolean areCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Check if slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate area of triangle
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Check if area is 0
        return area == 0;
    }
}
