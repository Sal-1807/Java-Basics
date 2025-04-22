package Javaweek3lv1;
import java.util.Scanner;
public class FactorofNumber {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a natural number: ");
    int number = scanner.nextInt();
    //Find the factors of the number and save in an array 
    int[] factors = new int[number / 2 + 1];
    int maxFactor = 10;
    int factorIndex = 0;
    for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            factors[factorIndex++] = i;
            if (factorIndex == maxFactor) {
                break;
            }
        }
    }
    //print the factors of the number
    System.out.print("Factors of " + number + ": ");
    for (int i = 0; i < factorIndex; i++) {
        System.out.print(factors[i] + " ");
    }
    System.out.println();
    scanner.close();
}
}
