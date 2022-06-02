import java.util.Scanner;


public class Scantimer {

	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Current Time:");
		int time = userInput.nextInt();
	if(time>=4 && time<=12)
	{
		System.out.println("Wishing you Good Morning");
	}
	else if(time>=13 && time<=18){
		
		System.out.println(" Wishing you Good evening");
	}
	else{
		System.out.println(" Wishing you Good Night");
		
	}
		

	}

}
