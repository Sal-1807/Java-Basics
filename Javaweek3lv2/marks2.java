package Javaweek3lv2;
import java.util.Scanner;
public class marks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = scanner.nextInt();
                while (mark < 0) {
                    System.out.println("Marks cannot be negative. Please enter again.");
                    System.out.print(subject + ": ");
                    mark = scanner.nextInt();
                }
                marks[i][j] = mark;
            }

            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

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

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }

        scanner.close();
    }
}
