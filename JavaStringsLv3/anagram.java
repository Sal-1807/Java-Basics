package JavaStringsLv3;
import java.util.Scanner;
public class anagram {
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] charFrequency = new int[26]; // Assuming only lowercase English letters

        for (int i = 0; i < text1.length(); i++) {
            charFrequency[text1.charAt(i) - 'a']++;
            charFrequency[text2.charAt(i) - 'a']--;
        }

        for (int freq : charFrequency) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String text1 = scanner.nextLine().toLowerCase();

        System.out.println("Enter the second text:");
        String text2 = scanner.nextLine().toLowerCase();

        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
