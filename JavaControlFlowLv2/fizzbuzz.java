package JavaControlFlowLv2;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
          //check wheter the number is a positive integer 
        if (number >= 0) {                               
            for (int i = 1; i <= number; i++) {           
                if (i % 3 == 0 && i % 5 == 0) {     //Checking whether the number is divisible by both 3 and 5 
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {            //checking whether the number is divsible by 3 
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {            //checking whether the number is divisible by 5 
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}
