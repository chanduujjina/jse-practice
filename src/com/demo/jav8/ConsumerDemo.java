package com.demo.jav8;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		/*Consumer consumer = t ->System.out.println("inside accept method:"+t);
		consumer.accept("chandu");*/
		
		List numberList = Arrays.asList(1,2,3,4,5,6);
		
		numberList.forEach(number->System.out.println(number));
		
		

	}

	/*@Override
	public void accept(Object t) {
		System.out.println("inside accept method:"+t);
		
	}*/
	
	
		
	
	
	

}
