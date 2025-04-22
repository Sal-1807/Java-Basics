package Javaweek2lv3;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a year greater than 1582: ");
       int year = scanner.nextInt();
       // Check if the year is a leap year
       if (year >= 1582) {
          if (year % 400 == 0) {// Check if the year is divisible by 400
             System.out.println("The year " + year + " is a leap year");
          } else {
             if (year % 100 == 0) {// Check if the year is divisible by 100
                System.out.println("The year " + year + " is not a leap year");
             } else {
                if (year % 4 == 0) {// Check if the year is divisible by 4
                    System.out.println("The year " + year + " is a leap year");
                } else {
                    System.out.println("The year " + year + " is not a leap year");
                }
             }
          }
       } else {
          System.out.println("Please enter a year greater than 1582");
       }
       
       scanner.close();
    }
}
