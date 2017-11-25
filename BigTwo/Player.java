package BigTwo;

import java.util.ArrayList;

import BigTwo.Card;
import BigTwo.RuleController;
import Exception.InputMoreThanHandsException;
import Exception.InvalidPatternException;
import Exception.InvalidRankException;

public class Player {
	
	private ArrayList<Card> cardList ;
	private String name;
	
	public ArrayList<Card> getCardList() {
		return cardList;
	}


	public void setCardList(ArrayList<Card> cardList) {
		this.cardList = cardList;
	}


	private String ValidAction = null;
	
	public Player(String aName) {
		
		aName = name;
		cardList = new ArrayList<>();
		
	}
	
	
	//Add cards to players
	
	public void Draw(Card card) throws InputMoreThanHandsException {
		if(cardList.size() > 13){
			throw new InputMoreThanHandsException(cardList.size());
		}
		else
			cardList.add(card);
	}
	
	//Display all player's cards
	
	public String showHands() {
		String output = "";
		for(int i = 1; i< cardList.size(); i++) {
			
			output += i + ": " + cardList.get(i-1).getSuit() + cardList.get(i-1).getFace() + " ";
			
		}
		
		return output;
	}
	
	
	
	public boolean Pass() {
		
		
		return true;
	}
	
	public String returnAction() {
		
		return ValidAction;
		
		
	}
	
	
	public boolean Play(int x[]) {
		
		//int num_of_card = x.length();
		ArrayList<Card> Card_to_be_played = new ArrayList<Card>();
		
		for(int c: x) {
			
			Card_to_be_played.add(cardList.get(c));
			
		}
		
		RuleController ruleController = RuleController.getInstance();
		
		//check card 
		if(cardList.size() == 1) {
			try {
				if(ruleController.valid(Card_to_be_played)) {
					
					String ValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace() + " ";
						
					}
					return true;
				}
			} catch (InvalidPatternException e) {
				e.printStackTrace();
			} catch (InvalidRankException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		else if(ruleController.Pair(Card_to_be_played)) {
			try{
				if(ruleController.valid(Card_to_be_played)) {
					

					String ValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace() + " ";
						
					}
					return true;
				}
			} catch (InvalidPatternException e) {
				e.printStackTrace();
			} catch (InvalidRankException e) {
				e.printStackTrace();
			}
		}
		
		else if(ruleController.ThreeOfKind(Card_to_be_played)) {
			try{
				if(ruleController.valid(Card_to_be_played)) {
					

					String ValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace() + " ";
						
					}
					return true;
				}
			} catch (InvalidPatternException e) {
				e.printStackTrace();
			} catch (InvalidRankException e) {
				e.printStackTrace();
			}
			
			
		}
		
		else if(ruleController.Straight(Card_to_be_played)) {
			try{
				if(ruleController.valid(Card_to_be_played)) {
					

					String ValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace();
						
					}
					return true;
				}
			} catch (InvalidPatternException e) {
				e.printStackTrace();
			} catch (InvalidRankException e) {
				e.printStackTrace();
			}
		}
		
		else if(ruleController.Flush(Card_to_be_played)) {
			try{
				if(ruleController.valid(Card_to_be_played)) {
					

					String ValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace();
						
					}
					return true;
				}
			} catch (InvalidPatternException e) {
				e.printStackTrace();
			} catch (InvalidRankException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
	
	
}
