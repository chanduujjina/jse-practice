package com.demo.execption;

public class EmployeeInfo {
  @Override
	public String toString() {
		return "EmployeeInfo [employee=" + employee + ", error=" + error + "]";
	}
public Employee getEmployee() {
		return employee;
	}
	public ErrorDetail getError() {
		return error;
	}
public EmployeeInfo(Employee employee, ErrorDetail error) {
		super();
		this.employee = employee;
		this.error = error;
	}
private Employee employee;
  private ErrorDetail error;
}
