package day12;

public abstract class Calculator {
	
	int num1;
	int num2;
	int res;
	
	public abstract void add();
	
	public abstract int sub();
	
	public abstract void div(int num1,int num2);
	
	public void welcomMessage() {
		
		System.out.println("Hi! I'm from Abstract class");
	}
	
	public static void mul() {
		
		System.out.println("I'm a static method from Abstract class");
	}


}
