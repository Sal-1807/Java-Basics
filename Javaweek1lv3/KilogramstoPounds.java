package Javaweek1lv3;


import java.util.Scanner;

public class KilogramstoPounds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Read the weight of the person in kilograms 
        System.out.print("Enter the weight of the person in kilograms: ");
        double weight = scanner.nextDouble();   
        //Convert the weight from kilograms to pounds
        double pounds = weight * 2.2;
        //Display the weight in pounds
        System.out.println("The weight of the person in pounds is: " + pounds + " pounds and in kilograms is: " + weight + " kilograms");
        scanner.close();
    }
}
