package org.testing;

public class Testclass2 {

	public static void main(String[] args) {

		int age = 20;
		double sight = 4.0;

		if (age >= 16)
			{
			System.out.println("The user is eligible  to vote");
			if (sight <= 2.5) 
			{
				System.out.println("The user is eligible to vote ");
			} 
			else {
				System.out.println("The user is not eligible to vote because of eyesight less than the expected value");
			}
		} else {
			System.out.println("The user is not eligible to vote because of age limit");
		}
	}

}
