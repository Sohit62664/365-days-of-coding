class Solution {
	public int minOperations(String s1, String s2) {
		// code here
		int n = s1.length();
		int m = s2.length();
		int lcs = f(s1, s2, n, m);
		
		int deletion = n- lcs ;
		int insertion = m - lcs;
		
		return deletion + insertion;
	}
	
	int f(String s1, String s2, int n, int m) {
		
		int[][] dp = new int[n + 1][m + 1];
		
		int max = 0 ;
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 1 ; j <= m ; j ++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1]+1 ;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
				
				max = Math.max(max, dp[i][j]);
			}
		}
		
		return max ;
	}
}
