import java.util.Scanner;

public class upper {

    // Method to convert a string to uppercase using ASCII values
    public static String toUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Converting to uppercase using built-in method
        String builtInUpperCase = input.toUpperCase();

        // Converting to uppercase using custom method
        String customUpperCase = toUpperCase(input);

        // Comparing the two strings
        boolean areEqual = compareStrings(builtInUpperCase, customUpperCase);

        // Displaying the results
        System.out.println("Built-in Uppercase: " + builtInUpperCase);
        System.out.println("Custom Uppercase: " + customUpperCase);
        System.out.println("Are both uppercase strings equal? " + areEqual);

        scanner.close();
    }
}
