package javaLessons;

public class StringLesson {

	public static void main(String[] args) {
		
		String text = "Automation Testing using Selenium";
		String letters="Automation API using RestAPI";
		System.out.println("Length of Strings:" + text.length());  // to find the length of Strings
		
		System.out.println("To Uppercase: "+ text.toUpperCase());   // to convert all strings to uppercase
		
		System.out.println("To Lowercase:" +text.toLowerCase());    //to convert to Lowercase
       
		System.out.println("StartsWith:"+ text.startsWith("S"));
		//ends with
		//Substring
		
		//System.out.println(text.substring(11 ,150 ));
		System.out.println("Substring:" +text.substring(5));
		System.out.println("Contains:" +text.contains("Test"));  // contains(case sensitive)
		
		System.out.println("CharAt:"+ text.charAt(5));   //CharAt index- to find if a particular character is present or not in the given string
		
		System.out.println("IndexOf:" + text.indexOf("Z")); //indexOf method- returns the index of characters in the strings, if char is not present in the string returns -ve value
		
		System.out.println("lastIndexOf:" +text.lastIndexOf("u")); // returns from last
		System.out.println("Replace: "  +text.replace("Testing", "Kalkin"));// replaces
		System.out.println("ReplaceAll:"+ text.replaceAll("(.*)Testing(.*)", "Kalkin"));
		System.out.println("Is Empty:"+ text.isEmpty());
		
		System.out.println("Equals:"+ text.equals(letters));  //equals method is case sensitive
		
		System.out.println("Concat:"+ text.concat(" "  +letters)); //Concat Strings
		
		//**Is string mutable or immutable?, why Java  is prferred over C++ thou both are based on oops?, ASCII VALUE?
		
		System.out.println("Compare:"+ text.compareTo(letters)); // if two string are equal returns 0 and it compares string based on AsCII values
		
		System.out.println(System.identityHashCode(text)); // returns memory address of the text variable stored in -------
		
		System.out.println("identityHashCode:"+ System.identityHashCode(letters));
		
		System.out.println("identityHashCode:"+System.identityHashCode(text.concat(letters)));
		System.out.println("identityHashCode:"+ System.identityHashCode(text)); //
		
		//System.out.println(text);
		
		String[] array= text.split(" ");   // Split method to parse the strings
		//String arraypart1= array [0];
		//String arraypart2= array[1];
		//String arraypart3= array[2];
		//String arraypart4= array[3];
		//System.out.println(arraypart1);
		//System.out.println(arraypart2);
		//System.out.println(arraypart3);
		
		
		for(int i=0; i<array.length; i++) {    // this loop print the index values
			System.out.println(i);
		}
		
		
		for(String s: array) {              // this loop print the Strings present in the index values
			
			System.out.println(s);
		}
		
		
		
		
		
		                                                          // buffer String?
		
		

	}

}
