package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import BigTwo.Player;
import BigTwo.Card;
import java.util.ArrayList;

public class testPlayer {

	@Test
	public void testPlayer_1() throws Exception {
		
		ArrayList<Card> myList = new ArrayList<Card>();
		Card card1 = new Card("4", "spades");
		Card card2 = new Card("6", "diamonds");
		Card card3 = new Card("A", "clubs");
		Card card4 = new Card("9", "hearts");
		Card card5 = new Card("10", "clubs");
		Card card6 = new Card("10", "spades");
		Card card7 = new Card("2", "diamonds");
		Card card8 = new Card("3", "clubs");
		Card card9 = new Card("4", "hearts");
		Card card10 = new Card("5", "clubs");
		Card card11 = new Card("J", "clubs");
		Card card12 = new Card("Q", "hearts");
		Card card13 = new Card("K", "diamonds");
		myList.add(card1);
		myList.add(card2);
		myList.add(card3);
		myList.add(card4);
		myList.add(card5);
		myList.add(card6);
		myList.add(card7);
		myList.add(card8);
		myList.add(card9);
		myList.add(card10);
		myList.add(card11);
		myList.add(card12);
		myList.add(card13);
		
		Player player = new Player("Silva");
		
		player.setCardList(myList);
		
		int test[] = {1, 9};
		
		boolean result = player.Play(test);
		
		assertEquals(true, result);
		
		
	}
}
