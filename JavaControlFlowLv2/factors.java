package JavaControlFlowLv2;

import java.util.Scanner;

public class factors {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
		
		//to find the factors 
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				System.out.print(i + " ");
		}
		scanner.close();
	}
}
			
