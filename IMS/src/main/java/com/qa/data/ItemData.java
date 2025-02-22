package com.qa.data;

public class ItemData {
	
	//Declaring item table data:
	private int itemID;
	private String itemName;
	private double Price;
	private int stock;
	
	//Generating the getters and setters for items table data:
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}	
}
