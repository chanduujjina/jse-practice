package com.demo.oops.polymorphism;

public class Item {
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType + "]";
	}

	public int getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public Item(int itemId, String itemName, String itemType) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
	}

	private int itemId;
	
	private String itemName;
	
	private String itemType;
	

}
