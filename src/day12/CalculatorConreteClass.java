package day12;

public class CalculatorConreteClass extends CalculatorImplementation{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		 res = num1 + num2;
		 System.out.println("The addtion value is: " +res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mul();
		CalculatorConreteClass obj  = new CalculatorConreteClass();
		obj.num1=10;
		obj.num2=2;
		obj.welcomMessage();
		obj.add();
		System.out.println("The sub value: "+obj.sub());
		obj.div(obj.num1,obj.num2);
		
		
		
	}

	

}
