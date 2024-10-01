package com.bptn.course._07_;

class Employees {
	private String name;
	private double salary;
	
	// Constructor
	public Employees(String name, double salary) {
		// this refers to the current object's instance variable
		this.name = name; // this.name is the instance variable
		this.salary = salary; // this.salary is the instance variable
	}
	
	public void setSalary(double salary) {
		// this distinguishes between the instance variable and the parameter
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name: " + this.name + ", Salary: " + this.salary);
	}
}

	public class ThisDemoOne {
		public static void main(String[] args) {
			Employees EmployeesName = Alice;
			Employees EmployeesSalary = 40,000;	
		
	}

}
