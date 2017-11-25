package BigTwo;

import java.util.ArrayList;

import BigTwo.Card;
import BigTwo.RuleController;
import Exception.CannotPassYourOwnLoopException;
import Exception.InputCannotBeNullException;
import Exception.InputMoreThanHandsException;
import Exception.InputNotValidException;
import Exception.InvalidPatternException;
import Exception.InvalidRankException;

public class Player {
	
	private ArrayList<Card> cardList ;
	private String name;
	private String ValidAction = null;
	private String lastValidAction = null;
	
	public ArrayList<Card> getCardList() {
		return cardList;
	}


	public void setCardList(ArrayList<Card> cardList) {
		this.cardList = cardList;
	}


	
	
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
	
	public String returnlastAction() {
		
		return lastValidAction;
		
		
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
				if(ruleController.valid(Card_to_be_played, cardList.size(), "one", name)) {
					
					lastValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace() + " ";
						lastValidAction += c.getSuit() + c.getFace() + " ";
					}
					return true;
				}
			} catch (InputCannotBeNullException e) {
				System.out.println("Player should not play nothing");
				e.printStackTrace();
			}catch (InputNotValidException e) {
				System.out.println("Player should input only the provide options, size of input : " + e.getSize() + "exceeds");
				e.printStackTrace();
			}catch (InvalidPatternException e) {
				System.out.println("Player should must follow last pattern, last pattern : " + e.getPattern());
				e.printStackTrace();
			}catch (InvalidRankException e) {
				System.out.println("Player must play a card or pattern have higher rank, last rank : " + e.getRank());
				e.printStackTrace();
			}catch (CannotPassYourOwnLoopException e) {
				System.out.println("Player must not pass a turn if last valid action player is himself, last player: " + e.getLastValidPlayer());
				e.printStackTrace();
			}
		}
		
		else if(ruleController.Pair(Card_to_be_played)) {
			try {
				if(ruleController.valid(Card_to_be_played, cardList.size(), "Pair", name)) {
					

					lastValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace() + " ";
						lastValidAction += c.getSuit() + c.getFace() + " ";
					}
					return true;
				}
			} catch (InputCannotBeNullException e) {
				System.out.println("Player should not play nothing");
				e.printStackTrace();
			}catch (InputNotValidException e) {
				System.out.println("Player should input only the provide options, size of input : " + e.getSize() + "exceeds");
				e.printStackTrace();
			}catch (InvalidPatternException e) {
				System.out.println("Player should must follow last pattern, last pattern : " + e.getPattern());
				e.printStackTrace();
			}catch (InvalidRankException e) {
				System.out.println("Player must play a card or pattern have higher rank, last rank : " + e.getRank());
				e.printStackTrace();
			}catch (CannotPassYourOwnLoopException e) {
				System.out.println("Player must not pass a turn if last valid action player is himself, last player: " + e.getLastValidPlayer());
				e.printStackTrace();
			}
		}
		
		else if(ruleController.ThreeOfKind(Card_to_be_played)) {
			try {
				if(ruleController.valid(Card_to_be_played, cardList.size(), "ThreeOfKind", name)) {
					

					lastValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace() + " ";
						lastValidAction += c.getSuit() + c.getFace() + " ";
					}
					return true;
				}
			} catch (InputCannotBeNullException e) {
				System.out.println("Player should not play nothing");
				e.printStackTrace();
			}catch (InputNotValidException e) {
				System.out.println("Player should input only the provide options, size of input : " + e.getSize() + "exceeds");
				e.printStackTrace();
			}catch (InvalidPatternException e) {
				System.out.println("Player should must follow last pattern, last pattern : " + e.getPattern());
				e.printStackTrace();
			}catch (InvalidRankException e) {
				System.out.println("Player must play a card or pattern have higher rank, last rank : " + e.getRank());
				e.printStackTrace();
			}catch (CannotPassYourOwnLoopException e) {
				System.out.println("Player must not pass a turn if last valid action player is himself, last player: " + e.getLastValidPlayer());
				e.printStackTrace();
			}
		}
		
		else if(ruleController.Straight(Card_to_be_played)) {
			try {
				if(ruleController.valid(Card_to_be_played, cardList.size(), "Straight", name)) {
					

					lastValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace();
						lastValidAction += c.getSuit() + c.getFace() + " ";
					}
					return true;
				}
			} catch (InputCannotBeNullException e) {
				System.out.println("Player should not play nothing");
				e.printStackTrace();
			}catch (InputNotValidException e) {
				System.out.println("Player should input only the provide options, size of input : " + e.getSize() + "exceeds");
				e.printStackTrace();
			}catch (InvalidPatternException e) {
				System.out.println("Player should must follow last pattern, last pattern : " + e.getPattern());
				e.printStackTrace();
			}catch (InvalidRankException e) {
				System.out.println("Player must play a card or pattern have higher rank, last rank : " + e.getRank());
				e.printStackTrace();
			}catch (CannotPassYourOwnLoopException e) {
				System.out.println("Player must not pass a turn if last valid action player is himself, last player: " + e.getLastValidPlayer());
				e.printStackTrace();
			}
		}
		
		else if(ruleController.Flush(Card_to_be_played)) {
			try {
				if(ruleController.valid(Card_to_be_played, cardList.size(), "Flush", name)) {
					

					lastValidAction = "";
					for(Card c : cardList) {
						
						ValidAction += c.getSuit() + c.getFace();
						lastValidAction += c.getSuit() + c.getFace() + " ";
					}
					return true;
				}
			} catch (InputCannotBeNullException e) {
				System.out.println("Player should not play nothing");
				e.printStackTrace();
			}catch (InputNotValidException e) {
				System.out.println("Player should input only the provide options, size of input : " + e.getSize() + "exceeds");
				e.printStackTrace();
			}catch (InvalidPatternException e) {
				System.out.println("Player should must follow last pattern, last pattern : " + e.getPattern());
				e.printStackTrace();
			}catch (InvalidRankException e) {
				System.out.println("Player must play a card or pattern have higher rank, last rank : " + e.getRank());
				e.printStackTrace();
			}catch (CannotPassYourOwnLoopException e) {
				System.out.println("Player must not pass a turn if last valid action player is himself, last player: " + e.getLastValidPlayer());
				e.printStackTrace();
			}
		}
		
		return false;
	}
	
	
}
