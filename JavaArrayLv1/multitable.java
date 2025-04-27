package JavaArrayLv1;
import java.util.Scanner;
public class multitable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Enter the number you want to find the  multiplication table of :
        System.out.println("Enter the number you want to find the multiplication table of: ");
        int num = scanner.nextInt();
        //make an array form 1 to 10 
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = i + 1;
        }
        //now multiply the input number with the array elements
        for(int i = 0; i < 10; i++){
            System.out.println(num + " * " + arr[i] + " = " + (num * arr[i]));
        }
        scanner.close();

    }
}
