package problemSolving;

public class StudentDetailsImplementation extends StudentDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetailsImplementation obj = new StudentDetailsImplementation();
		obj.setMarks(10);   
		obj.num=10;
		obj.num2=20;
		obj.percentage=10;
		obj.setRno(20,30);
		System.out.println(obj.getRno());
		obj.setName("John");
		obj.getName();
		System.out.println(obj.setMarks(102));
	}

}
