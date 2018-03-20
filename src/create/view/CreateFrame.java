package create.view;

import create.controller.CreateController;
import javax.swing.JFrame;



public class CreateFrame extends JFrame
{
	private CreateController appController;
	private CreatePanel appPanel;
	
	/**
	 * Constructor, initializes the data members
	 * @param appController
	 */
	
	public CreateFrame(CreateController appController)
	{
		super();
		this.appController = appController;
		appPanel = new CreatePanel(appController);
		setupFrame();
	}
	
	/**
	 * Sets up the frame with established parameters
	 */
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setSize(721, 504);
		this.setVisible(true);
	}
	
	/**
	 * Gets app controller and returns it
	 */
	
	public CreateController getAppController()
	{
		return appController;
	}
}

