package javaLessons;

public class StaticMethod{
	
	
	// STATIC:
	
		//Static class:NOt defined as static but nested class can be defined as Static
		// Static method: These methods can be called in the same class without object; In diff class it can be called through "extends"keyword or using the "classname.methodname" way without inheritance 
		//Static variable: These variables makes no difference in the same class;In diff class it can be called through "extends"keyword or using the "classname.variablename" way without inheritance 
		
	
	

	public static void main(String[] args) {
		
		//login(); // Static method called from different class throu inheritance("extends" AccessModifier)
		
		AccessModifier.login(); // Static method called from differrent class without inheritance using"classname.methodname"

	}

}
