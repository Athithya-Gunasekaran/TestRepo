package org.testing.calc;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num;
		System.out.println(" Please enter any number:");
		num = input. nextInt();
		System.out.println("Multiplication Table of:" + num);
		for(int i=1; i<=12; i++)
		
		{
			System.out.println(num + "x" + i + " = " + (num*i) );
		}                      
		
		
		

	}

}
