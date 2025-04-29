package day14;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> names = new LinkedList<String>();
		
		names.add("John");
		names.add("Akash");
		names.add("Danis");
		names.add("Arun");
		
		for(String name : names) {
			
			System.out.println(name);
		}
		
		names.remove("Arun");
		
		System.out.println(names);
		
		for(int i=0;i<names.size();i++) {
			
			System.out.println(names.get(i));
		}
		
		
		System.out.println("Using Iterator");
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}

}
