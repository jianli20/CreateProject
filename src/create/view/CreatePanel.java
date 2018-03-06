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
		priceField = new JTextField();
		drinkField = new JTextField();
		totalField = new JTextField();
		
		hamburgerButton = new JButton("Hamburger");
		cheeseburgerButton = new JButton("Cheeseburger");
		wrapButton = new JButton("Wrap");
		
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
		this.add(cokeButton);
		friesButton = new JButton("Fries");
		this.add(friesButton);
		saladButton = new JButton("Salad");
		this.add(saladButton);
		soupButton = new JButton("Soup");
		this.add(soupButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
