package Javaweek1lv3;


import java.util.Scanner;

public class TrianglePerimeterAthelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Enter the length of sides of a triangle
        System.out.print("Enter the length of side 1 in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 in meters: ");
        double side3 = scanner.nextDouble();
        //Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000; // 5 km in meters
        double rounds = distanceToRun / perimeter;
        //Display the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");
        scanner.close();
    }
}
