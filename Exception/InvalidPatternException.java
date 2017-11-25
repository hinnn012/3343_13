package Exception;

public class InvalidPatternException extends Exception {

	private String pattern;
	
	public InvalidPatternException(String pattern){
		this.pattern = pattern;
	}
	
	public String getSize(){
		return pattern;
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