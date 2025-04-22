package Javaweek4lv2;
import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factorsArray = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factorsArray) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int sum = findSum(factorsArray);
        System.out.println("Sum of factors: " + sum);

        int product = findProduct(factorsArray);
        System.out.println("Product of factors: " + product);

        int sumOfSquares = findSumOfSquares(factorsArray);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        scanner.close();
    }
// This method finds all factors of a given number and returns them as an array.
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
// This method calculates the sum of the factors.
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
// This method calculates the product of the factors.
    public static int findProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
// This method calculates the sum of squares of the factors.
    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}
