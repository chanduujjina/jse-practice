package com.demo.execption;

public class UnCheckedException {

	//static method
	public static void main(String[] args) {
		UnCheckedException  unCheckedException = new UnCheckedException();
		int result = unCheckedException.getRemainder(1, 0);
		System.out.println("result"+result);
		String value =unCheckedException.removeSpace(null);
		System.out.println("value:"+value);
		Character c = unCheckedException.getCharcter("pavan", 8);
		System.out.println("character::"+c);

	}
	//not  static method
	private int getRemainder(int a , int b) {
		int result =0;
		try {
		result= a/b;
		}
		catch(ArithmeticException  arithmeticException) {
			System.out.println("infinite value and second value never  zero");
		}
		return result;
	}
	
	private String removeSpace(String value) {
		return value != null?value.trim():"";
	}
	//pavan
	private Character getCharcter(String name,int index) {
		Character result =null;
		
		try {
			result = name.charAt(index);
		} catch (StringIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("there is no element at that index");
		}
		return result;
	}

}
