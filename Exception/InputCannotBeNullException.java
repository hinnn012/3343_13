package Exception;

public class InputCannotBeNullException extends Exception {

	private int size;
	
	public InputCannotBeNullException(int size){
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