package com.demo.collections;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamHandler {

	public static void main(String[] args) {
		//fetch List of  employee id from List of employess
		List<EmployeeInfo> employeeInfoList = EmployeeSerivice.getEmpemployeeInfoList();
		List<Integer> empIDList=employeeInfoList.stream().map(EmployeeInfo :: getEmpID).collect(Collectors.toList());
		System.out.println("employee ID's"+empIDList);
		//fetch List of  employee names from List of employes
		List<String> empnameList=employeeInfoList.stream().map(EmployeeInfo :: getEmpName).collect(Collectors.toList());
		System.out.println("employee names's"+empnameList);
		
		//get employee from employee List start with c
		
		EmployeeInfo info =employeeInfoList.stream().filter(employee->employee.getEmpName().startsWith("v")).findFirst().get();
		System.out.println(info);
		
		//get max salary from list of employees
		double maxValue =employeeInfoList.stream().map(EmployeeInfo :: getSalary).collect(Collectors.toList()).stream().mapToDouble(x->x).max().getAsDouble();
		System.out.println(maxValue);
		
		//get min salary from list of employees
		double minValue =employeeInfoList.stream().map(EmployeeInfo :: getSalary).collect(Collectors.toList()).stream().mapToDouble(x->x).min().getAsDouble();
		System.out.println(minValue);
		
		//group by functions
		Map<String,Long> map=employeeInfoList.stream().map(EmployeeInfo :: getDeptName).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		//sum of salries
		
		//avegade of salries
		
		//flatmap
		
		//sorting
	}

}
