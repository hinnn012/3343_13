package BigTwo;

import java.util.ArrayList;
import java.util.Scanner;

import BigTwo.Card;
import BigTwo.Player;
import BigTwo.Poker;
import Exception.InputMoreThanHandsException;
public class Main {
	
	
	public static void main(String[] args) {
		
		//String history = null;
		//String input = null;
		boolean end = false; 
		boolean true_input = false;
		int player_index = 0;
		ArrayList<Player> player = new ArrayList<Player>();
		ArrayList<String> history = new ArrayList<String>();
		String tmp_history;
		System.out.println("Initializing...");
		
		
		System.out.println("Distributing Card...");
		Poker poker = Poker.getInstance();
		poker.initialize();  //Initialize the poker
		poker.shuffle();  	//Shuffle the card 
		
		for(int i = 0 ; i < 3; i++) {
			
			
			Player p_i = new Player(Integer.toString(i+1));
			player.add(p_i);
			
		}
		
		
		for(Player p : player) {
			
			for(int i = 0; i < 13; i++) {
			Card card_to_be_assigned = poker.pop();
			try {
				p.Draw(card_to_be_assigned);
			} catch (InputMoreThanHandsException e) {
				System.out.println("Player should not play more than their hands : " + e.getSize());
				e.printStackTrace();
				}
			}
		}
		
		System.out.println("Game start.");
		Scanner c = new Scanner(System.in);
		try {
			while(end == false){
				//input = null;
				true_input = false;
				System.out.println("Player " + ( player_index + 1 ) + " turn");
				System.out.println("=============================================================================================");
				Player this_turn = player.get(player_index);
				System.out.println("History: ");
				
				for(String s : history) {
					
					System.out.println(s);
					
				}
				
				System.out.printf("Your Hand: { %s } \n", this_turn.showHands());
				
				while(!true_input) {
					
					System.out.print("Please enter your action (history/play/pass): ");
					
					String input = c.next();
					c.nextLine();
					
					if(input.equals("history")){
							
						
						System.out.flush(); 
						System.out.println("History:");
						
						if(!history.isEmpty()) {
								
								
							for(String s : history) {
						
								System.out.println(s);
								
							}
								
						}
							
						else System.out.println("No history. ");
					}
					
					else if(input.equals("play")) {
						
						
						System.out.print("Please enter index of card : ");
						String card_to_play = c.nextLine();
						String[] card_index =  card_to_play.split(" ");
						int [] card_inedx_int = new int[card_index.length];
						

						for(int i = 0; i < card_index.length; i++) {
							
							card_inedx_int[i] = Integer.parseInt(card_index[i]) - 1 ;
							
						}
						
						if(this_turn.Play(card_inedx_int)) {
							
							
							System.out.println("You have played " + this_turn.returnlastAction());
							tmp_history = "Player " + (player_index + 1) + "played" + this_turn.returnlastAction() + "."; 
							history.add(tmp_history);
							true_input = true;
						}
						
						else System.out.print("Your Input Pattern is not correct!");
						
					}
					
					else if(input.equals("pass")) {
						
						
						if(this_turn.Pass()) {
							tmp_history = "Player " + (player_index + 1) + "passed."; 
							history.add(tmp_history);
							true_input = true;
						}
						
					}
					
					else {
						
						continue;
						
					}
					
					
					
				}
				
				
				
				player_index++;
				
				if(player_index == 4) {
					player_index = 0;
				}
				
				
				//break; // break infinite loop , will be removed in final
				
				//clear console
				System.out.print("\033[H\033[2J"); 
			    System.out.flush(); 
			   
			}
			 c.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
  
}
