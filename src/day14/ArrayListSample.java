package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		//Create Array List
		ArrayList<Object> numbers = new ArrayList<Object>();
		
		// Add the elements
		
//		numbers.add(300);
//		numbers.add(10);
//		numbers.add(150);
//		numbers.add(60);
//		numbers.add("Arun");
//		numbers.add("age");
		
		
		for(int i =0; i<5;i++) {
			
			numbers.add(sc.next()); // accept all types of values
		}
		
		// To retrieve the elements
		System.out.println("Direct print: ");
		System.out.println(numbers);
		
		System.out.println("Using for each");
		
		for(Object num : numbers) {
			
			System.out.println(num);
		}
		
		System.out.println("Using for-loop");
		
		for(int i=0; i < numbers.size(); i++) {
			
			System.out.println(numbers.get(i));
		}
		
		// access the element
		System.out.println("Using get and set method");
		System.out.println(numbers.get(3));
		
		numbers.set(3,70);
		
		System.out.println(numbers.get(3));
		
		numbers.remove(2);  // to remove the element
		
		// Sorting
		
		System.out.println("Sorting");
		
		System.out.println("Before sorting: " +numbers);
		
		//Collections.sort(numbers);
		
		System.out.println("After sorting: " +numbers);
		
		System.out.println("Using Iterator");

		Iterator<Object> itr = numbers.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		

		
	}

}
