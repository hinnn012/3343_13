package Big_two;
import java.util.ArrayList;

import javax.smartcardio.Card;

public class Player {
	
	private ArrayList<Card> cardList ;
	private String name;
	private String ValidAction = null;
	
	public Player(String aName) {
		
		aName = name;
		cardList = new ArrayList<>();
		
	}
	
	
	//Add cards to players
	
	public void addHands(Card card) {
		
		cardList.add(card);
		
		
	}
	
	//Display all player's cards
	
	public String showHands() {
		String otuput = "";
		for(int i = 1; i< cardList.size(); i++) {
			
			output += i + ": " + cardList.get(i-1).getSuit() + cardList.get(i-1).getFace() + " ";
			
		}
		
		return output;
	}
	
	
	
	public boolean Pass() {
		
		
		return true;
	}
	
	public boolean Play(int x[]) {
		
		//int num_of_card = x.length();
		
		ArrayList<Card> Card_to_be_played = new ArrayList();
		
		for(int c: x) {
			
			Card_to_be_played(cardList.get(c));
			
		}
		
		return false;
	}
	
	
}
