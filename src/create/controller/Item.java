package create.controller;

public class Item
{
	public double itemPrice;
	public String itemName;
	public int itemAmount;
	
	public Item(double itemPrice, String itemName, int itemAmount)
	{
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.itemAmount = itemAmount;		
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
	
	int getItemAmount()
	{
		return itemAmount;
	}
	
}
