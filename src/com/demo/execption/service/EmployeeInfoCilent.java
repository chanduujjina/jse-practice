package com.demo.execption.service;

import java.util.List;

import com.demo.execption.Employee;
import com.demo.execption.EmployeeInfo;
import com.demo.execption.EmployeeNotFoundException;
import com.demo.execption.ErrorDetail;

public class EmployeeInfoCilent {

	public static void main(String[] args) {
		//get Employee by name
		
		//EmployeeInfo employeeInfo1 =getEmployeeByName("chandu");
		//System.out.println(employeeInfo1);
		EmployeeInfo employeeInfo2 =getEmployeeByName("test");
		System.out.println(employeeInfo2);
	}

	private static EmployeeInfo getEmployeeByName(String name) {
		EmployeeInfo employeeInfo= null ;
		Employee emp1 = null;
		try {
			emp1 = EmployeeService.getEmployeeByName(name);
			employeeInfo = new EmployeeInfo(emp1,null);
		} catch (EmployeeNotFoundException e) {
			
			ErrorDetail detail = new ErrorDetail(e.getEmpid(), e.getStatus(), e.getFulldescrption());
			employeeInfo = new EmployeeInfo(null,detail);
		}
		return employeeInfo;
	}

}
