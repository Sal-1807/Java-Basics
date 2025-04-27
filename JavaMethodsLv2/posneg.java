package JavaMethodsLv2;
import java.util.Scanner;
public class posneg {
    //Method to check if a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }
    //Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
//Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive and ");
                if (isEven(number)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
