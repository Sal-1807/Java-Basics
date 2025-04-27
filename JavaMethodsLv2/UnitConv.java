package JavaMethodsLv2;
import java.util.Scanner;
public class UnitConv {
    // This program converts units of measurement between kilometers, miles, meters, and feet.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double km = scanner.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        System.out.print("Enter the distance in miles: ");
        miles = scanner.nextDouble();
        km = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + km + " kilometers.");

        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        System.out.print("Enter the distance in feet: ");
        feet = scanner.nextDouble();
        meters = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + meters + " meters.");

        scanner.close();
    }
    // Conversion methods
    // This method converts kilometers to miles.
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
// This method converts miles to kilometers.
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
// This method converts meters to feet.
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
// This method converts feet to meters.
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}
