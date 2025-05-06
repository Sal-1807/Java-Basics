
package JavaStringsLv2;
import java.util.Scanner;

public class splitcomapre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Using custom split method
        String[] customSplitWords = customSplit(input);

        // Using built-in split method
        String[] builtInSplitWords = input.split(" ");

        // Comparing the two arrays
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Displaying the results
        System.out.println("Custom Split Words:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("Built-in Split Words:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("Are the two arrays equal? " + areEqual);

        scanner.close();
    }

    // Method to find the length of a string without using length()
    public static int findLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to split the text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 1;

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        // Extract words using charAt()
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = currentWord.toString();
                currentWord = new StringBuilder();
            } else {
                currentWord.append(c);
            }
        }
        words[wordIndex] = currentWord.toString();

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
}
