package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import BigTwo.Face;

public class testFace {

	@Test
	public void testFace_1() throws Exception {
	
		Face face = null;
		assertEquals("A",face.ACE.getValue());
		
	}
	
	@Test
	public void testFace_2() throws Exception {
		
		Face face = null;
		assertEquals("9",face.NINE.getValue());
	}
}
