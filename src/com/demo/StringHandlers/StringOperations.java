package com.demo.StringHandlers;

public class StringOperations {

	public static void main(String[] args) {
		// first way
		//String pool
		String s1 = "pavan is a lecturer";
		
		
		//String pool
		String s2 ="pavan is a lecturer";
		
		// it will store in heap area
		String s3 = new  String("pavan is a lecturer").intern();
		// == method will compare the reference
		//intern method will store value in object which resides in heap memory will copy the same to string pool
		boolean val= s1==s2 ? true : false;
		
		System.out.println("s1==s2 is "+val);
		
		boolean val1= s1==s3 ? true : false;
		System.out.println("s1==s3 is "+val1);
		
		
		//equals method will compare the content
		
		boolean val3= s1.equals(s3) ? true:false;
		System.out.println("s1 equals s3 is "+val3);
		
		// string concatenate
		
		String s4 ="chandu is a programmer";
		
       s4 =s4+"in infosys";
		
		
		

	}

}
