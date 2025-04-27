package JavaControlFlowLv1;
import java.util.Scanner ;
public class forcountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter the countdown start value
        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();    
        //Countdown
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("LAUNCH!");
        scanner.close();
    }
}
