package javaLessons;

public class ParentConstrctor {
	
	
	public  ParentConstrctor()   // Default constructor
	
	{
		this(4);
		System.out.println("Parent Constructor");
		
	}
	
	
	public  ParentConstrctor(int hours) 
	{
		this(7,8);
		System.out.println(hours);
	}
	
	
	
	public  ParentConstrctor(int hours, int min) 
	{
	
		System.out.println(hours + min);
	}
	

	public static void main(String[] args) 
	{
	
		ParentConstrctor pc= new ParentConstrctor();
		
	}

}
