package Exception;

public class CannotPassYourOwnLoopException extends Exception {

	private String lastValidPlayer;
	
	public CannotPassYourOwnLoopException(String lastValidPlayer){
		this.lastValidPlayer = lastValidPlayer;
	}
	
	public String getLastValidPlayer(){
		return lastValidPlayer;
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