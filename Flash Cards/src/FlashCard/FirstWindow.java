package FlashCard;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstWindow extends JFrame {
	
	public FirstWindow() {
		
		JFrame first = new JFrame("Welcome");
		Panel p = new Panel();
		JButton addB = new JButton("add");
		p.add(addB);
		
		first.add(p);
		 
		first.setSize(400, 400);
		first.setVisible(true);
	}
	
	public static void main(String [] args) {
		
		FirstWindow f = new FirstWindow();
	}

}
