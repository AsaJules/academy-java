package com.bptn.course_34_BigCodingChallenge;

public class Student {

	// Create instance variables int id, String name, and int age
	private int id;
	private String name;
	private int age;

	// Define a constructor that takes three arguments (id, name, and age)
	public Student(int id, String name, int age) {
		this.id = id; // Initialize id
		this.name = name; // Initialize name
		this.age = age; // Initialize age
	}

	// Define a getter method for the id field
	public int getId() {
		return id;
	}

	// Define a getter method for the name field
	public String getName() {
		return name;
	}

	// Define a getter method for the age field
	public int getAge() {
		return age;
	}

	// toString() method
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
	}
}
