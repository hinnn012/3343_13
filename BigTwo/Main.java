package BigTwo;

import java.util.ArrayList;
import BigTwo.Card;
public class Main {
	
	
	public static void main(String[] args) {
		
		String history = null;
		String input = null;
		boolean end = false; 
		boolean ture = false;
		ArrayList<Player> player = new ArrayList<Player>();
		
		System.out.println("Initializing...");
		
		
		System.out.println("Distributing Card...");
		Poker poker = Poker.getInstance();
		poker.initialize();  //Initialize the poker
		poker.shuffle();  	//Shuffle the card 
		
		for(Player p : player) {
			
			for(int i = 0; i < 13; i++) {
			Card card_to_be_assigned = poker.pop();
			p.Draw(card_to_be_assigned);
			
			}
		}
		
		System.out.println("Game start.");
		
		while(end == false){
			
			break; // break infinite loop , will be removed in final
			
		}		
		
	}
  
}
