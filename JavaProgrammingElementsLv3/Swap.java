package JavaProgrammingElementsLv3;


import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        //Enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Swapping the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;
        //Display the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        scanner.close();
    }
}
