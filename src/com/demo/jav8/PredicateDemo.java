package com.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		/*Predicate<Integer> predicate = (a)-> a>100;
		System.out.println(predicate.test(1000));*/
		
		Predicate<Integer> predicate1 = (a)-> a>10;
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(numberList.stream().filter((a)->a>5 && a<7).findAny().orElse(10));

	}

	/*@Override
	public boolean test(Integer num) {
		
		return num>100;
	}*/

}
