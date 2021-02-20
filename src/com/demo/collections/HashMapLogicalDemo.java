package com.demo.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapLogicalDemo {

	public static void main(String[] args) {
		
		String sentance ="test is word but test is string";
		
		String words [] =sentance.split(" ");
		//{"test","is"}
		
		Map<String,Integer> map = new HashMap();
		
		for(String str :words) {
			
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str,1);
			}
		}
      System.out.println(map);
      
    Map<String,Long> responseMap =Arrays.stream(words).collect(Collectors.groupingBy(x->x,Collectors.counting()));
    System.out.println("responseMap::"+responseMap);
    
   
	}

}
