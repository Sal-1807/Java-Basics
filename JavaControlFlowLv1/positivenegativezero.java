package JavaControlFlowLv1;

import java.util.Scanner;

public class positivenegativezero {
    public static void main(String[] args){
        //Enter a number
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();     
        //Check if the number is positive,negative or zero 
        if(number>0)
        {
            System.out.println("The number "+number+" is positive");
        }
        else if(number<0)
        {
            System.out.println("The number "+number+" is negative");
        }
        else
        {
            System.out.println("The number "+number+" is zero");
        }
        scanner.close();
    }
}
