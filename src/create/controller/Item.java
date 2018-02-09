package create.controller;

public class Item
{
	public double itemPrice;
	public String itemName;
	public int itemStock;
	public int itemIdentifier;
	
	public Item(double itemPrice, String itemName, int itemStock, int itemIdentifier)
	{
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.itemStock = itemStock;
		this.itemIdentifier = itemIdentifier;		
	}
	
	//Getters
	double getItemPrice()
	{
		return itemPrice;
	}
	
	String getItemName()
	{
		return itemName;
	}
	
	int getItemStock()
	{
		return itemStock;
	}
	
	int getItemIdentifier()
	{
		return itemIdentifier;
	}
	
	//Will update the stock amount if changed
	public void updateStock(int itemStock)
	{
		this.itemStock = itemStock;
	}
}
