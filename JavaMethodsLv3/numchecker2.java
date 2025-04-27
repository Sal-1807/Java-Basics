
import java.util.Scanner;
public class numchecker2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("Count of digits: " + NumberChecker.countDigits(number));
            int[] digits = NumberChecker.getDigitsArray(number);
            System.out.println("Sum of digits: " + NumberChecker.sumOfDigits(digits));
            System.out.println("Sum of squares of digits: " + NumberChecker.sumOfSquaresOfDigits(digits));
            System.out.println("Is Harshad number: " + NumberChecker.isHarshadNumber(number, digits));
            int[][] frequency = NumberChecker.digitFrequency(digits);
            System.out.println("Digit frequencies:");
            for (int[] row : frequency) {
                System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
            }
        }
    }

    static class NumberChecker {
        public static int countDigits(int number) {
            return String.valueOf(Math.abs(number)).length();
        }

        public static int[] getDigitsArray(int number) {
            String numStr = String.valueOf(Math.abs(number));
            int[] digits = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                digits[i] = Character.getNumericValue(numStr.charAt(i));
            }
            return digits;
        }

        public static int sumOfDigits(int[] digits) {
            int sum = 0;
            for (int digit : digits) {
                sum += digit;
            }
            return sum;
        }

        public static int sumOfSquaresOfDigits(int[] digits) {
            int sum = 0;
            for (int digit : digits) {
                sum += Math.pow(digit, 2);
            }
            return sum;
        }

        public static boolean isHarshadNumber(int number, int[] digits) {
            int sum = sumOfDigits(digits);
            return number % sum == 0;
        }

        public static int[][] digitFrequency(int[] digits) {
            int[][] frequency = new int[10][2];
            for (int i = 0; i < 10; i++) {
                frequency[i][0] = i;
            }
            for (int digit : digits) {
                frequency[digit][1]++;
            }
            return frequency;
        }
    }
}
