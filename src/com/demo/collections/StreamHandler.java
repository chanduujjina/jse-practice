package com.demo.collections;

import java.util.Comparator;
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
		
		double maxValue_v1 = employeeInfoList.stream().mapToDouble(EmployeeInfo :: getSalary).max().getAsDouble();
		
		
	
	
		//get min salary from list of employees
		double minValue =employeeInfoList.stream().map(EmployeeInfo :: getSalary).collect(Collectors.toList()).stream().mapToDouble(x->x).min().getAsDouble();
		System.out.println(minValue);
		
		double minValue_v1 = employeeInfoList.stream().mapToDouble(EmployeeInfo :: getSalary).min().getAsDouble();
		
		//group by functions
		Map<String,Long> map=employeeInfoList.stream().map(EmployeeInfo :: getDeptName).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		//sum of salries from list of employees
		
		double sumofSalries_v1=employeeInfoList.stream().map(EmployeeInfo::getSalary).collect(Collectors.toList()).stream().reduce(Double::sum).get();
		System.out.println("sumofSalries_v1::"+sumofSalries_v1);
		
		
		//appoach 2
		double sumofSalries_v2= employeeInfoList.stream().mapToDouble(EmployeeInfo::getSalary).sum();
		System.out.println("sumofSalries_v3::"+sumofSalries_v2);
		
		//average of salaries from list of employees
		double averageofsalries_v1= employeeInfoList.stream().map(EmployeeInfo::getSalary).collect(Collectors.averagingDouble(x->x));
		System.out.println("averageofsalries_v1::"+averageofsalries_v1);
		
		//approach 2
		double averageofsalries_v2 =employeeInfoList.stream().mapToDouble(EmployeeInfo::getSalary).average().getAsDouble();
		System.out.println("averageofsalries_v2::"+averageofsalries_v2);
		
		//get an employee having max salary from list of employees
		EmployeeInfo maxSalaryEmployee= employeeInfoList.stream().collect(Collectors.maxBy(Comparator.comparing(EmployeeInfo::getSalary))).get();
		System.out.println("maxSalaryEmployee::"+maxSalaryEmployee);
		
		
		//get an employee having max salary from list of employees
		EmployeeInfo minSalaryEmployee = employeeInfoList.stream().collect(Collectors.minBy(Comparator.comparing(EmployeeInfo::getSalary))).get();
		System.out.println("minSalaryEmployee::"+minSalaryEmployee);
		
		//get average experinece of IT employee from list of employees
		double itexperinceaverage=employeeInfoList.stream().filter(emp->emp.getDeptName().equalsIgnoreCase("it")).mapToInt(EmployeeInfo::getExperience).average().getAsDouble();
		System.out.println("itexperinceaverage::"+itexperinceaverage);
		
		//get sum of experience of it employess from list of employees
		int sumofitexperience= employeeInfoList.stream().filter(emp->emp.getDeptName().equalsIgnoreCase("it")).mapToInt(EmployeeInfo::getExperience).sum();
		System.out.println("sumofitexperience::"+sumofitexperience);
		
		//get list of disinct departments from list of employees
		List<String> distinctDeptList= employeeInfoList.stream().map(EmployeeInfo::getDeptName).distinct().collect(Collectors.toList());
		System.out.println("distinctDeptList::"+distinctDeptList);
		
		//sort the employee based on salries descending order
		employeeInfoList.sort(Comparator.comparing(EmployeeInfo::getSalary).reversed());
		System.out.println("sorted employee List descending order::"+employeeInfoList);
		
		//sort the employee based on salries ascending order
		employeeInfoList.sort(Comparator.comparing(EmployeeInfo::getSalary));
		System.out.println("sorted employee List ascending order::"+employeeInfoList);
		
		
	}

}
