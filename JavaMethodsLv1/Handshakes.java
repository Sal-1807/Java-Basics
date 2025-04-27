package JavaMethodsLv1;
import  java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int maxHandshakes = calculateHandshakes(n);
        System.out.println("The maximum number of handshakes is: " + maxHandshakes);
        scanner.close();
    }
// Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
