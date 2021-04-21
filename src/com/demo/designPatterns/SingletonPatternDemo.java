package com.demo.designPatterns;

public class SingletonPatternDemo {
	
	private static SingletonPatternDemo patternDemo = new SingletonPatternDemo();
	
	//private constructor
	private SingletonPatternDemo() {
		
	}
	
	public static SingletonPatternDemo getInstance() {
		return patternDemo;
	}
	
	public void showMessage() {
		System.out.println("inside showMessage::");
	}

}
