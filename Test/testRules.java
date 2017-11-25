package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import BigTwo.RuleController;
import BigTwo.Card;

public class testRules {

	@Test
	public void testPair_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "clubs");
		Card card2 = new Card("10", "spades");
		myList.add(card1);
		myList.add(card2);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Pair(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void testThreeOfKind_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("3", "spades");
		Card card2 = new Card("3", "diamonds");
		Card card3 = new Card("3", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.ThreeOfKind(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void testStraight_1() throws Exception {
		
	}
	
	@Test
	public void testFlush_1() throws Exception {
		
	}

}
