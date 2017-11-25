package Exception;

public class InputMoreThanHandsException extends Exception {

	private int size;
	
	public InputMoreThanHandsException(int size){
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