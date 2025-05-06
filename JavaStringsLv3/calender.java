package JavaStringsLv3;
import java.util.Scanner;
public class calender {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            displayCalendar(month, year);
        }
    }

    public static void displayCalendar(int month, int year) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // Adjust for leap year
        }

        System.out.println("  " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        int days = daysInMonth[month - 1];
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }
}
