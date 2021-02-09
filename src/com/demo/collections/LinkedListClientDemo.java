package com.demo.collections;

public class LinkedListClientDemo {

 public static void main(String[] args) {
	//create a constructor
	 
	 CustomLinkedListv1 linkedListv1 = new CustomLinkedListv1();
	 
	 linkedListv1.add(new CustomLinkedListv1.Node("1"));
	 linkedListv1.add(new CustomLinkedListv1.Node("2"));
	 linkedListv1.add(new CustomLinkedListv1.Node("3"));
	 linkedListv1.add(new CustomLinkedListv1.Node("4"));
	 linkedListv1.add(new CustomLinkedListv1.Node("5"));
	 linkedListv1.add(new CustomLinkedListv1.Node("6"));
		linkedListv1.add(new CustomLinkedListv1.Node("7"));
	 
	 System.out.println("linkedListv1::"+linkedListv1);
	 
	 //find the middle element from the linkedList
	 
	 //find the head node
	 
	 CustomLinkedListv1.Node currentNode=  linkedListv1.head();
	 CustomLinkedListv1.Node middleNode=  linkedListv1.head();
	 
	 int length =0;
	 
	 while(currentNode.next()!=null) {
		 length++;
		 if(length%2==0) {
			 middleNode= middleNode.next();
		 }
		 currentNode = currentNode.next();
	 }
	 if(length%2==1) {
		 middleNode= middleNode.next(); 
	 }
	 System.out.println(middleNode);
	 
 }
}
