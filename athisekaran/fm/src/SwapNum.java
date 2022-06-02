import java.util.Scanner;


public class SwapNum {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		System.out.println("Give two numbers");
		int a=userInput.nextInt();
		int b=userInput.nextInt();
		int c;
		System.out.println("Before Swap:" + a + b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swap:" + a + b);
		
		
		
		
		
		

	}

}
