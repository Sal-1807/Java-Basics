
package JavaControlFlowLv3;
import java.util.Scanner;

public class numofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        // The while loop will continue until the number becomes 0.
        // For each iteration, the number is divided by 10 and its value is incremented by 1.
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
