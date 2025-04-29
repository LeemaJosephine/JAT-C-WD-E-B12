package day13;

import java.io.FileReader;
import java.util.Scanner;

import day13.sub.Sample;



public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample obj = new Sample();
		
		
		int[] arr= {10,20,30,40};
		
		System.out.println("Start of the program");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array index from 0 - 3");
		int i = sc.nextInt();
		
		try {
			
			// Null Pointer exception
//			String str = null;
//			System.out.println(str.length());
			
			// Division by 0
			//int c = i / 1; // Arthmetic
		    System.exit(0); // For a normal termination
			System.out.println(arr[i]);  // Array
			System.out.println("You have printed the value"); // This will not be executed if the exception occurs in previous line

			
		//	FileReader file = new FileReader("C://My file//file.txt");
			
						
		} catch(ArrayIndexOutOfBoundsException e) {
			
			//e.printStackTrace(); // prints the exception occured along with it's message.
			System.out.println("Sorry you entered a wrong index.");
		} catch(ArithmeticException e) {
			
			System.out.println("Value divided by 0.");
			
		}  finally {
			
			System.out.println("I'm finally block");
		}
		
		
		System.out.println("End of the program");
		

	}

}
