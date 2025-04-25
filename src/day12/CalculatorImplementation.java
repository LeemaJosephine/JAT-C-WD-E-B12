package day12;

public abstract class CalculatorImplementation extends Calculator{
	

	@Override
	public int sub() {
		
		res = num1 - num2;
		return res;
	}

	@Override
	public void div(int num1, int num2) {
		
		 this.num1=num1;
		 this.num1=num2;
		 
		 res = num1 / num2;
		 System.out.println("The div value: "+res);
		
	}
	
}
