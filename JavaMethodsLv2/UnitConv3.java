package JavaMethodsLv2;
import java.util.Scanner;
public class UnitConv3 {
    // This program converts units of measurement between Fahrenheit and Celsius, pounds and kilograms, and gallons and liters.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");

        System.out.print("Enter the temperature in Celsius: ");
        celsius = scanner.nextDouble();
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");

        System.out.print("Enter the weight in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " lbs is equal to " + kilograms + " kg.");

        System.out.print("Enter the weight in kilograms: ");
        kilograms = scanner.nextDouble();
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kg is equal to " + pounds + " lbs.");

        System.out.print("Enter the volume in gallons: ");
        double gallons = scanner.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        System.out.print("Enter the volume in liters: ");
        liters = scanner.nextDouble();
        gallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + gallons + " gallons.");

        scanner.close();
    }
    // This method converts Fahrenheit to Celsius.
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
// This method converts Celsius to Fahrenheit.
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
// This method converts pounds to kilograms.
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
// This method converts kilograms to pounds.
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
// This method converts gallons to liters.
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
// This method converts liters to gallons.
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
