package create.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item
{
	private List<Item> mainList;
	private List<Item> sideList;
	private List<Item> drinkList;
	public static Map<String, Double> menu = new HashMap<String,Double>();
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
		buildMenu();
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
	
	void buildMenu()
	{
		menu.put("Hamburger", 4.99);
		menu.put("Cheeseburger", 5.49);
		menu.put("Wrap", 3.99);
		menu.put("Fries", 2.99);
		menu.put("Salad", 1.49);
		menu.put("Soup", 2.99);
		menu.put("Coke", 2.00);
		menu.put("Sprite", 2.00);
		menu.put("Coffee", 1.49);
	}
	//Getters
	double retrieveItemPrice(String itemName)
	{
		for (int i = 0; i < mainList.size(); i++)
		{
			if(mainList.get(i).getItemName().equals(itemName))
			{
				return mainList.get(i).getItemPrice();
			}
		}
		
		for (int i = 0; i < sideList.size(); i++)
		{
			if(sideList.get(i).getItemName().equals(itemName))
			{
				return sideList.get(i).getItemPrice();
			}
		}
		
		for (int i = 0; i < drinkList.size(); i++)
		{
			if(drinkList.get(i).getItemName().equals(itemName))
			{
				return drinkList.get(i).getItemPrice();
			}
		}
		
		return 0.0;
	}
	
	double getItemPrice()
	{
		return itemPrice;
	}
	
	String getItemName()
	{
		return itemName;
	}
	
}
