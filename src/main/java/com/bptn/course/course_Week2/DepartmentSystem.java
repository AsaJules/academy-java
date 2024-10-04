package com.bptn.course.course_Week2;

public class DepartmentSystem {

	public static void main(String[] args) {
		Department salesDepartment = new SalesDepartment("Sales Resources", 200, 50.00);
		salesDepartment.displayDepartmentInfo();
		
		Department techDepartment = new SalesDepartment("Tech Resources", 100, 20.00);
		techDepartment.displayDepartmentInfo();
		
		
		

	}

}
