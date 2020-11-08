package com.demo.oops;

public class Admin extends Employee{
	
	@Override
	public String toString() {
		return "Admin [access=" + access + "]";
	}



	public void setAccess(String access) {
		this.access = access;
	}

	

	public String getAccess() {
		return access;
	}
    private String access;//read access and wrtire
	
	
	

}
