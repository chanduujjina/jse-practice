package com.demo.execption.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.execption.Employee;
import com.demo.execption.EmployeeNotFoundException;
//purpose of this class to get mock data from this service instead of database
public class EmployeeService {
	
	private static List<Employee> epmloyeeList= new ArrayList<>();
	
	static {
		epmloyeeList.add(new Employee(1, "chandu", 100000, "it","active",null));
		epmloyeeList.add(new Employee(2, "pavan", 100000, "it","inactive","moved out"));
		epmloyeeList.add(new Employee(3, "siva", 100000, "admin","inactive","terminated"));
		epmloyeeList.add(new Employee(4, "balu", 100000, "it","active",null));
	}
	
	public static List<Employee> getEmployeeList(){
		return epmloyeeList;
	}
	
	public static Employee getEmployeeByName(String name) {
		for(Employee employee :epmloyeeList) {
			if(employee.getName().equals(name)) {
				//happy path
				if(employee.getStatus().equals("active")) {
				return employee;
				}
				else {
					throw new EmployeeNotFoundException(employee.getId(), employee.getStatus(), employee.getStatusDescrption());
				}
			}
			}
			
		
		throw new EmployeeNotFoundException("employee not found");
	}
	
	public static List<Employee> getActiveEmployee(){
		List<Employee> activeList = new ArrayList<>();
		for(Employee employee :epmloyeeList) {
			if(employee.getStatus().equals("active")) {
				activeList.add(employee);
			}
		}
		return activeList;
	}
	
	

}
