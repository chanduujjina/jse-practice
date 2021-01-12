package com.demo.execption;

public class Employee {


@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptName=" + deptName + ", status="
				+ status + ", statusDescrption=" + statusDescrption + "]";
	}
public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public String getStatus() {
		return status;
	}
	public String getStatusDescrption() {
		return statusDescrption;
	}
public Employee(int id, String name, int salary, String deptName, String status, String statusDescrption) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptName = deptName;
		this.status = status;
		this.statusDescrption = statusDescrption;
	}
private int id;
private String name;
private int salary;
private String deptName;
private String status;
private String statusDescrption;



}
