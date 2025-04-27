package JavaMethodsLv1;
import java.util.Scanner;
public class Handshakes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
    // Using if-else statement to check the number of students and calculate handshakes
        if (numberOfStudents < 2) {
            System.out.println("The number of students must be at least 2 to have handshakes.");
        } else {
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
            System.out.println("The maximum number of handshakes is: " + handshakes);
        }
        scanner.close();
    }
}
