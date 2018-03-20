package create.controller;

import java.util.List;
import create.view.CreateFrame;
import create.controller.Item;

public class CreateController
{
	private CreateController appController;
	private CreateFrame appFrame;
	private Item appItem;

	public void start()
	{
	
	}
	
	public CreateController()
	{
		appController = new CreateController();
		appFrame = new CreateFrame(this);
		appItem = new Item(0.0, "");
		
		
	}	
}


