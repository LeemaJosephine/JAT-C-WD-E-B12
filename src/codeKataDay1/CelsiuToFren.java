package codeKataDay1;

import java.util.Scanner;

public class CelsiuToFren {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//	int n = sc.nextInt();
		
//		double  farenheit= ( cel * 1.8 ) +32;
//		
//		System.out.printf("%.2f",farenheit);
		
		
//		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//			System.out.println("Y");
//		}else {
//			System.out.println("N");
//		}
//		
//		for(int i=1; i<=3;i++) {
//			
//			int res = n * i;
//			if(i==3) {
//				System.out.print(res);
//			} else {
//				System.out.print(res+" ");
//			}
//		}
//		
//		String str = sc.nextLine();
//		System.out.println(str.length());
//		String replace = str.replace(" ", "");
//		System.out.println(replace);
//		System.out.println(replace.length());
		
//		int a = sc.nextInt();
//		int n = sc.nextInt();
//		
//		for(int i=0;i<n;i++) {
//			
//			System.out.println(a);
//		}
		
		 int digit,sum=0;
	     long num = sc.nextLong();
	      
	      while(num > 0) {
	    	  digit = (int) (num %10);
	    	  sum = sum + digit;
	    	  num = num /10;  
	        } 
	      System.out.println(sum);
	      
//	      X = {-b + √(b² - 4ac) } / 2a 
//	      X=  {-b-√(b² -4ac)} / 2a
//	      
//	     int des=  b * b - 4 * a  * c;
//	      
//	      -b + (Math.sqrt(des))/ 2 * a;
//	      
//	      -b - (Math.sqrt(des))/ 2 * a;
	      
	      
	      
	}
}
