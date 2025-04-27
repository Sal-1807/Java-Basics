package JavaControlFlowLv2;

import java.util.Scanner;

public class factorefor {
 public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
            greatestFactor = i;
            break;
            }
        }
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
		scanner.close();
}
}
