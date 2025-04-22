package Javaweek2lv1;

import java.util.Scanner;

public class Divby5 {
    public static void main(String[] args){
        //Enter a number 
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
      int  n=number%5;
      //Check if the number is divisible by 5
      System.out.println("Is the number "+number+" divisible by 5? ");
      if (n==0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
        scanner.close();

      } 
    }

