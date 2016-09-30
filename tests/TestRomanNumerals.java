import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals rn = new RomanNumerals();

	
	@Test public void testRN_I_One() {
		assertEquals(1, rn.convertToInteger("I"));
	}
	
	@Test public void testRN_II_Two() {
		assertEquals(2, rn.convertToInteger("II"));
	}
	
	@Test public void testRN_III_Three() {
		assertEquals(3, rn.convertToInteger("III"));
	}
	
	@Test public void testRN_V_Five() {
		assertEquals(5, rn.convertToInteger("V"));
	}
	
	@Test public void testRN_VIII_Eight() {
		assertEquals(8, rn.convertToInteger("VIII"));
	}
	
	@Test public void testRN_X_Ten() {
		assertEquals(10, rn.convertToInteger("X"));
	}
	
	@Test public void testRN_L_50() {
		assertEquals(50, rn.convertToInteger("L"));
	}
	
	@Test public void testRN_C_100() {
		assertEquals(100, rn.convertToInteger("C"));
	}
	
	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

}
