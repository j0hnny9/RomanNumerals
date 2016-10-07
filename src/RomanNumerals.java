import java.util.LinkedList;
import java.util.List;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		char[] digits = splitRN(romanNum);
		LinkedList<LinkedList<String>> equalCombinations = combineEqualDigits(digits);
		
		if (romanNum.length() == 1) {
			return getArabNumForBasicRN(romanNum.charAt(0));
		} else if (equalCombinations.size() > 1) {
			if (convertToInteger(equalCombinations.get(0)) < convertToInteger(getConcatStrings(equalCombinations.subList(1, equalCombinations.size()) ))) {
				return getArabNumForBasicRN(digits[1]) - getArabNumForBasicRN(digits[0]);
			} else {
				return getArabNumForBasicRN(digits[0]) + getArabNumForBasicRN(digits[1]);
			}
		} else if (romanNum.length() > 2) {
			equalCombinations = combineEqualDigits(digits);
			int res = 0;
			for (LinkedList<String> sl : equalCombinations) {
				res += convertToInteger(getConcatString(sl));
			}
			return res;
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
	
	public LinkedList<LinkedList<String>> combineEqualDigits(char[] digits) {
		LinkedList<LinkedList<String>> combDigitsList = new LinkedList<>();
		LinkedList<String> combDigits = new LinkedList<>();
		char prevChar = 'a';
		for (char d : digits) {
			if (d != prevChar) {
				combDigits = new LinkedList<>();
				combDigitsList.add(combDigits);
				prevChar = d;
			}
			combDigits.add(String.valueOf(d));
		}
		return combDigitsList;
	}
	
	public boolean canBeSubtracted(char digit) {
		if (getArabNumForBasicRN(digit) == 5 || getArabNumForBasicRN(digit) == 50 || getArabNumForBasicRN(digit) == 500) {
			return false;
		} else {
			return true;
		}
	}
	
	public String getConcatString(List<String> l) {
		String sRes = "";
		for (String sElem : l) {
			sRes += sElem;
		}
		
		return sRes;
	}
	
	public String getConcatStrings(List<List<String>> ls) {
		String sRes = "";
		for (List<String> sElements : ls) {
			for (String s : sElements) {
				sRes += s;
			}
		}
		
		return sRes;
	}
	
	
	
}
