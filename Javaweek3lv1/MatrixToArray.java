package Javaweek3lv1;
import java.util.Scanner;
public class MatrixToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array (Matrix)
        int[][] matrix = new int[rows][columns];

        // Take user input for the 2D array elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to copy the elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Print the 1D array
        System.out.println("The 1D array is:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
