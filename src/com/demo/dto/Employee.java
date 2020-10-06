package com.demo.dto;

public class Employee {
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
// getter
	public String getName() {
		return name;
	}
//setter
	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	private int id;//instance variable
	
	private String name;
	
	private long salary;
	
	private int height;
	
	private int weight;
	
	
	//setters and getters
	
	//using parameterized constructor with three parameters
	public Employee(int id,String name,long salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	//using parameterized constructor with two parameters
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	public Employee(int id,String name,int height,int weight) {
		this.id=id;
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}
	
	
	
	//default constructor
	
   public Employee() {
		super();
	}
	
	
	
	

}
