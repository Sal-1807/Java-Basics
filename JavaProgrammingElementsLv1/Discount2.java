package JavaProgrammingElementsLv1;


import java.util.Scanner;

public class Discount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Calculate the discount amount and final fee
        System.out.print("Enter the student fee: ");
        double fee = scanner.nextDouble();
        // Read the discount percentage
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();
         //Calculate
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        // Output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        scanner.close();
    }
}
