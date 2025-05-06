package codeKataDay1;

import java.util.Scanner;

public class ReadAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		Scanner sc= new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c=sc.nextInt();
//		
//		System.out.println(a+" "+b+" "+c);
		
		String str = sc.next();
		
		for(int i=0; i<=str.length()-1;i++) {
			
			char a = str.charAt(i);
		//	System.out.println(a);
			if(i == str.length()-1) {
				System.out.println(a);
			} else {
			System.out.print(a+",");
			
			}
		}
		
		 //farenheit= ( celsius * 1.8 ) +32;
//		String str =sc.nextLine();
//		String[] split = str.split(" ");
//		
//		for(String num : split) {
//			
//			System.out.println(num);
//		}
		
		
		// 32.56763424  -> 32.57
		
		
	}

}
