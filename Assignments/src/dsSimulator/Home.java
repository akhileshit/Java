package dsSimulator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home extends JPanel implements ActionListener {

	JLabel chooseLabel;
	JButton arrayButton, stackButton;
	Navigator navigator;
	
	public Home(Navigator navigator) {
		this.navigator = navigator;
		

		setLayout(new FlowLayout());
		
		chooseLabel = new JLabel("<html> <h1 style='color:red'>Choose Your DS</h1> </html>");
		
		arrayButton = new JButton("Array");
		arrayButton.addActionListener(this);
		stackButton = new JButton("Stack");
		stackButton.addActionListener(this);
		
		add(chooseLabel);
		
		add(arrayButton);
		add(stackButton);
		
		setSize(500, 400);
		setVisible(true);

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == arrayButton) {
			
			navigator.showCard("Array");
		}
		
		else if (e.getSource() == stackButton) {
			
			navigator.showCard("Stacks");;
		}
		
		
	}
	
	
//	public static void main(String[] args) {
//		
//		new Home();
//		System.out.println("Hello. Welcome Home.");
//	}
	
}
