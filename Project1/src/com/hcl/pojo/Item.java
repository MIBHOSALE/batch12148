package com.hcl.pojo;

public class  Item  extends Product{
	private String itemName;
	private String category;
	private String buyingPrice;
	

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {	
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(String buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	 
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", category=" + category + ", buyingPrice=" + buyingPrice + "]";
	}
	
	

	public Item(int productId, String productName, double sellingPrice, int availableQuantity, String itemName,
			String category, String buyingPrice) {
		super(productId, productName, sellingPrice, availableQuantity);
		this.itemName = itemName;
		this.category = category;
		this.buyingPrice = buyingPrice;
	}
	
 
	public static void main(String[] args) {

	}

}
