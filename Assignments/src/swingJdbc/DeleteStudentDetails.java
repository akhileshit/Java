package swingJdbc;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeleteStudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel;
	JTextField idText;	
	JButton showButton, deleteButton, clearButton, backButton;
	JTextArea displayArea;
	Home home;
	Select select;
	Delete delete;
	
	public DeleteStudentDetails(Home home) {
		this.home = home;
		
//		setLayout(new FlowLayout());  //no need sice layout already defined in JFrame, applies to all
		
		headingLabel = new JLabel("<html> <h1 style='color:blue'>^^^DELETE STUDENT RECORD^^^</h1> </html>");
		idLabel = new JLabel("ID : ");
		
		idText = new JTextField(35);
		
		showButton = new JButton("SHOW");
		showButton.addActionListener(this);
		deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(this);
		backButton = new JButton("HOME");
		backButton.addActionListener(this);
		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(this);
		
		displayArea = new JTextArea(10, 35);
		
		
		add(headingLabel);
		add(idLabel);
		add(idText);
		add(showButton);
		add(deleteButton);
		add(displayArea);
		add(clearButton);
		add(backButton);
		
//		setSize()
//		setVisible(true);
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
			
			if (idText.getText().trim().isBlank()) {
				JOptionPane.showMessageDialog(this, "Please Enter the ID to Show/Delete.");
				return;
			}
			int id = Integer.parseInt(idText.getText().trim());
			select = new Select(id);
			if (select.noId) {
				JOptionPane.showMessageDialog(this, ("ID " + id + " Does Not Exist."));
				return;
			}
			
			displayArea.setText(select.headerString + "\n");
			displayArea.append(select.rowString);
			
			displayArea.setEditable(false);
			
		}
		
		else if (e.getSource() == deleteButton) {
			
			if (idText.getText().trim().isBlank()) {
				JOptionPane.showMessageDialog(this, "Please Enter the ID to Show/Delete.");
				return;
			}
			int id = Integer.parseInt(idText.getText().trim());
			delete = new Delete(id);
			if (delete.noId) {
				JOptionPane.showMessageDialog(this, ("ID " + id + " Does Not Exist."));
				return;
			}
			
			displayArea.setText("Deleted Row : \n");
			displayArea.append(delete.headerString + "\n");
			displayArea.append(delete.rowString);
			
			displayArea.setEditable(false);
			
		}
		
		}
		catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(this, "Please enter valid ID to Show/Delete.");
		}
		
	}
	
}
