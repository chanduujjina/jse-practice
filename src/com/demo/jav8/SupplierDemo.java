package com.demo.jav8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier supplier = ()->3;
		//System.out.println(supplier.get());
		
		List numberList = Arrays.asList();
		
		 System.out.println(numberList.stream().findAny().orElseGet(()->4));
		

	}

	
}
