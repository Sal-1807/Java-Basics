import java.util.Scanner;

public class charec {
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] userDefinedChars = getCharacters(input);
        char[] builtInChars = input.toCharArray();

        boolean areEqual = compareArrays(userDefinedChars, builtInChars);

        System.out.println("User-defined method result: " + new String(userDefinedChars));
        System.out.println("Built-in method result: " + new String(builtInChars));
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
