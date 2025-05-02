package day14;

import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vec = new Vector<String>();
		vec.add("Apple");
		vec.add("Orange");
		vec.add("Banana");
		vec.add("Grapes");
		
		System.out.println(vec.size());
		
		System.out.println(vec);
		
		vec.remove(0);
		
		System.out.println("After removing");
		for(String names : vec) {
			
			System.out.print(names+ " ");
		}
		
		System.out.println();
		System.out.println("The elemet at the postion 2 is " +vec.get(2));
	}

}
