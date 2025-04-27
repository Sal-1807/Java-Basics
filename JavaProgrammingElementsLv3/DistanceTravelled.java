package JavaProgrammingElementsLv3;


import java.util.Scanner;

public class DistanceTravelled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in hours: ");
        double timeFromToVia = scanner.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in hours: ");
        double timeViaToFinalCity = scanner.nextDouble();

        // Calculating total distance and time
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Printing the results
        System.out.println("Hello " + name + ", your travel details are as follows:");
        System.out.println("From " + fromCity + " to " + viaCity + " is " + fromToVia + " miles and takes " + timeFromToVia + " hours.");
        System.out.println("From " + viaCity + " to " + toCity + " is " + viaToFinalCity + " miles and takes " + timeViaToFinalCity + " hours.");
        System.out.println("Total distance from " + fromCity + " to " + toCity + " is " + totalDistance + " miles.");
        System.out.println("Total time taken from " + fromCity + " to " + toCity + " is " + totalTime + " hours.");

        scanner.close();
    }
}