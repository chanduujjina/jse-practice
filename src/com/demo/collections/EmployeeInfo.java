package com.demo.collections;

public class EmployeeInfo {
	
	@Override
	public String toString() {
		return "EmployeeInfo [empID=" + empID + ", empName=" + empName + ", deptName=" + deptName + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}
	public int getEmpID() {
		return empID;
	}
	public String getEmpName() {
		return empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public double getSalary() {
		return salary;
	}
	public int getExperience() {
		return experience;
	}
	public EmployeeInfo(int empID, String empName, String deptName, double salary, int experience) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.deptName = deptName;
		this.salary = salary;
		this.experience = experience;
	}
	int empID;
	String empName;
	String deptName;
	double salary;
	int experience;

}
