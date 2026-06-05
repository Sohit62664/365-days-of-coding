class Solution {
	int maxSubstring(String s) {
		// code here
		// brute force genrate each and every substring and take diff of zeros and one
		
		int max = Integer.MIN_VALUE;
		int curr = 0;
		
		for (char ch : s.toCharArray()) {
			int val = -1 ;
			if (ch == '0') {
				val = 1;
			}
			curr = Math.max(val, curr + val); // decreasing as well if the value is -1 then 
			max = Math.max(max, curr);
		}
		
		return max<0 ? -1 : max;
		
	}
}
