package Big_Two;

public class Card {

	private String face;	//e.g. ace to king
	private String suit;	//e.g. diamond to spade
	
	public Card(String cFace, String cSuit) {
		
		face = cFace;
		suit = cSuit;
		
		
		
	}
	
	public String getFace() {
		
		return face;
		
	}
	
	public String getSuit() {
		
		return suit;
		
	}
	
}

