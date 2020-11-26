package Java;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		int num;
        System.out.println("Enter the integer: ");

		
        Scanner s = new Scanner(System.in); 
        num = s.nextInt(); 

				
		if(num%2==0) {
			
			System.out.println("print even");
		}
		else {
			System.out.println("print odd");
		}
}

	}
