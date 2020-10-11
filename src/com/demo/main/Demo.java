package com.demo.main;

import com.demo.dto.Employee;
import com.demo.utility.ComputeUtility;

public class Demo {

	private String name;
	private String nAme;
	
	private int rollNo;
	
	private int rollno;
	
	
	
	
	public static void main(String[] args) {
		//create object
		/*Employee  emp = new  Employee();
		
		//set data into object
		emp.setId(1);
		emp.setName("Pavan");
		emp.setSalary(100000l);*/
		
		//set data into object using constructior
		Employee  emp = new  Employee(1,"pavan",150,75);
		
		//get data from object
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());	
		
		
		//craete object for ComputeUtility
		//calculate bmi
		ComputeUtility utility = new ComputeUtility(); 
		int bmi=utility.calculateBMI(emp.getWeight(), emp.getHeight());
		System.out.println("bmi:"+bmi);
		
		String result=utility.getResult(bmi);
		System.out.println(result);
		
		
	}
	
	
}
