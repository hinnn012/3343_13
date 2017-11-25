package Exception;

public class InvalidRankException extends Exception {

	private int rank;
	
	public InvalidRankException(int rank){
		this.rank = rank;
	}
	
	public int getRank(){
		return rank;
	}
}
/*
InputMoreThanHands
InputCannotBeNull
InputNotValid
InvalidPattern
InvalidRank
CannotPassYourOwnLoop
*/