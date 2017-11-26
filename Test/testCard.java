package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import BigTwo.Card;


public class testCard {

	@Test
	public void testCard_1() throws Exception {
	
		String face = "test";
		Card card = new Card(face, "diamond");
		assertEquals(true, card.getFace().equals(face));
		
	}
	
	@Test
	public void testCard_2() throws Exception {
		
		String suit = "test";
		Card card = new Card("ace", suit);
		assertEquals(true, card.getSuit().equals(suit));
		
	}
}
