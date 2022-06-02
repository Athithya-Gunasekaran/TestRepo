
package javaPrgrms;
import java.util.Scanner;


public class Biggestnum {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Print three nimbers:a,b,c");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a>b && a>c)
			{
			System.out.println("1st is largest");	
			
		}
		if(b>a && b>c){
			System.out.println("2nd is largest");	
			
		}
		if(c>a && c>b){
			System.out.println("3rd is largest");	
		}
		
		

	}

}
