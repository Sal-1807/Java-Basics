package JavaArrayLv1;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the elements : ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Reversed array: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
