import java.util.Scanner;

public class arrayoutofbounds {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        // Accessing an index larger than the array length
        System.out.println(names[names.length]); // This will throw the exception
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            System.out.println("Handling ArrayIndexOutOfBoundsException...");
            // Accessing an index larger than the array length
            System.out.println(names[names.length]); // This will throw the exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the array of names
        System.out.println("Enter the number of names:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        // Calling the methods
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        handleException(names);

        scanner.close();
    }
}
