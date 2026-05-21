// User function Template for Java

class Solution {
	public static String reverseString(String s) {
	StringBuilder sb = new StringBuilder();
		// code here
		helper(s, 0, sb);
		return sb.toString();
	}
	static void helper(String s, int i, StringBuilder sb) {
		if (i == s.length()) {
			return ;
		}
		
		helper(s, i + 1, sb);
		
		sb.append(s.charAt(i));
	}
}
