package Exception;

public class InvalidRankException extends Exception {

	private int size;
	
	public InvalidRankException(int size){
		this.size = size;
	}
	
	public int getSize(){
		return size;
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