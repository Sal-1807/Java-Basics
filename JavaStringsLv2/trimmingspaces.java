package JavaStringsLv2;
import java.util.Scanner;
public class trimmingspaces {
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

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
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();

        // Trim spaces using custom method
        int[] indices = findTrimIndices(input);
        String trimmedCustom = createSubstring(input, indices[0], indices[1]);

        // Trim spaces using built-in method
        String trimmedBuiltIn = input.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Custom trimmed string: \"" + trimmedCustom + "\"");
        System.out.println("Built-in trimmed string: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
