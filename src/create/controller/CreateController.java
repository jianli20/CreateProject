package create.controller;

import java.util.ArrayList;
import java.util.List;
import create.view.CreateFrame;
import create.controller.Item;

public class CreateController
{
	private CreateFrame appFrame;
	private Item item;
	public double total = 0;
	public List<Item> allItems = new ArrayList<Item>();
	public List<Item> boughtItems = new ArrayList<Item>();
	
	public boolean addItem(int amount)
	{
		
		for (int i = 0; i < allItems.size(); i++)
		{
			
		}
	}
	public void start()
	{
	
	}
	
	public CreateController()
	{
		appFrame = new CreateFrame(this);
		item = new Item(0.0, "");
	}	
	

	public double updateTotal()
	{
		total += boughtItems.get(boughtItem.size() - 1).getPrice() * boughtItems.get(boughtItem.size() - 1).getAmount();
		return total;
	}
	
	public double getTotal()
	{
		return total;
	}
}


