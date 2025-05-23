package dsSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.*;

public class StackImplementation extends JPanel implements ActionListener{
	
	JLabel sizeLabel, elementLabel, displayLabel;
	JTextField sizeText, elementText, displayText;
	JButton createStackButton, pushElementButton, displayButton, popButton, backButton;
	Stacks stack;
	Navigator navigator;
	
	public StackImplementation(Navigator navigator) { // Constructor
		this.navigator = navigator;

		
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
		
		backButton = new JButton("Back");
		backButton.addActionListener(this);
			
		
		
		add(sizeLabel);
		add(sizeText);
		add(createStackButton);
		
		add(elementLabel);
		add(elementText);
		add(pushElementButton);
		
		add(displayLabel);
		add(displayText);
		add(displayButton);
		
		add(popButton);
		
		add(backButton);
		
		
		
		//panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(250,400);
		setLayout(new FlowLayout());
		//setVisible(true);
		
	}
	
	
	
//	public static void main(String[] args) {  // main() method
//		
//		new StackImplementation();
//	}
	

	@Override
	public void actionPerformed(ActionEvent e) {  // Actions for buttons
		try {
		//
		if (e.getSource() == createStackButton) {
			int size = Integer.parseInt(sizeText.getText());
			if (size < 0) {
				showMessageDialog(this, "Please enter +ve Integer for size.", "Bro!!" ,JOptionPane.ERROR_MESSAGE);
			}
			else {
				stack = new Stacks(size);
				showMessageDialog(this, "Stack Created", "Information", JOptionPane.INFORMATION_MESSAGE);  // (parentComponent, message, title, mssgType)
			}
		}
		//
		else if (e.getSource() == pushElementButton) {
			Object ele = elementText.getText();
			int msg = stack.push(ele);
			if (msg == -1) {
				showMessageDialog(this, "Cannot push. Stack is Full", "Stop it Bro!!", JOptionPane.WARNING_MESSAGE);
			}
			else {
				showMessageDialog(this, "Pushed", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		//
		else if (e.getSource() == displayButton) {
			String text = stack.toString();
			if (text.isEmpty()) {
				showMessageDialog(this, "Stack is Empty", "Bro!!", JOptionPane.WARNING_MESSAGE);
			}
			else {
				displayText.setText(text);
			}
		}
		//
		else if (e.getSource() == popButton) {
			int msg = stack.pop();
			if (msg == -1) {
				showMessageDialog(this, "Cannot pop. Stack is Empty", "Stop it Bro!!", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if (e.getSource() == backButton) {
			//homeInstance.panel.setVisible(true);
			//panel.dispose();
			navigator.showCard("Home");
		}
		}
		
		catch (NullPointerException | NumberFormatException ne) {
			showMessageDialog(this, "Please specify the \"Size\" of the Stack with +ve Integer and click on \"Create\"", "Bro!!" ,JOptionPane.ERROR_MESSAGE);
		}
	}
}
