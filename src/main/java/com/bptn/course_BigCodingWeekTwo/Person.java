package com.bptn.course_BigCodingWeekTwo;

public class Person {
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private String ssn;

	// Constructor
	public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		this.ssn = ssn;
	}

	// Create methods
	public String getFirstName() {
		return firstName;
	}

	// Setter method for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter method for lastName
	public String getLastName() {
		return lastName;
	}

	// Setter method for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Method to get the birthday in the format "birthMonth/birthDay/birthYear"
	public String getBirthday() {
		return birthMonth + "/" + birthDay + "/" + birthYear;
	}

	// Method to verify if the input SSN matches the person's SSN
	public boolean verifySSN(String ssn) {
		return this.ssn.equals(ssn);

	}

}
