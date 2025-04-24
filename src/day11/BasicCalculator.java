package day11;

public class BasicCalculator {

	int num1;
	int num2;
	int result;
	
	public void addition(int num1, int num2) {
		
		this.num1=num1;
		this.num2=num2;
		result= num1 + num2;
		System.out.println("The addition value is: " + result);
	}
	
	public void subtraction(int num1, int num2) {
		
		this.num1=num1;
		this.num2=num2;
		result= num1 - num2;
		System.out.println("The sub value is: " + result);
	}
	
	
	
	public static void main(String[] args) {
		
		BasicCalculator obj = new BasicCalculator();
		obj.addition(10, 20);
		obj.subtraction(30,10);
		
	}
}
