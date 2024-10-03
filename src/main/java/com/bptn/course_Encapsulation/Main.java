package com.bptn.course_Encapsulation;

public class Main {
	
	    public static void main(String[] args) {
	        // Create a new student with valid data
	        Student student1 = new Student("John", 20);
	        student1.displayInfo(); // Should display: John, 20

	        // Create a new student with invalid name and age
	        Student student2 = new Student("", -5);
	        student2.displayInfo(); // Should display: Unknown, 18

	        // Modify student2's data using setters
	        student2.setName("Alice");
	        student2.setAge(22);
	        student2.displayInfo(); // Should display: Alice, 22
	    }
	}


	
	


