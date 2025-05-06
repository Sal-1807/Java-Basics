package JavaStringsLv3;
import java.util.Scanner;
public class charfreqloop {
    public static String[] findCharFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        String[] result;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as '0'
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }

        result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " - " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] frequencies = findCharFrequency(input);
        System.out.println("Character Frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }

        scanner.close();
    }
}
