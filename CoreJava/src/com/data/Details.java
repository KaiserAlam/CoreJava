package com.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Details {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(001, "Accounting");
		map.put(002, "Marketing");
		map.put(003, "Sales");
		map.put(004, "Service");
		map.put(005, "Human Resource");
		
		Set<?> s = map.entrySet();
		Iterator<?> itr = s.iterator();
		
		try {
			while(itr.hasNext()) { 	
				Map.Entry<?, ?> m = (Map.Entry<?, ?>) itr.next();
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}catch(NoSuchElementException e) {
			System.out.println("no more items in collection");
		}
	}
}
