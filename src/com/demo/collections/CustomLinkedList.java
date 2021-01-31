package com.demo.collections;

public class CustomLinkedList {
	
	@Override
	public String toString() {
		return "CustomLinkedList [head=" + head + ", tail=" + tail + "]";
	}


	private Node head;
	private Node tail;
	
	//create constructor for CustomLinkedList
	
	public CustomLinkedList() {
		head = new Node("head");
		tail = head;
	}
	
	public void add(Node node) {
		tail.next = node;
		tail = node;
	}
	
	public Node head() {
		return head;
	}
	
	public Node tail() {
		return tail;
	}
	
	
	public static class Node {
		@Override
		public String toString() {
			return "Node [next=" + next + ", data=" + data + "]";
		}

		private Node next;
		private String data;
		
		//consturctor for Node
		public Node(String data) {
			this.data = data;
		}
		
		public Node next() {
			return next;
		}
	}

}
