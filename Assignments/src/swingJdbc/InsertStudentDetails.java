package swingJdbc;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InsertStudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel, nameLabel, classLabel, marksLabel, genderLabel;
	JTextField idText, nameText, classText, marksText, genderText;
	JButton insertButton, clearButton, backButton;
	JTextArea displayArea;
	Home home;
	Insert insert;
	
	public InsertStudentDetails(Home home) {
		this.home = home;
		
//		setLayout()
		
		headingLabel = new JLabel("<html> <h1 style='color:blue'>^^^INSERT STUDENT RECORD^^^</h1> </html>");
		idLabel = new JLabel("ID : ");
		nameLabel = new JLabel("NAME : ");
		classLabel = new JLabel("CLASS : ");
		marksLabel = new JLabel("MARKS : ");
		genderLabel = new JLabel("GENDER : ");
		
		idText = new JTextField(15);
		nameText = new JTextField(15);
		classText = new JTextField(12);
		marksText = new JTextField(12);
		genderText = new JTextField(28);
		
		insertButton = new JButton("INSERT");
		insertButton.addActionListener(this);
		backButton = new JButton("HOME");
		backButton.addActionListener(this);
		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(this);
		
		displayArea = new JTextArea(10, 35);
		
		
		add(headingLabel);
		add(idLabel);
		add(idText);
		add(nameLabel);
		add(nameText);
		add(classLabel);
		add(classText);
		add(marksLabel);
		add(marksText);
		add(genderLabel);
		add(genderText);
		add(insertButton);
		add(displayArea);
		add(clearButton);
		add(backButton);
		
//		setSize()
//		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == backButton) {
			
			home.showCard("Navigator");
		}
		
		else if (e.getSource() == clearButton) {
			
			for (Component c : getComponents()) {
				if (c instanceof JTextField) {
					((JTextField) c).setText("");
				}
				else if (c instanceof JTextArea) {
					((JTextArea) c).setText("");
				}
			}
		}
		
		else if (e.getSource() == insertButton) {
			
			try {
			//No Empty fields
			if (idText.getText().trim().isBlank() || nameText.getText().trim().isBlank() || classText.getText().trim().isBlank() || marksText.getText().trim().isBlank() || genderText.getText().trim().isBlank() ) {
				JOptionPane.showMessageDialog(this, "Please enter all the details.");
				return;
			}
			
			int id = Integer.parseInt(idText.getText().trim());
			if (id < 0) {
				JOptionPane.showMessageDialog(this, "Please enter only positive integer for Id.");
				return;
			}
			
			String name = nameText.getText().trim();
			
			int clss = Integer.parseInt(classText.getText().trim());
			if (clss > 12 || clss < 1) {
				JOptionPane.showMessageDialog(this, "Please enter Class between 1-12.");
				return;
			}
			
			double marks = Double.parseDouble(marksText.getText().trim());
			if (marks > 100 || marks < 0) {
				JOptionPane.showMessageDialog(this, "Please enter marks between 0-100.");
				return;
			}
			
			String gender = genderText.getText().trim().toUpperCase();
			if (!(gender.equals("MALE") || gender.equals("FEMALE"))) {
				JOptionPane.showMessageDialog(this, "Please enter proper Gender(Male/Female)");
				return;
			}
			
			insert = new Insert(id, name, clss, marks, gender); //throws SQL..Exception
			displayArea.setText("Inserted : \n");
			displayArea.append(insert.headerString + "\n");
			displayArea.append(insert.rowString);
			displayArea.setEditable(false);
			
			}
			catch (SQLIntegrityConstraintViolationException e3) {
				JOptionPane.showMessageDialog(this, "Duplicate ID entry not allowed!");
			}
			catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(this, "Please check the Id, Class and Marks entered by you once.\n- Id (Positive integer)\n- Class 1-12\n- Marks 0-100");
			}
			catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "Some Error Occurred");
				e2.printStackTrace();
			}
		}
		
	}

}
