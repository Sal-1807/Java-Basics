package JavaStringsLv3;
import java.util.Scanner;
public class charfreq {
    public static int[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // Array to store frequency of each ASCII character

        // Calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count distinct characters
        int distinctCount = 0;
        for (int count : freq) {
            if (count > 0) {
                distinctCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[distinctCount][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i; // ASCII value of character
                result[index][1] = freq[i]; // Frequency of character
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Call the method to find character frequencies
        int[][] frequencies = findCharFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (int[] pair : frequencies) {
            System.out.println((char) pair[0] + ": " + pair[1]);
        }

        scanner.close();
    }
}
