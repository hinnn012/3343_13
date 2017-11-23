package Big_two;

public enum Suit {

	spades("♠"),
	hearts("♥"),
	clubs("♣"),
	diamonds("♦");
	
	/*		♠ (spades),
			♥ (hearts),
			♣ (clubs),
			♦ (diamonds)
	 
	 */
	
	private String value;
	
	private Suit(String value) {
		
		this.value = value; 
		
	}
	
	public String getValue() {
		
		return value;
		
	}
	
}
