package org.testing.calc;

import java.util.Scanner;

import org.testing.Calc;

public class Main {

	public static void main(String[] args) {
		int type;
		String operation;
		Scanner userInput= new Scanner(System.in) ;
		System.out.println("1. Calculator");
		System.out.println("2. Scientific Calculator");
		System.out.println("Please choose either 1 or 2:");

		int option = userInput.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("You have chosedn simple calculator.");
			System.out.println("Please enter a:");
			int a = userInput.nextInt();
			System.out.println("Please enter b:");
			int b = userInput.nextInt();
			System.out.println("Enter the operation type:");
			String c = userInput.next();
			Calc calc=new Calc();
			if(c.equalsIgnoreCase("add"))
			{
				calc.dosum(a,b);
			}
			else if(c.equals("Subtract")){
				calc.dosubtract(a,b);
			}
			else if(c.equals("Multiply")){
				calc.domultiply(a,b);
			}
				
			else if(c.equals("Divide")){
				calc.dodivision(a,b);
			}
				
             break;
		case 2:
			 
			System.out.println("You have chosedn scientific calculator.");
			System.out.println("Please enter a:");
			 a = userInput.nextInt();
			 System.out.println("Please enter b:");
			 b = userInput.nextInt();
			
			System.out.println("Enter the operation type:");
			Scicalc scicalc=new Scicalc();
			c = userInput.next();
			if(c.equalsIgnoreCase("Log"))
			{
				scicalc.dolog(a,b);
			}
			else if(c.equals("Expo")){
				scicalc.doexpo(a,b);
			}
			else if(c.equals("Trignometry")){
				scicalc.dotrig(a,b);
			}
				
			else if(c.equals("Pi calculation")){
				scicalc.dopi(a,b);
			}
		 break;
			
		default:
			System.out.println("Invalid entry");
			break;
			
		}
	}

}
