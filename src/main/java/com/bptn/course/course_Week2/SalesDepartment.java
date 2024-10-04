package com.bptn.course.course_Week2;

class SalesDepartment extends Department {
	
	private double totalSalesAmount;

	public SalesDepartment(String Departmentname, int numOfEmployees, double totalSalesAmount) {
		super(Departmentname, numOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
		
		
	}
	
}
