class Solution {
	public int findIndex(String s) {
		// code here
		// no. of closing in n-k == no. of opening in 0 to k
		
		// naive approach
		int n = s.length();
		int o_count = 0;
		int ans = n;
		for (int k = 0 ; k<n ; k++) {
			
			int c_count = 0 ;
			
			for (int j = k ; j<n ; j++) {
				if (s.charAt(j) == ')') {
					c_count++;
				}
			}
			
			if (o_count == c_count) {
				return k;
			}
			
			if (s.charAt(k) == '(') {
				o_count++;
			}
		}
		return n;
	}
	
}
