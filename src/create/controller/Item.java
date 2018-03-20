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
		mainList.add(4.99 ,"Hamburger");
		mainList.add(5.49, "Cheeseburger");
		mainList.add(3.99, "Wrap");
	}
	
	void buildSide()
	{
		sideList.add(2.99, "Fries");
		sideList.add(1.49, "Salad");
		sideList.add(2.99, "Soup");
	}
	
	void buildDrink()
	{
		drinkList.add(2.00, "Coke");
		drinkList.add(2.00, "Sprite");
		drinkList.add(1.49, "Coffee");
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
