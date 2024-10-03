package com.bptn.course_Encapsulation;

public class Student {
	
		    // Private fields for encapsulation
	    private String name;
	    private int age;

	    // Constructor
	    public Student(String name, int age) {
	        this.setName(name); // Use setter to initialize name
	        this.setAge(age);   // Use setter to initialize age
	    }
	    
	    // Setter for 'name'
	    public void setName(String name) {
	        // Validate the name before setting it
	        if (name != null && !name.trim().isEmpty()) {
	            this.name = name;
	        } else {
	            System.out.println("Invalid name. Setting default value.");
	            this.name = "Unknown";
	        }
	    }

	    // Getter for 'name'
	    public String getName() {
	        return this.name;
	    }

	    // Setter for 'age'
	    public void setAge(int age) {
	        // Ensure age is a positive number
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Invalid age. Setting default value.");
	            this.age = 18; // Set default age if input is invalid
	        }
	    }

	    // Getter for 'age'
	    public int getAge() {
	        return this.age;
	    }

	    // Display student information
	    public void displayInfo() {
	        System.out.println("Student Name: " + this.getName());
	        System.out.println("Student Age: " + this.getAge());
	    }
	}


	

