package JavaControlFlowLv1;

import java.util.Scanner;

public class sumofnnwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
       // Check if the number is natural
        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Compute sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;
            // Compare and print results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula); 
            if (sumWhile == sumFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }

        scanner.close();
    }
}
