package BigTwo;



import java.util.ArrayList;
import BigTwo.Card;
import Exception.InvalidPatternException;
import Exception.InvalidRankException;


public class RuleController {

	private static RuleController instance = new RuleController();
			
	
	private String lastValidPlayer;
			
	private Double lastWeight;
			
	private Integer lastRank;
	
	Card card;
	
	public boolean InvalidPattern(ArrayList<Card> card_to_be_played) throws InvalidPatternException{
		if(card_to_be_played != lastPattern){
			throw new InvalidPatternException(lastPattern);
		}
		return true;
	}
	
	public boolean valid(ArrayList<Card> card_to_be_played) throws InvalidPatternException, InvalidRankException{
		if(card_to_be_played != lastPattern){
			throw new InvalidPatternException(lastPattern);
		}
		else if (card_to_be_played != isHigherRank){
			throw new InvalidRankException(isHigherRank);
		}
		return true;
	} 
	
	
	public boolean Pair(ArrayList<Card> arraylist){
		for (int i=0;i < arraylist.size();i++){
			
		}
		return false;

		
	}
			
	public boolean ThreeOfKind(ArrayList<Card> arraylist){
		return false;

			
	}
			
	public boolean Straight(ArrayList<Card> arraylist){
		return false;
				
			
	}
			
	public boolean Flush(ArrayList<Card> arraylist){
		return false;
				
			
	}


	public static RuleController getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
