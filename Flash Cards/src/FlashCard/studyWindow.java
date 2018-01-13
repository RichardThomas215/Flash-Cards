package FlashCard;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class studyWindow extends JFrame {

   static int counter = -1;
	Card temp;
	
    public studyWindow(ArrayList<Card> list) {
    	
    	super("Reviewing");
    	//setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	setSize(400, 400);
    	counter++;
    	System.out.println(counter);
    	
    	JPanel j1 = new JPanel ();
    	
    	//while(counter <= list.size()-1) {
    		
    		temp = list.get(counter);
    		//System.out.println("in loop");
    		JLabel jFront = new JLabel(temp.getFront());
    		j1.add(jFront);
    		
    		JLabel jBack = new JLabel(temp.getBack());
    		j1.add(jBack , BorderLayout.SOUTH);
    		add(j1, BorderLayout.CENTER);
    		
    		JPanel j2 = new JPanel();
    		JButton jb = new JButton("Next");
    		
    		 
    		 
    		jb.addActionListener(new ActionListener() {

    			@Override
    			public void actionPerformed(ActionEvent e) {
    				studyWindow sw = new studyWindow(list);
    				sw.setVisible(true);
    			}
    			
    		});
    		j2.add(jb);
    		
    		 addWindowListener(new WindowAdapter()
    	        {
    	            public void windowClosing(WindowEvent e)
    	            {
    	            	counter = -1;
    	            }
    	        });
    		
    		
    		add(j2, BorderLayout.SOUTH);
    		
    		
    	//}
    	
    	
    }
    
    public void study(ArrayList<Card> list) {
    	
    	
    }
}
