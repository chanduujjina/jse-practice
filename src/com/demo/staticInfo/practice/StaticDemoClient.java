package com.demo.staticInfo.practice;

import java.util.List;

import com.demo.collections.EmployeeInfo;

public class StaticDemoClient {

	public static void main(String[] args) {
		
		List<EmployeeInfo> employeeInfoList= StaticDemo.getEmployeeInfoList();
		System.out.println(employeeInfoList);

	}

}
