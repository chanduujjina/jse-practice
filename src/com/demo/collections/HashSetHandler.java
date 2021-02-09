package com.demo.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetHandler {

	public static void main(String[] args) throws Exception {
		Set set= new HashSet();
		
		//write a program to find elements existing or not in collection
		//if elements is not there add it if it present throw some exception
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		if(set.add(7)) {
			System.out.println("new element added::");
		}
		else {
			throw  new Exception("element already added");
		}
		
		

	}
	
	
}
