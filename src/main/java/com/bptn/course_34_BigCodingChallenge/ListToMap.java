package com.bptn.course_34_BigCodingChallenge;

import java.util.ArrayList; //Import all necessary packages here
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	// create static method "convertStudentListToMap"
	public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
		// Use streams to collect the list of students into a map with id as the key and
		// Student object as the value
		Map<Integer, Student> studentMap = students.stream()
				.collect(Collectors.toMap(Student::getId, student -> student)); // Key is student id, value is the
																				// Student object itself
		return studentMap; // Return the generated map
	}

	// Complete the main method
	public static void main(String[] args) {

		// Create a list of students
		List<Student> students = new ArrayList<>();

		// add student objects to this list
		students.add(new Student(1, "Alice", 20));
		students.add(new Student(2, "Bob", 22));
		students.add(new Student(3, "Charlie", 21));

		// Call "convertStudentListToMap" method and hold the returned value in
		// "studentMap" variable.
		Map<Integer, Student> studentMap = convertStudentListToMap(students);
		// Print the map
		System.out.println("Students Map: " + studentMap);
	}
}

/*
 * In this code, we learned how to transform a list of custom objects
 * ('Student') into a map using Java Streams and collectors. The use of Java
 * Streams was new in this context. Understanding how 'Collectors.toMap()'
 * works, particularly with method references and lambda expressions, was key to
 * solving this task I'll ensure that I remember how to use streams for
 * conversions like list-to-map in future tasks.
 */