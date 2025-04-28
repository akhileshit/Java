package swingJdbc;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateStudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel, nameLabel, classLabel, marksLabel;
	JTextField idText, nameText, classText, marksText;
	JButton showButton, updateButton, clearButton, backButton;
	JTextArea displayArea;
	Home home;
	Select select;
	Update update;
	
	public UpdateStudentDetails(Home home) {
		this.home = home;
		
//		setLayout()
		
		headingLabel = new JLabel("<html> <h1 style='color:blue'>^^^UPDATE STUDENT RECORD^^^</h1> </html>");
		idLabel = new JLabel("ID : ");
		nameLabel = new JLabel("NAME : ");
		classLabel = new JLabel("CLASS : ");
		marksLabel = new JLabel("MARKS : ");
		
		idText = new JTextField(28);
		nameText = new JTextField(12);
		classText = new JTextField(12);
		marksText = new JTextField(28);
		
		showButton = new JButton("SHOW");
		showButton.addActionListener(this);
		updateButton = new JButton("UPDATE");
		updateButton.addActionListener(this);
		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(this);
		backButton = new JButton("HOME");
		backButton.addActionListener(this);
		
		displayArea = new JTextArea(10, 35);
		
		
		add(headingLabel);
		add(idLabel);
		add(idText);
		add(showButton);
		add(nameLabel);
		add(nameText);
		add(classLabel);
		add(classText);
		add(marksLabel);
		add(marksText);
		add(updateButton);
		add(displayArea);
		add(clearButton);
		add(backButton);
		
//		setSize()
//		setVisible()
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
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
		
		else if (e.getSource() == showButton) {
			
			// id cannot be blank
			if (idText.getText().trim().isBlank()) {
				JOptionPane.showMessageDialog(this, "Please Enter the ID to Show.");
				return;
			}
			int id = Integer.parseInt(idText.getText().trim());
			select = new Select(id);
			if (select.noId)  {
				JOptionPane.showMessageDialog(this, ("ID " + id + " Does Not Exist."));
				return;
			}
			
			displayArea.setText(select.headerString + "\n");
			displayArea.append(select.rowString);
			
			displayArea.setEditable(false);
			
		}
		
		else if (e.getSource() == updateButton) {
			
			// id cannot be blank
			if (idText.getText().trim().isBlank()) {
				JOptionPane.showMessageDialog(this, "Please Enter the ID.");
				return;
			}
			// All fields cannot be blank
			if (nameText.getText().trim().isBlank() && marksText.getText().trim().isBlank() && classText.getText().trim().isBlank()) {
				JOptionPane.showMessageDialog(this, "Please enter atleast 1 field to Update.");
				return;
			}
			int id = Integer.parseInt(idText.getText().trim());
			String name = "";
			Double marks = 0.0;
			int clss = 0;
			
			HashMap<Object, Object> hm = new HashMap<>();
			if (!nameText.getText().trim().isBlank()) {
				name = nameText.getText().trim();
				hm.put("name", name);
			}
			
			if (!classText.getText().trim().isBlank()) {
				clss = Integer.parseInt(classText.getText().trim());
				if (clss < 1 || clss > 12) {
					JOptionPane.showMessageDialog(this, "Please enter Class between 1-12.");
					return;
				}
				hm.put("class", clss);
			}
			
			if (!marksText.getText().trim().isBlank()) {
				marks = Double.parseDouble(marksText.getText().trim());
				if (marks < 0 || marks > 100) {
					JOptionPane.showMessageDialog(this, "Please enter Marks between 0-100");
					return;
				}
				hm.put("marks", marks);
			}
			
			update = new Update(id, hm);
			if (update.noId)  {
				JOptionPane.showMessageDialog(this, ("ID " + id + " Does Not Exist."));
				return;
			}
			
			displayArea.setText("Updated Row : \n");
			displayArea.append(update.headerString + "\n");
			displayArea.append(update.rowString);
			
			displayArea.setEditable(false);
			
		}
		
		}
		catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(this, "Please check the Id/Class/Marks entered by you once.");
		}
		
	}

}
