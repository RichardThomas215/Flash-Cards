package FlashCard;

import java.sql.*;

public class DBConnect {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "");
			st = con.createStatement();
			
		}catch(Exception ex) {
			System.out.println("Error: "+ex);
		}
	}
	
	public void getData() {
		try {
			
			String query = "select * from cards";
			rs = st.executeQuery(query);
			System.out.println("Records from DataBase");
			
			while(rs.next()) {
				String front = rs.getString("Front");
				String back = rs.getString("Back");
				
				System.out.println("Front: "+ front);
				System.out.println("Back: "+ back);
			}
			
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	public Card getCard() throws SQLException {
		
		
		try {
			String query = "select * from cards";
			 rs = st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		rs.next();

		String front = rs.getString("Front");
		String back = rs.getString("Back");
		
		Card newCard = new Card(front, back);
		
		return newCard;
		
		
		 
	}
	
}
