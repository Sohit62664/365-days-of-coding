// User function Template for Java

class Solution {
	char carry = '0';
	StringBuilder sb = new StringBuilder();
	public String addBinary(String s1, String s2) {
		// code here
		// 		int sum = 0;
		
		int i = s1.length() - 1 ;
		int j = s2.length() - 1 ;
		
		while (i >= 0 && j >= 0) {
			char a = s1.charAt(i);
			char b = s2.charAt(j);
			sum(a, b);
			
			i--;
			j--;
		}
		
		while (i >= 0) {
			char a = s1.charAt(i);
			sum(a, '0');
			i--;
		}
		
		while (j >= 0) {
			char a = s2.charAt(j);
			sum(a, '0');
			j--;
		}
		if (carry == '1') {
			sb.append('1');
		}
		sb.reverse();
		
		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		return sb.toString();
		
	}
	
	void sum(char a, char b) {
		
		if (a == '0' && b == '0') {
			
			if (carry == '0') {
				sb.append('0');
			} else {
				sb.append('1');
				carry = '0';
			}
			
		} else if ((a == '0' && b == '1') || (a == '1' && b == '0')) {
			
			if (carry == '0') {
				sb.append('1');
			} else {
				sb.append('0');
				carry = '1';
			}
			
		} else {
			
			if (carry == '0') {
				sb.append('0');
				carry = '1';
			} else {
				sb.append('1');
				carry = '1';
			}
		}
	}
}
