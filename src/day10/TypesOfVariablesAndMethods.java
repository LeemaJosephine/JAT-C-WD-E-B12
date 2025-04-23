package day10;

public class TypesOfVariablesAndMethods {

	static int a;
	static int b; // Global variable
	
	int num1;
	int num2;
	
	public TypesOfVariablesAndMethods() {
		
		System.out.println("Default constructor");
		System.out.println("The following program demonstrates the types on variables and methods");
	}
	
	public TypesOfVariablesAndMethods(int a , int b) {
		
		System.out.println("constructor with 2 values");
		this.a=a;
		this.b=b;
	}
	
	public TypesOfVariablesAndMethods(int a , int b, int c) {
		
		System.out.println("constructor with 3 values");
		this.a=a;
		this.b=b;
		System.out.println(c);
	}
	
	public void method1() {
		
		int c= a + b;  // Local Variable
		System.out.println(c);
	}
	
	public static void method2() {
		
		a = 30;
		b = 40;
		int c = a - b;
		System.out.println(c);
		
	}
	
	public void method3(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public void printValues() {
		
		System.out.println(num1+""+num2);
	}
	
	public void detils() {
		
		System.out.println("The following program demonstrates the types on variables and methods");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TypesOfVariablesAndMethods obj = new TypesOfVariablesAndMethods(100,50,70);
		TypesOfVariablesAndMethods obj1 = new TypesOfVariablesAndMethods();
		TypesOfVariablesAndMethods obj2 = new TypesOfVariablesAndMethods(10, 20);
		obj.method1();
		TypesOfVariablesAndMethods.method2();
		System.out.println(a);
		obj.method3(10, 20);
		obj.printValues();
		
		//The following program demonstrates the types on variables and methods
	}

}
