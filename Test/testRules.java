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
	public void testPair_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("4", "clubs");
		Card card2 = new Card("9", "spades");
		myList.add(card1);
		myList.add(card2);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Pair(myList);
		assertEquals(false, result);
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
	public void testThreeOfKind_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("K", "spades");
		Card card2 = new Card("Q", "spades");
		Card card3 = new Card("J", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.ThreeOfKind(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void testStraight_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "spades");
		Card card2 = new Card("2", "diamonds");
		Card card3 = new Card("3", "clubs");
		Card card4 = new Card("4", "hearts");
		Card card5 = new Card("5", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Straight(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void testStraight_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("5", "clubs");
		Card card2 = new Card("6", "spades");
		Card card3 = new Card("7", "hearts");
		Card card4 = new Card("8", "diamonds");
		Card card5 = new Card("9", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Straight(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void testStraight_3() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("5", "clubs");
		Card card2 = new Card("4", "spades");
		Card card3 = new Card("10", "hearts");
		Card card4 = new Card("K", "diamonds");
		Card card5 = new Card("2", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Straight(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void testStraight_4() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("Q", "clubs");
		Card card2 = new Card("K", "spades");
		Card card3 = new Card("A", "hearts");
		Card card4 = new Card("2", "diamonds");
		Card card5 = new Card("3", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Straight(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void testStraight_5() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "clubs");
		Card card2 = new Card("J", "spades");
		Card card3 = new Card("Q", "hearts");
		Card card4 = new Card("K", "diamonds");
		Card card5 = new Card("A", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Straight(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void testFlush_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "clubs");
		Card card2 = new Card("8", "clubs");
		Card card3 = new Card("4", "clubs");
		Card card4 = new Card("2", "clubs");
		Card card5 = new Card("3", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Flush(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void testFlush_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("9", "clubs");
		Card card2 = new Card("8", "hearts");
		Card card3 = new Card("4", "clubs");
		Card card4 = new Card("2", "diamonds");
		Card card5 = new Card("3", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.Flush(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void testStraightFlush_1() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "clubs");
		Card card2 = new Card("7", "clubs");
		Card card3 = new Card("8", "clubs");
		Card card4 = new Card("9", "clubs");
		Card card5 = new Card("10", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.StraightFlush(myList);
		assertEquals(true, result);
	}

	@Test
	public void testStraightFlush_2() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "hearts");
		Card card2 = new Card("7", "clubs");
		Card card3 = new Card("8", "diamonds");
		Card card4 = new Card("9", "clubs");
		Card card5 = new Card("10", "clubs");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.StraightFlush(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void testStraightFlush_3() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "hearts");
		Card card2 = new Card("10", "hearts");
		Card card3 = new Card("K", "hearts");
		Card card4 = new Card("A", "hearts");
		Card card5 = new Card("10", "hearts");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.StraightFlush(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void testStraightFlush_4() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "hearts");
		Card card2 = new Card("10", "clubs");
		Card card3 = new Card("K", "diamonds");
		Card card4 = new Card("A", "clubs");
		Card card5 = new Card("10", "spades");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController rulecontroller = new RuleController();
		result = rulecontroller.StraightFlush(myList);
		assertEquals(false, result);
	}
	
class stubRuleController extends RuleController {
		
		public String checkPattern(ArrayList<Card> myList){
			
			if (myList.size() == 1) {
				return "one";
			}else if (myList.size() == 2 && myList.get(0).getFace().equals("10") && myList.get(1).getFace().equals("10")) {
				return "pair";
			}else if (myList.size() == 3 && myList.get(0).getFace().equals("A") && myList.get(1).getFace().equals("A") && myList.get(2).getFace().equals("A")) {
				return "ThreeOfKind";
			}else if (myList.size() == 5) {
				if (myList.get(0).getFace().equals("8")) {
					return "Straight";
				}else if (myList.get(0).getFace().equals("J")) {
					return "Flush";
				}
			}
			
			return "Invalid";
		}
	}
	
	@Test
	public void testCheckPatter_1() {
		
		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "hearts");
		
		myList.add(card1);
		
		stubRuleController stubrulecontroller = new stubRuleController();
		
		result = stubrulecontroller.checkPattern(myList);
		assertEquals("one", result);
	}
	
	@Test
	public void testCheckPatter_2() {
		
		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "hearts");
		Card card2 = new Card("10", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		
		stubRuleController stubrulecontroller = new stubRuleController();
		
		result = stubrulecontroller.checkPattern(myList);
		assertEquals("pair", result);
	}
	
	@Test
	public void testCheckPatter_3() {
		
		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "hearts");
		Card card2 = new Card("A", "spades");
		Card card3 = new Card("A", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		
		stubRuleController stubrulecontroller = new stubRuleController();
		
		result = stubrulecontroller.checkPattern(myList);
		assertEquals("ThreeOfKind", result);
	}
	
	@Test
	public void testCheckPatter_4() {
		
		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("8", "hearts");
		Card card2 = new Card("2", "spades");
		Card card3 = new Card("4", "clubs");
		Card card4 = new Card("5", "spades");
		Card card5 = new Card("7", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		
		stubRuleController stubrulecontroller = new stubRuleController();
		
		result = stubrulecontroller.checkPattern(myList);
		assertEquals("Straight", result);
	}
	
	@Test
	public void testCheckPatter_5() {
		
		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "hearts");
		Card card2 = new Card("2", "spades");
		Card card3 = new Card("4", "clubs");
		Card card4 = new Card("5", "spades");
		Card card5 = new Card("7", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		
		stubRuleController stubrulecontroller = new stubRuleController();
		
		result = stubrulecontroller.checkPattern(myList);
		assertEquals("Flush", result);
	}
	
	@Test
	public void testCheckPatter_6() {
		
		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();
		
		stubRuleController stubrulecontroller = new stubRuleController();
		
		result = stubrulecontroller.checkPattern(myList);
		assertEquals("Invalid", result);
	}
	
	@Test
	public void fourOfKind_1() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("2", "hearts");
		Card card2 = new Card("2", "spades");
		Card card3 = new Card("2", "diamonds");
		Card card4 = new Card("2", "clubs");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);

		RuleController rulecontroller = new RuleController();
		result = rulecontroller.FourOfKind(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void fourOfKind_2() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "hearts");
		Card card2 = new Card("3", "spades");
		Card card3 = new Card("4", "diamonds");
		Card card4 = new Card("7", "clubs");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);

		RuleController rulecontroller = new RuleController();
		result = rulecontroller.FourOfKind(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void fullHouse_1() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "hearts");
		Card card2 = new Card("J", "spades");
		Card card3 = new Card("J", "clubs");
		Card card4 = new Card("3", "spades");
		Card card5 = new Card("3", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		
		RuleController rulecontroller = new RuleController();
		
		result = rulecontroller.FullHouse(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void fullHouse_2() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "hearts");
		Card card2 = new Card("10", "spades");
		Card card3 = new Card("2", "clubs");
		Card card4 = new Card("6", "spades");
		Card card5 = new Card("3", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		
		RuleController rulecontroller = new RuleController();
		
		result = rulecontroller.FullHouse(myList);
		assertEquals(false, result);
	}
	
	@Test
	public void fullHouse_3() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "hearts");
		Card card2 = new Card("J", "spades");
		Card card3 = new Card("10", "clubs");
		Card card4 = new Card("J", "diamonds");
		Card card5 = new Card("J", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		
		RuleController rulecontroller = new RuleController();
		
		result = rulecontroller.FullHouse(myList);
		assertEquals(true, result);
	}
	
	@Test
	public void fullHouse_4() {
		
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "hearts");
		Card card2 = new Card("J", "spades");
		Card card3 = new Card("J", "clubs");
		Card card4 = new Card("J", "diamonds");
		Card card5 = new Card("10", "clubs");
		
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		
		RuleController rulecontroller = new RuleController();
		
		result = rulecontroller.FullHouse(myList);
		assertEquals(true, result);
	}
}
