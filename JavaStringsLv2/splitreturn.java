package JavaStringsLv2;
import java.util.Scanner;
public class splitreturn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String[] words = splitTextIntoWords(input);
        String[][] wordLengths = getWordLengths(words);

        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        scanner.close();
    }

    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        java.util.ArrayList<String> words = new java.util.ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }

        return words.toArray(new String[0]);
    }

    public static int findStringLength(String str) {
        return str.length();
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return result;
    }
}
