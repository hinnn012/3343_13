package Exception;

public class CannotPassYourOwnLoopException extends Exception {

	private int size;
	
	public CannotPassYourOwnLoopException(int size){
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