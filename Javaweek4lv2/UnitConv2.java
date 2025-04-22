package Javaweek4lv2;
import java.util.Scanner;
public class UnitConv2 {
    // This program converts units of measurement between yards and feet, meters and inches, and inches and centimeters.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in yards: ");
        double yards = scanner.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        System.out.print("Enter the distance in feet: ");
        feet = scanner.nextDouble();
        yards = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yards + " yards.");

        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        System.out.print("Enter the distance in inches: ");
        inches = scanner.nextDouble();
        meters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + meters + " meters.");

        System.out.print("Enter the distance in inches for centimeters conversion: ");
        inches = scanner.nextDouble();
        double centimeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");

        scanner.close();
    }
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
