package FlashCard;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testWindow extends JFrame{
	
	static int counter = 0;
	public testWindow(ArrayList<Card> list) {
		
		 super("Test");
		 setSize(400,400);
		 setLocationRelativeTo(null);
		 
		 Card temp = list.get(counter);
		 
		 JPanel p1 = new JPanel();
		 
		 JButton checkB = new JButton("Check");
		 p1.add(checkB);
		 add(p1, BorderLayout.SOUTH);
		 
		 JPanel p2 = new JPanel();
		 
		 JLabel jl1 = new JLabel(temp.getFront());
		 p2.add(jl1, BorderLayout.CENTER);
		 
		 JTextField jt = new JTextField(10);
		 p2.add(jt, BorderLayout.SOUTH);
		 add(p2, BorderLayout.CENTER);
		 
		 
		 
	}

}
