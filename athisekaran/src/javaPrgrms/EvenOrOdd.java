package javaPrgrms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		// To find a given number is even or odd
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter a number:");
		
		int i;
		i= sc.nextInt();
		if(i%2==0) {
			System.out.println("The entered number is Even");
		}
		else {
			System.out.println("The Entered number is odd");
		}
		
		
		

	}

}
