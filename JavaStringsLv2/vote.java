package JavaStringsLv2;
import java.util.Scanner;
public class vote {
    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Random 2-digit number
        }
        return ages;
    }

    // Method to validate ages and determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Age\tCan Vote");
        System.out.println("----------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int[] ages = generateAges(n);
        String[][] results = checkVotingEligibility(ages);

        System.out.println("\nVoting Eligibility Results:");
        displayResults(results);

        scanner.close();
    }
}
