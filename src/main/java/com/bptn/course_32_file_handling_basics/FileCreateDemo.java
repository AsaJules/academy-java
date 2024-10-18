package com.bptn.course_32_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

class Student {
	int studentIS;
	String studentName;
	private int studentID;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getstudentID() {
		return studentID;
	}
}

public class FileCreateDemo {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("student.txt");
			writer.write("This is a new file!");
			System.out.println("File created! ");
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: ");
			e.printStackTrace();
		}
	}

}
