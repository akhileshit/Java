package swingJdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CustomStudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel, detailsLabel, idCbLabel, nameCbLabel, classCbLabel, marksCbLabel, genderCbLabel;
	JTextField idText;
	JCheckBox idCbox, nameCbox, classCbox, marksCbox, genderCbox;
	JButton fetchButton, backButton;
	JTextArea displayArea;
	Home home;
	CustomSelect cs;
	
	public CustomStudentDetails(Home home) {
		this.home = home;
		
		setLayout(new FlowLayout());
		
		headingLabel = new JLabel("<html> <h1 style='color:blue'>^^CUSTOM STUDENT DETAILS^^</h1> </html>");
		idLabel = new JLabel("ID : ");
		detailsLabel = new JLabel("Details : ");
		idCbLabel = new JLabel("id");
		nameCbLabel = new JLabel("name");
		classCbLabel = new JLabel("class");
		marksCbLabel = new JLabel("marks");
		genderCbLabel = new JLabel("gender");
		
		idText = new JTextField(35);
		
		idCbox = new JCheckBox();
		idCbox.setText("id");
		nameCbox = new JCheckBox();
		nameCbox.setText("name");
		classCbox = new JCheckBox();
		classCbox.setText("class");
		marksCbox = new JCheckBox();
		marksCbox.setText("marks");
		genderCbox = new JCheckBox();
		genderCbox.setText("gender");
		
		fetchButton = new JButton("FETCH");
		fetchButton.addActionListener(this);
		backButton = new JButton("HOME");
		backButton.addActionListener(this);
		
		displayArea = new JTextArea(10, 35);
		
		
		add(headingLabel);
		add(idLabel);
		add(idText);
		add(detailsLabel);
		add(idCbox);
		add(nameCbox);
		add(classCbox);
		add(marksCbox);
		add(genderCbox);
		add(fetchButton);
		add(displayArea);
		add(backButton);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == backButton) {
			
			home.showCard("Navigator");
		}
		
		else if (e.getSource() == fetchButton) {
			
			int id = Integer.parseInt(idText.getText());
			String columnString = "";
			if(idCbox.isSelected())  columnString = columnString + "ID, ";
			if(nameCbox.isSelected())  columnString = columnString + "NAME, ";
			if(classCbox.isSelected())  columnString = columnString + "CLASS, ";
			if(marksCbox.isSelected())  columnString = columnString + "MARKS, ";
			if(genderCbox.isSelected())  columnString = columnString + "GENDER, ";
			
			cs = new CustomSelect(id, columnString);
			
			displayArea.setText(cs.colHeading + "\n");
			displayArea.append(cs.colString + "\n");
			
			displayArea.setEditable(false);
			
			//add more....
		}	
	}
}
