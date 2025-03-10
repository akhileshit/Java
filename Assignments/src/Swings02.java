import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Swings02  implements ActionListener { // Adding 2 numbers using JFrame(GUI) (Java Swing)
	
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b;
	JFrame frame;
	
	public Swings02() { // Constructor
		super();
		
		l1 = new JLabel("Enter First Number");
		t1 = new JTextField(20);
		
		l2 = new JLabel("Enter Second Number");
		t2 = new JTextField(20);
		
		b = new JButton("ADD");
		
		l3 = new JLabel("Result");
		
		b.addActionListener(this);
		
		frame = new JFrame();
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(b);
		frame.add(l3);
		
		frame.setSize(250, 400);
		frame.setLayout(new FlowLayout());
		//frame.setLayout(null);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		
		int sum = num1 + num2;
		l3.setText("" + sum);
		
	}
	
	
	public static void main(String[] args) {
		
		new Swings02(); // Just create an object of Swings02
		
	}
}
