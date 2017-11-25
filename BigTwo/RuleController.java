package BigTwo;



import java.util.ArrayList;
import BigTwo.Card;


public class RuleController {

	private static RuleController instance = new RuleController();
			
	
	private String lastValidPlayer;
			
	private Double lastWeight;
			
	private Integer lastRank;
	
	Card card;
	
	public boolean valid(){
		return false;
		
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
