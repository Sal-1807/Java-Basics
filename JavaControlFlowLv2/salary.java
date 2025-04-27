package JavaControlFlowLv2;

import java.util.Scanner;   

public class salary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           // Enter your salary 
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
            // Enter your years of service 
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
         //Check whether the years of service is greater or lesser than 5 years 
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus is: " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        scanner.close();
    }
    
}
