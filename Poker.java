package Big_two;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
	private static Poker instance = null;
	ArrayList<Card> Poker;
	private Poker() {
		
		Poker = new ArrayList(52);
		
	}
	
	public static Poker getInstance() {
		
		return instance;
		
	}
	
	public void Shuffle() {
		
		Collections.shuffle(Poker);
		
	}
	
	
	public void initalize() {
		if(instance == null) {
		
			instance = new Poker();
			for(Suit s : Suit.values()) {
				
				for(Face f : Face.values()) {
					
					Poker.add(new Card(s.getValue(), f.getValue()));
				}
			}
		}
		
		else System.out.println("Already initialized. ");
	}
	
	public Card Pop() {
		
		return Poker.get(0);
		
	}
}
