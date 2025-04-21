package swingJdbc;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Run this class for the Student Management Application
public class Home {
	
	JPanel cardPanel;
	CardLayout cardLayout;
	JFrame frame;
	
	public Home() {
		
		frame = new JFrame();
		frame.setSize(430, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		cardPanel.add(new Navigator(this), "Navigator");
		cardPanel.add(new StudentDetails(this), "StudentDetails");
		cardPanel.add(new CustomStudentDetails(this), "CustomStudentDetails");
		cardPanel.add(new DeleteStudentDetails(this), "DeleteStudentDetails");
		cardPanel.add(new InsertStudentDetails(this), "InsertStudentDetails");
		cardPanel.add(new UpdateStudentDetails(this), "UpdateStudentDetails");
				
		
		frame.add(cardPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	public void showCard(String cardName) {
		cardLayout.show(cardPanel, cardName);
		//Resize frame according to diff panel sizes here  (if neeeded)...
		
	}
	
	public static void main (String [] args) {
		
		new Home();
	}
}
