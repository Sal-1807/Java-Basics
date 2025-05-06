import java.util.Scanner;

public class illegealarg {

    public static void generateException(String input) {
        // This will generate IllegalArgumentException
            System.out.println(input.substring(5, 2));
        }

    public static void handleException(String input) {
        try {
            // Attempt to generate the exception
            System.out.println(input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the exception
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

            handleException(userInput);
            scanner.close();
    }
}
    

