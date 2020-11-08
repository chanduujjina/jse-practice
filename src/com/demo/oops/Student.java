package com.demo.oops;

public class Student {
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + "]";
	}

	//instance varibles
	private int id;
	
     private String name;
     
     private String deptName;
     
     //use seetter and getter(optional dependency)
     //constructor(mandatory dependency)
     //three arg constructor
     public Student(int id,String name ,String deptName) {
    	this(id,name);	//this should
    	 System.out.println("inside three arg constructor");
    	this.id = id;
    	this.name = name;
    	this.deptName =  deptName;
    }
     
     //two arg constructor
     public Student(int id,String name) {
    	 System.out.println("inside two arg constructor");
    	 this.id = id;
    	 this.name = name;
    	
    }
     
     

	

}
