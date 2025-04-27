package JavaProgrammingElementsLv2;
import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the unit price and quantity from the user
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();
        
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();
        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;
        // Output the result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);
        scanner.close();
    }
}