package com.demo.dto;

public class Employee implements Cloneable{
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

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
	
	private String department;
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private String designation;
	
	
	
	//setters and getters
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

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
	
  
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
	

}
