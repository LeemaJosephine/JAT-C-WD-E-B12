package day11;

public class EncapsulationConcept {

	private String name;
	private String designation;
	public int age;
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public void getName() {
		
		System.out.println("The name of the person is: "+ name);
	}
	
	public void setDesignation(String designation) {
		
		this.designation=designation;
	}
	
	public void getDesignation() {
		
		System.out.println("The user designation is: "+designation);
	}
	

	public void printAge() {
		System.out.println("The age of the person is: "+age);
	}

}
