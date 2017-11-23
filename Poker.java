package Big_two;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
	private static Poker instance = new Poker(); //Singleton
	ArrayList<Card> Poker;
	
	
	private Poker() {
		
		Poker = new ArrayList(52);
		
	}
	
	public static Poker getInstance() {
		
		return instance;
		
	}
	
	public void Shuffle() {
		
		Collections.shuffle(Poker); //Shuffle the Poker set
		
	}
	
	
	public void initalize() {
		
		
		for(Suit s : Suit.values()) {
				
			for(Face f : Face.values()) {
					
				Poker.add(new Card(s.getValue(), f.getValue()));
				
			}
		}
			
	}
	
	//Function for picking the first card 
	public Card Pop() {
		
		Card requireCard = Poker.get(0);
		Poker.remove(0);
		return requiredCard;
		
	}
}
