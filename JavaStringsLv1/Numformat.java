import java.util.Scanner;

public class Numformat {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if the text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to parse as a number: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        System.out.println("Calling generateException()...");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        System.out.println("Calling handleException()...");
        handleException(userInput);

        scanner.close();
    }
}
