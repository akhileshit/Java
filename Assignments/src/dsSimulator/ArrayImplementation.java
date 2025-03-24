package dsSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;

public class ArrayImplementation implements ActionListener {
	
	JLabel sizeLabel, addPositionLabel, elementLabel, deletePositionLabel, arrayContentsLabel;
	JTextField sizeText, addPositionText, elementText, deletePositionText, arrayContentsText;
	JButton createArrayButton, insertButton, deleteButton, displayButton;
	JFrame frame;
	Arrays array;
	
	public ArrayImplementation() { // Constructor
		
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
		
		
		frame = new JFrame();
		frame.add(sizeLabel);
		frame.add(sizeText);
		frame.add(createArrayButton);
		
		frame.add(addPositionLabel);
		frame.add(addPositionText);
		frame.add(elementLabel);
		frame.add(elementText);
		frame.add(insertButton);
		
		frame.add(deletePositionLabel);
		frame.add(deletePositionText);
		frame.add(deleteButton);
		
		frame.add(arrayContentsLabel);
		frame.add(arrayContentsText);
		frame.add(displayButton);
		
		
		frame.setLayout(new FlowLayout());
		frame.setSize(280, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) { // Actions for Buttons
		try {
		//
		if (e.getSource() == createArrayButton) {
			int size = Integer.parseInt(sizeText.getText());
			if (size < 0) {
				showMessageDialog(frame, "Please enter +ve integer for \"Size\"", "Bro!!", 0);
			}
			else {
				array = new Arrays(size);
				showMessageDialog(frame, "Array Created.", "Information", 1);
			}
		}
		//
		else if (e.getSource() == insertButton) {
			try {
			if (addPositionText.getText().isEmpty()) {
				showMessageDialog(frame, "Please specify the \"Position\"", "Hey", 2);
				return;
			}
			
			int pos = Integer.parseInt(addPositionText.getText());
			Object ele = elementText.getText();
			int msg = array.insert(pos, ele);
			if (msg == -1) {
				showMessageDialog(frame, "Please specify \"Position\" > 0 and < \"Size\"", "Bro!!", 0);
			}
			else if (msg == 1) {
				showMessageDialog(frame, "Element Inserted.", "Information", 1);	
			}
			}
			
			catch (NumberFormatException nfe) {
				showMessageDialog(frame, "Please specify only an integer > 0 and < \"Size\" for \"Position\"", "Bro!!", 0);
			}
		}
		//
		else if (e.getSource() == deleteButton) {
			try {
				if (deletePositionText.getText().isEmpty()) {
					showMessageDialog(frame, "Please specify the \"Position\"", "Hey", 2);
					return;
				}
				
				int pos = Integer.parseInt(deletePositionText.getText());
				int msg = array.delete(pos);
				if (msg == -1) {
					showMessageDialog(frame, "Please specify \"Position\" > 0 and < \"Size\"", "Bro!!", 0);
				}
				else if (msg == 1) {
					showMessageDialog(frame, "Element Deleted.", "Information", 1);	
				}
			}
			catch (NumberFormatException nfe) {
				showMessageDialog(frame, "Please specify only an integer > 0 and < \"Size\" for \"Position\"", "Bro!!", 0);
			}
		}
		//
		else if (e.getSource() == displayButton) {
			arrayContentsText.setText(array.toString());
		}
		}
		
		catch (NullPointerException | NumberFormatException ne) {
			showMessageDialog(frame, "Please specify the \"Size\" with +ve integer and click on \"Create\"", "Bro!!", 0);
		}
	}
	
	
	
	public static void main(String[] args) { // main() method
		
		new ArrayImplementation();
	}
}
