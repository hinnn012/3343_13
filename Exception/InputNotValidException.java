package Exception;

public class InputNotValidException extends Exception {

	private int size;
	
	public InputNotValidException(int size){
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