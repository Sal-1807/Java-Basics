package JavaControlFlowLv1;

import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double number;

        do {
            System.out.println("Enter a number (0 to quit): ");
            number = scanner.nextDouble();
            total += number;
        } while (number != 0);
    
        total -= number; 
        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}
