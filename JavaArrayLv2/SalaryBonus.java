package JavaArrayLv2;
import java.util.Scanner;
public class SalaryBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEE_COUNT = 3;
        double[] salaries = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonuses = new double[EMPLOYEE_COUNT];
        double[] newSalaries = new double[EMPLOYEE_COUNT];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
     // Loop to get salary and years of service for each employee
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();

            if (salary <= 0 || years < 0) {
            System.out.println("Invalid input. Please enter again.");
            i--; // Decrement index to re-enter data for the same employee
            continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = years;
        }
     // Loop to calculate bonus, new salary, and total bonus payout
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            double bonusPercentage = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];
     // Calculate total bonus payout, total old salary, and total new salary
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
        scanner.close();
    }
}
