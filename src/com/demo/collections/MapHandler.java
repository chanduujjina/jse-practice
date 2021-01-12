package com.demo.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapHandler {

	public static void main(String[] args) {
		Map< Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "Hemendra");
		map.put(99, "Andrew");
		map.put(103, "Anish");
		map.put(18, "Mohan");
		map.put(11, "Christine");
		map.put(109, "Rebeca");
		map.put(111, "David");
		map.put(19, "Rahim");
		map.put(10, "Krishna");
		Map< Integer, String> sortedmapByKey=sortByKey("descending",map);
		System.out.println(sortedmapByKey);
		Map< Integer, String> sortedmapByvalue=sortByValue("descending",map);
		System.out.println(sortedmapByvalue);
		sortByValue1(map);
		sortByKey1(map);
		
		
	}

	private static Map<Integer,String> sortByKey(String order, Map<Integer, String> map) {
		List<Entry<Integer,String>> list = new LinkedList(map.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> val1, Entry<Integer, String> val2) {
				// TODO Auto-generated method stub
				if(order.equals("ascending")) {
				return val1.getKey().compareTo(val2.getKey());
				}
				else {
					return val2.getKey().compareTo(val1.getKey());
				}
			}
		});
		Map<Integer,String> sortedMap = new LinkedHashMap<Integer, String>();
		for(Entry<Integer,String> entryset :list) {
			sortedMap.put(entryset.getKey(), entryset.getValue());
		}
		return sortedMap;
	}

	private static void sortByKey1(Map<Integer, String> map) {
		Map< Integer, String> ascendingOrder = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x1,x2)->x1,LinkedHashMap :: new));
		System.out.println("sort by key ascendingOrder::"+ascendingOrder);
		Map< Integer, String> descendingOrder = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(x1,x2)->x2,LinkedHashMap::new));
		System.out.println("sort by key descendingOrder::"+descendingOrder);
	}

	private static void sortByValue1(Map<Integer, String> map) {
		Map< Integer, String> ascendingOrder =map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldvalue,newvalue)->oldvalue,LinkedHashMap::new));
		System.out.println("sort by value ascending::"+ascendingOrder);
		Map< Integer, String> descendingOrder =map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldvalue,newvalue)->oldvalue,LinkedHashMap::new));
		System.out.println("sort by value descendingOrder::"+descendingOrder);
		
	}

	private static Map< Integer, String> sortByValue(String order, Map<Integer, String> map) {
		
		List<Entry<Integer,String>> list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> map1, Entry<Integer, String> map2) {
				// TODO Auto-generated method stub
				if(order.equals("acending")) {
				return map1.getValue().compareTo(map2.getValue());
				}
				else {
					return map2.getValue().compareTo(map1.getValue());
				}
			}
			
		}
		);
		//System.out.println(list);

		Map< Integer, String> sortedmap=new LinkedHashMap<Integer, String>();
		for(Entry<Integer, String> entry :list) {
			sortedmap.put(entry.getKey(), entry.getValue());
		}
		return sortedmap;
	}
	
	

}
