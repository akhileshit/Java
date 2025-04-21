package swingJdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Navigator extends JPanel implements ActionListener {

	
	JLabel chooseLabel;
	JButton displayRecButton, customDisplayButton, deleteRecButton, insertRecButton, updateRecButton;
	Home home;
	
	public Navigator(Home home) {
		this.home = home; // its for all-panel-session persistence while the app is open
		
		setLayout(new FlowLayout());
		
		chooseLabel = new JLabel("<html> <h1 style='color:red'>STUDENT MANAGEMENT SYSTEM</h1> </html>");
		
		displayRecButton = new JButton("DISPLAY RECORD");
		displayRecButton.addActionListener(this);
		customDisplayButton = new JButton("CUSTOMIZED DISPLAY");
		customDisplayButton.addActionListener(this);
		deleteRecButton = new JButton("DELETE RECORD");
		deleteRecButton.addActionListener(this);
		insertRecButton = new JButton("INSERT RECORD");
		insertRecButton.addActionListener(this);
		updateRecButton = new JButton("UPDATE RECORD");
		updateRecButton.addActionListener(this);
		
		add(chooseLabel);
		
		add(displayRecButton);
		add(customDisplayButton);
		add(deleteRecButton);
		add(insertRecButton);
		add(updateRecButton);
		
//		setSize(500, 400);
//		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == displayRecButton) {
			
			home.showCard("StudentDetails");
		}
		
		else if (e.getSource() == customDisplayButton) {
			
			home.showCard("CustomStudentDetails");
		}
		
		else if (e.getSource() == deleteRecButton) {
			
			home.showCard("DeleteStudentDetails");
		}
		
		else if (e.getSource() == insertRecButton) {
			
			home.showCard("InsertStudentDetails");
		}
		
		else if (e.getSource() == updateRecButton) {
			
			home.showCard("UpdateStudentDetails");
		}
	}
	
}
