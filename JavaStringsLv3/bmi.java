package JavaStringsLv3;
import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2];

        // Taking user input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            heightWeightArray[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        // Compute BMI and status
        String[][] bmiResults = computeBMIAndStatus(heightWeightArray);

        // Display results
        displayResults(bmiResults);

        scanner.close();
    }

    public static String[][] computeBMIAndStatus(double[][] heightWeightArray) {
        String[][] results = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
            double heightInMeters = heightWeightArray[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);

            results[i][0] = String.format("%.2f", heightWeightArray[i][1]); // Height in cm
            results[i][1] = String.format("%.2f", weight); // Weight in kg
            results[i][2] = String.format("%.2f", bmi); // BMI

            // Determine BMI status
            if (bmi < 18.5) {
                results[i][3] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                results[i][3] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                results[i][3] = "Overweight";
            } else {
                results[i][3] = "Obesity";
            }
        }

        return results;
    }

    public static void displayResults(String[][] bmiResults) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < bmiResults.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", 
                bmiResults[i][0], bmiResults[i][1], bmiResults[i][2], bmiResults[i][3]);
        }
    }
}

