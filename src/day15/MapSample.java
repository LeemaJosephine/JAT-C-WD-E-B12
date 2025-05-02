package day15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("HashMap Sample");
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Tara");
		map.put(102, "Arun");
		map.put(103, "David");
		map.put(104, "John");
		map.put(104, "Tarun");
		map.put(105, "Tara");
		map.put(null, "Leema");
		map.put(106, null);
		map.put(107, null);
		map.put(null, null);
		
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey(107));
		
		System.out.println(map.containsValue("Tara"));
	
		// To print the elements of map
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
		
			System.out.println(entry.getKey()+"->" + entry.getValue());
		}
		
		System.out.println("Printing only the keys");
		
		for(Integer key : map.keySet()) {
			
			System.out.println(key);
		}
		
		
		System.out.println("Linked Hash Map");
		
		LinkedHashMap<String, Double> marks = new LinkedHashMap<String, Double>();
		marks.put("Maths", 80.01);
		marks.put("English",70.5);
		marks.put("Tamil", 56.0);
		marks.put(null, null);
		marks.put("Social", null);
		marks.put(null,78.9);
		
		System.out.println(marks);
		
		System.out.println("Tree Map");
		
		TreeMap<String, Double> marks1 = new TreeMap<String, Double>();
		marks1.put("Maths", 80.01);
		marks1.put("English",70.5);
		marks1.put("Tamil", 56.0);
		//marks1.put(null, null);
		marks1.put("Social", null);
		marks1.put("Computer",null);
		
		System.out.println(marks1);
		
		Hashtable<Integer, Object> table = new Hashtable<Integer, Object>();
		table.put(101, "Apple");
		table.put(102, 102);
		table.put(104, "Orange");
		
		System.out.println(table);
 		
		// today java class was about java concept today class was good.
		
		//  Find occurance of each word in this statement 
		
		// today -> 2
		// java  -> 2
		// class -> 2
		// was -> 2
		// about -> 1
		// concept -> 1
		// good -> 1 
		
		
	}
	
		

}
