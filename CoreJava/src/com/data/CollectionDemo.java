package com.data;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {

		ArrayList<String> student = new ArrayList<String>();

		student.add("Umar");
		student.add("Sun");
		student.add("Shobuj");
		student.add("Alam");
		student.add("Shawpon");
		student.add("Shawon");

		Iterator<?> itr = student.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String s: student) {
			System.out.println(s);
		}
	
		student.remove(7);
		for(String s: student) {
			System.out.println(s);
		}
	}
}
