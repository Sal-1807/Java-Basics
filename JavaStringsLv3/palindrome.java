package JavaStringsLv3;
import java.util.Scanner;
public class palindrome {
    // Method 1: Using start and end indexes
    public static boolean isPalindromeUsingIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Using recursion
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Method 3: Using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a text to check if it is a palindrome: ");
            String text = scanner.nextLine();
            text = text.replaceAll("\\s+", "").toLowerCase(); // Normalize input

            System.out.println("Using Indexes: " + isPalindromeUsingIndexes(text));
            System.out.println("Using Recursion: " + isPalindromeUsingRecursion(text, 0, text.length() - 1));
            System.out.println("Using Character Array: " + isPalindromeUsingCharArray(text));
        }
    }
}
