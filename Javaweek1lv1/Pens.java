package Javaweek1lv1;


public class Pens {
    public static void main(String[] args) {
        // Data
        int totalPens = 14;
        int students = 3;
        // Pens Per Student
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
