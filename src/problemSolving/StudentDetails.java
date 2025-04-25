package problemSolving;

public class StudentDetails {

	
	private int rno;  // Global variable 
	private String name;
	private int marks;
	
	private int num1 =10;
	
	public int percentage;
	
	protected int num;
	
	int num2;  // if no access provider is mentioned then it's consider as default
	
	
	
	public void setRno(int rno,int num1) { // Local variable
		
		
		this.rno=rno;
		this.num1=num1;
	}
	
	public String getRno() {
		
		return rno+" "+num1; // 101 23
	}
	
	public void setName(String studentName) {
		
		name = studentName;
		
	}
	
	public void getName() {
		
		System.out.println(name);
	}
	
	public int setMarks(int marks) {
		
		this.marks=marks;
		return marks;
	}
	
	
	
}
