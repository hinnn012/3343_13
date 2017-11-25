package BigTwo;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
	private static Poker instance = new Poker(); //Singleton
	ArrayList<Card> Poker;
	
	
	private Poker() {
		
		Poker = new ArrayList<>(52);
		
	}
	
	public static Poker getInstance() {
		
		return instance;
		
	}
	
	public void shuffle() {
		
		Collections.shuffle(Poker); //Shuffle the Poker set
		
	}
	
	
	public void initialize() {
		
		
		for(Suit s : Suit.values()) {
				
			for(Face f : Face.values()) {
					
				Poker.add(new Card(s.getValue(), f.getValue()));
				
			}
		}
			
	}
	
	//Function for picking the first card 
	public Card pop() {
		
		Card requiredCard = Poker.get(0);
		Poker.remove(0);
		return requiredCard;
		
	}
}
