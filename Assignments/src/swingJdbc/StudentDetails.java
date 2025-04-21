package swingJdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel;
	JTextField idText;
	JButton fetchButton, backButton;
	JTextArea displayArea;
	Home home;
	Select select;
	
	public StudentDetails(Home home) {
		this.home = home;
		
		setLayout(new FlowLayout());
		
		headingLabel = new JLabel("<html> <h1 style='color:blue'>^^^^^^STUDENT DETAILS^^^^^^</h1> </html>");
		idLabel = new JLabel("ID : ");
		
		idText = new JTextField(35);
		
		fetchButton = new JButton("FETCH");
		fetchButton.addActionListener(this);
		backButton = new JButton("HOME");
		backButton.addActionListener(this);
		
		displayArea = new JTextArea(10, 35);
		JScrollPane scroll = new JScrollPane(displayArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		add(headingLabel);
		add(idLabel);
		add(idText);
		add(fetchButton);
//		add(displayArea); //not needed
		add(scroll); // enough
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
		
		else if (e.getSource() == fetchButton) {
			
			int id = Integer.parseInt(idText.getText());
			select = new Select(id);
			displayArea.setText(select.headerString+ "\n");
			displayArea.append(select.rowString);
			
			displayArea.setEditable(false);
			
			//add more....
		}
	}
	
}
