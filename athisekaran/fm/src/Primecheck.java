import java.util.Scanner;

public class Primecheck {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println(" Give a number:");
		int n = userInput.nextInt();
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = true;
				System.out.println(" not prime");
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Its prime");
		}
		// if(n<0){
		// System.out.println("Enter positive number:");
		// }
		// else{
		// System.out.println("Lets check if the given number is prime or not");

		// }

	}

}
