import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Using charAt() to create a substring
        String substringUsingCharAt = createSubstringUsingCharAt(input, start, end);

        // Using built-in substring() method
        String substringUsingBuiltIn = input.substring(start, end);

        // Comparing the two substrings
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Displaying the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in method: " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + areEqual);

        scanner.close();
    }

    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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
}
