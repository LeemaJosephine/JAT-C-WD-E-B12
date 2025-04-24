package day11;

public class InterCalculator extends BasicCalculator{

	int num1;
	int num2;
	int result;
	
	public void mul(int num1, int num2) {
		
		this.num1=num1;
		this.num2=num2;
		result = num1 * num2;
		System.out.println("The multiplication value is: "+result);
	}
	
	public void addition(int num1, int num2) {  // Method overriding 
		
		this.num1=num1;
		this.num2=num2;
		result= num1 + num2 + 1;
		System.out.println("This addition method is from InterClaculator: " + result);
	}
	
	public void addition(int num1, int num2,int num3) { // Method overloading
		
		this.num1=num1;
		this.num2=num2;
		result= num1 + num2 + num3;
		System.out.println("This addition method is from InterClaculator: " + result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterCalculator obj= new InterCalculator();
		obj.subtraction(100, 50);
		obj.mul(2, 4);
		obj.addition(10, 20);
		obj.addition(10, 20, 30);
		
		
	}

}
