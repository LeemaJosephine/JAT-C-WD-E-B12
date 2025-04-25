package day12;

public interface StudentDetails {
	
	public static final String name = "Arun";
	
	void studentName();
	
	void studentAge(int age);
	
	int printAge();
	
	void welcomeMessage();
	
	default void printDetails() {
		
		// The code remains the same -> It cannot be redefined , the logic provided here remains the same.
		
		System.out.println("I'm from interface and I'm a default method");
	}
}
