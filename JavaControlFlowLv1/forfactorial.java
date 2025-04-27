package JavaControlFlowLv1;

import java.util.Scanner;   

public class forfactorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); 
        //initialize the factorial
        int factorial = 1;
        //loop to calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}