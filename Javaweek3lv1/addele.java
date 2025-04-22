package Javaweek3lv1;
import java.util.Scanner;
public class addele {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        //Enter the numbers in an array
        while (true) {
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();
             //if the input is less than or equal to 0 or the index is equal to 10 then break
            if (input <= 0 || index == 10) {
                break;
            }
            numbers[index] = input;
            index++;
        }
         //add the numbers in the array
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        //print the total
        System.out.println("\nTotal: " + total);
        scanner.close();
    }
}
