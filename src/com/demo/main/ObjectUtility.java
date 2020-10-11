package com.demo.main;

import com.demo.dto.Employee;

public class ObjectUtility {

	public static void main(String[] args) throws CloneNotSupportedException {
	//create an object with pavan employee data
		
		Employee emp1 = new Employee(1, "pavan_V");
		Employee emp2 = new Employee(1, "pavan");
		//compare hashcode of two objects
		
		boolean isHashcodeSame =compareHashcode(emp1,emp2);
		
		//compare content of two objects
		boolean isObjectEquals= compareEquals(emp1,emp2);
		
		if(isHashcodeSame && isObjectEquals) {
			//System.out.println("content of two objects are same");
		}
		else {
			//System.out.println("two are diffrent objects");
		}
		
		// clone is nothing but  copy of object
		// 1.shallow clone 
		// 2. deep clone
		
		Employee emp = new Employee(1,"pavan");
		Employee emp3 = emp;//shallow clone
		emp.setDepartment("it");
		emp.setDesignation("TA");
		emp3.setDesignation("TL");
		
		//System.out.println(emp.toString());
		
		//deep clone
		Employee emp4 = new Employee(1,"pavan");
		Employee emp5=(Employee) emp4.clone();//down casting
		emp4.setDepartment("it");
		emp4.setDesignation("ta");
		System.out.println(emp4);
		emp5.setDepartment("it");
		emp5.setDesignation("qa");
		System.out.println(emp5);
		
		

	}
	
	private static boolean compareEquals(Employee emp1 , Employee emp2) {
		boolean isObjectEquals=emp1.equals(emp2);
		return isObjectEquals;
	}
	
	private static boolean compareHashcode(Employee emp1 , Employee emp2) {
		
		
		boolean isHashcodeSame = false;
		if(emp1.hashCode() == emp2.hashCode()) {
			isHashcodeSame =true;
		}
		return isHashcodeSame;
		
	}

}
