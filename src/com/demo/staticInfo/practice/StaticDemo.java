package com.demo.staticInfo.practice;

import java.util.ArrayList;
import java.util.List;

import com.demo.collections.EmployeeInfo;

public class StaticDemo {
	
	//static method,static variable you can call with a class Name
	//static varibles will load at the time of class load
	
	//static variable,static block,static method(when your calling)
	
	//static varble -1
	private static List<EmployeeInfo> employeeInfoList =  new ArrayList();
	
	private StaticDemo() {
		
	}
	
	//static block -2
	static {
		employeeInfoList.add(new EmployeeInfo(1, "chandu", "it", 10000, 4));
		employeeInfoList.add(new EmployeeInfo(2, "pavan", "it", 10000, 4));
	}
	
	//static method -3(when you are calling)
	public static List<EmployeeInfo> getEmployeeInfoList(){
		return employeeInfoList;
	}
	
	

}
