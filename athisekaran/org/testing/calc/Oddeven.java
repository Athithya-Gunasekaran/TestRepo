package org.testing.calc;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		int num;
		Scanner input =new Scanner(System.in);
		System.out.println("Please give the set of integers:");
		num = input. nextInt();
		for(int i=1; i<=1000; i++){
			if(i/2==0){
				System.out.println(" The given integers are even numbers");
			}
			else{
				System.out.println(" The given numbers are odd numbers");
			}
			
		}
		
		

	}

}
