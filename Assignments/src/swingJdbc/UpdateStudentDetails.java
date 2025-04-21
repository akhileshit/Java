package swingJdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UpdateStudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel, nameLabel, classLabel, marksLabel;
	JTextField idText, nameText, classText, marksText;
	JButton showButton, updateButton, backButton;
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
		add(backButton);
		
//		setSize()
//		setVisible()
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
		
		else if (e.getSource() == updateButton) {
			
			int id = Integer.parseInt(idText.getText());
			String name = "";
			Double marks = 0.0;
			int clss = 0;
			
			HashMap<Object, Object> hm = new HashMap<>();
			if (!nameText.getText().trim().isEmpty()) {
				name = nameText.getText();
				hm.put("name", name);
			}
			
			if (!classText.getText().trim().isEmpty()) {
				clss = Integer.parseInt(classText.getText());
				hm.put("class", clss);
			}
			
			if (!marksText.getText().trim().isEmpty()) {
				marks = Double.parseDouble(marksText.getText());
				hm.put("marks", marks);
			}
			
			update = new Update(id, hm);
			
			displayArea.setText("Updated Row : \n");
			displayArea.append(update.headerString + "\n");
			displayArea.append(update.rowString);
			
			displayArea.setEditable(false);
			
			//add more....
		}
		
	}

}
