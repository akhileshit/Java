package swingJdbc;

import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;

public class StudentDetails extends JPanel implements ActionListener {

	JLabel headingLabel, idLabel;
	JTextField idText;
	JButton fetchButton, fetchAllButton, clearButton, backButton;
	JTextArea displayArea;
	Home home;
	Select select;
	SelectAll selectAll;
	
	public StudentDetails(Home home) {
		this.home = home; //helps persist 1 app session (across all operations)
		
//		setLayout(new FlowLayout());  //no need sice layout already defined in JFrame, applies to all
		
		headingLabel = new JLabel("<html> <h1 style='color:blue'>^^^^^^STUDENT DETAILS^^^^^^</h1> </html>");
		idLabel = new JLabel("ID : ");
		
		idText = new JTextField(35);
		
		fetchButton = new JButton("FETCH");
		fetchButton.addActionListener(this);
		fetchAllButton = new JButton("FETCH ALL");
		fetchAllButton.addActionListener(this);
		backButton = new JButton("HOME");
		backButton.addActionListener(this);
		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(this);
		
		displayArea = new JTextArea(10, 35);
		JScrollPane scroll = new JScrollPane(displayArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		
		add(headingLabel);
		add(idLabel);
		add(idText);
		add(fetchButton);
		add(fetchAllButton);
//		add(displayArea); //not needed
		add(scroll); // enough
		add(clearButton);
		add(backButton);
		
//		setSize()  //no need sice layout already defined in JFrame, applies to all
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
				else if (c instanceof JScrollPane) { // must go inside scrollpane to access TextArea/to clear it.
		            JViewport viewport = ((JScrollPane) c).getViewport();
		            Component view = viewport.getView();
		            if (view instanceof JTextArea) {
		                ((JTextArea) view).setText("");
		            }
		        }
			}
		}
		
		else if (e.getSource() == fetchButton) {
			try {
			int id = Integer.parseInt(idText.getText().trim());
			select = new Select(id);
			if (select.noId) {
				JOptionPane.showMessageDialog(this, ("Id " + id + " does not exist."));
				return;
			}
			displayArea.setText(select.headerString + "\n"); //setText()
			displayArea.append(select.rowString);  //append() ---> adding to previous
			
			displayArea.setEditable(false);
			
			}
			catch(NumberFormatException e1) {
				showMessageDialog(this, "Please enter valid ID(positive integer).", "", 0);
			}
			catch (Exception e2) {
				JOptionPane.showMessageDialog(this, "Some Error Occurred.");
			}
		}
		
		else if (e.getSource() == fetchAllButton) {
			
			selectAll = new SelectAll();
			displayArea.setText(selectAll.headerString + "\n");
			displayArea.append(selectAll.rowsString);
			
			displayArea.setEditable(false);
		}
		
		}
		catch (Exception e3) {
			JOptionPane.showMessageDialog(this, "Some Error Occurred.");
			e3.printStackTrace();
		}
	}
	
}
