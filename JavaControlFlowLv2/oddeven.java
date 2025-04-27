package JavaControlFlowLv2;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
             // Enter a natural number 
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
			// Check wheter the no. is odd or even 
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
        scanner.close();
    }
}
