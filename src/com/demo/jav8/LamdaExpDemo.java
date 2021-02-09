package com.demo.jav8;

@FunctionalInterface
interface Drawble{
	void draw();
	
}

interface Sayble{
	String say();
}

interface SayblewithName{
	String say(String name);
}

interface Calculate{
	Integer add(int a,int b);
}

interface Name{
	Integer nameLenght(String name);
}

interface NameInfo{
	Integer indexof(String name);
}


public class LamdaExpDemo {

	public static void main(String[] args) {
		
		Drawble d = new Drawble() {
			
			@Override
			public void draw() {
				System.out.println("inside draw method");
				
			}
		};
		
		d.draw();
		
		//lamda expression
		//without parameter and no return value
		Drawble d1 = ()->{
			System.out.println("inside draw method lambda");
		};
		
		d1.draw();
		
		//with out parameter return value
		Sayble s = ()->"hello chandu";
		System.out.println(s.say());
		
		//with  parameter return value
		SayblewithName s2 = (name)->"hi "+name;
		System.out.println(s2.say("pavan"));
		
		//with two parameters and return value
		Calculate cal =(a,b)->a+b;
		System.out.println(cal.add(3, 4));
		
		Name name =(x)->x.length();
		System.out.println(name.nameLenght("chandu"));
		
		NameInfo info =(x)->x.indexOf("u");
		System.out.println(info.indexof("chandu"));
	}

}
