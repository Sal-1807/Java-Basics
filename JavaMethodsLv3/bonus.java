// Removed package declaration
public class bonus {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        int[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }

    // Method to generate random salary and years of service for 10 employees
    public static int[][] generateEmployeeData() {
        int[][] data = new int[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // Random 5-digit salary
            data[i][1] = (int) (Math.random() * 10) + 1; // Random years of service (1-10)
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static int[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int[][] updatedData = new int[10][2];
        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            int bonus = (int) (salary * bonusPercentage);
            updatedData[i][0] = salary + bonus; // New salary
            updatedData[i][1] = bonus; // Bonus amount
        }
        return updatedData;
    }

    // Method to display the summary in a tabular format
    public static void displaySummary(int[][] employeeData, int[][] updatedData) {
        int totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Emp#", "Old Salary", "Years of Service", "New Salary", "Bonus");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            int newSalary = updatedData[i][0];
            int bonus = updatedData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15d %-15d %-15d %-15d%n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s %-15d %-15s %-15d %-15d%n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }
}
