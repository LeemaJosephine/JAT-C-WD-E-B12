package codeKataDay1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OddAndEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String numStr = sc.nextLine();
		
		ArrayList<Integer> evenDigits = new ArrayList<Integer>();
		ArrayList<Integer> oddDigits = new ArrayList<Integer>();
		
		for(int i=0; i < numStr.length();i++) {
			
			char c = numStr.charAt(i);
			int digit = Character.getNumericValue(c); 
			
			if(digit % 2 == 0) {
				
				evenDigits.add(digit);
			} else {
				
				oddDigits.add(digit);
			}
			
		}
		
		Collections.sort(evenDigits);
		Collections.sort(oddDigits);
		
		for(int num : evenDigits) {
			
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num1 : oddDigits) {
			
			System.out.print(num1+" ");
		}
		System.out.println();
	}
}
