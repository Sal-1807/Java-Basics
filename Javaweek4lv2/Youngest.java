package Javaweek4lv2;
import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.println("Enter height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextInt();
        }

        // Find and display the youngest
        String youngest = findYoungest(names, ages);
        System.out.println("The youngest is: " + youngest);

        // Find and display the tallest
        String tallest = findTallest(names, heights);
        System.out.println("The tallest is: " + tallest);

        scanner.close();
    }

    // Method to find the youngest
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    // Method to find the tallest
    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }
}
