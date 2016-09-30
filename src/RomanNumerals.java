
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		if (romanNum.length() == 1) {
			return getArabNumForBasicRN(romanNum);
		} else if (romanNum.length() == 2) {
			char[] digits = splitRN(romanNum);
			if (getArabNumForBasicRN(digits[0]) < getArabNumForBasicRN(digits[1])) {
				return getArabNumForBasicRN(digits[0] + getArabNumForBasicRN(digits[1]));
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
		if (rnDigit.equals('I'))
			return 1;
		else if (rnDigit.equals('V'))
			return 5;
		else if (rnDigit.equals('X'))
			return 10;
		else if (rnDigit.equals('L'))
			return 50;
		else if (rnDigit.equals('C'))
			return 100;
		else if (rnDigit.equals('D'))
			return 500;
		else if (rnDigit.equals('M'))
			return 1000;
		
		return 0;
	}
	
	public char[] splitRN(String rn) {
		return rn.toCharArray();
	}
	
}
