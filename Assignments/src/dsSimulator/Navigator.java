package dsSimulator;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.*;

public class Navigator {
	
	JPanel cardPanel;
	CardLayout cardLayout;
	JFrame frame;
	
	public Navigator() {
		
		frame = new JFrame(); // create a frame
		frame.setSize(210, 400); // Dimension of Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit jFrame on close
		frame.setLayout(new BorderLayout()); //
		
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		cardPanel.add(new Home(this), "Home"); // first card added will only be visible automatically
		cardPanel.add(new ArrayImplementation(this), "Array");
		cardPanel.add(new StackImplementation(this), "Stacks");
		
		frame.add(cardPanel, BorderLayout.CENTER);
		frame.setVisible(true); // make frame visible
		
		
	}
	
	public void showCard(String cardName) {
		cardLayout.show(cardPanel, cardName);
		
		if (cardName.equals("Home")) {
			frame.setSize(210, 400);
		}
		else if (cardName.equals("Array")) {
			frame.setSize(280, 400);
		}
		else if (cardName.equals("Stacks")) {
			frame.setSize(250, 400);
		}
		
	}
	
	public static void main(String[] args) {
		
		new Navigator();
	}

}
