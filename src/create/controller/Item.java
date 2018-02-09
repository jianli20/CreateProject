package create.controller;

public class Item
{
	public double itemPrice;
	public String itemName;
	public int itemIdentifier;
	
	public Item(double itemPrice, String itemName, int itemIdentifier)
	{
		this.itemPrice = itemPrice;
		this.itemName = itemName;
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
	
	int getItemIdentifier()
	{
		return itemIdentifier;
	}
	
}
