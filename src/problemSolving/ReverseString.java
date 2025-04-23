package problemSolving;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str1= sc.nextLine();
		String str2 = "";
		
		// String Reverse
		
		for(int i=str1.length()-1; i >=0 ; i--) {
			
			str2 += str1.charAt(i);
		}
		
		System.out.println(str2);
		
		// Check String palindrome
		
		if(str1.equalsIgnoreCase(str2)) {
			
			System.out.println("Its a palindrome");
		} else {
			
			System.out.println("Not a palindrome");
		}
		
		
		// Madam -- madaM
	}

}
