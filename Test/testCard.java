package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import BigTwo.Card;


public class testCard {

	@Test
	public void testCard_1() throws Exception {
	
		String face = "A";
		Card card = new Card(face, "diamond");
		assertEquals(true, card.getFace().equals(face));
		
	}
	
	@Test
	public void testCard_2() throws Exception {
		
		String suit = "spade";
		Card card = new Card("ace", suit);
		assertEquals(true, card.getSuit().equals(suit));
		
	}
	
	@Test
	public void testCard_3() throws Exception {
		
		Card card = new Card("4", "heart");
		int result = card.getIntFace();
		assertEquals(true, (result == 4));
		
	}
	
	@Test
	public void testCard_4() throws Exception {
		
		Card card1 = new Card("J", "club");
		Card card2 = new Card("3", "diamond");
		int result = card1.compareTo(card2);
		assertEquals(true, (result == 8));
		
	}
}
