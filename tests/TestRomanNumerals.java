import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals rn = new RomanNumerals();

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_FirstRN_One() {
		assertEquals(1, rn.convertToInteger("I"));
	}

}
