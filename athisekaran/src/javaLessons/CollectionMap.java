package javaLessons;

import java.util.*;
import java.util.Map.Entry;

public class CollectionMap {

	public static void main(String[] args) {
	
		Map<Integer, String> m= new TreeMap<Integer, String>();
		
		m.put(1, "Employee");
		m.put(2, "Address");
		m.put(3, "Role");
		
		System.out.println(m);
		
		//m.entrySet();
		
		Set<Entry <Integer, String>> es= m.entrySet(); // to iterate through entire map
		for (Entry<Integer, String> entry : es) {
			
			System.out.println(entry);
			
		}
		
		for (Entry<Integer, String> entrykey : es) {
			
			System.out.println(entrykey.getKey());
			System.out.println(entrykey.getValue());
		}
		
		
	}
	
	
	

}
