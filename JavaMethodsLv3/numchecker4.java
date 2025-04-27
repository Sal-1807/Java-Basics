
import java.util.Scanner;
public class numchecker4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("Is Prime: " + NumberChecker.isPrime(number));
            System.out.println("Is Neon: " + NumberChecker.isNeon(number));
            System.out.println("Is Spy: " + NumberChecker.isSpy(number));
            System.out.println("Is Automorphic: " + NumberChecker.isAutomorphic(number));
            System.out.println("Is Buzz: " + NumberChecker.isBuzz(number));
        }
    }

    static class NumberChecker {
        public static boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        public static boolean isNeon(int num) {
            int square = num * num;
            int sum = 0;
            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }
            return sum == num;
        }

        public static boolean isSpy(int num) {
            int sum = 0, product = 1;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                product *= digit;
                num /= 10;
            }
            return sum == product;
        }

        public static boolean isAutomorphic(int num) {
            int square = num * num;
            return String.valueOf(square).endsWith(String.valueOf(num));
        }

        public static boolean isBuzz(int num) {
            return num % 7 == 0 || num % 10 == 7;
        }
    }
}
