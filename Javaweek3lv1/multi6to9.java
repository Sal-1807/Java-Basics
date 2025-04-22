package Javaweek3lv1;
import java.util.Scanner;
public class multi6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];
        // Loop through 6 to 9 and multiply the number by the loop index
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
       // Print the multiplication results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        scanner.close();
    }
}
