package Exception;

public class InputNotActionException extends Exception {

	private String input;
	
	public InputNotActionException(String input){
		this.input = input;
	}
	
	public String getInput(){
		return input;
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