package create.controller;

import java.util.List;
import create.view.CreateFrame;
import create.controller.Item;

public class CreateController
{
	private CreateFrame appFrame;
	private Item item;
	double total = 0;
	
	
	public void start()
	{
	
	}
	
	public CreateController()
	{
		appFrame = new CreateFrame(this);
		item = new Item(0.0, "");
	}	
	
	public double boughtItems()
	{
		double boughtItems = 0;
		
		boughtItems += item.getItemPrice();
		
		return boughtItems;
	}
	
	public double addTotal()
	{
		total += boughtItems();
		
		
		
		return total;
	}
}


