package FlashCard;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow extends JFrame {
	
	public FirstWindow() {
		
		super("Welcome");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15, 15, 0);
		
		
		JPanel p = new JPanel();
		
		
		JButton addB = new JButton("add");
		
		p.add(addB);
		
		add(p,BorderLayout.CENTER);
		 
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		
		FirstWindow f = new FirstWindow();
	}

}
