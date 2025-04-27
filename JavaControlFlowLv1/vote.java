package JavaControlFlowLv1;

import java.util.Scanner;   

public class vote {
    public static void main(String[] args){
        //To check wheter a person is eligible to vote or not
        Scanner scanner = new Scanner(System.in);
        //Enter your age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("The person is " + age + " years old and is eligible to vote.");
        } else {
            System.out.println("The person is " + age + " years old and is not eligible to vote.");
        }
        scanner.close();
    }
}
