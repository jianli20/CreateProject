package create.controller;

import java.util.ArrayList;
import java.util.List;

public class Item
{
	private List<Item> mainList;
	private List<Item> sideList;
	private List<Item> drinkList;
	public double itemPrice;
	public String itemName;
	public int itemAmount;
	
	public Item(double itemPrice, String itemName)
	{
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.mainList = new ArrayList<Item>();
		this.sideList = new ArrayList<Item>();
		this.drinkList = new ArrayList<Item>();
		
		buildMain();
		buildSide();
		buildDrink();
	}
	
	void buildMain()
	
	{
		mainList.add(new Item(4.99 ,"Hamburger"));
		mainList.add(new Item(5.49, "Cheeseburger"));
		mainList.add(new Item(3.99, "Wrap"));
	}
	
	void buildSide()
	{
		sideList.add(new Item(2.99, "Fries"));
		sideList.add(new Item(1.49, "Salad"));
		sideList.add(new Item(2.99, "Soup"));
	}
	
	void buildDrink()
	{
		drinkList.add(new Item(2.00, "Coke"));
		drinkList.add(new Item(2.00, "Sprite"));
		drinkList.add(new Item(1.49, "Coffee"));
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
	
}
