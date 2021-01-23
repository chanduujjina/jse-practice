package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSerivice {
	
	private static List<EmployeeInfo> employeeInfoList = new ArrayList();
	
	static {
		employeeInfoList.add(new EmployeeInfo(1, "anand", "it", 700000, 5));
		employeeInfoList.add(new EmployeeInfo(2, "balu", "admin", 1100000, 8));
		employeeInfoList.add(new EmployeeInfo(3, "pavan", "it", 1000000, 8));
		employeeInfoList.add(new EmployeeInfo(4, "vinod", "hr", 600000, 4));
		employeeInfoList.add(new EmployeeInfo(5, "chandu", "it", 800000, 6));
	}
	
	public static List<EmployeeInfo> getEmpemployeeInfoList() {
		return employeeInfoList;
	}

}
