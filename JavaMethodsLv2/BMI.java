package JavaMethodsLv2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses = new String[10];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and populate the array
        calculateBMI(data);

        // Determine BMI status
        statuses = determineBMIStatus(data);

        // Display results
        System.out.println("Height(cm)  Weight(kg)  BMI       Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f       %.2f       %.2f    %s%n", data[i][1], data[i][0], data[i][2], statuses[i]);
        }

        scanner.close();
    }

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}
