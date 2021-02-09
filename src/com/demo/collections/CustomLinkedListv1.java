package com.demo.collections;

public class CustomLinkedListv1 {
	
	@Override
	public String toString() {
		return "CustomLinkedListv1 [head=" + head + ", tail=" + tail + "]";
	}


	private Node head;
	
	private Node tail;
	
	public Node head() {
		return head;
	}
	
	public Node tail() {
		return tail;
	}
	
	//create constructor
	
	public CustomLinkedListv1() {
		this.head = new Node("head");
		this.tail= head;
	}
	
	public void add(Node node) {
		tail.next=node;
		tail=node;
	}
	
	
	public static class Node{
		@Override
		public String toString() {
			return "Node [next=" + next + ", data=" + data + "]";
		}

		private Node next;
		
		private String data;
		
		//just one next method
		
		public Node next() {
			return next;
		}
		
		//create a constructor
		
		public Node(String data) {
			this.data =data;
		}
	}

}
