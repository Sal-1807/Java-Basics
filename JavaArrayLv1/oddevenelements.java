package JavaArrayLv1;
import java.util.Scanner;
public class oddevenelements {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Enter 5 elements in an array 
    int[] arr = new int[5];
    for(int i = 0; i < 5; i++){
        System.out.println("Enter the element " + (i+1) + ": ");
        arr[i] = scanner.nextInt();
    }
  //To check which element is even and which is odd:
    for(int i = 0; i < 5; i++){
        if(arr[i] % 2 == 0){
            System.out.println("Element " + arr[i] + " is even.");
        }
        else{
            System.out.println("Element " + arr[i] + " is odd.");
        }
    }
    //to check if the number is positve , negative or zero 
    for(int i = 0; i < 5; i++){
        if(arr[i] > 0){
            System.out.println("Element " + arr[i] + " is positive.");
        }
        else if(arr[i] < 0){
            System.out.println("Element " + arr[i] + " is negative.");
        }
        else{
            System.out.println("Element " + arr[i] + " is zero.");
        }
    }
    //to check the last and first element if they arre equal,greater or smaller
    if(arr[0] == arr[4]){
        System.out.println("First and last element are equal.");
    }
    else if(arr[0] > arr[4]){
        System.out.println("First element is greater than last element.");
    }
    else{
        System.out.println("First element is smaller than last element.");
    }
    scanner.close();

 }    
}
