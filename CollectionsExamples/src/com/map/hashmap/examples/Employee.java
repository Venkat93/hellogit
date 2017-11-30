package com.map.hashmap.examples;

public class Employee {
	
	private int employeeID;
	private String fName;
	private String gender;
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Employee(int employeeID, String fName, String gender) {
		super();
		this.employeeID = employeeID;
		this.fName = fName;
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	@Override
	public int hashCode() {
		return this.employeeID;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee emp=(Employee)obj;
			if(this.employeeID==emp.getEmployeeID()||this.fName.equals(emp.getfName())||this.gender.equals(emp.getGender())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", fName=" + fName + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
