package com.demo.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListHandler {

	public static void main(String[] args) {
		//create a linked list
		
		LinkedList<Integer> numberList = new LinkedList();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.addFirst(0);
		numberList.addLast(4);
	
		int middleindex=numberList.size()/2;
		numberList.add(middleindex, 5);
		System.out.println(numberList);
		
		int firstNumber=numberList.getFirst();
		
		System.out.println("firstNumber:"+firstNumber);
		
		int lastNumber=numberList.getLast();
		System.out.println("lastNumber:"+lastNumber);
		
		int peek = numberList.peek();
		System.out.println("peek::"+peek);
		
		int peekFirst =numberList.peekFirst();
		System.out.println("peekFirst::"+peekFirst);
		
		int peekLast = numberList.peekLast();
		System.out.println("peekLast::"+peekLast);
		
		int pollLast = numberList.pollLast();
		System.out.println("pollLast::"+pollLast);
		System.out.println(numberList);
		
		

	}

}
