package JavaControlFlowLv3;

public class days {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide the month, day, and year as command-line arguments.");
            return;
        }
      //taking the input from the user
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
     //calculating the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println(d0);
    }
}
