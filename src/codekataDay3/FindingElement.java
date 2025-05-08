package codekataDay3;

import java.util.Scanner;

public class FindingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		// Check if K exists in the array
		boolean found= false;
		for(int i=0;i<n;i++) { // linear search
			if(arr[i]==k) {
				found=true;
				break;
			}
		}
		
		// Print 'yes' if K exists, otherwise print no
		if(found) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
