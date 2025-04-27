package JavaProgrammingElementsLv3;


import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Read Principal amount , Rate of interest and Time period from the user
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the Rate of interest: ");
        double rate = scanner.nextDouble(); 
        System.out.print("Enter the Time period: ");
        double time = scanner.nextDouble();
        //Calculate the Simple Interest
        double simpleInterest = (principal*rate*time)/100;
        //Disply the Simple Interest
        System.out.println("The Simple Interest is " + simpleInterest + "for the Principal amount " + principal + " at the rate of interest " + rate + " for the time period of " + time);
        scanner.close();    
    }
}
