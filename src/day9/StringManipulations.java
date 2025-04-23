package day9;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // Used to get the values from user
		
		//int num1 = sc.nextInt();
		
		String str1 = sc.next();  // Guvi 
		String str2 = sc.next(); // Geek 
		
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.charAt(1)); // Will return the character that is present in the specific index
		
		System.out.println(str1.equals(str2)); // check whether the value for both the strings are matching
		
		// This is used for comparing numbers == 
		
		// difference between == and equals()
		
		// equals() will check the value
		// == will check the address 
		
		System.out.println(str1==str2);
		
		System.out.println(str1.contains(str2)); // used to check whether str1 has the value of str2
		
		System.out.println(str1.length()); // Return the no.of values the string is having
	
		
		
	}

}
