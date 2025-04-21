package swingJdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeleteStudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel;
	JTextField idText;	
	JButton showButton, deleteButton, backButton;
	JTextArea displayArea;
	Home home;
	Select select;
	Delete delete;
	
	public DeleteStudentDetails(Home home) {
		this.home = home;
		
//		setLayout(new FlowLayout());
		
		headingLabel = new JLabel("<html> <h1 style='color:blue'>^^^DELETE STUDENT RECORD^^^</h1> </html>");
		idLabel = new JLabel("ID : ");
		
		idText = new JTextField(35);
		
		showButton = new JButton("SHOW");
		showButton.addActionListener(this);
		deleteButton = new JButton("DELETE");
		deleteButton.addActionListener(this);
		backButton = new JButton("HOME");
		backButton.addActionListener(this);
		
		displayArea = new JTextArea(10, 35);
		
		
		add(headingLabel);
		add(idLabel);
		add(idText);
		add(showButton);
		add(deleteButton);
		add(displayArea);
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
		
		else if (e.getSource() == showButton) {
			
			int id = Integer.parseInt(idText.getText());
			select = new Select(id);
			
			displayArea.setText(select.headerString + "\n");
			displayArea.append(select.rowString);
			
			displayArea.setEditable(false);
			
			//add more....
		}
		
		else if (e.getSource() == deleteButton) {
			
			int id = Integer.parseInt(idText.getText());
			delete = new Delete(id);
			
			displayArea.setText("Deleted Row : \n");
			displayArea.append(delete.headerString + "\n");
			displayArea.append(delete.rowString);
			
			displayArea.setEditable(false);
			
			//add more....
		}
		
	}
	
}
