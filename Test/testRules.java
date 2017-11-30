package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import BigTwo.RuleController;
import Exception.CannotPassYourOwnLoopException;
import Exception.InputNotValidException;
import Exception.InvalidPatternException;
import Exception.InvalidRankException;
import Exception.PatternNotRecognizeException;
import BigTwo.Card;

public class testRules {

	@Test
	public void testPair_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "club");
		Card card2 = new Card("10", "spade");
		myList.add(card1);
		myList.add(card2);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Pair(myList);
		assertEquals(true, result);
	}

	@Test
	public void testPair_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("4", "club");
		Card card2 = new Card("9", "spade");
		myList.add(card1);
		myList.add(card2);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Pair(myList);
		assertEquals(false, result);
	}

	@Test
	public void testThreeOfKind_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("3", "diamond");
		Card card3 = new Card("3", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.ThreeOfKind(myList);
		assertEquals(true, result);
	}

	@Test
	public void testThreeOfKind_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("K", "spade");
		Card card2 = new Card("Q", "spade");
		Card card3 = new Card("J", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.ThreeOfKind(myList);
		assertEquals(false, result);
	}

	@Test
	public void testThreeOfKind_3() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("K", "spade");
		Card card2 = new Card("K", "heart");
		Card card3 = new Card("J", "spade");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.ThreeOfKind(myList);
		assertEquals(false, result);
	}

	@Test
	public void testThreeOfKind_4() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("2", "spade");
		Card card2 = new Card("3", "club");
		Card card3 = new Card("2", "heart");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.ThreeOfKind(myList);
		assertEquals(false, result);
	}

	@Test
	public void testStraight_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "diamond");
		Card card3 = new Card("5", "club");
		Card card4 = new Card("A", "heart");
		Card card5 = new Card("2", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Straight(myList);
		assertEquals(true, result);
	}

	@Test
	public void testStraight_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("5", "club");
		Card card2 = new Card("6", "spade");
		Card card3 = new Card("7", "heart");
		Card card4 = new Card("8", "diamond");
		Card card5 = new Card("9", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Straight(myList);
		assertEquals(true, result);
	}

	@Test
	public void testStraight_3() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("4", "club");
		Card card2 = new Card("5", "spade");
		Card card3 = new Card("10", "heart");
		Card card4 = new Card("K", "diamond");
		Card card5 = new Card("2", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Straight(myList);
		assertEquals(false, result);
	}

	@Test
	public void testStraight_4() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("4", "club");
		Card card2 = new Card("5", "spade");
		Card card3 = new Card("7", "heart");
		Card card4 = new Card("A", "diamond");
		Card card5 = new Card("2", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Straight(myList);
		assertEquals(false, result);
	}

	@Test
	public void testStraight_5() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("2", "club");
		Card card2 = new Card("3", "spade");
		Card card3 = new Card("4", "heart");
		Card card4 = new Card("4", "diamond");
		Card card5 = new Card("6", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Straight(myList);
		assertEquals(false, result);
	}

	@Test
	public void testStraight_6() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("3", "club");
		Card card2 = new Card("4", "spade");
		Card card3 = new Card("5", "heart");
		Card card4 = new Card("6", "diamond");
		Card card5 = new Card("2", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Straight(myList);
		assertEquals(true, result);
	}

	@Test // no. of iteration = 0
	public void testFlush_1() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "club");
		Card card2 = new Card("8", "heart");
		Card card3 = new Card("4", "club");
		Card card4 = new Card("2", "club");
		Card card5 = new Card("3", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Flush(myList);
		assertEquals(false, result);
	}

	@Test // no. of iteration = 1
	public void testFlush_2() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("9", "club");
		Card card2 = new Card("8", "club");
		Card card3 = new Card("4", "heart");
		Card card4 = new Card("2", "club");
		Card card5 = new Card("3", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Flush(myList);
		assertEquals(false, result);
	}

	@Test // no. of iteration > 1
	public void testFlush_3() throws Exception {
		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "club");
		Card card2 = new Card("8", "club");
		Card card3 = new Card("4", "club");
		Card card4 = new Card("2", "club");
		Card card5 = new Card("3", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.Flush(myList);
		assertEquals(true, result);
	}

	@Test
	public void testStraightFlush_1() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "club");
		Card card2 = new Card("7", "club");
		Card card3 = new Card("8", "club");
		Card card4 = new Card("9", "club");
		Card card5 = new Card("10", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.StraightFlush(myList);
		assertEquals(true, result);
	}

	@Test
	public void testStraightFlush_2() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "heart");
		Card card2 = new Card("7", "club");
		Card card3 = new Card("8", "diamond");
		Card card4 = new Card("9", "club");
		Card card5 = new Card("10", "club");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.StraightFlush(myList);
		assertEquals(false, result);
	}

	@Test
	public void testStraightFlush_3() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "heart");
		Card card2 = new Card("10", "heart");
		Card card3 = new Card("K", "heart");
		Card card4 = new Card("A", "heart");
		Card card5 = new Card("10", "heart");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.StraightFlush(myList);
		assertEquals(false, result);
	}

	@Test
	public void testStraightFlush_4() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "heart");
		Card card2 = new Card("10", "club");
		Card card3 = new Card("K", "diamond");
		Card card4 = new Card("A", "club");
		Card card5 = new Card("10", "spade");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.StraightFlush(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFourOfKind_1() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("2", "heart");
		Card card2 = new Card("2", "spade");
		Card card3 = new Card("2", "diamond");
		Card card4 = new Card("2", "club");
		Card card5 = new Card("9", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(true, result);
	}

	@Test
	public void testFourOfKind_2() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("10", "spade");
		Card card3 = new Card("10", "diamond");
		Card card4 = new Card("7", "club");
		Card card5 = new Card("10", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(true, result);
	}

	@Test
	public void testFourOfKind_3() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("10", "spade");
		Card card3 = new Card("A", "diamond");
		Card card4 = new Card("10", "club");
		Card card5 = new Card("10", "diamond");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(true, result);
	}

	@Test
	public void testFourOfKind_4() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "heart");
		Card card2 = new Card("2", "spade");
		Card card3 = new Card("6", "spade");
		Card card4 = new Card("6", "club");
		Card card5 = new Card("6", "diamond");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(true, result);
	}

	@Test
	public void testFourOfKind_5() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "heart");
		Card card2 = new Card("7", "spade");
		Card card3 = new Card("7", "heart");
		Card card4 = new Card("7", "club");
		Card card5 = new Card("7", "diamond");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(true, result);
	}

	@Test
	public void testFourOfKind_6() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "heart");
		Card card2 = new Card("7", "spade");
		Card card3 = new Card("3", "heart");
		Card card4 = new Card("J", "club");
		Card card5 = new Card("K", "diamond");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFourOfKind_7() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "heart");
		Card card2 = new Card("A", "spade");
		Card card3 = new Card("10", "heart");
		Card card4 = new Card("5", "club");
		Card card5 = new Card("4", "diamond");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFourOfKind_8() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "heart");
		Card card2 = new Card("A", "spade");
		Card card3 = new Card("5", "diamond");
		Card card4 = new Card("A", "club");
		Card card5 = new Card("4", "diamond");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		result = ruleCtrl.FourOfKind(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_1() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "heart");
		Card card2 = new Card("J", "spade");
		Card card3 = new Card("J", "club");
		Card card4 = new Card("3", "spade");
		Card card5 = new Card("3", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(true, result);
	}

	@Test
	public void testFullHouse_2() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "heart");
		Card card2 = new Card("10", "spade");
		Card card3 = new Card("10", "club");
		Card card4 = new Card("J", "spade");
		Card card5 = new Card("3", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_3() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("10", "spade");
		Card card3 = new Card("10", "club");
		Card card4 = new Card("A", "diamond");
		Card card5 = new Card("J", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_4() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("7", "spade");
		Card card3 = new Card("7", "club");
		Card card4 = new Card("6", "diamond");
		Card card5 = new Card("6", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_5() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("10", "spade");
		Card card3 = new Card("10", "club");
		Card card4 = new Card("10", "diamond");
		Card card5 = new Card("6", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_6() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "heart");
		Card card2 = new Card("J", "spade");
		Card card3 = new Card("10", "club");
		Card card4 = new Card("J", "diamond");
		Card card5 = new Card("J", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_7() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("3", "heart");
		Card card2 = new Card("3", "spade");
		Card card3 = new Card("J", "diamond");
		Card card4 = new Card("J", "spade");
		Card card5 = new Card("J", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(true, result);
	}

	@Test
	public void testFullHouse_8() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "heart");
		Card card2 = new Card("10", "spade");
		Card card3 = new Card("2", "club");
		Card card4 = new Card("2", "spade");
		Card card5 = new Card("2", "diamond");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_9() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("10", "spade");
		Card card3 = new Card("Q", "club");
		Card card4 = new Card("Q", "diamond");
		Card card5 = new Card("J", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_10() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("7", "spade");
		Card card3 = new Card("10", "club");
		Card card4 = new Card("10", "diamond");
		Card card5 = new Card("10", "spade");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testFullHouse_11() {

		boolean result;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "heart");
		Card card2 = new Card("9", "spade");
		Card card3 = new Card("3", "club");
		Card card4 = new Card("K", "diamond");
		Card card5 = new Card("6", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();

		result = ruleCtrl.FullHouse(myList);
		assertEquals(false, result);
	}

	@Test
	public void testCheckPattern_1() {

		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");

		myList.add(card1);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		result = ruleCtrl.checkPattern(myList);
		assertEquals("one", result);
	}

	@Test
	public void testCheckPattern_2() {
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("10", "heart");
		Card card2 = new Card("10", "club");

		myList.add(card1);
		myList.add(card2);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Pair", result);
	}

	@Test
	public void testCheckPattern_3() {
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("6", "heart");
		Card card2 = new Card("10", "club");

		myList.add(card1);
		myList.add(card2);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Invalid", result);
	}

	@Test
	public void testCheckPattern_4() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "heart");
		Card card2 = new Card("A", "spade");
		Card card3 = new Card("A", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Three Of Kind", result);
	}

	@Test
	public void testCheckPattern_5() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "heart");
		Card card2 = new Card("Q", "spade");
		Card card3 = new Card("4", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Invalid", result);
	}

	@Test
	public void testCheckPattern_6() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("3", "heart");
		Card card2 = new Card("4", "spade");
		Card card3 = new Card("5", "club");
		Card card4 = new Card("6", "spade");
		Card card5 = new Card("7", "club");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Straight", result);
	}

	@Test
	public void testCheckPattern_7() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("J", "heart");
		Card card2 = new Card("2", "heart");
		Card card3 = new Card("4", "heart");
		Card card4 = new Card("5", "heart");
		Card card5 = new Card("7", "heart");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Flush", result);
	}

	@Test
	public void testCheckPattern_8() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("Q", "heart");
		Card card2 = new Card("Q", "heart");
		Card card3 = new Card("Q", "heart");
		Card card4 = new Card("Q", "heart");
		Card card5 = new Card("5", "heart");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Four Of Kind", result);
	}

	@Test
	public void testCheckPattern_9() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("3", "heart");
		Card card2 = new Card("4", "heart");
		Card card3 = new Card("5", "heart");
		Card card4 = new Card("A", "heart");
		Card card5 = new Card("2", "heart");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Straight Flush", result);
	}

	@Test
	public void testCheckPattern_10() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("A", "heart");
		Card card2 = new Card("A", "spade");
		Card card3 = new Card("A", "club");
		Card card4 = new Card("J", "heart");
		Card card5 = new Card("J", "heart");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Full House", result);
	}

	@Test
	public void testCheckPattern_11() {

		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("5", "heart");
		Card card2 = new Card("4", "spade");
		Card card3 = new Card("A", "club");
		Card card4 = new Card("10", "heart");
		Card card5 = new Card("K", "heart");

		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);

		RuleController ruleCtrl = RuleController.getInstance();
		;

		String result = ruleCtrl.checkPattern(myList);
		assertEquals("Invalid", result);
	}

	@Test
	public void testCheckPattern_12() {

		String result = null;
		ArrayList<Card> myList = new ArrayList<Card>();

		RuleController ruleCtrl = RuleController.getInstance();
		;

		result = ruleCtrl.checkPattern(myList);
		assertEquals("Invalid", result);
	}

	@Test
	public void testAscenCard_1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new Card("4", "diamond"));
		cards.add(new Card("5", "club"));
		cards.add(new Card("6", "spade"));
		cards.add(new Card("7", "club"));
		cards.add(new Card("8", "club"));

		RuleController ruleCtrl = RuleController.getInstance();
		String result = ruleCtrl.ascenCard(cards);
		System.out.print(result);
		assertEquals("diamond4 club5 spade6 club7 club8 ", result);

	}

	@Test
	public void testAscenCard_2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new Card("4", "diamond"));
		cards.add(new Card("5", "club"));
		cards.add(new Card("8", "club"));
		cards.add(new Card("A", "spade"));
		cards.add(new Card("2", "spade"));

		RuleController ruleCtrl = RuleController.getInstance();
		String result = ruleCtrl.ascenCard(cards);
		assertEquals("spadeA spade2 diamond4 club5 club8 ", result);
	}

	@Test
	public void testAscenCard_3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new Card("3", "diamond"));
		cards.add(new Card("4", "club"));
		cards.add(new Card("5", "spade"));
		cards.add(new Card("7", "club"));
		cards.add(new Card("2", "club"));
		
		RuleController ruleCtrl = RuleController.getInstance();
		String result = ruleCtrl.ascenCard(cards);
		assertEquals("club2 diamond3 club4 spade5 club7 ", result);
	}

	@Test
	public void passCheck_1() throws CannotPassYourOwnLoopException {
		RuleController ruleCtrl = RuleController.getInstance();
		Boolean result = true;
		ruleCtrl.setLastValidPlayer("test");

		try {

			ruleCtrl.passCheck("test");

		} catch (CannotPassYourOwnLoopException e) {
			result = false;
		}

		assertEquals(false, result);
	}

	@Test
	public void passCheck_2() throws CannotPassYourOwnLoopException {
		RuleController ruleCtrl = RuleController.getInstance();
		Boolean result;
		ruleCtrl.setLastValidPlayer("Player1");

		try {

			ruleCtrl.passCheck("test");
			result = true;

		} catch (CannotPassYourOwnLoopException e) {
			result = false;
		}

		assertEquals(true, result);
	}

	@Test
	public void passCheck_3() throws CannotPassYourOwnLoopException {
		RuleController ruleCtrl = RuleController.getInstance();
		Boolean result;
		ruleCtrl.setLastValidPlayer("");

		try {

			ruleCtrl.passCheck("Player1");
			result = true;

		} catch (CannotPassYourOwnLoopException e) {
			result = false;
		}

		assertEquals(false, result);
	}

	@Test
	public void testStraightSmall_1() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "diamond");
		Card card3 = new Card("5", "diamond");
		Card card4 = new Card("A", "club");
		Card card5 = new Card("2", "heart");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Straight", cards);
		assertEquals(true, result);
	}

	@Test
	public void testStraightSmall_2() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "diamond");
		Card card3 = new Card("5", "diamond");
		Card card4 = new Card("6", "club");
		Card card5 = new Card("2", "heart");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Straight", cards);
		assertEquals(true, result);
	}

	@Test
	public void testStraightSmall_3() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "diamond");
		Card card3 = new Card("5", "diamond");
		Card card4 = new Card("6", "club");
		Card card5 = new Card("7", "heart");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Straight", cards);
		assertEquals(false, result);
	}

	@Test
	public void testStraightSmall_8() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("10", "spade");
		Card card2 = new Card("J", "diamond");
		Card card3 = new Card("Q", "diamond");
		Card card4 = new Card("K", "club");
		Card card5 = new Card("A", "heart");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Straight", cards);
		assertEquals(false, result);
	}

	@Test
	public void testStraightSmall_4() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "spade");
		Card card3 = new Card("5", "spade");
		Card card4 = new Card("A", "spade");
		Card card5 = new Card("2", "spade");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Straight", cards);
		assertEquals(true, result);
	}

	@Test
	public void testStraightSmall_5() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "spade");
		Card card3 = new Card("5", "spade");
		Card card4 = new Card("6", "spade");
		Card card5 = new Card("2", "spade");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Straight", cards);
		assertEquals(true, result);
	}

	@Test
	public void testStraightSmall_6() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("10", "spade");
		Card card2 = new Card("J", "spade");
		Card card3 = new Card("Q", "spade");
		Card card4 = new Card("K", "spade");
		Card card5 = new Card("A", "spade");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Straight", cards);
		assertEquals(false, result);
	}

	@Test
	public void testStraightSmall_7() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("10", "spade");
		Card card2 = new Card("10", "club");
		Card card3 = new Card("10", "heart");
		Card card4 = new Card("Q", "spade");
		Card card5 = new Card("Q", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.straightSmall("Full House", cards);
		assertEquals(false, result);
	}

	@Test
	public void testCalRank_1() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("4", "spade");
		Card card2 = new Card("5", "club");
		Card card3 = new Card("6", "heart");
		Card card4 = new Card("Q", "spade");
		Card card5 = new Card("Q", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		int result = ruleCtrl.calRank(cards, false);
		assertEquals(39, result);
	}

	@Test
	public void testCalRank_2() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("4", "spade");
		Card card2 = new Card("5", "club");
		Card card3 = new Card("6", "heart");
		Card card4 = new Card("J", "spade");
		Card card5 = new Card("Q", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		int result = ruleCtrl.calRank(cards, true);
		assertEquals(38, result);
	}

	@Test
	public void testCalRank_3() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("A", "spade");
		Card card2 = new Card("5", "club");
		Card card3 = new Card("6", "heart");
		Card card4 = new Card("J", "spade");
		Card card5 = new Card("2", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		int result = ruleCtrl.calRank(cards, true);
		assertEquals(25, result);
	}

	@Test
	public void testCalRank_4() {
		RuleController ruleCtrl = RuleController.getInstance();

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("A", "spade");
		Card card2 = new Card("5", "club");
		Card card3 = new Card("2", "heart");
		Card card4 = new Card("J", "spade");
		Card card5 = new Card("Q", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		int result = ruleCtrl.calRank(cards, false);
		assertEquals(57, result);
	}

	@Test
	public void testValid_1()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();

		ruleCtrl.setLastValidPlayer("");
		ruleCtrl.setLastPattern("");
		ruleCtrl.setLastRank(0);
		ruleCtrl.setLastWeight(0);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("6", "spade");
		Card card2 = new Card("6", "club");
		cards.add(card1);
		cards.add(card2);

		boolean result = ruleCtrl.valid(cards, "Player1");
		assertEquals(true, result);
	}

	@Test
	public void testValid_2()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();

		ruleCtrl.setLastValidPlayer("");
		ruleCtrl.setLastPattern("");
		ruleCtrl.setLastRank(0);
		ruleCtrl.setLastWeight(0);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "club");
		Card card3 = new Card("5", "heart");
		Card card4 = new Card("A", "spade");
		Card card5 = new Card("2", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.valid(cards, "Player1");
		assertEquals(true, result);
	}

	@Test
	public void testValid_3()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();

		ruleCtrl.setLastValidPlayer("");
		ruleCtrl.setLastPattern("");
		ruleCtrl.setLastRank(0);
		ruleCtrl.setLastWeight(0);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("J", "spade");
		Card card2 = new Card("Q", "club");
		Card card3 = new Card("K", "heart");
		Card card4 = new Card("A", "spade");
		Card card5 = new Card("2", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		boolean result = ruleCtrl.valid(cards, "Player1");
		assertEquals(true, result);
	}

	@Test
	public void testValid_4()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player1");
		ruleCtrl.setLastPattern("Pair");
		ruleCtrl.setLastRank(0);
		ruleCtrl.setLastWeight(0);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("J", "spade");
		Card card2 = new Card("Q", "club");
		Card card3 = new Card("K", "heart");
		Card card4 = new Card("A", "spade");
		Card card5 = new Card("2", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		try {
			result = ruleCtrl.valid(cards, "Player2");
		} catch (InvalidPatternException e) {
			result = false;
		}
		assertEquals(false, result);
	}

	@Test
	public void testValid_5()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player2");
		ruleCtrl.setLastPattern("Straight");
		ruleCtrl.setLastRank(25);
		ruleCtrl.setLastWeight(3);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("J", "spade");
		Card card2 = new Card("Q", "club");
		Card card3 = new Card("K", "heart");
		Card card4 = new Card("A", "spade");
		Card card5 = new Card("2", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		try {
			result = ruleCtrl.valid(cards, "Player3");
		} catch (InvalidRankException e) {
			result = false;
		}
		assertEquals(true, result);
	}

	@Test
	public void testValid_6()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player2");
		ruleCtrl.setLastPattern("Straight");
		ruleCtrl.setLastRank(25);
		ruleCtrl.setLastWeight(3);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("9", "spade");
		Card card2 = new Card("10", "club");
		Card card3 = new Card("J", "heart");
		Card card4 = new Card("Q", "spade");
		Card card5 = new Card("K", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		try {
			result = ruleCtrl.valid(cards, "Player3");
		} catch (InvalidRankException e) {
			result = false;
		}
		assertEquals(true, result);
	}

	@Test
	public void testValid_7()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player2");
		ruleCtrl.setLastPattern("Straight");
		ruleCtrl.setLastRank(50);
		ruleCtrl.setLastWeight(40);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "club");
		Card card3 = new Card("5", "heart");
		Card card4 = new Card("6", "spade");
		Card card5 = new Card("7", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		try {
			result = ruleCtrl.valid(cards, "Player3");
		} catch (InvalidRankException e) {
			result = false;
		}
		assertEquals(false, result);
	}

	@Test
	public void testValid_8()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player4");
		ruleCtrl.setLastPattern("Straight");
		ruleCtrl.setLastRank(50);
		ruleCtrl.setLastWeight(3);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "club");
		Card card3 = new Card("5", "heart");
		Card card4 = new Card("6", "spade");
		Card card5 = new Card("7", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		try {
			result = ruleCtrl.valid(cards, "Player4");
		} catch (PatternNotRecognizeException e) {
			result = false;
		}
		assertEquals(true, result);
	}

	@Test
	public void testValid_9()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player4");
		ruleCtrl.setLastPattern("Straight");
		ruleCtrl.setLastRank(50);
		ruleCtrl.setLastWeight(3);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "club");
		Card card3 = new Card("5", "heart");
		Card card4 = new Card("A", "spade");
		Card card5 = new Card("2", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		result = ruleCtrl.valid(cards, "Player4");
		assertEquals(true, result);
	}

	@Test
	public void testValid_10()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player4");
		ruleCtrl.setLastPattern("Flush");
		ruleCtrl.setLastRank(0);
		ruleCtrl.setLastWeight(0);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "club");
		Card card3 = new Card("7", "heart");

		cards.add(card1);
		cards.add(card2);
		cards.add(card3);

		try {
			result = ruleCtrl.valid(cards, "Player1");
		} catch (PatternNotRecognizeException e) {
			result = false;
		}
		assertEquals(false, result);
	}
	
	@Test
	public void testValid_11()
			throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException {
		RuleController ruleCtrl = RuleController.getInstance();
		boolean result;

		ruleCtrl.setLastValidPlayer("Player4");
		ruleCtrl.setLastPattern("Flush");
		ruleCtrl.setLastRank(50);
		ruleCtrl.setLastWeight(5);

		ArrayList<Card> cards = new ArrayList<>();
		Card card1 = new Card("3", "spade");
		Card card2 = new Card("4", "club");
		Card card3 = new Card("5", "heart");
		Card card4 = new Card("A", "spade");
		Card card5 = new Card("2", "diamond");
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		cards.add(card4);
		cards.add(card5);

		try {
			result = ruleCtrl.valid(cards, "Player1");
		} catch (InvalidRankException e) {
			result = false;
		}
		assertEquals(false, result);
	}
}
