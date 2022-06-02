package javaPrgrms;

public class ArrayPrgrm {
	
	

	public static void main(String[] args) {
		
		 int sum=0;
		 int i;
		
		
		//int a[] =new int[5]; // Another Syntax to declare Array
		
		int[] array= {12, 30, 15, 14, 19};
		
		
		
		
		for( i=0; i<array.length; i++)
			
		{
			
		if(array[i]%2==0) {
			
			System.out.println( array[i]+ " is Even");
		}
		
		else {
			
			System.out.println(array[i]+" is odd");
		}
		
	}
		for(i=0; i<array.length; i++) {
		
		sum= sum+array[i];
		
		
		}
		System.out.println("Added value is:" + sum);
		
		

	}

}
