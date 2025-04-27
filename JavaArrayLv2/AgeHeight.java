package JavaArrayLv2;
import java.util.Scanner;
public class AgeHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};
        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
            youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
            tallestIndex = i;
            }
        }
        // Display results
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");
        scanner.close();
    }
}
