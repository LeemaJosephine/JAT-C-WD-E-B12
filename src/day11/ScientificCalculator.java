package day11;

public class ScientificCalculator extends BasicCalculator{

	int num1;
	int num2;
	int result;
	
	public void tan() {
		
		
		System.out.println("This is tan method ");
	}
	
	public void cos() {
		
		
		System.out.println("This is cos method ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScientificCalculator obj = new ScientificCalculator();
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.tan();
		obj.cos();
	}

}
