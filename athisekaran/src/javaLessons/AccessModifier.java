package javaLessons;

public class AccessModifier {
	
	
	//**** Three  types of Access modifiers: Abstract, Static and Final ****
	
	// ABSTRACT:
	//Abstract class: In Abstract class-we cannot create object
	// Abstract method : In Abstract method - we cannot define body
	//Abstract variable: Abstract variable are not able to create
	// Refer- "Abstraction"class present in the oopsConcept package
	
	// STATIC:
	
	//Static class:NOt defined as static but nested class can be defined as Static
	// Static method: These methods can be called in the same class without object; In diff class it can be called through "extends"keyword or using the "classname.methodname" way without inheritance 
	//Static variable: These variables makes no difference in the same class;In diff class it can be called through "extends"keyword or using the "classname.variablename" way without inheritance 
	
	// FINAL:
	
	//Final class: When final is given to class, it cannot be inherited
	//Final method: Final methods cannot be overriden
	//Final Variable: Final variable values cannot be changed
	
	
	static int a=4;   //Static variable
	
	
	public static void login() {                         // Static method
		
		System.out.println("Print User Login Credentials");
		
	}
	
	
	public static void main (String[] args) {
		
		login();                    // Static method called without creating object
		
		
		
		
	}

}
