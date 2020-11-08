package com.demo.oops;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptment=" + deptment + ", salary=" + salary
				+ ", accuntName=" + accuntName + "]";
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setDeptment(String deptment) {
		this.deptment = deptment;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public void setAccuntName(String accuntName) {
		this.accuntName = accuntName;
	}


	


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getDeptment() {
		return deptment;
	}


	public int getSalary() {
		return salary;
	}


	public String getAccuntName() {
		return accuntName;
	}


	

	private int id;
	
	private String name;
	
	private String deptment;
	
	private int salary;

	
	private String accuntName;
}
