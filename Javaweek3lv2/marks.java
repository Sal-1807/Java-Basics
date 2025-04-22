package Javaweek3lv2;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        // Create arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physicsMarks[i] = scanner.nextInt();
            while (physicsMarks[i] < 0) {
                System.out.print("Marks cannot be negative. Enter again: ");
                physicsMarks[i] = scanner.nextInt();
            }
            System.out.print("Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
            while (chemistryMarks[i] < 0) {
                System.out.print("Marks cannot be negative. Enter again: ");
                chemistryMarks[i] = scanner.nextInt();
            }
            System.out.print("Math: ");
            mathMarks[i] = scanner.nextInt();
            while (mathMarks[i] < 0) {
                System.out.print("Marks cannot be negative. Enter again: ");
                mathMarks[i] = scanner.nextInt();
            }
            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathMarks[i]) / 3.0;
            // Determine grade
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        // Display marks, percentages, and grades
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Math: " + mathMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
        scanner.close();
    }
}
