package JavaProgrammingElementsLv1;


import java.util.Scanner;

public class ConvertMilestoKilometers {
    public static void main(String[] args) {
        // Convert kilometers to miles
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        //Read the input in double
        double km = input.nextDouble();
        //Convert kilometers to miles
        double miles = km / 1.6;
        //Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
