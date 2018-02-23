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
		
		nameField = new JTextField();
		drinkField = new JTextField();
		totalField = new JTextField();
		
		hamburgerButton = new JButton("Hamburger");
		cheeseburgerButton = new JButton("CheeseBurger");
		wrapButton = new JButton("Wrap");
		saladButton = new JButton("Salad");
		friesButton = new JButton("Fries");
		soupButton = new JButton("Soup");
		cokeButton = new JButton("Coke");
		spriteButton = new JButton("Sprite");
		coffeeButton = new JButton("Coffee");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.add(nameField);
		this.add(drinkField);
		this.add(totalField);
		
		this.add(hamburgerButton);
		this.add(cheeseburgerButton);
		this.add(wrapButton);
		this.add(saladButton);
		this.add(friesButton);
		this.add(soupButton);
		this.add(cokeButton);
		this.add(spriteButton);
		this.add(coffeeButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
