package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
	private int employeeID;
	private String employeeName;
	private String employeeGender;
	private String employeeCountry;
	private String employeeState;
	private String employeeCity;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeID, String employeeName, String employeeGender, String employeeCountry,
			String employeeState, String employeeCity) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeCountry = employeeCountry;
		this.employeeState = employeeState;
		this.employeeCity = employeeCity;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeeCountry() {
		return employeeCountry;
	}

	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}

	public String getEmployeeState() {
		return employeeState;
	}

	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Employee ID : " + employeeID + ", Employee Name : " + employeeName + ", Employee Gender : "
				+ employeeGender + ", Employee Country : " + employeeCountry + ", Employee State : " + employeeState
				+ ", Employee City : " + employeeCity + "]";
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee> employeList =getEmployeeList();
		List<Employee> sortedEmployeeList= employeList.stream().filter(emp->emp.getEmployeeState().equals("California")).collect(Collectors.toList());
		System.out.println(sortedEmployeeList);
		getLostButOneJoinedEmployee(employeList);
		employeList.forEach(emp->{
			emp.setEmployeeID(emp.getEmployeeID()+10);
			if(emp.getEmployeeGender().equals("F")) {
				emp.setEmployeeName("Mrs "+emp.getEmployeeName());
			}
			});
		
		
		System.out.println(employeList);
		
		
	}
	
	

	private static void getLostButOneJoinedEmployee(ArrayList<Employee> employeList) {
		
		employeList.sort((Employee e1,Employee e2)->e2.getEmployeeID()-e1.getEmployeeID());
		//System.out.println(employeList);
		Employee lostjoined =employeList.get(1);
		System.out.println(lostjoined);
	}

	private static ArrayList<Employee> getEmployeeList() {
        ArrayList<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(101, "John", "M", "United States", "California", "Los Angeles"));
		employees.add(new Employee(91, "Jacob", "M", "United States", "California", "Los Angeles"));
		employees.add(new Employee(111, "Lisa", "F", "United States", "California", "Los Angeles"));
		employees.add(new Employee(97, "Mary", "F", "United States", "California", "Sacramento"));
		employees.add(new Employee(76, "Christine", "F", "United States", "California", "Sacramento"));
		employees.add(new Employee(114, "David", "M", "United States", "California", "San Jose"));
		employees.add(new Employee(103, "Kevin", "M", "United States", "California", "Oakland"));
		employees.add(new Employee(109, "Joe", "M", "United States", "California", "Oakland"));
		employees.add(new Employee(119, "Mathew", "M", "United States", "California", "San Jose"));
		employees.add(new Employee(99, "Angelina", "F", "United States", "California", "San Diego"));
		employees.add(new Employee(98, "Tom", "M", "United States", "California", "San Diego"));
		employees.add(new Employee(116, "Curl", "M", "United States", "California", "Los Angeles"));
		employees.add(new Employee(66, "Christopher", "M", "United States", "California", "Oakland"));
		employees.add(new Employee(56, "Chelse", "F", "United States", "California", "Oakland"));
		employees.add(new Employee(88, "Murali", "M", "United States", "California", "San Jose"));
		employees.add(new Employee(87, "Daisy", "F", "United States", "California", "Sacramento"));
		employees.add(new Employee(85, "Niza", "F", "United States", "Virginia", "Richmond"));
		employees.add(new Employee(86, "Chris", "M", "United States", "Virginia", "Fairfax"));
		employees.add(new Employee(90, "Andrew", "M", "United States", "Virginia", "Reston"));
		return employees;
	}
	
	

}

