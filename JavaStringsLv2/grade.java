package JavaStringsLv2;
import java.util.Random;
public class grade {
    public static void main(String[] args) {
        int[][] scores = generateRandomScores(5); // Generate scores for 5 students
        double[][] results = calculateResults(scores);
        char[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics
            scores[i][1] = 50 + random.nextInt(51); // Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Maths
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Total, Average, Percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static char[] calculateGrades(double[][] results) {
        char[] grades = new char[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i] = 'A';
            } else if (percentage >= 80) {
                grades[i] = 'B';
            } else if (percentage >= 70) {
                grades[i] = 'C';
            } else if (percentage >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10c%n", 
                i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
}
