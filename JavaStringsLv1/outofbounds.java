import java.util.Scanner;

public class outofbounds {
    public static void generateException(String input) {
        // This method will generate the StringIndexOutOfBoundsException
        System.out.println("Attempting to access character at an invalid index...");
        System.out.println(input.charAt(input.length())); // Accessing index beyond the length
    }

    public static void handleException(String input) {
        // This method will handle the exception using try-catch
        try {
            System.out.println("Attempting to access character at an invalid index...");
            System.out.println(input.charAt(input.length())); // Accessing index beyond the length
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        generateException(userInput);

        // Call the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
