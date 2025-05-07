package codekataDay2;

import java.util.Scanner;

public class BeautifulString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int res = isBeautiful(str);
		System.out.println(res);
	}
	
	public static int isBeautiful(String s) {
		
		int length = s.length();
		
		// Check if the string has at least three characters
		
		if(length < 3) {
			
			return 0;
		}
		
		// check if the first character is 'a' or 'A'
		
		if(s.charAt(0) != 'a' && s.charAt(0) != 'A') {
			
			return 0;
		}
		
		// check if the middle character is 'm' or 'M'
		char middleChar = s.charAt(length/2);
		if(middleChar != 'm' && middleChar != 'M') {
			
			return 0;
		}
		
		// Check if the last character is 'z' or 'Z'
		
		if(s.charAt(length-1) != 'z' && s.charAt(length-1) !='Z') {
			return 0;
		}
		
		return 1;
	}
	

}
