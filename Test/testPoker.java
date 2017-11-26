package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import BigTwo.Card;
import BigTwo.Poker;


public class testPoker {

	@Test
	public void testPoker_1() throws Exception {
	
		Poker instance = Poker.getInstance();
		instance.initialize();
		instance.shuffle();
		Card card = instance.pop();
		boolean result = card instanceof Card;
		assertEquals(true, result);
		
	}
	
}
