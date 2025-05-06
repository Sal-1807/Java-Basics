package JavaStringsLv2;
import java.util.Scanner;
public class splitshortlong {
    // Method to split the text into words without using split()
    public static String[] splitWords(String text) {
        StringBuilder word = new StringBuilder();
        java.util.ArrayList<String> words = new java.util.ArrayList<>();
        for (int i = 0; i < text.toCharArray().length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }
        return words.toArray(new String[0]);
    }

    // Method to find the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = Integer.parseInt(wordsWithLengths[0][1]);

        for (String[] wordWithLength : wordsWithLengths) {
            int length = Integer.parseInt(wordWithLength[1]);
            if (length < shortestLength) {
                shortest = wordWithLength[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = wordWithLength[0];
                longestLength = length;
            }
        }
        return new String[]{shortest, longest};
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a text:");
            String text = scanner.nextLine();

            String[] words = splitWords(text);
            String[][] wordsWithLengths = getWordsWithLengths(words);
            String[] result = findShortestAndLongest(wordsWithLengths);

            System.out.println("Shortest word: " + result[0]);
            System.out.println("Longest word: " + result[1]);
        }
    }
}
