package BigTwo;



import java.util.ArrayList;
import BigTwo.Card;


public class RuleController {

	private static RuleController instance = new RuleController();
			
	
	private String lastValidPlayer;
			
	private Double lastWeight;
			
	private Integer lastRank;
	
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
	
	public boolean valid(){
		return false;
		
	} 
	
	
	public boolean Pair(ArrayList<Card> arraylist){
		for (int i=0;i < arraylist.size();i++){
		if (arraylist.get(i).getFace()==arraylist.get(i+1).getFace())
			valid = true;
		}
		return valid;

		
	}
			
	public boolean ThreeOfKind(ArrayList<Card> arraylist){
		for (int i=0;i < arraylist.size();i++){
			if (arraylist.get(i).getFace()==arraylist.get(i+1).getFace()&&arraylist.get(i+2).getFace()==arraylist.get(i+1).getFace())
				valid = true;
			}
		return valid;

			
	}
			
	public boolean Straight(ArrayList<Card> arraylist){
		for(int i = 0 ; i < arraylist.size() ; i++){
			if(faceToInt(arraylist.get(i).getFace())!=faceToInt(arraylist.get(i+1).getFace())+1){
				valid = false;
				break;
			}else valid = true;
		}
		return valid;
				
			
	}
			
	public boolean Flush(ArrayList<Card> arraylist){
		for(int i = 0 ; i < arraylist.size() ; i++){
			if(arraylist.get(i).getSuit()!=arraylist.get(i+1).getSuit()){
				valid = false;
				break;
			}else valid = true;
		}
		return valid;
				
			
	}


	public static RuleController getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
}
