import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Comparing strings using charAt() method
        boolean charAtComparisonResult = compareUsingCharAt(str1, str2);

        // Comparing strings using built-in equals() method
        boolean equalsMethodResult = str1.equals(str2);

        // Displaying the results
        System.out.println("Comparison using charAt() method: " + charAtComparisonResult);
        System.out.println("Comparison using equals() method: " + equalsMethodResult);

        // Checking if both methods give the same result
        if (charAtComparisonResult == equalsMethodResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }

        scanner.close();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareUsingCharAt(String str1, String str2) {
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