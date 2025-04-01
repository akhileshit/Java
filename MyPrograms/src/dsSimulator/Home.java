package dsSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home implements ActionListener {

	JLabel chooseLabel;
	JButton arrayButton, stackButton;
	JFrame frame;
	Home homeInstance = this;
	
	public Home() {
		
		chooseLabel = new JLabel("<html> <h1 style='color:red'>Choose Your DS</h1> </html>");
		
		arrayButton = new JButton("Array");
		arrayButton.addActionListener(this);
		stackButton = new JButton("Stack");
		stackButton.addActionListener(this);
		
		frame = new JFrame();
		frame.add(chooseLabel);
		
		frame.add(arrayButton);
		frame.add(stackButton);
		
		frame.setSize(210, 400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == arrayButton) {
			
			new ArrayImplementation(homeInstance);
		}
		
		else if (e.getSource() == stackButton) {
			
			new StackImplementation(homeInstance);
		}
		
		frame.setVisible(false);
	}
	
	
	public static void main(String[] args) {
		
		new Home();
		System.out.println("Hello. Welcome Home.");
	}
	
}
