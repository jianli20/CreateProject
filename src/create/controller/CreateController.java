package create.controller;

import java.util.List;
import create.view.CreateFrame;
import create.controller.Item;

public class CreateController
{
	private CreateFrame appFrame;
	private Item item;

	public void start()
	{
	
	}
	
	public CreateController()
	{
		appFrame = new CreateFrame(this);
		item = new Item(0.0, "");
	}	
	
	private int addTotal(Item mainList, Item sideList, Item drinkList)
	{
		int total = 0;
		return total;
	}
}


