package com.demo.execption;

public class EmployeeNotFoundException extends RuntimeException{
	
	public EmployeeNotFoundException(String fulldescrption) {
		super();
		this.fulldescrption = fulldescrption;
	}
	public int getEmpid() {
		return empid;
	}
	public String getStatus() {
		return status;
	}
	public String getFulldescrption() {
		return fulldescrption;
	}
	public EmployeeNotFoundException(int empid, String status, String fulldescrption) {
		super();
		this.empid = empid;
		this.status = status;
		this.fulldescrption = fulldescrption;
	}
	private int empid;
	private String status;
	private String fulldescrption;
	
	

}
