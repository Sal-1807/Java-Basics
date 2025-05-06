package JavaStringsLv3;
import java.util.Scanner;
public class nonreapeatchar {
    public static char findFirstNonRepeatingChar(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters

        // Loop to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
