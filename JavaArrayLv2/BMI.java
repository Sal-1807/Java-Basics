package JavaArrayLv2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        // Arrays to store height, weight, BMI, and weight status for each person
        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];
        // Loop to collect data for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in meters): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weights[i] = scanner.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        // Display the details of all persons
        System.out.println("\nDetails of all persons:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < numberOfPersons; i++) {
            // Print height, weight, BMI, and weight status for each person
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", heights[i], weights[i], bmis[i], statuses[i]);
        }
        scanner.close();
    }
}
