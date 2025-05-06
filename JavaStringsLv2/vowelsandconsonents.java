package JavaStringsLv2;
import java.util.Scanner;
public class vowelsandconsonents {
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase
        if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);

        scanner.close();
    }
}
