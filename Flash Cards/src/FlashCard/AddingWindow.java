package FlashCard;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddingWindow extends JFrame {
	
	public AddingWindow() {
		
		super("Please add your card");
		
		JPanel p1 = new JPanel();
		
		JLabel front = new JLabel("Front");
		p1.add(front);
		add(p1);
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String []args) {
		
		AddingWindow w = new AddingWindow();
		
	}
 
}
