package Javaweek2lv3;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of operations: ");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = scanner.next();
            //using switch case to perform the operation
            switch (op) {
                case "+":
                    System.out.println("Result: " + (first + second));
                    break;
                case "-":
                    System.out.println("Result: " + (first - second));
                    break;
                case "*":
                    System.out.println("Result: " + (first * second));
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }

        scanner.close();
    }
}