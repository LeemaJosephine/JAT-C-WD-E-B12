package codekataDay2;

import java.util.Scanner;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();
		int conversionType = sc.nextInt();
		int pos = sc.nextInt();
		
		String result = perfomConversion(input, conversionType, pos);
		System.out.println(result);
	}
	
	public static String perfomConversion(String s, int type, int pos) {
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			
			// Check if the index is multiple of P
			
			if((i + 1) % pos == 0) {
				
				// Perform conversion based on the conversion type
				
				if(type == 1) {
					
					result.append(Character.toLowerCase(c));
					
				} else if (type == 2) {
					
					result.append(Character.toUpperCase(c));
				}
			} else {
				result.append(c);
			}
		}
		
		return result.toString();
	}

}
