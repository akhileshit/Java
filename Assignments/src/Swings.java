import javax.swing.*;

public class Swings {
	
	public static void main(String[] args) { // Showing Button inside JFrame
		
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Display");
		
		
		frame.add(button);  // to add a button to the frame
		
		button.setBounds(100,100,90,50);  // to set the position of button in the frame and its width and height (x-axis,y-axis,width,height) 
		
		frame.setSize(500, 600); // to set the frame size
		
		frame.setLayout(null); // mandatory or else button occupies complete frame
		
		frame.setVisible(true); // mandatory or else frame itself is not visible

	}

}
