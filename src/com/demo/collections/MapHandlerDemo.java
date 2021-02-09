package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class MapHandlerDemo {

	public static void main(String[] args) {
		Map<Integer,EmployeeInfo> inmap =  new HashMap();
	
		inmap.put(1,new EmployeeInfo(1, "anand", "it", 700000, 5));
		inmap.put(2,new EmployeeInfo(2, "chandu", "it", 700000, 5));
		inmap.put(3,new EmployeeInfo(3, "sowmya", "it", 700000, 5));
		
		Map<Integer,EmployeeInfo> outmap =  new HashMap();
		
		outmap.put(4,new EmployeeInfo(4, "siva", "it", 700000, 5));
		outmap.put(1,new EmployeeInfo(2, "raju", "it", 700000, 5));
		outmap.put(3,new EmployeeInfo(3, "vasu", "it", 700000, 5));
		
		
		
		

	}
	
	

}
