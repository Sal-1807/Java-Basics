package JavaControlFlowLv2;

import java.util.Scanner;

public class powerofnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();       
        System.out.print("Enter the power: ");
        int power = scanner.nextInt(); 
        int result = 1;
        // to find power of  NUMBER 
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
}
