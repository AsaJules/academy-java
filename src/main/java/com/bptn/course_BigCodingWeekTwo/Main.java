package com.bptn.course_BigCodingWeekTwo;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("John", "Doe", 1, 1, 1990, "123-45-6789");
		Person person2 = new Person("Jane", "Doe", 2, 2, 1991, "987-65-4321");
		Person person3 = new Person("Jane", "Smith", 1, 1, 1990, "111-11-1111");
		Person person4 = new Person("Jane", "Smith", 2, 2, 1991, "222-22-2222");

		System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() + " Birthday: "
				+ person1.getBirthday() + " SSN: " + person1.verifySSN("123-45-6789"));
		System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() + " Birthday: "
				+ person2.getBirthday() + " SSN: " + person2.verifySSN("987-65-4321"));
		System.out.println("Person 3: " + person3.getFirstName() + " " + person3.getLastName() + " Birthday: "
				+ person3.getBirthday() + " SSN: " + person3.verifySSN("111-11-1111"));
		System.out.println("Person 4: " + person4.getFirstName() + " " + person4.getLastName() + " Birthday: "
				+ person4.getBirthday() + " SSN: " + person4.verifySSN("222-22-2222"));
	}
//		Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
//		System.out.println(stock);
//		stock.adjustPrice(20);
//		System.out.println(stock);
	// create an instance of Employee class and initialize it with salary = 100 and
	// hoursPerDay = 8
//	       Employee student = new Employee(100, 8);
//	       
//	       // print the salary of the employee
//	       System.out.println(student.getSalary());
}
