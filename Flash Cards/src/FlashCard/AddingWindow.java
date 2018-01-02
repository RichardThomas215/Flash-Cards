package FlashCard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddingWindow extends JFrame {
	
	public AddingWindow(ArrayList<Card> list) {
				
		super("Please make your card");
		
		//final String frontH;
		//final String backH;
		
		JPanel p1 = new JPanel();
		
		// the word Front
		JLabel front = new JLabel("Front");
		p1.add(front);
		
		// text field to enter the front
		JTextField jt = new JTextField(10);
		p1.add(jt, BorderLayout.AFTER_LAST_LINE);
		add(p1);
		
		JPanel p2 = new JPanel();
		
		// the word back
		JLabel back = new JLabel("Back");
		p2.add(back);
		
		//text field to enter the back
		JTextField jt2 = new JTextField(10);
		p2.add(jt2, BorderLayout.AFTER_LAST_LINE);
		add(p2, BorderLayout.SOUTH);
		
		JPanel p3 = new JPanel();
		
		JButton b1 = new JButton("Add");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String frontH = jt.getText();
				String backH = jt2.getText();
				
			}
			
		});
		
		p3.add(b1);
		add(p3, BorderLayout.WEST);
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String []args) {
		
		//AddingWindow w = new AddingWindow();
		
	}
 
}
