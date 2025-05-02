package day15;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text ="We learn java basics as part of java session in java week1";
		
		// Step 1: Split string into words using spade
		String[] words = text.split(" "); 
		
		// Step 2: Use LinkedHashSet to maintain order and remove duplicates
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(words));
		
		// Step 3: Display the result
		for(String word : set) {
			
			System.out.print(word+" ");
		}
		
		// Guvi Geek  -> g u v i 
		
		System.out.println();
		
		String name = "Guvi Geek";
		
		LinkedHashSet<Character> set1= new LinkedHashSet<Character>();
//		for(int i=0;i<name.length()-1;i++) {
//			
//			 set1.add(name.charAt(i));
//		}
		
		
		char[] charArray = name.toCharArray();
		
		for(char uniqueChar: charArray) {
			
			set1.add(uniqueChar);
		}
		
		System.out.println(set1);
		

	}

}
