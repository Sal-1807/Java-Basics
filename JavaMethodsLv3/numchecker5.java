
import java.util.Scanner;
public class numchecker5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = NumberChecker.findFactors(number);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Greatest Factor: " + NumberChecker.findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + NumberChecker.findSumOfFactors(factors));
        System.out.println("Product of Factors: " + NumberChecker.findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + NumberChecker.findProductOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + NumberChecker.isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + NumberChecker.isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + NumberChecker.isDeficientNumber(number));
        System.out.println("Is Strong Number: " + NumberChecker.isStrongNumber(number));
        scanner.close();
    }

    static class NumberChecker {
        public static int[] findFactors(int number) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) count++;
            }
            int[] factors = new int[count];
            int index = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) factors[index++] = i;
            }
            return factors;
        }

        public static int findGreatestFactor(int[] factors) {
            return factors[factors.length - 1];
        }

        public static int findSumOfFactors(int[] factors) {
            int sum = 0;
            for (int factor : factors) {
                sum += factor;
            }
            return sum;
        }

        public static int findProductOfFactors(int[] factors) {
            int product = 1;
            for (int factor : factors) {
                product *= factor;
            }
            return product;
        }

        public static double findProductOfCubeOfFactors(int[] factors) {
            double product = 1;
            for (int factor : factors) {
                product *= Math.pow(factor, 3);
            }
            return product;
        }

        public static boolean isPerfectNumber(int number) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) sum += i;
            }
            return sum == number;
        }

        public static boolean isAbundantNumber(int number) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) sum += i;
            }
            return sum > number;
        }

        public static boolean isDeficientNumber(int number) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) sum += i;
            }
            return sum < number;
        }

        public static boolean isStrongNumber(int number) {
            int sum = 0, temp = number;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            return sum == number;
        }

        private static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}
