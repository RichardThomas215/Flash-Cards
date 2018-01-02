package FlashCard;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow extends JFrame {
	
	public FirstWindow(ArrayList<Card> list) {
		
		super("Welcome");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15,15, 15, 0);
		
		
		JPanel p = new JPanel();
		
		
		JButton addB = new JButton("add");
		addB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddingWindow aw = new AddingWindow(list);
				aw.setVisible(true);
			}
			
		});
		p.add(addB);
		
		add(p,BorderLayout.CENTER);
		 
		setSize(400, 400);
		setVisible(true);
	}

}
