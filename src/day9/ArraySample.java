package day9;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int size=sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Printing array values");
//		for(int i=0; i<arr.length; i++) {
//			
//			System.out.println(arr[i]);
//		
//		}
		
		// Advanced for-loop -> for-each
		
		for(int num : arr) {
			
			System.out.println(num);
		}

	}

}
