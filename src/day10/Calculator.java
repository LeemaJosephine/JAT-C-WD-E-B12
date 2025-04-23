package day10;

import java.util.Scanner;

public class Calculator {

	int a = 10;
	int b = 20;   // attributes
	
	public void addition() {  // methods
		
		int c = a +b;
		System.out.println(c);
		
	}
	
	public int sub() {
		
		int c = a - b;
		return c;
	}
	
	public String print() {
		
		String str = "Hello";
		return str;
		
	}
	
	public void printDetails(String fn,int ln) { // passing parameter to a method
		
		String firstName=fn;
		int personage=ln;
		
		System.out.println("The name of the person is: "+firstName+" the age of the person is: " +personage);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator(); // memory allocation will happen
		System.out.println("The value for a: "+ obj.a);
		System.out.println("The value for b: "+ obj.b);
		obj.addition();
		int sub = obj.sub();
		String value =obj.print();
		System.out.println(sub);
		System.out.println(value);
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		
		obj.printDetails(name,age);
		
		
	}

}
