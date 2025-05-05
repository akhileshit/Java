package dsSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;

public class ArrayImplementation extends JPanel implements ActionListener {
	
	JLabel sizeLabel, addPositionLabel, elementLabel, deletePositionLabel, arrayContentsLabel;
	JTextField sizeText, addPositionText, elementText, deletePositionText, arrayContentsText;
	JButton createArrayButton, insertButton, deleteButton, displayButton, backButton;
	//JPanel panel;     // Not needed, since we are extending itself..
	Arrays array;
	Navigator navigator;
	
	public ArrayImplementation(Navigator navigator) { // Constructor
		
		this.navigator = navigator;
		
		sizeLabel = new JLabel("Size:");
		sizeText = new JTextField(12);
		createArrayButton = new JButton("Create");
		createArrayButton.addActionListener(this);
		
		addPositionLabel = new JLabel("Position:");
		addPositionText = new JTextField(2);
		elementLabel = new JLabel("Element:");
		elementText = new JTextField(2);
		insertButton = new JButton("Insert");
		insertButton.addActionListener(this);
		
		deletePositionLabel = new JLabel("Position:");
		deletePositionText = new JTextField(10);
		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(this);
		
		arrayContentsLabel = new JLabel("ArrayContents:");
		arrayContentsText = new JTextField(25);
		displayButton = new JButton("Display");
		displayButton.addActionListener(this);
		
		backButton = new JButton("Back");
		backButton.addActionListener(this);
		
		
		add(sizeLabel);
		add(sizeText);
		add(createArrayButton);
		
		add(addPositionLabel);
		add(addPositionText);
		add(elementLabel);
		add(elementText);
		add(insertButton);
		
		add(deletePositionLabel);
		add(deletePositionText);
		add(deleteButton);
		
		add(arrayContentsLabel);
		add(arrayContentsText);
		add(displayButton);
		
		add(backButton);
		
		
		//setLayout(new FlowLayout());
		//setSize(280, 400);
		//setVisible(true);
		//panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) { // Actions for Buttons
		try {
		//
		if (e.getSource() == createArrayButton) {
			int size = Integer.parseInt(sizeText.getText());
			if (size <= 0) {
				showMessageDialog(this, "\"Size\" should be > 0", "Bro!!", 0);
			}
			else {
				array = new Arrays(size);
				showMessageDialog(this, "Array Created.", "Information", 1);
			}
		}
		//
		else if (e.getSource() == insertButton) {
			try {
			if (addPositionText.getText().isEmpty()) {
				showMessageDialog(this, "Please specify the \"Position\"", "Hey", 2);
				return;
			}
			
			int pos = Integer.parseInt(addPositionText.getText());
			Object ele = elementText.getText();
			int msg = array.insert(pos, ele);
			if (msg == -1) {
				showMessageDialog(this, "Please specify \"Position\" >= 0 and < \"Size\"", "Bro!!", 0);
			}
			else if (msg == 1) {
				showMessageDialog(this, "Element Inserted.", "Information", 1);	
			}
			}
			
			catch (NumberFormatException nfe) {
				showMessageDialog(this, "Please specify only an integer >= 0 and < \"Size\" for \"Position\"", "Bro!!", 0);
			}
		}
		//
		else if (e.getSource() == deleteButton) {
			try {
				if (deletePositionText.getText().isEmpty()) {
					showMessageDialog(this, "Please specify the \"Position\"", "Hey", 2);
					return;
				}
				
				int pos = Integer.parseInt(deletePositionText.getText());
				int msg = array.delete(pos);
				if (msg == -1) {
					showMessageDialog(this, "Please specify \"Position\" >= 0 and < \"Size\"", "Bro!!", 0);
				}
				else if (msg == 1) {
					showMessageDialog(this, "Element Deleted.", "Information", 1);	
				}
			}
			catch (NumberFormatException nfe) {
				showMessageDialog(this, "Please specify only an integer >= 0 and < \"Size\" for \"Position\"", "Bro!!", 0);
			}
		}
		//
		else if (e.getSource() == displayButton) {
			arrayContentsText.setText(array.toString());
			
			arrayContentsText.setEditable(false);
		}
		
		else if (e.getSource() == backButton) {
			navigator.showCard("Home");
		}
		}
		
		catch (NullPointerException | NumberFormatException ne) {
			showMessageDialog(this, "Please specify the \"Size\" with +ve integer and click on \"Create\"", "Bro!! First Create the Array", 0);
		}
	}
	
	
	
//	public static void main(String[] args) { // main() method
//		
//		new ArrayImplementation();
//	}
}
