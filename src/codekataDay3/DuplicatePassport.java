package codekataDay3;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicatePassport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		for(int i=0; i<size;i++) {
			
			arr[i]=sc.next();
		}
		
		//Create a HashSet to store unique passport numbers
		
		HashSet<String> set = new HashSet<String>();
		
		// Add each element of the array to the set using for each
		
		for(String passportNum : arr) {
			
			set.add(passportNum);
		}
		
		// Print the unique passport numbers
		
		for(String pass : set) {
			
			System.out.println(pass);
		}
		
	}

}
