package JavaStringsLv3;
import java.util.Scanner;
public class uniquechar {
    // Method to find the length of the string without using the length() method
    public static int findLength(String text) {
        int length = 0;
        for (int i = 0; i < text.toCharArray().length; i++) {
            length++;
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char[] uniqueCharacters = findUniqueCharacters(input);
            System.out.print("Unique characters: ");
            for (char c : uniqueCharacters) {
                System.out.print(c + " ");
            }
        }
    }
}
