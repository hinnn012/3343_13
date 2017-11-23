package Big_two;

public enum Face {
	
	A("1"), 
	TWO("2"), 
	THREE("2"),
	FOUR("2"), 
	FIVE("2"), 
	SIX("2"), 
	SEVEN("2"), 
	EIGHT("2"),
	NINE("2"),
	TEN("2"), 
	JACK("J"), 
	QUEEN("Q"), 
	KING("K");
	
	private String value;
	
	private Face(String value) {
		
		this.value = value; 
		
	}
	
	public String getValue() {
		
		return value;
		
	}


	
}

