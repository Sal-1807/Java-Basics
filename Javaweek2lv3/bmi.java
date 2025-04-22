package Javaweek2lv3;
import java.util.Scanner;


public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for weight and height
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();

        // Converting height from cm to meters
        double heightM = heightCm / 100;

        // Calculating BMI
        double bmi = weight / (heightM * heightM);

        // Determining weight status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obesity";
        }

        // Displaying the result
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Weight status: " + status);

        scanner.close();
    }
}
