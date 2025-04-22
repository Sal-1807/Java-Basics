package Javaweek1lv2;
import java.util.Scanner;

public class YardsandMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the distance in feet from the user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        // Calculate the distance in yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        //Output the result in yards and miles
        System.out.printf("Distance in yards: %.2f yards%n", distanceInYards);
        System.out.printf("Distance in miles: %.2f miles%n", distanceInMiles);
        
        scanner.close();
    }
}