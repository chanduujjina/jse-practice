package com.demo.oops;

import java.util.ArrayList;
import java.util.List;

public class TestOpps {

	public static void main(String[] args) {
		//Student std = new Student(1, "chandu", "it");
		//System.out.println(std);
		
		//set data of admin team
		
		/*
		 * Admin admin =new Admin(); admin.setId(1); admin.setName("admin1");
		 * admin.setSalary(10000); admin.setDeptment("admin_default");
		 * admin.setAccess("read/wrire");
		 * 
		 * 
		 * Admin admin1 =new Admin(); admin1.setId(1); admin1.setName("admin2");
		 * admin1.setSalary(10000); admin1.setDeptment("admin_default");
		 * admin1.setAccess("read");
		 * 
		 * List<Admin> list = new ArrayList<>(); list.add(admin1); list.add(admin);
		 * System.out.println(list);
		 * 
		 * 
		 * //developer
		 * 
		 * Developer dev1 = new Developer(); dev1.setId(1); dev1.setName("chandu");
		 * dev1.setSalary(10000); dev1.setDeptment("admin_default"); dev1.setRole("TA");
		 * dev1.setDevsikllset("java,reactjs");
		 * 
		 * System.out.println(dev1.getName());
		 */
		
		GearVehicle gerGearVehicle = new  GearVehicle(4, "front", "100 ","bs6", "splendor", "gear vehcle");
		System.out.println("gear vehicel name:"+gerGearVehicle.getVehicleName());
		System.out.println("number of gears:"+gerGearVehicle.getNumberofGears());
		
		WithoutGearVehicle   without = new WithoutGearVehicle("dignol turn swith up", "dignol turn swith down", "125 ","bs6", "activa125", "non gear vehcle");
		
		System.out.println("non gear vehicel name:"+without.getVehicleName());
		System.out.println("seat direction:"+without.getSeatopenopedirection());

	}

}
