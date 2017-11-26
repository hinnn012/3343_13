package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import BigTwo.Suit;


public class testSuit {

	@Test
	public void testSuit_1() throws Exception {
	
		String test = "\u2665";
		assertEquals(false,Suit.diamonds.getValue().equals(test));
		
	}
	
	@Test
	public void testSuit_2() throws Exception {
		
		String test = "\u2666";
		assertEquals(true,Suit.diamonds.getValue().equals(test));
		
	}
}

