package com.demo.oops;

public class Developer extends Employee {
	
	

	@Override
	public String toString() {
		return "Developer [designation=" + designation + ", role=" + role + ", devsikllset=" + devsikllset + "]";
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setDevsikllset(String devsikllset) {
		this.devsikllset = devsikllset;
	}

	public String getDesignation() {
		return designation;
	}

	public String getRole() {
		return role;
	}

	public String getDevsikllset() {
		return devsikllset;
	}

	

	private String designation;
	
	private String role;
	
	private String devsikllset;

}
