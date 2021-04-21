package com.demo.designPatterns;

public class SingletonPattrenClient {

	public static void main(String[] args) {
		SingletonPatternDemo patternDemo = SingletonPatternDemo.getInstance();
		
		System.out.println(patternDemo.hashCode());
		
		SingletonPatternDemo patternDemo1 = SingletonPatternDemo.getInstance();
		
		System.out.println(patternDemo1.hashCode());
		
		patternDemo.showMessage();
		
		
	}

}
