package com.demo.designPatterns;

public class ShapeFactory {
	
	public static final String TRIANGLE = "triangle";
	public static final String SQUARE = "square";
	public static final String RECTANGLE = "rectangle";

	public Shape getShape(String shape) {
		
		if(shape== null) {
			return null;
		}
		if(shape.equals(RECTANGLE)) {
			return new Rectangle();
		}
		else if(shape.equals(SQUARE)) {
			return new Sqaure();
		}
		
		else if(shape.equals(TRIANGLE)) {
			return new Triangle();
		}
		
		return null;
	}

}
