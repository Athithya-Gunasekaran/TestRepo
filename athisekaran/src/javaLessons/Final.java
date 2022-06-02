package javaLessons;

public class Final {
	
	// FINAL:
	
		//Final class: When final is given to class, it cannot be inherited
		//Final method: Final methods cannot be overriden
		//Final Variable: Final variable values cannot be changed
	
	
	public final void arithmetic(){   //final method
		
		final int a=5;  //final variable
		// a=a+4;   //  which is not allowed to change the value
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
		Final fnl= new Final();
		fnl.arithmetic();
		

	}

}
