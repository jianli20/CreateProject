package create.view;

import create.controller.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreatePanel extends JPanel
{
	private CreateController appController;
	private SpringLayout appLayout;
	
	private JTextField nameField;
	private JTextField priceField;
	private JTextField drinkField;
	private JTextField totalField;
	
	private JButton hamburgerButton;
	private JButton cheeseburgerButton;
	private JButton wrapButton;
	private JButton saladButton;
	private JButton friesButton;
	private JButton soupButton;
	private JButton cokeButton;
	private JButton spriteButton;
	private JButton coffeeButton;



	public CreatePanel(CreateController appController)
	{
		super();
		this.appController = appController;
		this.appLayout = new SpringLayout();
		
		nameField = new JTextField();
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 20, SpringLayout.WEST, this);
		priceField = new JTextField();
		appLayout.putConstraint(SpringLayout.NORTH, priceField, 97, SpringLayout.NORTH, this);
		drinkField = new JTextField();
		appLayout.putConstraint(SpringLayout.NORTH, drinkField, 184, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, drinkField);
		appLayout.putConstraint(SpringLayout.WEST, drinkField, 10, SpringLayout.WEST, this);
		
		totalField = new JTextField();
		appLayout.putConstraint(SpringLayout.WEST, totalField, 157, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, totalField, -78, SpringLayout.SOUTH, this);
		

		hamburgerButton = new JButton("Hamburger");
		appLayout.putConstraint(SpringLayout.SOUTH, hamburgerButton, -419, SpringLayout.SOUTH, this);
		cheeseburgerButton = new JButton("Cheeseburger");
		appLayout.putConstraint(SpringLayout.WEST, cheeseburgerButton, 25, SpringLayout.EAST, hamburgerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, cheeseburgerButton, -419, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, hamburgerButton, 0, SpringLayout.NORTH, cheeseburgerButton);
		appLayout.putConstraint(SpringLayout.NORTH, cheeseburgerButton, 33, SpringLayout.NORTH, this);
		wrapButton = new JButton("Wrap");
		appLayout.putConstraint(SpringLayout.EAST, cheeseburgerButton, -25, SpringLayout.WEST, wrapButton);
		appLayout.putConstraint(SpringLayout.WEST, wrapButton, 604, SpringLayout.WEST, this);

		

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.add(nameField);
		this.add(priceField);
		this.add(drinkField);
		this.add(totalField);
		
		this.add(hamburgerButton);
		this.add(cheeseburgerButton);
		this.add(wrapButton);
		spriteButton = new JButton("Sprite");
		this.add(spriteButton);
		coffeeButton = new JButton("Coffee");
		
		this.add(coffeeButton);
		cokeButton = new JButton("Coke");
		appLayout.putConstraint(SpringLayout.WEST, cokeButton, 319, SpringLayout.EAST, drinkField);
		appLayout.putConstraint(SpringLayout.EAST, cokeButton, -25, SpringLayout.WEST, spriteButton);
		appLayout.putConstraint(SpringLayout.NORTH, spriteButton, 0, SpringLayout.NORTH, cokeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, spriteButton, 0, SpringLayout.SOUTH, cokeButton);
		appLayout.putConstraint(SpringLayout.SOUTH, cokeButton, -278, SpringLayout.SOUTH, this);
		this.add(cokeButton);
		friesButton = new JButton("Fries");
		appLayout.putConstraint(SpringLayout.NORTH, friesButton, 120, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, friesButton, 339, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, friesButton, -355, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, cokeButton, 45, SpringLayout.SOUTH, friesButton);
		appLayout.putConstraint(SpringLayout.EAST, priceField, -162, SpringLayout.WEST, friesButton);
		this.add(friesButton);
		saladButton = new JButton("Salad");
		appLayout.putConstraint(SpringLayout.NORTH, saladButton, 120, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, friesButton, -25, SpringLayout.WEST, saladButton);
		appLayout.putConstraint(SpringLayout.WEST, spriteButton, 0, SpringLayout.WEST, saladButton);
		appLayout.putConstraint(SpringLayout.EAST, spriteButton, 0, SpringLayout.EAST, saladButton);
		appLayout.putConstraint(SpringLayout.WEST, saladButton, 0, SpringLayout.WEST, cheeseburgerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saladButton, 0, SpringLayout.SOUTH, friesButton);
		appLayout.putConstraint(SpringLayout.EAST, saladButton, 0, SpringLayout.EAST, cheeseburgerButton);
		this.add(saladButton);
		soupButton = new JButton("Soup");
		appLayout.putConstraint(SpringLayout.WEST, coffeeButton, 0, SpringLayout.WEST, soupButton);
		appLayout.putConstraint(SpringLayout.EAST, coffeeButton, 0, SpringLayout.EAST, soupButton);
		appLayout.putConstraint(SpringLayout.NORTH, soupButton, 0, SpringLayout.NORTH, saladButton);
		appLayout.putConstraint(SpringLayout.WEST, soupButton, 0, SpringLayout.WEST, wrapButton);
		appLayout.putConstraint(SpringLayout.SOUTH, soupButton, 0, SpringLayout.SOUTH, saladButton);
		appLayout.putConstraint(SpringLayout.EAST, soupButton, 0, SpringLayout.EAST, wrapButton);
		this.add(soupButton);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, hamburgerButton, 339, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, hamburgerButton, 446, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, wrapButton, 0, SpringLayout.NORTH, cheeseburgerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, wrapButton, 0, SpringLayout.SOUTH, cheeseburgerButton);
		appLayout.putConstraint(SpringLayout.EAST, wrapButton, -10, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, coffeeButton, 0, SpringLayout.NORTH, spriteButton);
		appLayout.putConstraint(SpringLayout.SOUTH, coffeeButton, 0, SpringLayout.SOUTH, spriteButton);
	}
	
	private void setupListeners()
	{
		hamburgerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		cheeseburgerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		wrapButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		friesButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		soupButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		saladButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		cokeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		spriteButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String currentName = drinkField.getText();
				String currentPrice = priceField.getText();
				drinkField.setText(currentName + "\n" + "Sprite");
				
				
			}
		});
		coffeeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
	}
	
}
