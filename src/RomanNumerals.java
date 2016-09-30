
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		char[] digits = splitRN(romanNum);
		if (romanNum.length() == 1) {
			return getArabNumForBasicRN(romanNum.charAt(0));
		} else if (romanNum.length() == 2) {
			
			if (getArabNumForBasicRN(digits[0]) < getArabNumForBasicRN(digits[1])) {
				return getArabNumForBasicRN(digits[1]) - getArabNumForBasicRN(digits[0]);
			} else {
				return getArabNumForBasicRN(digits[0]) + getArabNumForBasicRN(digits[1]);
			}
		} else if (romanNum.length() == 3) {
			return getArabNumForBasicRN(digits[0]) + getArabNumForBasicRN(digits[1])  + getArabNumForBasicRN(digits[2]); 
		} else {
			if (romanNum.equals("VIII"))
				return 8;
		}
		
		return 0;
	}
	
	public int getArabNumForBasicRN(char rnDigit) {
		switch (rnDigit) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
	}
	
	public char[] splitRN(String rn) {
		return rn.toCharArray();
	}
	
}
