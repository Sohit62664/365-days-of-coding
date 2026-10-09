class Solution {
	public static String minWindow(String s, String p) {
		// code here
		int[] window = new int[26];
		int[] window_p = new int[26];
		
		for (char c : p.toCharArray()) {
			int index = c - 'a';
			
			window_p[index] ++;
		}
		
		int left = 0 ;
		int min = Integer.MAX_VALUE;
		
		String str = "";
		for (int right = 0 ; right<s.length() ; right++) {
			// expand the window
			int index = s.charAt(right) - 'a';
			window[index] ++;
			
			// shrink the window
			boolean valid = true;
			
			while (valid) {
				for (char c : p.toCharArray()) {
					int ind = c - 'a';
					
					if ((window_p [ind] > window[ind])) {
						valid = false;
						break;
					}
				}
				if (valid) {
					if (min > right - left + 1) {
						min = right - left + 1 ;
						str = s.substring(left, right + 1);
					}
					// 	str = s.substring(left , right+1);
					int idl = s.charAt(left) - 'a' ;
					window[idl]--;
					left++;
				}
			}
			// 			min = Math.min(min, right - left + 1);
			
		}
		
		return str;
		
	}
}
