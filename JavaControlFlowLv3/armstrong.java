package JavaControlFlowLv3;

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
    
        while (originalNumber != 0) { 
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (sum == number) {// if the sum of the cube of each digit is equal to the number itself, then the number is an Armstrong number.
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
