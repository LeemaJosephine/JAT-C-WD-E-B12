package codekataDay3;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndMergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Length of array 1
		int m = sc.nextInt(); //Length of array 2
		int totalLength = n + m;
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		for(int i=0; i<n;i++) {
			
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			
			arr2[i]=sc.nextInt();
		}
		
		// Sort array 1 in ascending 
		Arrays.sort(arr1);
		
		// Sort array 2 in descending
		Arrays.sort(arr2);
		reverse(arr2);
		
		// Merger the two arrays
		int[] mergedArray = new int[totalLength];
		System.arraycopy(arr1, 0, mergedArray, 0, n);
		System.arraycopy(arr2, 0, mergedArray, n, m);
		
		// Print the merged array
		for(int i=0;i<totalLength;i++) {
			System.out.print(mergedArray[i]+" ");
		}
		System.out.println();
	}

	public static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		
		int left =0;
		int right = arr.length-1;
		
		while(left < right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right]= temp;
			left++;
			right--;
		}
	}

}
