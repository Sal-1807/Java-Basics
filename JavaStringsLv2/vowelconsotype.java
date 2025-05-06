package JavaStringsLv2;
import java.util.Scanner;
public class vowelconsotype {
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] data) {
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = findVowelsAndConsonants(input);
        displayResult(result);

        scanner.close();
    }
}
