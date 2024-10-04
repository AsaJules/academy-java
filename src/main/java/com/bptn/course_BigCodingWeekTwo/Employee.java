package com.bptn.course_BigCodingWeekTwo;

public class Employee {
	private int salary;
	private int hoursPerDay;
	
	 public Employee(int salary, int hoursPerDay) {
	        setSalary(salary);
	        sethoursPerDay(hoursPerDay);
	    }
	
	public void setSalary(int salary) {
		if (salary < 500) {
			this.salary = salary + 10;
		} else {
			this.salary = salary;
		}
	
	}
	
	public void sethoursPerDay(int hoursPerDay) {
		if (hoursPerDay > 6) {
			this.salary += 5;
		}
	
		this.hoursPerDay = hoursPerDay;

	}
	
	public int getSalary() {
        return salary;
    }

}
