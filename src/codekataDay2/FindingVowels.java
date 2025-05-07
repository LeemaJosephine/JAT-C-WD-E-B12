package codekataDay2;

import java.util.Scanner;

public class FindingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		if(containsVowel(str)) {
			
			System.out.println("yes");
		} else {
			
			System.out.println("no");
		}
		
	}
	
	public static boolean containsVowel(String str) {
		
		for(int i=0; i<str.length();i++) {
			
			char c = str.charAt(i);
			if(isVowel(c)) {
				return true;
			}
		}
		
		return false;
	}

	public static boolean isVowel(char c) {
		
		// A a
		
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u';
		
		
	}

}
