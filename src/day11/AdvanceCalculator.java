package day11;

public class AdvanceCalculator  extends InterCalculator{

	int num1;
	int num2;
	int result;
	
	public void div(int num1, int num2) {
		
		this.num1=num1;
		this.num2=num2;
		result = num1 / num2;
		System.out.println("The division value is: "+result);
	}
	
	public void mod(int num1, int num2) {
		
		this.num1=num1;
		this.num2=num2;
		result = num1 % num2;
		System.out.println("The mod value is: "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvanceCalculator obj = new AdvanceCalculator();
		obj.addition(10, 20);
		obj.subtraction(20, 5);
		obj.mul(5, 6);
		obj.div(10, 2);
		obj.mod(10, 2);
		
	}

}
