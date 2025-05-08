package codekataDay3;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesWithoutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		for(int i=0; i<size;i++) {
			
			arr[i]=sc.next();
		}
		
		// Creating temp array for storing the unique values
		
		//Sort the input array
		Arrays.sort(arr);
		
		// Creating another array for sorting the unique values
		String[] temp = new String[size];
		int newLength=0;
		
		// Comparing the first with the next element 
		for(int i=0;i<size - 1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[newLength++]=arr[i];
			}
		}
		
		// Adding last element to the array
		temp[newLength++] = arr[size-1];
		
		// Print unique array
		for(int i=0; i<newLength;i++) {
			
			System.out.println(temp[i]+" ");
		}
	}

}
