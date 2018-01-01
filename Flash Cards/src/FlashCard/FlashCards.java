package FlashCard;

import java.util.ArrayList;
import java.util.Scanner;

public class FlashCards {

	static ArrayList<Card> list = new ArrayList<Card>();
	static int size = 0;

	public static void createCard(String f, String b) {
		Card newCard = new Card(f, b);
		addCard(newCard);
	}

	public static void addCard(Card card) {
		list.add(card);
		size++;

	}

	public static void display() {
		int counter = 0;
		Card temp;
		
		while (counter <= list.size()-1) {
			
		temp = list.get(counter);
			
		System.out.println(temp.front);
		System.out.println(temp.back);
		counter++;
			
		}
		

	}
	public static void study () {
		int counter = 0;
		String UserInput;
		Card temp;
		
		System.out.println("What would you Like to study/review?");
		Scanner scan = new Scanner(System.in);
		UserInput = scan.nextLine();
		
		while(counter <= list.size()-1) {
			temp = list.get(counter);
			
		    if(UserInput.compareToIgnoreCase(temp.getFront()) == 0){
		    	System.out.println(temp.getFront());
		    	System.out.println(temp.getBack());
		    	break;
		    }
		}
		
	}
	
	public static void test() {
		int counter = 0;
		String userIn;
		Card temp;
		
		while(counter <= list.size()-1) {
			
			temp = list.get(counter);
			System.out.println(temp.getFront());
			Scanner userI = new Scanner(System.in);
			userIn = userI.nextLine();
			
			if(userIn.compareToIgnoreCase(temp.getBack()) == 0) {
				System.out.println("Correct!");
				counter++;
			}else {
				System.out.println("Incorrect try again");
			}
		}
	}

	public static void main(String[] args) {
		int run = 0;
		String Command;
		String Front;
		String Back;

		while (run != 1) {
			System.out.println("What would you like to do?");
		//	System.out.println("add - add new card");

			Scanner scan = new Scanner(System.in);
			Command = scan.nextLine();

			if (Command.compareToIgnoreCase("add") == 0) {
				System.out.println("What will the front say?");
				Scanner scan2 = new Scanner(System.in);
				Front = scan2.nextLine();

				System.out.println("What will the back say?");
				Scanner scan3 = new Scanner(System.in);
				Back = scan3.nextLine();

				createCard(Front, Back);
				
			}if (Command.compareToIgnoreCase("end") == 0) {
				run++;
			}if(Command.compareToIgnoreCase("display") == 0) {
				display();
			}if(Command.compareToIgnoreCase("study") == 0) {
				study();
			}
			if(Command.compareToIgnoreCase("test") == 0) {
				test();
				
			}
		}
	}
}
