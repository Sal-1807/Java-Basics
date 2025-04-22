package Javaweek1lv3;


import java.util.Scanner;

public class DividingChocolate {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //Enter the no. of childern 
        System.out.print("Enter the no. of children: ");
        int noOfChildren = scanner.nextInt();
        //Enter the no. of chocolates
        System.out.print("Enter the no. of chocolates: ");
        int noOfChocolates = scanner.nextInt();
        //Calculate the chocolates each child will get
        int chocolatesEachChild = noOfChocolates / noOfChildren;
        //Claculate the chocolates left
        int chocolatesLeft = noOfChocolates % noOfChildren;
        //Display the chocolates each child will get and chocolates left
        System.out.println("Each child will get " + chocolatesEachChild + " chocolates and " + chocolatesLeft + " chocolates will be left");
        scanner.close();
    }
}