package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hash Set");
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("four");
		
		Iterator<String> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			
			System.out.print(itr.next()+" ");
		}
		System.out.println();

		System.out.println("LinkedHashSet");
		LinkedHashSet<String> linkSet = new LinkedHashSet<String>();
		linkSet.add("One");
		linkSet.add("Two");
		linkSet.add("Three");
		linkSet.add("Four");
		linkSet.add("Two");
		linkSet.add("Three");
		linkSet.add("four");
		
		Iterator<String> itr1 = linkSet.iterator();
		
		while(itr1.hasNext()) {
			
			System.out.print(itr1.next()+" ");
		}
		System.out.println();

		System.out.println("TreeSet");
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("one");
		
		Iterator<String> itr2 = set.iterator();
		
		while(itr2.hasNext()) {
			
			System.out.print(itr2.next()+" ");
		}
		System.out.println();
		
		// Convert Set to List
		
		System.out.println("Set to List");
		ArrayList<String> arr = new ArrayList<String>(hashSet);
		
		for(int i=0; i<arr.size();i++) {
			
			System.out.println(arr.get(i));
		}
	}

}
