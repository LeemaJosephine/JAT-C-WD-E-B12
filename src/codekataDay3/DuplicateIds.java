package codekataDay3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateIds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		// Create a HashMap to count the occurrences of each ID
	
		HashMap<Integer, Integer> idCount = new HashMap<Integer, Integer>();
		for(int id: arr) {
			
			idCount.put(id, idCount.getOrDefault(id, 0) + 1);
		}
		
		// Find common ID
		boolean foundCommonID = false;
		for(Map.Entry<Integer, Integer> entry : idCount.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey()+" ");
				foundCommonID=true;
			}
		}
		
		// If no common IDs were found, print -1
		if(!foundCommonID) {
			System.out.println("-1");
		}
	}

}
