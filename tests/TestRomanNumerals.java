import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals rn = new RomanNumerals();

	
	@Test
	public void test_I_One() {
		assertEquals(1, rn.convertToInteger("I"));
	}
	
	@Test
	public void test_II_Two() {
		assertEquals(2, rn.convertToInteger("II"));
	}
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

}
