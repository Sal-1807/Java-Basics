package Javaweek2lv1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        //Initialize the factorial and i 
        int factorial = 1;
        int i = number;
        //Calculate the factorial
        while (i > 0) {
            factorial *= i;
            i--;
        }
        //Result of the factorial
        System.out.println("The factorial of " + number + " is " + factorial);
        scanner.close();
    }
}
