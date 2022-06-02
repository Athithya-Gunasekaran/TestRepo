package javaLessons;

public class StrngMutableImmutable {
	
	// IS STRING MUTABLE OR IMMUTABLE IN JAVA? IT IS IMMUTABLE IN JAVA
	
	//Mutable: Once obj created we can change the value using String Buffer/ String builder
	
	//Immutable: Once object created we cannot modify the value at the memory address

	public static void main(String[] args) {
		
		String str= "Welcome";
		String str1= "To Automation learning";
		System.out.println(str + System.identityHashCode(str));
		System.out.println(str1 + System.identityHashCode(str1));
		 String cncat= str.concat(str1);
		 System.out.println(cncat + System.identityHashCode(cncat)); // the concat value is stored in new memory and not overwriting on cancating String varables
		 
		// Using  String buffer/String builder(in recent java version) to make the string mutable
		 
		 StringBuffer buf= new StringBuffer("Welcome");
		 StringBuffer buf1= new StringBuffer("To REST API Learning");
		 System.out.println(buf);
		 System.out.println(System.identityHashCode(buf));
		 System.out.println(buf1);
		 System.out.println(System.identityHashCode(buf1));
		 StringBuffer bfconcat= buf.append(buf1);
		 System.out.println(bfconcat);
		 System.out.println(System.identityHashCode(bfconcat)); // Achieved String mutablity by using StringBuffer class where the concated String is stored in the Stringbuffer 'buf' variable
		 
		

	}

}
