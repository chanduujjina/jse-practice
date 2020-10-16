package com.demo.dto;

public class Student {
	
	public Student(int rollNo, String name, String branchName, String section) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branchName = branchName;
		this.section = section;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branchName=" + branchName + ", section=" + section
				+ "]";
	}

	private int rollNo;//instance  variables
	
	private String name;
	
	private  String branchName;
	
	private String section;
	
	//setter method
	//purpose of this method is to set data into rollNo(instance variable)

	public void setNo(int no) {
		this.rollNo=no;
	};
	
	//gettter method
	public int getNo() {
		return this.rollNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}
	
	//default constructor
	public  Student() {
		super();
	}
	
	//parameterized constructor
	
	public Student(int rollNo ,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
}
