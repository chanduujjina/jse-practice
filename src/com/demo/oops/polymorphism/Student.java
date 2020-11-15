package com.demo.oops.polymorphism;

import com.demo.dto.Profile;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private int id;
	
	private String name;
	
	
	public Profile getStudentProfie() {
		return new Profile("maths,physics", 10, "average");
	}
	
	public String getStudentSection() {
		return "1A";
	}

}

