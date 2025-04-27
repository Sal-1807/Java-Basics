package JavaControlFlowLv2;

import java.util.Scanner;

public class multiplesofnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // to find the multiples backwards from 100 ( for forward we can use i=1;i<=100;i++ ) 
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i =100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
