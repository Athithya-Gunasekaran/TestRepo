import java.util.Scanner;


public class Leapyear {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("Print the year y:");
		int year= userInput.nextInt();
		if(year%4==0)
		{
			System.out.println("It is the Leap year");	
		}
		else{
			System.out.println("It is not the Leap year");	
			
		}

	}

}
