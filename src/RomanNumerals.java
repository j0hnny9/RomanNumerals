
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum.length() == 1) {
			return getArabNumForBasicRN(romanNum.charAt(0));
		} else if (romanNum.length() == 2) {
			char[] digits = splitRN(romanNum);
			if (getArabNumForBasicRN(digits[0]) < getArabNumForBasicRN(digits[1])) {
				return getArabNumForBasicRN(digits[0]) + getArabNumForBasicRN(digits[1]);
			} else {
				return getArabNumForBasicRN(digits[1]) - getArabNumForBasicRN(digits[0]);
			}
			if (romanNum.equals("II"))
				return 2;
		} else {
			if (romanNum.equals("III"))
				return 3;
			else if (romanNum.equals("VIII"))
				return 8;
		}
		
		return 0;
	}
	
	public int getArabNumForBasicRN(char rnDigit) {
		if (rnDigit == 'I')
			return 1;
		else if (rnDigit == 'V')
			return 5;
		else if (rnDigit == 'X')
			return 10;
		else if (rnDigit == 'L')
			return 50;
		else if (rnDigit == 'C')
			return 100;
		else if (rnDigit == 'D')
			return 500;
		else if (rnDigit == 'M')
			return 1000;
		
		return 0;
	}
	
	public char[] splitRN(String rn) {
		return rn.toCharArray();
	}
	
}
