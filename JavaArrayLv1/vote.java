package JavaArrayLv1;
import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
    //Enter the age of 10 students using array:
    int[] age = new int[10];
    for(int i = 0; i < 10; i++){
        System.out.println("Enter the age of student " + (i+1) + ": ");
        age[i] = scanner.nextInt();
    }
    //To check which student is eligible for voting:
    for(int i = 0; i < 10; i++){
        if(age[i] >= 18){
            System.out.println("Student " + (i+1) + " is eligible for voting.");
        }
        else{
            System.out.println("Student " + (i+1) + " is not eligible for voting.");
        }
    }
        scanner.close();
        }
    }