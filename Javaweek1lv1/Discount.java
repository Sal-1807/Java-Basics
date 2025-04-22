package Javaweek1lv1;


public class Discount {
    public static void main(String[] args) {
        // Data
        int fee = 125000;
        int discountPercent = 10;
        // Discount
        int discount = (fee * discountPercent) / 100;
        int discountedFee = fee - discount;
        // Output
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}
