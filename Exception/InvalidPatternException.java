package Exception;

public class InvalidPatternException extends Exception {

	private int size;
	
	public InvalidPatternException(int size){
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