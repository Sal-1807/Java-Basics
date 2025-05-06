package JavaStringsLv3;
import java.util.Scanner;
public class uniquecharfreq {
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString().toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] characterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of ASCII characters
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String[][] frequencies = characterFrequency(input);

        System.out.println("Character Frequencies:");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + ": " + pair[1]);
        }

        scanner.close();
    }
}
