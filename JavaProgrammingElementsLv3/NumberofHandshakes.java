package JavaProgrammingElementsLv3;


import java.util.Scanner;

public class NumberofHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        //Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        //Display the maximum number of handshakes
        System.out.println("The maximum number of handshakes is: " + handshakes);
        scanner.close();
    }
}
