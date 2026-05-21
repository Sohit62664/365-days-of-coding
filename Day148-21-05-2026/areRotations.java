class Solution {
	public boolean areRotations(String s1, String s2) {
		// code here
		
		
		// brute fotce
		if (s1.equals(s2)) {
			return true;
		}
		
		StringBuilder sb = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		for (int i = 0; i < s1.length(); i++) {
			
			char ch = sb.charAt(0);
			sb.deleteCharAt(0);
			sb.append(ch);
			
			if (sb.toString().equals(sb2.toString())) {
				return true;
			}
		}
		
		return false;
	}	
	// Alternet Solution
// 	return (s1 + s1).contains(s2);
	
	
    }
}
