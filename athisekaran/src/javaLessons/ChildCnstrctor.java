package javaLessons;

public class ChildCnstrctor extends ParentConstrctor {
	
	//Constructor: It is similar to the method and it is invoked when an object of the class is created
	// Two types: Default and Parametrized Constructor
	// Super(); keyword is used to invoke parent level constructor ie.,in parametrized constructor while inheriting
	// if no Super(); keyword is used after inheriting the parent default constructor is printed followed by the child class default constructor
	//this(); keyword is used to invoke class level constructor
	

	public ChildCnstrctor()            // Default constructor
	{  
		
		this(20);
		
		System.out.println("Child default constructor");
	}
	
	
	
	public ChildCnstrctor(int users)   // Parametrized constructor //If a constructor calls itself, then the error message “recursive constructor invocation” occurs. The following program is not allowed by the compiler because inside the constructor we tried to call the same constructor. The compiler detects it instantly and throws an error.
	{
		//this("Domain Name");        // both this(); and Super(); cannot be given---------check!!!
		super();
		
		System.out.println(users);
	}
	
	
	
	public ChildCnstrctor(String credentials) //Parametrized constructor
	{
		
		 System.out.println(credentials);
	}
	
	
	
	public static void main(String[] args) {
		
		 ChildCnstrctor cc= new  ChildCnstrctor();
		

	}

}
