import static org.junit.Assert.*;

import java.util.LinkedList;

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
	
	@Test public void testRN_IV_Four() {
		assertEquals(4, rn.convertToInteger("IV"));
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
	
	@Test public void testRN_D_500() {
		assertEquals(500, rn.convertToInteger("D"));
	}
	
	@Test public void testRN_M_1000() {
		assertEquals(1000, rn.convertToInteger("M"));
	}
	
	@Test public void testRN_splitII_FirstElementI() {
		String rnTwo = "II";
		char[] digits = rn.splitRN(rnTwo);
		assertEquals('I', digits[0]);
	}
	
	@Test public void testRN_combineRNIII() {
		char[] digits = {'I', 'I', 'I'};
		LinkedList<LinkedList<String>> combDigitsList = rn.combineEqualDigits(digits);
		String combDigits = "";
		for (String s : combDigitsList.get(0)) {
			combDigits += s;
		}
		assertEquals("III", combDigits);
	}
	
	@Test public void testRN_combineRNVIII_FirstCombV() {
		char[] digits = {'V', 'I', 'I', 'I'};
		LinkedList<LinkedList<String>> combDigitsList = rn.combineEqualDigits(digits);
		String combDigits = "";
		for (String s : combDigitsList.get(0)) {
			combDigits += s;
		}
		assertEquals("V", combDigits);
	}
	
	@Test public void testRN_combineRNVIII_SecondCombIII() {
		char[] digits = {'V', 'I', 'I', 'I'};
		LinkedList<LinkedList<String>> combDigitsList = rn.combineEqualDigits(digits);
		String combDigits = "";
		for (String s : combDigitsList.get(1)) {
			combDigits += s;
		}
		assertEquals("III", combDigits);
	}
	
	@Test public void testRN_inputVIII_resEight() {
		assertEquals(8, rn.convertToInteger("VIII"));
	}
	
	@Test public void testRN_inputIV_resEight() {
		assertEquals(4, rn.convertToInteger("IV"));
	}
	
	@Test public void testRN_inputXVII_res17() {
		assertEquals(17, rn.convertToInteger("XVII"));
	}
	
	@Test public void testRN_inputIX_res_9() {
		assertEquals(9, rn.convertToInteger("IX"));
	}

}
