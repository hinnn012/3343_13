package BigTwo;

public enum Suit {

	spades("\u2660"),
	hearts("\u2665"),
	clubs("\u2663"),
	diamonds("\u2666");
	
	/*		\\u2660 (spades),
			\\u2665(hearts),
			\\u2663 (clubs),
			\\u2666 (diamonds)
	 		UTF-8 encoding
	 */
	
	private String value;
	
	private Suit(String value) {
		
		this.value = value; 
		
	}
	
	public String getValue() {
		
		return value;
		
	}
	
}
