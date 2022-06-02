package javaLessons;
import java.util.*;

public class CollectionSet {

	public static void main(String[] args) {
	
		Set<Integer> s= new HashSet<Integer>();
		
		s.add(20);
		s.add(21);
		s.add(22);
		s.add(23);
		
		Set<Integer> s1= new HashSet<Integer>();
	
		s1.add(80);
		s1.add(22);
		s1.add(83);
		s1.add(84);
		
		System.out.println(s);
		
		System.out.println(s1);
		
		s.retainAll(s1);
		
		System.out.println(s);
		
		s.removeAll(s1);
		System.out.println(s);
		
		
		
		
		
		

	}

}
