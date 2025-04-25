package day12;

public class ImplementInterface implements StudentDetails{

	int age;
	
	@Override
	public void studentName() {
	
		System.out.println(name);
	}

	@Override
	public void studentAge(int age) {
		
		this.age=age;
	}

	@Override
	public int printAge() {
		
		return age;
	}

	@Override
	public void welcomeMessage() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementInterface obj = new ImplementInterface();
		obj.age=20;
		obj.studentName();
		obj.studentAge(obj.age);
		System.out.println(obj.printAge());
		obj.welcomeMessage();
		obj.printDetails();
		
	}

}
