package JavaControlFlowLv3;

import java.util.Scanner;

public class leapyear2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // Check if the year is a leap year by using the OR operator and AND operator
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
        
        scanner.close();
    }
    
}
