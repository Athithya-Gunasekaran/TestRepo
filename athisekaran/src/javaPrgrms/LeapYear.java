package javaPrgrms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		// To find a given number is leap year or not
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter the Year:");
		
		int year;
		year= sc.nextInt();
		if(year%4==0) {
			
			System.out.println("The year is leap year");
		}

		else {
			System.out.println("The year is not a leap year");
		}
	}

}
