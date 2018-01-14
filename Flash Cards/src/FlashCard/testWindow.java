package FlashCard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class testWindow extends JFrame{
	
	static int counter = -1;
	public testWindow(ArrayList<Card> list) {
		
		 super("Test");
		 setSize(400,400);
		 setLocationRelativeTo(null);
		 
		 counter++;
		 Card temp = list.get(counter);
		
		 // panel 1
		 JPanel p1 = new JPanel();
		 
		 JLabel jl1 = new JLabel(temp.getFront());
		 p1.add(jl1, BorderLayout.CENTER);
		 
		 JTextField jt = new JTextField(10);
		 p1.add(jt, BorderLayout.SOUTH);
		 add(p1, BorderLayout.CENTER);
		 
		 
		 // panel 2
		 JPanel p2 = new JPanel();
		 JButton checkB = new JButton("Check");
		 checkB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			String input =	jt.getText();
				
				if(input.compareToIgnoreCase(temp.getBack()) == 0) {
					testWindow tw = new testWindow(list);
					tw.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null,"Incorrect Answer Please try again" , "Incorrect", JOptionPane.PLAIN_MESSAGE);
				}
				
			}
			 
		 });
		 
		 p2.add(checkB);
		 add(p2, BorderLayout.SOUTH);
		 
		 addWindowListener(new WindowAdapter()
	        {
	            public void windowClosing(WindowEvent e)
	            {
	            	counter = -1;
	            }
	        });
		 
		 
	}

}
