package com.demo.main;

import com.demo.dto.Student;

public class Demo1 {

	public static void main(String[] args) {
		//instantiate object
		
		//Student s1 = new Student();
		
		//set data into object
		
		//s1.setNo(1);
		
		//s1.setName("pavan");
		
		//System.out.println(s1.toString());
		
		
		//instantiate object using parameterized constructor
		
		Student s2 = new Student(1,"pavan");
		System.out.println(s2.toString());
		
		
		Student s3 = new Student(1,"pavan","EEE","A");
		
		System.out.println(s3.toString());
		
		
		
		
		

	}

}
