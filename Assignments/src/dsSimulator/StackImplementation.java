package dsSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;

public class StackImplementation implements ActionListener{
	
	JLabel sizeLabel, elementLabel, displayLabel, l4, l5;
	JTextField sizeText, elementText, displayText, t4, t5;
	JButton createStackButton, pushElementButton, displayButton, popButton, b5;
	JFrame frame;
	Stacks stack;
	
	public StackImplementation() { // Constructor
		
		sizeLabel = new JLabel("Size:");
		sizeText = new JTextField(10);
		createStackButton = new JButton("Create");
		createStackButton.addActionListener(this);
		
		elementLabel = new JLabel("Element:");
		elementText = new JTextField(10);
		pushElementButton = new JButton("Push");
		pushElementButton.addActionListener(this);
		
		displayLabel = new JLabel("Display:");
		displayText = new JTextField(20);
		displayButton = new JButton("Display");
		displayButton.addActionListener(this);
		
		popButton = new JButton("Pop");
		popButton.addActionListener(this);
			
		
		frame = new JFrame();
		frame.add(sizeLabel);
		frame.add(sizeText);
		frame.add(createStackButton);
		
		frame.add(elementLabel);
		frame.add(elementText);
		frame.add(pushElementButton);
		
		frame.add(displayLabel);
		frame.add(displayText);
		frame.add(displayButton);
		
		frame.add(popButton);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}

	
	public static void main(String[] args) {  // main() method
		
		new StackImplementation();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {  // Actions for buttons
		try {
		//
		if (e.getSource() == createStackButton) {
			int size = Integer.parseInt(sizeText.getText());
			if (size < 0) {
				showMessageDialog(frame, "Please enter +ve Integer for size.", "Bro!!" ,JOptionPane.ERROR_MESSAGE);
			}
			else {
				stack = new Stacks(size);
				showMessageDialog(frame, "Stack Created", "Information", JOptionPane.INFORMATION_MESSAGE);  // (parentComponent, message, title, mssgType)
			}
		}
		//
		else if (e.getSource() == pushElementButton) {
			Object ele = elementText.getText();
			int msg = stack.push(ele);
			if (msg == -1) {
				showMessageDialog(frame, "Cannot push. Stack is Full", "Stop it Bro!!", JOptionPane.WARNING_MESSAGE);
			}
			else {
				showMessageDialog(frame, "Pushed", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		//
		else if (e.getSource() == displayButton) {
			String text = stack.toString();
			if (text.isEmpty()) {
				showMessageDialog(frame, "Stack is Empty", "Bro!!", JOptionPane.WARNING_MESSAGE);
			}
			else {
				displayText.setText(text);
			}
		}
		//
		else if (e.getSource() == popButton) {
			int msg = stack.pop();
			if (msg == -1) {
				showMessageDialog(frame, "Cannot pop. Stack is Empty", "Stop it Bro!!", JOptionPane.WARNING_MESSAGE);
			}
		}
		}
		
		catch (NullPointerException | NumberFormatException ne) {
			showMessageDialog(frame, "Please specify the \"Size\" of the Stack with +ve Integer and click on \"Create\"", "Bro!!" ,JOptionPane.ERROR_MESSAGE);
		}
	}
}
