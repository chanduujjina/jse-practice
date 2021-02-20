package com.demo.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapHandler {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap();
		
		//adding values to the Map
		
		map.put(1,"chandu");
		map.put(2, "balu");
		map.put(3, "pavan");
		map.put(4, "vinod");
		map.put(6, "chari");
		map.put(5, "suresh");
		map.put(6, "suresh");
		
		
		
		System.out.println(map);
		
		
		//get the value by given key
		String name =map.get(1);
		System.out.println("value::"+name);
		
		
		//fetch the elements from the map
		Set<Map.Entry<Integer, String>> entryset= map.entrySet();
		
		for(Map.Entry<Integer, String> entry :map.entrySet()) {
			//System.out.println("key :"+entry.getKey()+" value::"+entry.getValue());
		}
		
		
		//fetch elements using java8
		
		map.entrySet().stream().forEach(entry->System.out.println("key::"+entry.getKey()+"value::"+entry.getValue()));
		
		//sort the elements from the Map by value Using collections in acending order
		  List<Entry<Integer,String>> ascendinglistByValue =	getSortedValueByValue(map.entrySet(),"ascending");
		
		  //System.out.println("ascendinglistByValue::"+ascendinglistByValue);
		  
		  List<Entry<Integer,String>> desscendinglistByValue =	getSortedValueByValue(map.entrySet(),"descending");
		  
		 // System.out.println("desscendinglistByValue::"+desscendinglistByValue);
		  
		  List<Entry<Integer,String>> ascendinglistByKey =	getSortedValueByKey(map.entrySet(),"ascending");
			
		  //System.out.println("ascendinglistByKey::"+ascendinglistByKey);
		  
		  List<Entry<Integer,String>> desscendinglistByKey =	getSortedValueByKey(map.entrySet(),"descending");
		  
		 // System.out.println("desscendinglistByKey::"+desscendinglistByKey);
		  
		  
		  Map< Integer, String> ascendingOrderbyvaluejava8 =	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
				  collect(Collectors.toMap(Map.Entry ::getKey, Map.Entry ::getValue,(k,v)->k,LinkedHashMap :: new ));
		  
		  System.out.println("ascendingOrderbyvaluejava8::"+ascendingOrderbyvaluejava8);
		  
		  Map< Integer, String> descendingOrderbyvaluejava8 =	 map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
		  collect(Collectors.toMap(Map.Entry ::getKey, Map.Entry::getValue,(k,v)->k,LinkedHashMap::new));
		  
		  System.out.println("descendingOrderbyvaluejava8::"+descendingOrderbyvaluejava8);
		  
		  Map< Integer, String> ascendingOrderbykeyjava8 =  map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry ::getKey, Map.Entry::getValue,(k,v)->k,LinkedHashMap::new));
		  Map< Integer, String> descendingOrderbykeyjava8 =map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry ::getKey, Map.Entry::getValue,(k,v)->k,LinkedHashMap::new));
		  System.out.println("ascendingOrderbykeyjava8::"+ascendingOrderbykeyjava8);
		  System.out.println("descendingOrderbykeyjava8::"+descendingOrderbykeyjava8);
		  
		  //convert HashMap to Linked HashMap
		  
		 LinkedHashMap<Integer, String> linkedHashMap =map.entrySet().stream().collect(Collectors.toMap(Entry ::getKey, Entry :: getValue,(k,v)->k,LinkedHashMap::new));
		 System.out.println("linkedHashMap::"+linkedHashMap);
		  
		  
		  
		
		
}
	
	
	private static List<Entry<Integer,String>> getSortedValueByKey(Set<Map.Entry<Integer, String>> entryset ,String order){
	       List<Entry<Integer,String>> list = new LinkedList(entryset);
	       
	       if(order.equals("ascending")) {
			
			Collections.sort(list, new Comparator<Entry<Integer,String>>() {

				@Override
				public int compare(Entry<Integer, String> val1, Entry<Integer, String> val2) {
					// TODO Auto-generated method stub
					return val1.getKey()-val2.getKey();
				}
				
			});
	       }
	       else if(order.equals("descending")) {
	   		Collections.sort(list, new Comparator<Entry<Integer,String>>() {

				@Override
				public int compare(Entry<Integer, String> val1, Entry<Integer, String> val2) {
					// TODO Auto-generated method stub
					return val2.getKey()-val1.getKey();
				}
				
			});
	       }
			
			return list;
		}
	
	private static List<Entry<Integer,String>> getSortedValueByValue(Set<Map.Entry<Integer, String>> entryset ,String order){
       List<Entry<Integer,String>> list = new LinkedList(entryset);
       
       if(order.equals("ascending")) {
		
		Collections.sort(list, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> val1, Entry<Integer, String> val2) {
				// TODO Auto-generated method stub
				return val1.getValue().compareTo(val2.getValue());
			}
			
		});
       }
       else if(order.equals("descending")) {
   		Collections.sort(list, new Comparator<Entry<Integer,String>>() {

			@Override
			public int compare(Entry<Integer, String> val1, Entry<Integer, String> val2) {
				// TODO Auto-generated method stub
				return val2.getValue().compareTo(val1.getValue());
			}
			
		});
       }
		
		return list;
	}
	
	 
	


}
