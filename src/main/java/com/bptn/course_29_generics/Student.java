package com.bptn.course_29_generics;

import java.util.Map;

public class Student {

	private String name;
	private Map<String, Double> subjectScores;

	public Student(String name, Map<String, Double> subjectScores) {
		this.name = name;
		this.subjectScores = subjectScores;
	}

}