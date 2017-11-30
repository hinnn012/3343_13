package BigTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import BigTwo.Card;
import BigTwo.Player;
import BigTwo.Poker;
import Exception.InputCannotBeNullException;
import Exception.InputMoreThanHandsException;
import Exception.InputNotActionException;
public class Main {
	
	
	public static void main(String[] args) {
		
		//String history = null;
		//String input = null;
		boolean end = false; 
		boolean true_input = false;
		int player_index = 0;
		ArrayList<Player> player = new ArrayList<Player>();
		History history = null;
		//ArrayList<String> history = new ArrayList<String>();
		String tmp_history;
		List<String> actions = Arrays.asList(new String[] {"history", "play", "pass"});
		System.out.println("Initializing...");
		
		
		System.out.println("Distributing Card...");
		Poker poker = Poker.getInstance();
		RuleController rulecontroller = RuleController.getInstance();
		poker.initialize();  //Initialize the poker
		poker.shuffle();  	//Shuffle the card 
		
		
		//player.newPlayer() - not duplicated..
		for(int i = 0 ; i < 3; i++) {
			
			
			Player p_i = new Player(Integer.toString(i+1));
			player.add(p_i);
			
		}
		
		// player.initialize(poker)?
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
				//System.out.println("History: ");
				
				//printHistory()
				history.printHistory();
				/*
				for(String s : history) {
					
					System.out.println(s);
					
				}
				*/
				System.out.printf("Your Hand: { %s } \n", this_turn.showHands());
				
				while(!true_input) {
					
					System.out.print("Please enter your action (history/play/pass): ");
					
					String input = c.next();
					c.nextLine();
					if(input == null || input.isEmpty()){
						System.out.print("Input Cannot Be Null");
						throw new InputCannotBeNullException();
					}
					if(actions.contains(input)){
						System.out.println("Input does not match an action");
						throw new InputNotActionException(input);
					}
					/*
					if(!input.equals("history") && !input.equals("play") && !input.equals("pass")){
						System.out.println("Input does not match an action");
						throw new InputNotActionException(input);
					}
					*/
					else if(input.equals("history")){
						System.out.flush(); 
						history.printHistory();
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
							
							
							System.out.println(rulecontroller.getLastPlayMsg());
							tmp_history = "Player " + (player_index + 1) + "played" + rulecontroller.getLastPlayMsg() + "."; 
							history.add(tmp_history);//temporary field
							true_input = true;
						}
						
						
						
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
				
				
				for(Player p : player) {
					
					if(p.checkWin()) {
						
						System.out.printf("Player %s wins!", p.getName());
						
					}
					
				}
				
				player_index++;
				
				if(player_index > 3) {
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
