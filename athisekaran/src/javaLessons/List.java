package javaLessons;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		
		ArrayList als= new ArrayList();
		als.add("Athithya");
		als.add('c');
		als.add(50);
		
		ArrayList<Integer> ali= new ArrayList<Integer>();
		ali.add(35);
		ali.add(19);
		ali.add(35);
	
		
		ArrayList ali1= new ArrayList();
		ali1.add(3);
		ali1.add("Test");
		ali1.add('B');
		
		System.out.println(als.isEmpty());
		
	
		//System.out.println("Added lists:"+ als.addAll(ali1)); //Similar datatype cannot be added????
		System.out.println("Added list:" + als);
		
		System.out.println(als.equals(ali));
		
		Object index= als.get(2);
		System.out.println("Get Index:" + index);
		
		
		
		
		System.out.println("List1:" + als);
		System.out.println("List2:"+ali);
		System.out.println("List3:"+ali1);
		
	for (Integer age : ali) {
		
		System.out.println("List2:" + age);// print
	}
		
		

	}

}
