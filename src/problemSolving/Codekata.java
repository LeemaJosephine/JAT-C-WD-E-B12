package problemSolving;

import java.util.Scanner;

public class Codekata {

	   public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        String numberStr = scanner.nextLine();
	        
	        int[] evenDigits = new int[numberStr.length()];
	        int[] oddDigits = new int[numberStr.length()];
	        int evenCount = 0;
	        int oddCount = 0;
	        
	        for (int i = 0; i < numberStr.length(); i++) {
	            char c = numberStr.charAt(i);
	            int digit = c - '0'; // Convert char to int
	            
	            if (digit % 2 == 0) {
	                evenDigits[evenCount++] = digit;
	            } else {
	                oddDigits[oddCount++] = digit;
	            }
	        }
	        
	        // Sort even digits (using Bubble Sort)
	        bubbleSort(evenDigits, evenCount);
	        
	        // Sort odd digits (using Bubble Sort)
	        bubbleSort(oddDigits, oddCount);
	        
	        // Print even digits
	        for (int i = 0; i < evenCount; i++) {
	            System.out.print(evenDigits[i]);
	            if (i < evenCount - 1) {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	        
	        // Print odd digits
	        for (int i = 0; i < oddCount; i++) {
	            System.out.print(oddDigits[i]);
	            if (i < oddCount - 1) {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    
	    // Bubble Sort implementation
	    public static void bubbleSort(int[] arr, int n) {
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	
}
