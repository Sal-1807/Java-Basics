package JavaProgrammingElementsLv1;


import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Convert height in centimeters to feet and inches
        //Read the height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        //convert the height 
        double heightInches = heightCm / 2.54;
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;
        //Output
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
        scanner.close();
    }
}
