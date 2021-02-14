package com.demo.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetHandler {

	public static void main(String[] args) throws Exception {
		/*Set set= new HashSet();
		
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
		}*/
		
		
		// add elements to the set
		
		Set<String> namesSet = getListOfCities();
		System.out.println(namesSet);
		
		//iterate the set using java 7
		
		for(String name:namesSet) {
			System.out.println(name);
		}
		//remove the element from set
		namesSet.remove("munmbai");
		System.out.println("nameset after remove element:"+namesSet);
		
		//sort the elements from set
		
		List<String> sortedNameSet = namesSet.stream().sorted(new Comparator<String>() {

			@Override
			public int compare(String val1, String val2) {
				// TODO Auto-generated method stub
				return val1.compareTo(val2);
			}
			
		}).collect(Collectors.toList());
		//System.out.println("sorting name set::"+sortedNameSet);
		
		//sort the elements from set using lambda
		List<String> sortedNameSet_ascending = namesSet.stream().sorted((val1,val2)->val1.compareTo(val2)).collect(Collectors.toList());
		System.out.println("sorting name set using lambda::"+sortedNameSet_ascending);
		
		//sort the elements in reverse from set using lambda
		
		List<String> sortedNameSet_descending = namesSet.stream().sorted((val1,val2)->val2.compareTo(val1)).collect(Collectors.toList());
		System.out.println("sorting name set using lambda::"+sortedNameSet_descending);
		
		
		
		//iterate the set jav8
		//namesSet.stream().forEach(name -> System.out.println(name));
		

	}
	
	private static Set<String> getListOfCities(){
		Set<String> set= new HashSet();
		set.add("hyderabd");
		set.add("bangalore");
		set.add("chennai");
		set.add("pune");
		set.add("munmbai");
		return set;
	}
	
	
}
