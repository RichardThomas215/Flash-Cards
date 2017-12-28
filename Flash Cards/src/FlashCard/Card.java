package FlashCard;

public class Card {

 String front;	
 String back;
 
   public Card (String f, String b) {
	   front = f;
	   back = b;
   }
   
   public void setFront(String f) {
	   this.front = f;
   }
	
   public void setBack(String b) {
	   this.back = b;
   }
   
   public String getFront() {
	   return this.front;
   }
   
   public String getBack() {
	   return this.back;
   }
}
