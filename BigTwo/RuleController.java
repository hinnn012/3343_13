package BigTwo;



import java.util.ArrayList;
import BigTwo.Card;
import Exception.CannotPassYourOwnLoopException;
import Exception.InputCannotBeNullException;
import Exception.InputNotValidException;
import Exception.InvalidPatternException;
import Exception.InvalidRankException;


public class RuleController {

	private static RuleController instance = new RuleController();
			
	
	private String lastValidPlayer;
			
	private Double lastWeight;
			
	private Integer lastRank;
	
	private String lastPattern;
	
	public String getLastPattern() {
		return lastPattern;
	}

	public void setLastPattern(String lastPattern) {
		this.lastPattern = lastPattern;
	}

	public Integer faceToInt(String face){
		Integer intFace = null;
		switch(face){
		case "A" :intFace= 1;
		case "2" :intFace= 2;
		case "3" :intFace= 3;
		case "4" :intFace= 4;
		case "5" :intFace= 5;
		case "6" :intFace= 6;
		case "7" :intFace= 7;
		case "8" :intFace= 8;
		case "9" :intFace= 9;
		case "10":intFace= 10;
		case "J" :intFace= 11;
		case "Q" :intFace= 12;
		case "K" :intFace= 13;
		}
		return intFace;
		
	}
	
	boolean valid = false;
	
	public boolean valid(ArrayList<Card> card_to_be_played, int cardsInHand, String pattern, String name) throws InputCannotBeNullException, InputNotValidException, InvalidPatternException, InvalidRankException, CannotPassYourOwnLoopException{
		if(card_to_be_played.isEmpty() || card_to_be_played == null){
			throw new InputCannotBeNullException();
		}else if (card_to_be_played.size() > cardsInHand){
			throw new InputNotValidException(cardsInHand);
		}else if(pattern != this.getLastPattern()){
			throw new InvalidPatternException(pattern);
		}else if (faceToInt(card_to_be_played.get(cardsInHand).getFace()) > lastRank){
			throw new InvalidRankException(lastRank);
		}else if (name == lastValidPlayer){
			throw new CannotPassYourOwnLoopException(lastValidPlayer);
		}
		return true;
		/*
		 * InputMoreThanHands
		 * InputCannotBeNull
		 * InputNotValid
		 * InvalidPattern
		 * InvalidRank
		 * CannotPassYourOwnLoop
		 */
	} 
	
	public boolean Pair(ArrayList<Card> arraylist){
		for (int i=0;i < arraylist.size()-1;i++){
		if (arraylist.get(i).getFace()==arraylist.get(i+1).getFace())
			valid = true;
		}
		setLastPattern("Pair");
		return valid;

		
	}
			
	public boolean ThreeOfKind(ArrayList<Card> arraylist){
		for (int i=0;i < arraylist.size()-2;i++){
			if (arraylist.get(i).getFace()==arraylist.get(i+1).getFace()&&arraylist.get(i+2).getFace()==arraylist.get(i+1).getFace())
				valid = true;
			}
		setLastPattern("ThreeOfKind");
		return valid;

			
	}
			
	public boolean Straight(ArrayList<Card> arraylist){
		if(faceToInt(arraylist.get(0).getFace())!=10){
		for(int i = 0 ; i < arraylist.size() ; i++){
			if(faceToInt(arraylist.get(i).getFace())!=faceToInt(arraylist.get(i+1).getFace())-1){
				valid = false;
				break;
			}else valid = true;
		}
		}else for(int i = 0 ; i < arraylist.size()-1 ; i++){
			if(faceToInt(arraylist.get(i).getFace())!=faceToInt(arraylist.get(i+1).getFace())-1&&faceToInt(arraylist.get(arraylist.size()-1).getFace())!=1){
				valid = false;
				break;
			}else valid = true;
		}
		setLastPattern("Straight");
		return valid;
				
			
	}
			
	public boolean Flush(ArrayList<Card> arraylist){
		for(int i = 0 ; i < arraylist.size() ; i++){
			if(arraylist.get(i).getSuit()!=arraylist.get(i+1).getSuit()){
				valid = false;
				break;
			}else valid = true;
		}
		setLastPattern("Flush");
		return valid;
				
			
	}


	public static RuleController getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
}
