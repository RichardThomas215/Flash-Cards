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
		
		// add button
		JButton addB = new JButton("add");
		addB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddingWindow aw = new AddingWindow(list);
				aw.setVisible(true);
			}
			
		});
		p.add(addB, BorderLayout.LINE_START);
		
		// study button
		JButton studyB = new JButton("study");
		studyB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				studyWindow sw = new studyWindow(list);
				sw.setVisible(true);
			}
			
		});
		p.add(studyB, BorderLayout.CENTER);
		
		
		add(p,BorderLayout.LINE_START);
		 
		setSize(400, 400);
		setVisible(true);
	}

}
