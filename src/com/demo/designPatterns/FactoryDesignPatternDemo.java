package com.demo.designPatterns;

public class FactoryDesignPatternDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
	    Shape shape1 =	shapeFactory.getShape("rectangle");
	   //Shape shape = new Rectangle()
	    
	    shape1.drawshape();
	    
	    Shape shape2 = shapeFactory.getShape("square");
	    
	    shape2.drawshape();
	    
        Shape shape3 = shapeFactory.getShape("triangle");
	    
        shape3.drawshape();
	
	}

}
