package com.treeSet.comparator.examples;


public class Employee {
	
	private int employeeID;
	private String employeeName;
	private String gender;
	private int salary;
	
/*	@Override
	public int hashCode() {
		return this.employeeID;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Employee ) {
			Employee emp=(Employee)obj;
			
			if(this.employeeID==emp.employeeID||this.employeeName.equals
					(emp.employeeName)||this.gender.equals(emp.gender)||this.salary==emp.getSalary()) {
				return true;
			}
		}
		return false;
	}*/
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int employeeID, String employeeName, String gender, int salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.gender = gender;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}

	
	
	
	

}
