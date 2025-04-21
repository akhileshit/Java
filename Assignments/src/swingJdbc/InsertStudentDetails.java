package swingJdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InsertStudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel, nameLabel, classLabel, marksLabel, genderLabel;
	JTextField idText, nameText, classText, marksText, genderText;
	JButton insertButton, backButton;
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
		
		else if (e.getSource() == insertButton) {
			
			int id = Integer.parseInt(idText.getText());
			String name = nameText.getText();
			int clss = Integer.parseInt(classText.getText());
			double marks = Double.parseDouble(marksText.getText());
			String gender = genderText.getText();
			
			insert = new Insert(id, name, clss, marks, gender);
			displayArea.setText("Inserted : \n");
			displayArea.append(insert.headerString + "\n");
			displayArea.append(insert.rowString);
			displayArea.setEditable(false);
			
			//add more....
		}
		
	}

}
