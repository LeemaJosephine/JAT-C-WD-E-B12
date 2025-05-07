package codekataDay2;

import java.util.Scanner;

public class StringWeightage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int res =calculateWeight(str);
		System.out.println(res);
	}

	public static int calculateWeight(String str) {
		// TODO Auto-generated method stub
		int weight=0;
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			weight += (int)c; // When a character variable is type casted to int, it will provide the ASCI value of the particular character/
		}
		
		return weight;
	}
	
	
	

}
