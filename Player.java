package Big_two;
import java.util.ArrayList;

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
		
		for(Card c : cardList) {
			
			
			
		}
		
		return null;
	}
	
	
	
	public boolean Pass() {
		
		
		return false;
	}
	
	
	public boolean Play(int x[]) {
		
		
		
		return false;
	}
	
	
}
