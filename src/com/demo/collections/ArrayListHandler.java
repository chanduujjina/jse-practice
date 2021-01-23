package com.demo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListHandler {
public static void main(String[] args) {
	//create List of names using ArrayList and add elements to it
	List<String> nameList = buildNameList();
	
	//fetch elements from the list
	
	//getNamesfromList(nameList);
	
	//find the name in the list
	boolean ispresent = getNameFromNameList("phani",nameList);
	//System.out.println(ispresent);
	
	//remove the name from List
	
		//boolean isremoved = nameList.remove("chandu");
		//System.out.println(isremoved);
		
		//update the element in list
		int index =nameList.indexOf("pavan");
		
		nameList.remove("pavan");
		nameList.add(index,"pavanKumar");
		
		System.out.println(nameList);
		
		//sort name list comparator java8 descending order
		nameList.sort((a,b)->b.compareTo(a));
		System.out.println("descending order:"+nameList);
		
		//sort name list comparator java8 ascending order
		nameList.sort((a,b)->a.compareTo(b));
		System.out.println("ascending order:"+nameList);
		
		//find the name in the list which starts with v 
		String value =nameList.stream().filter(name->name.startsWith("v")).findFirst().get();
		System.out.println(value);
		
		//find the name in the list which starts with v and P
		List<String> filteredList =nameList.stream().filter(name->name.startsWith("v") ||  name.startsWith("p")||name.endsWith("u")).collect(Collectors.toList());
		System.out.println(filteredList);
		
		
	
	
}

private static boolean getNameFromNameList(String name,List<String> nameList) {
	return nameList.contains(name);
}

private static void getNamesfromList(List<String> nameList) {
	
	for(String name :nameList) {
		System.out.println(name);
	}
}

private static List<String> buildNameList() {
	List<String> nameList = new ArrayList();
	nameList.add("anand");
	nameList.add("balu");
	nameList.add("chandu");
	nameList.add("pavan");
	nameList.add("vinod");
	return nameList;
}


}
