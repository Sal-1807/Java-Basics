package JavaControlFlowLv2;

import java.util.Scanner;

public class youngesttallest {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Amar's age:");
		int Amarage=scanner.nextInt();
		System.out.print("Enter Akbar's age:");
		int Akbarage=scanner.nextInt();
		System.out.print("Enter Anthony's age:");
		int Anthonyage=scanner.nextInt();
		System.out.print("Enter Amar's height:");
		int Amarheight=scanner.nextInt();
		System.out.print("Enter Akbar's height:");
		int Akbarheight=scanner.nextInt();
		System.out.print("Enter Anthony's height:");
		int Anthonyheight=scanner.nextInt();
		
		//to check the youngest 
		 if (Amarage<Akbarage && Amarage<Anthonyage){
			 System.out.print("The youngest is Amar\n");
		 }else if (Akbarage<Amarage && Akbarage<Anthonyage){
			 System.out.print("The youngest is Akbar\n");
		 } else {
			 System.out.print("The youngest is Anthony\n");
		 }
		
		//to check the tallest 
		 if (Amarheight>Akbarheight && Amarheight>Anthonyheight){
			 System.out.print("The tallest is Amar\n");
		 }else{
			 if (Akbarheight>Amarheight && Akbarheight>Anthonyheight){
				 System.out.print("The tallest is Akbar\n");
		 }else if (Akbarheight>Amarheight && Akbarheight>Anthonyheight){
			 System.out.print("The tallest is Akbar\n");
		 } else {
			 System.out.print("The tallest is Anthony\n");
		 }	
               }	   
			   scanner.close();
    }
}
		
		
		
		