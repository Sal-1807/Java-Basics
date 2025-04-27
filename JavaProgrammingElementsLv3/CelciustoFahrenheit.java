package JavaProgrammingElementsLv3;


import java.util.Scanner;

public class CelciustoFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // celcius to fahrenheit
        //Read the temperature in celsius from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        //Convert the temperature from celsius to fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;
        //Display the result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        scanner.close();
    }
}
