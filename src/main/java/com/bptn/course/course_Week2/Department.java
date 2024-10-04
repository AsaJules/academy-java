package com.bptn.course.course_Week2;

class Department {
	
	// Data Members / Properties / Attributes
		private String nameOfTheDepartment;
		private int numOfEmployees;
								
		// Constructor
		public Department(String nameOfTheDepartment, int numOfEmployees) {
			this.nameOfTheDepartment = nameOfTheDepartment;
			this.numOfEmployees = numOfEmployees;
	
		}	
			// Instance Method, Class Method, Behaviour
			public void displayDepartmentInfo( ) {
				System.out.println("Name of Department: " + departmentName);
				System.out.println("Number of Employees: " + numberOfEmployees);
				}
			
		}
}

