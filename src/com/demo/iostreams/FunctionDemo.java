package com.demo.iostreams;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Integer stringLength = getVlaue(name->name.length(),"chandu");
		Integer indexval=getVlaue(name->name.indexOf("c"),"chandu");
		System.out.println("stringLength::"+stringLength);
		System.out.println("indexval::"+indexval);
		
		Double powervalue = getValue((a,b)->Math.pow(a, b),2,4);
		System.out.println("powervalue::"+powervalue);
		
		//power of the value is 16.0
		// "16.0"
		String valueasstr= getValueAsString((a,b)->Math.pow(a, b),2,4,(r)->"power value is :"+String.valueOf(r));
		System.out.println("valueasstr::"+valueasstr);
		
		
	}
	
	private static Integer getVlaue(Function<String, Integer> func,String name) {
		return func.apply(name);
	}
	
	private static Double getValue(BiFunction<Integer, Integer, Double> bifunc,Integer a,Integer b) {
		return bifunc.apply(a, b);
	}
	
	private  static String getValueAsString(BiFunction<Integer, Integer, Double> bifunc,Integer a,Integer b,Function<Double, String> func) {
		return bifunc.andThen(func).apply(a, b);
	}

}
