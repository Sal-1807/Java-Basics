package JavaProgrammingElementsLv3;


import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args) {
        // fahrenheit to celsius
        //Read the temperature in fahrenheit from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        //Convert the temperature from fahrenheit to celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        //Display the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        scanner.close();
    }
}
