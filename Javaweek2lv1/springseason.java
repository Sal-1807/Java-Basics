package Javaweek2lv1;

import java.util.Scanner;   

public class springseason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        if (day > 31 || day < 1 || month > 12 || month < 1) {
            System.out.println("Invalid day or month"); 
        } else if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }
}
