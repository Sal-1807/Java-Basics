import java.util.Scanner;

public class lower {

    // Method to convert a string to uppercase using ASCII logic
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert to uppercase
            } else {
                result.append(ch); // Keep other characters as is
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, strings are not equal
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // If any character differs, strings are not equal
            }
        }
        return true; // Strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert to uppercase using built-in method
        String upperCaseBuiltIn = input.toUpperCase();

        // Convert to uppercase using custom method
        String upperCaseCustom = toUpperCaseCustom(input);

        // Compare the two strings
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        // Display the results
        System.out.println("Uppercase using built-in method: " + upperCaseBuiltIn);
        System.out.println("Uppercase using custom method: " + upperCaseCustom);
        System.out.println("Are both uppercase strings equal? " + areEqual);

        scanner.close();
    }
}
