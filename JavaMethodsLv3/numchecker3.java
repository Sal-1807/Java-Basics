
import java.util.Scanner;
public class numchecker3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("Count of digits: " + NumberChecker.countDigits(number));
            int[] digits = NumberChecker.storeDigits(number);
            System.out.println("Digits array: " + java.util.Arrays.toString(digits));
            int[] reversedDigits = NumberChecker.reverseDigits(digits);
            System.out.println("Reversed digits array: " + java.util.Arrays.toString(reversedDigits));
            System.out.println("Is palindrome: " + NumberChecker.isPalindrome(number));
            System.out.println("Is duck number: " + NumberChecker.isDuckNumber(digits));
        }
    }

    static class NumberChecker {
        public static int countDigits(int number) {
            return String.valueOf(Math.abs(number)).length();
        }

        public static int[] storeDigits(int number) {
            String numStr = String.valueOf(Math.abs(number));
            int[] digits = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                digits[i] = Character.getNumericValue(numStr.charAt(i));
            }
            return digits;
        }

        public static int[] reverseDigits(int[] digits) {
            int[] reversed = new int[digits.length];
            for (int i = 0; i < digits.length; i++) {
                reversed[i] = digits[digits.length - 1 - i];
            }
            return reversed;
        }

        public static boolean isPalindrome(int number) {
            int[] digits = storeDigits(number);
            int[] reversed = reverseDigits(digits);
            return java.util.Arrays.equals(digits, reversed);
        }

        public static boolean isDuckNumber(int[] digits) {
            for (int i = 1; i < digits.length; i++) { // Start from index 1 to ignore leading zero
                if (digits[i] == 0) {
                    return true;
                }
            }
            return false;
        }
    }
}
