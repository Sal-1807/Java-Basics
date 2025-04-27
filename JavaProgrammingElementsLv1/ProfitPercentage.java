package JavaProgrammingElementsLv1;


public class ProfitPercentage {
    public static void main(String[] args) {
        // Profit Percentage
        int costPrice = 129;
        int sellingPrice = 191;
        // Profit
        int profit = sellingPrice - costPrice;
        double profitPercentage = (double) profit / costPrice * 100;
       // Output
        System.out.printf("The Cost Price is INR %d and Selling Price is INR %d%nThe Profit is INR %d and the Profit Percentage is %.2f%%", costPrice, sellingPrice, profit, profitPercentage);
    }
}
