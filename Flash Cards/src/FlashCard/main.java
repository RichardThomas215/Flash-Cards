package FlashCard;

import java.sql.SQLException;
import java.util.ArrayList;

public class main {
	
	
	public static void main(String [] args) {
		ArrayList<Card> list = new ArrayList<Card>();
		
		FirstWindow f = new FirstWindow(list);
		f.setVisible(true);
		
	
	}

}
