package javaLessons;

public class VariableTypes {
	
	// **** Three Variable types- Local, Instance/Global, Static
	
	// Local Variable: Created within the method and used within it; stored in "Stack" memory; cannot use access modifier to it; it should have values
    
	// Instance/ Global: Outside method within class; Stored in "Heap" Memory; default values are present
	
	// Static variables: Same as Static variables; Stored in "RAM"; Outside the method
	
	
	int a=5;  // global variable
	int b;    // default values are present
	static int c=5; //access modifier can be given to global variable and act as Static variable type
	
	public void calculator() {
		
		int a=10; //local variable
		int abc;    // values should be present -------Check!!!!
	}
	

	public static void main(String[] args) {
		

	}

}
