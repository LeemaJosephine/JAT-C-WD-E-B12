package problemSolving;

import java.util.Scanner;

public class SampleClass {

	private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public SampleClass(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Annual salary calculation
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Raise salary by percentage
    public int raiseSalary(int percent) {
        double increase = salary * (percent / 100.0);
        salary += (int) increase;
        return salary;
    }

    // String representation
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		SampleClass emp = new SampleClass(1, "John", "Doe", 5000);
		System.out.println(emp); // Employee[id=1, name=John Doe, salary=5000]
		emp.raiseSalary(10);     // 10% raise
		System.out.println(emp.getSalary()); // 5500
		
		
		
	}

}
