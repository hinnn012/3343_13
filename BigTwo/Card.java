package BigTwo;

public class Card implements Comparable<Card>{

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
	
	public int getIntFace() {
		
		Integer intFace = 0;
		switch(face){
		case "A" :intFace= 14;break;
		case "2" :intFace= 15;break;
		case "3" :intFace= 3;break;
		case "4" :intFace= 4;break;
		case "5" :intFace= 5;break;
		case "6" :intFace= 6;break;
		case "7" :intFace= 7;break;
		case "8" :intFace= 8;break;
		case "9" :intFace= 9;break;
		case "10":intFace= 10;break;
		case "J" :intFace= 11;break;
		case "Q" :intFace= 12;break;
		case "K" :intFace= 13;break;
		}
		return intFace;
		
		
		
	}

	@Override
	public int compareTo(Card next) {
		
		// TODO Auto-generated method stub
		return this.getIntFace() - next.getIntFace();
	}
}

