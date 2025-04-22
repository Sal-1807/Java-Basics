package Javaweek1lv3;


import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the salary 
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        //Enter the bonus
        System.out.print("Enter your bonus: ");
        double bonus = scanner.nextDouble();
        //Calculate the total income
        double totalIncome = salary + bonus;
        //Display the total income
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
        
        scanner.close();
    }
}
