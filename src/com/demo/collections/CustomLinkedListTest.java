package com.demo.collections;

public class CustomLinkedListTest {

	public static void main(String[] args) {
	
		CustomLinkedList linkedList = new CustomLinkedList();
		
		//add elements to the linkedList
		// node 1 head
		linkedList.add(new CustomLinkedList.Node("1"));
		linkedList.add(new CustomLinkedList.Node("2"));
		linkedList.add(new CustomLinkedList.Node("3"));
		linkedList.add(new CustomLinkedList.Node("4"));
		linkedList.add(new CustomLinkedList.Node("5"));
		linkedList.add(new CustomLinkedList.Node("6"));
		linkedList.add(new CustomLinkedList.Node("7"));
		
		System.out.println("linkedList::"+linkedList);
		
		//find the middle element from the custom linked list
		
		CustomLinkedList.Node head =linkedList.head();
		//sequential order
		CustomLinkedList.Node current = head;
		
		//even order
		CustomLinkedList.Node middle = head;
		
		int length = 0;
		
		while(current.next()!=null) {
			length++;
			if(length % 2 == 0) {
				middle = middle.next();
			}
			current =current.next();
		}
		if(length % 2 == 1) {
			middle = middle.next();
		}
		System.out.println("length of the linkedlist::"+length);
		System.out.println("middle node of the linked list::"+middle);

	}

}
