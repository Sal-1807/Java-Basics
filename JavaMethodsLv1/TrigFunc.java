package JavaMethodsLv1;
import java.util.Scanner;   
public class TrigFunc {
    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an angle in degrees: ");
            double angle = scanner.nextDouble();

            TrigFunc trigFunc = new TrigFunc();
            double[] results = trigFunc.calculateTrigonometricFunctions(angle);

            System.out.println("Sine: " + results[0]);
            System.out.println("Cosine: " + results[1]);
            System.out.println("Tangent: " + results[2]);
        }
    }
}
