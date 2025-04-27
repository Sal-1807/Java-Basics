package JavaControlFlowLv1;

import java.util.Scanner;   

public class sumofnnfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Using for loop
        int sumFor = 0;
        for (int j = 1; j <= n; j++) {
            sumFor += j;
        }

        // Using formula
        int sumFormula = n * (n + 1) / 2;

        // Compare results
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);

        System.out.println(sumFor == sumFormula ? "Both results are correct." : "There is a discrepancy in the results.");
        scanner.close();
    }
}
