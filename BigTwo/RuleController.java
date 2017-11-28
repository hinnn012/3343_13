package BigTwo;



import java.util.ArrayList;
import java.util.Collections;

import BigTwo.Card;
import Exception.CannotPassYourOwnLoopException;
import Exception.InputNotValidException;
import Exception.InvalidPatternException;
import Exception.InvalidRankException;
import Exception.PatternNotRecognizeException;


public class RuleController {

	private static RuleController instance = new RuleController();
			
	
	private String lastValidPlayer = "";
			
	private Integer lastWeight=0;
			
	private Integer lastRank = 0;
	
	private String lastPattern = "";
	
	private String lastCards = "";
	
	public String getLastPattern() {
		return lastPattern;
	}
	
	public String getLastValidPlayer() {
		return lastValidPlayer;
	}
	
	public void setLastPattern(String lastPattern) {
		this.lastPattern = lastPattern;
	}	
	
	public void setLastRank(int rank) {
		this.lastRank = rank;
	}
	
	public String getLastPlayMsg() {
		
		return lastValidPlayer + " " + lastCards + " a " + lastPattern + ".";
		
	}
	
	public void setLastCards(ArrayList<Card> card,boolean flag) {
		if (flag)
		{
			ArrayList<Card> mod = new ArrayList<Card>();
			mod = ascenCard(card);
			for (Card c:mod) {
				this.lastCards += c.getSuit() + c.getFace() + " ";
			}
		}
		else for(Card c : card) {
			
			this.lastCards += c.getSuit() + c.getFace() + " ";
			
		}
		
	}
	
	public void setLastWeight(int weight)
	{
		this.lastWeight = weight;
	}
	
	public ArrayList<Card> ascenCard(ArrayList<Card> cardArray){
		ArrayList<Card> temp = new ArrayList<>();
		for(Card c:cardArray) {
			if (c.getFace().equals("A")||c.getFace().equals("2"))
			{
				temp.add(c);
				cardArray.remove(c);
			}
			
		}
		for(Card c:cardArray) {			
				temp.add(c);
				cardArray.remove(c);			
		}
		return temp;
		
	}


	/*public Integer faceToInt(String face,boolean weight){
		Integer intFace = null;
		switch(face){
		case "A" :
			if(!weight)	intFace= 1;
			else intFace= 14;break;
		case "2" :
			if(!weight) intFace= 2;
			else intFace= 15;break;
		case "3" :intFace= 3;break;
		case "4" :intFace= 4;break;
		case "5" :intFace= 5;break;
		case "6" :intFace= 6;break;
		case "7" :intFace= 7;break;
		case "8" :intFace= 8;break;
		case "9" :intFace= 9;break;
		case "10":intFace= 10;break;
		case "J" :intFace= 11;break;
		case "Q" :intFace= 12;break;
		case "K" :intFace= 13;break;
		}
		return intFace;
		
	}*/
	
	//boolean valid = false;
	
	public boolean passCheck(String name)throws CannotPassYourOwnLoopException{
		
		if (this.getLastValidPlayer().equals(name))throw new CannotPassYourOwnLoopException(name);
		else return true;
		
	}
	public boolean straightSmall(String pattern,ArrayList<Card> array) {
		if  ((pattern.equals("Straight")||pattern.equals("Straight Flush"))&&((array.get(3).getFace().equals("A")&&array.get(4).getFace().equals("2"))||!(array.get(3).getFace().equals("A")&&array.get(4).getFace().equals("2"))))return true;
		else return false;
	}
	public boolean valid(ArrayList<Card> card_to_be_played, String name) throws InputNotValidException, InvalidPatternException, InvalidRankException, PatternNotRecognizeException{
		
	Collections.sort(card_to_be_played);
	String pattern = checkPattern(card_to_be_played);
	if (lastValidPlayer.equals("")&&lastPattern.equals("")&&lastRank==0&&lastWeight==0&&!pattern.equals("Invalid"))
	{
		
		if (straightSmall(pattern,card_to_be_played)) 
		{
			setLastPattern(pattern);
			int rank = calRank(card_to_be_played,true);
			int weight = calWeight(pattern);
			setLastRank(rank);
			setLastWeight(weight);
			setLastCards(card_to_be_played,true);
			return true;
		}
		else
		{
			setLastPattern(pattern);
			int rank = calRank(card_to_be_played,false);
			int weight = calWeight(pattern);
			setLastRank(rank);
			setLastWeight(weight);
			setLastCards(card_to_be_played,false);
			return true;
		}
	}
	else if(!this.lastValidPlayer.equals("") && !pattern.equals(this.getLastPattern())){
		throw new InvalidPatternException(pattern);
	}else if(!this.lastValidPlayer.equals(name)&&!this.lastValidPlayer.equals("") &&pattern.equals(this.lastPattern)&&!pattern.equals("Invalid")){
		if (straightSmall(pattern,card_to_be_played)) {
		int rank = calRank(card_to_be_played,true);
		int weight = calWeight(pattern);
		if (rank>lastRank && weight>lastWeight)
		{
		setLastRank(rank);
		setLastWeight(weight);
		setLastCards(card_to_be_played,true);
		return true;	
		}
		
		else throw new InvalidRankException(rank);
		}
		else {
		int rank = calRank(card_to_be_played,false);
		int weight = calWeight(pattern);
		if (rank>lastRank && weight>lastWeight)
		{
		setLastRank(rank);
		setLastWeight(weight);
		setLastCards(card_to_be_played,false);
		return true;	
		}
		
		else throw new InvalidRankException(rank);
		}
	}else if(this.lastValidPlayer.equals(name)&&!pattern.equals("null")&&!pattern.equals("Invalid")){
		if (straightSmall(pattern,card_to_be_played)) {
		this.setLastPattern(pattern);
		int rank = calRank(card_to_be_played,true);
		int weight = calWeight(pattern);
		setLastRank(rank);
		setLastWeight(weight);
		setLastCards(card_to_be_played,true);
		return true;			
	}
		else 
		{
			this.setLastPattern(pattern);
			int rank = calRank(card_to_be_played,false);
			int weight = calWeight(pattern);
			setLastRank(rank);
			setLastWeight(weight);
			setLastCards(card_to_be_played,false);
			return true;	
		}
	}
	else throw new PatternNotRecognizeException(pattern);

	}
	
	
		/*public boolean valid(ArrayList<Card> card_to_be_played, int cardsInHand, String name) throws InputCannotBeNullException, InputNotValidException, InvalidPatternException, InvalidRankException, CannotPassYourOwnLoopException{
		
		String pattern = checkPattern(card_to_be_played);
		if(card_to_be_played.isEmpty() || card_to_be_played == null){
			throw new InputCannotBeNullException();
		}else if (card_to_be_played.size() > cardsInHand){
			throw new InputNotValidException(cardsInHand);
		}else if(!this.lastValidPlayer.equals("") && !pattern.equals(this.getLastPattern())){
			throw new InvalidPatternException(pattern);
		}else if(this.lastValidPlayer.equals("") &&	pattern.equals("")){
			setLastPattern(pattern);
			return true;	
		}else if(this.lastValidPlayer.equals(name)){
			setLastPattern(pattern);
			return true;			
		}else if (faceToInt(card_to_be_played.get(card_to_be_played.size()-1).getFace()) > lastRank && !this.lastValidPlayer.equals("")){
			throw new InvalidRankException(lastRank);
		}else if (name == lastValidPlayer){
			throw new CannotPassYourOwnLoopException(lastValidPlayer);
		}
		
		return true;}*/
		/*
		 * InputMoreThanHands
		 * InputCannotBeNull
		 * InputNotValid
		 * InvalidPattern
		 * InvalidRank
		 * CannotPassYourOwnLoop
		 */

	
	/*
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
	//} 
	
	
	public boolean Pair(ArrayList<Card> arraylist){
		//for (int i=0;i < arraylist.size()-1;i++){
		if (arraylist.get(0).getFace().equals(arraylist.get(1).getFace()))return true;

		//if (valid) setLastPattern("Pair");
		//return valid;
		else return false; 
		
	}
			
	public boolean ThreeOfKind(ArrayList<Card> arraylist){
		//for (int i=0;i < arraylist.size()-2;i++){
			if (arraylist.get(0).getFace().equals(arraylist.get(1).getFace())&&arraylist.get(0).getFace().equals(arraylist.get(2).getFace()))
				return true;
		
		//if (valid) setLastPattern("ThreeOfKind");
		//return valid;
		else return false;
			
	}
	
	public boolean Straight(ArrayList<Card> arraylist) {
		int[] array = new int[5];
		for (int i=0;i<5;i++)
		{
			array[i]=arraylist.get(i).getIntFace();
		}
		if (array[0]==3&&array[1]==4&&array[2]==5&&array[3]==14&&array[4]==15)return true;
		else if (array[0]==3&&array[1]==4&&array[2]==5&&array[3]==6&&array[4]==15)return true;
		else {
			boolean straight = true;
			int j = 0;
			while(straight&&j<4)
			{
				if(array[j]!=(array[j+1]-1))straight =false;
				else j++;
			}
			return straight;
		}
		
	}
			
	/*public boolean Straight(ArrayList<Card> arraylist){
		Collections.sort(arraylist);
		if(faceToInt(arraylist.get(0).getFace())==10){//not 10JQKA
		for(int i = 0 ; i < arraylist.size() - 1; i++){
			if(faceToInt(arraylist.get(i).getFace())!=faceToInt(arraylist.get(i+1).getFace())-1&&faceToInt(arraylist.get(arraylist.size()-1).getFace())!=1){
				valid = false;
				break;
			}else valid = true;
		}
		}else for(int i = 0 ; i < arraylist.size()-1 ; i++){//for 10JQKA
			if(faceToInt(arraylist.get(i).getFace())!=faceToInt(arraylist.get(i+1).getFace())-1){
				valid = false;
				break;				
			}else {valid=true;
			}
		}
		//if (valid) setLastPattern("Straight");
		return valid;
				
			
	}*/
			
	public boolean Flush(ArrayList<Card> arraylist){
		boolean flush = true;
		for(int i = 0 ; i < arraylist.size()-1 ; i++){
			if(arraylist.get(i).getSuit()!=arraylist.get(i+1).getSuit()){
				flush = false;
				break;
			}
		}
		//if (valid) setLastPattern("Flush");
		return flush;			
	}

	public boolean StraightFlush(ArrayList<Card> arraylist){
		return (Flush(arraylist)&&Straight(arraylist));
		//if (valid) setLastPattern("StraightFlush");
	}
	
	public boolean FourOfKind(ArrayList<Card> arraylist) {
		ArrayList<Card> front = new ArrayList<Card>();
		ArrayList<Card> tail = new ArrayList<Card>();
		if (arraylist.get(0).getFace().equals(arraylist.get(1).getFace()))
				{
					for (int i=0;i<arraylist.size();i++) {
					if (i<2)front.add(arraylist.get(i));
					else tail.add(arraylist.get(i));
					}
					if(Pair(front)&&Pair(tail)&&front.get(0).getFace().equals(tail.get(0).getFace()))return true;
					else return false;
				}
		else {
			
				for (int i=1;i<arraylist.size();i++) {
				if (i<3)front.add(arraylist.get(i));
				else tail.add(arraylist.get(i));
				}
				if(Pair(front)&&Pair(tail)&&front.get(0).getFace().equals(tail.get(0).getFace()))return true;
				else return false;
		}
	}
	
	public boolean FullHouse(ArrayList<Card> arraylist) {
		ArrayList<Card> front = new ArrayList<Card>();
		ArrayList<Card> tail = new ArrayList<Card>();
		if(arraylist.get(1).getFace().equals(arraylist.get(2).getFace())){
				for (int i=0;i<arraylist.size();i++) {
				if (i<3)front.add(arraylist.get(i));
				else tail.add(arraylist.get(i));
			}
			if (ThreeOfKind(front)&&Pair(tail)&&!front.get(0).getFace().equals(tail.get(0).getFace()))return true;
			else return false;
			
		}
		else {

			for (int i=0;i<arraylist.size();i++) {
				if (i<2)front.add(arraylist.get(i));
				else tail.add(arraylist.get(i));
			}
			if (ThreeOfKind(tail)&&Pair(front)&&!front.get(0).getFace().equals(tail.get(0).getFace()))return true;
			else return false;
		}
		
		
	}
	public static RuleController getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}
	
	public String checkPattern(ArrayList<Card> arraylist) {
		
		if(arraylist.size() == 1) {
			
			return "one";
		}
		
		else if(arraylist.size() == 2 && Pair(arraylist)) {
			
			return "Pair";
		}
		else if(arraylist.size() == 3 && ThreeOfKind(arraylist)) {
			
			return "ThreeOfKind";
		}
		else if(arraylist.size() == 5) {
			if(FourOfKind(arraylist))return "Four Of Kind";
			else
			if(FullHouse(arraylist))return "Full House";
			else
			if(StraightFlush(arraylist)) return "Straight Flush";
			else	
			if(Straight(arraylist)) return "Straight";
			else
			if(Flush(arraylist)) return "Flush";
				
		}
		
		
		return "Invalid";
		
		
	}
	public int calWeight(String s) {
		switch(s) {
		case "one":return 1;
		case "Pair":return 2;
		case "Three of Kind":return 3;
		case "Straight": return 4;
		case "Flush": return 5;
		case "Full House": return 6;
		case "Four of Kind": return 7;
		case "Straight Flush": return 8;
		default: return 0;
		}
		
	}
	public int calRank(ArrayList<Card> arraylist,boolean flag){
		int rank = 0;
		int[] keeper = new int[arraylist.size()];
		for(int i = 0 ; i < arraylist.size(); i++){
		keeper[i]=arraylist.get(i).getIntFace();
		}
		if (flag) {
			for(int i = 0;i<keeper.length;i++) {
				if (keeper[i]==14)keeper[i]=1;
				else if (keeper[i]==15)keeper[i]=2;
				}
			for (int i: keeper)rank += i;
		}
		else for (int i:keeper)rank += i;
		return rank;
	}
}
