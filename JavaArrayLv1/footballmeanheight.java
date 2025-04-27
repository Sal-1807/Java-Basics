package JavaArrayLv1;
import java.util.Scanner;
public class footballmeanheight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
         //Enter the heights of 11 players
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
    //calculate the mean height of the football team
        double mean = sum / heights.length;
        System.out.println("The mean height of the football team is: " + mean);
        scanner.close();
    }
}
