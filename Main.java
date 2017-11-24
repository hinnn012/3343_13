import java.util.ArrayList;
import javax.smartcardio.Card;
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
			
			Card card_to_be_assigned = poker.pop();
			p.Draw(card_to_be_assigned);
			
		}
		
		while(end == false){
			
			break; // break infinite loop , will be removed in final
			
		}		
		
	}
  
}
