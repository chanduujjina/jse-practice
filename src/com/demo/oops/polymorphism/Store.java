package com.demo.oops.polymorphism;

public class Store {
	
	public Item getSku() {
		return sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getWherehouseName() {
		return wherehouseName;
	}
  // 3 arg constructor
	public Store(Item sku, int quantity, String wherehouseName) {
		super();
		this.sku = sku;
		this.quantity = quantity;
		this.wherehouseName = wherehouseName;
	}
	@Override
	public String toString() {
		return "Store [sku=" + sku + ", quantity=" + quantity + ", wherehouseName=" + wherehouseName + "]";
	}

	// 2 arg constructor
	public Store(Item sku, int quantity) {
		super();
		this.sku = sku;
		this.quantity = quantity;
		
	}

	private Item sku;
	
	private int quantity;
	
	private String wherehouseName;
	
	
	public Item getItem(int itemid) {
		return new Item(1, "shitrs", "retail");
	}
	
	public Item getItem(int itemid,String itemType) {
		return new Item(1, "shitrs", "retail");
	}
	
	public Item getItem(String itemType) {
		return new Item(2, "goldring", "jewller");
	}
	
	
	 

}
