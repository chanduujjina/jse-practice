package com.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionsDemo {

	public static void main(String[] args) {
		//heterogenous mixture
		/*List  heterogiousmixtureCollections = Arrays.asList(1,"123",123.56,2f);
		
		//reading element from the collection using iterator
		Iterator itr =heterogiousmixtureCollections.iterator();
		//[[1],[2]]
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//reading element from the collection using foreach
		
		for(Object obj:heterogiousmixtureCollections) {
			System.out.println(obj);
		}
		*/
		
		List<Integer>  numberList = Arrays.asList(1,7,14,13,19, 11,10);
		//getElementsfromtheCollections(numberList);
		//getElementsfromtheCollectionsInBothDirections(numberList,"forward");
		//getElementsfromtheCollectionsInBothDirections(numberList,"backward");
		
		
		
		//find max value from list
		//getMaxorMinValfromCollection(numberList,"max");
		
		//find max value from list
		//getMaxorMinValfromCollection(numberList,"min");
		
		//reverse the list
		//Collections.reverse(numberList);
		//System.out.println(numberList);
		
		//sort the list using collections in  ascending order
		//Collections.sort(numberList);
		//System.out.println(numberList);
		
		//sort the list using collections in  descending order
		SortNumberCollectionByOrder("descending",numberList);
		//sort the list using collections in  ascending order
		SortNumberCollectionByOrder("ascending",numberList);
		
		//names list
		List<String> nameList = Arrays.asList("pavan","chandu","anand","balu","vinod");
		//SortNameCollectionByOrder("descending",nameList);
		//SortNameCollectionByOrder("ascending",nameList);
		SortNameCollectionByOrder8("descending",nameList);
		SortNameCollectionByOrder8("ascending",nameList);
			
}
	
	private static void getElementsfromtheCollectionsInBothDirections(List<Integer> numberList, String direction) {
		ListIterator<Integer> listItr= numberList.listIterator();
		if(direction.equalsIgnoreCase("forward")) {
			
			while(listItr.hasNext()) {
				System.out.println(listItr.next());
			}
		}
		
		else if (direction.equalsIgnoreCase("backward")) {
			while(listItr.hasPrevious()) {
				System.out.println(listItr.previous());
			}
		}
		
	}

	//pupose of this method is to fetch the elements from the collection using iterator
	private static void getElementsfromtheCollections(List<Integer> numberList) {
		Iterator<Integer> itr= numberList.iterator();
		//apporach one while loop
		/*while(itr.hasNext()) {
			int value = itr.next();
			System.out.println(value);
		}*/
		
		
		//approach 2 using for each loop
		for(Integer val :numberList) {
			System.out.println(val);
		}
		
		
	}
	
	


	private static int getMaxorMinValfromCollection(List<Integer>  numberList,String priority) {
		int value=0;
		if(priority.equalsIgnoreCase("max")) {
			value= Collections.max(numberList);
			System.out.println("maxvalue:"+value);
		}
		else {
			value= Collections.min(numberList);
			System.out.println("minvalue:"+value);
		}
		return value;
	}

	private static void SortNumberCollectionByOrder(String order, List<Integer> numberList) {
		if(order.equalsIgnoreCase("descending")) {
		Collections.sort(numberList, new Comparator<Integer>() {

			@Override
			public int compare(Integer val1, Integer val2) {
				return val2-val1;
				
			}
		});
		System.out.println("numberlist descending order:"+numberList);
		}
		else if(order.equalsIgnoreCase("ascending")) {
				Collections.sort(numberList, new Comparator<Integer>() {

					@Override
					public int compare(Integer val1, Integer val2) {
						return val1-val2;
						
					}
				});
		
		System.out.println("numberlist ascending order:"+numberList);
		}
		
	}
	
	private static void SortNameCollectionByOrder(String order, List<String> nameList) {
		if(order.equalsIgnoreCase("descending")) {
		Collections.sort(nameList, new Comparator<String>() {

			@Override
			public int compare(String val1, String val2) {
				return val2.compareTo(val1);
				
			}
		});
		System.out.println("name list descending order:"+nameList);
		}
		else if(order.equalsIgnoreCase("ascending")) {
			Collections.sort(nameList, new Comparator<String>() {

				@Override
				public int compare(String val1, String val2) {
					return val1.compareTo(val2);
					
				}
			});
		
		System.out.println("name list ascending order:"+nameList);
		}
		
	}
	
	private static void SortNameCollectionByOrder8(String order, List<String> nameList) {
		if(order.equalsIgnoreCase("descending")) {
		List<String> list =nameList.stream().sorted((val1,val2)->val2.compareTo(val1)).collect(Collectors.toList());
		System.out.println("descending order:"+list);
		}
		else if(order.equalsIgnoreCase("ascending")){
			List<String> list1 = nameList.stream().sorted((val1,val2)->val1.compareTo(val2)).collect(Collectors.toList());
			System.out.println("ascending order:"+list1);
		}
	}

}
