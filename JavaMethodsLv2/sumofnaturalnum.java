package JavaMethodsLv2;
import java.util.Scanner;
public class sumofnaturalnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The input is not a natural number. Exiting...");
            scanner.close();
            return;
        }
        int recursiveSum = findSumRecursive(n);
        int formulaSum = findSumFormula(n);
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        if (recursiveSum == formulaSum) {
            System.out.println("Both results match. The computation is correct.");
        } else {
            System.out.println("The results do not match. There is an error in the computation.");
        }
        scanner.close();
    }
// This method calculates the sum of the first n natural numbers using recursion.
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursive(n - 1);
    }
// This method calculates the sum of the first n natural numbers using the formula n(n+1)/2.
    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
