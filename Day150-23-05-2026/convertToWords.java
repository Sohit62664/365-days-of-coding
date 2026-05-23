// User function Template for Java
class Solution {
	
	String[] belowTwenty = {
		"", "One", "Two", "Three", "Four", "Five",
		"Six", "Seven", "Eight", "Nine", "Ten",
		"Eleven", "Twelve", "Thirteen", "Fourteen",
		"Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	};
	
	static String[] tens = {
		"", "", "Twenty", "Thirty", "Forty",
		"Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	};
	
	static String[] thousands = {
		"", "Thousand", "Million", "Billion"
	};
	
	String convertToWords(int num) {
		// code here
		
		if (num == 0) {
			return "Zero";
		}
		 
		int i = 0;
		String result = "";
// 		extracts groups of 3 digits.
		while (num > 0) {
			
			if (num % 1000 != 0) {
				result = helper(num % 1000) + thousands[i] + " " + result;
			}
			
			num /= 1000;
			i++;
		}
		
		return result.trim();
		
	}
	
	private String helper(int num) {
		
		if (num == 0) {
			return "";
		}
		
		else if (num < 20) {
			return belowTwenty[num] + " ";
		}
		
		else if (num < 100) {
			return tens[num / 10] + " " + helper(num % 10);
		}
		
		else {
			return belowTwenty[num / 100] + " Hundred " + helper(num % 100);
		}
	}
	
}
