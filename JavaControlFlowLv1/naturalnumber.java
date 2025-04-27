package JavaControlFlowLv1;

import java.util.Scanner;

public class naturalnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
       //Check if the number is a natural number
        if (number >= 0) {
            System.out.println("The number " + number + " is a natural number");
            //Calculate the sum of the natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        scanner.close();
    }
}
