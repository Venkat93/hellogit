package com.test.DTO;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	@Override
	public String toString() {
		return "EmployeeDTO [eno=" + eno + ", eName=" + eName + ", salary=" + salary + ", gender=" + gender + "]";
	}
	private int eno;
	private String eName;
	private int salary;
	private String gender;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public EmployeeDTO(int eno, String eName, int salary, String gender) {
		super();
		this.eno = eno;
		this.eName = eName;
		this.salary = salary;
		this.gender = gender;
	}
	public EmployeeDTO() {
		super();
	}
	
	

}
