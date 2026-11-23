class Solution {
	static int countWays(String s) {
		// code here
		char a [] = s.toCharArray();
		
		int n = a.length;
		
		return f(0, n - 1, 1, a);
	}
	
	static int f(int i, int j, int isTrue, char[] a) {
		
		if (i> j)
			return 0 ;
		
		if (i == j) {
			if (isTrue == 1) {
				return (a[i] == 'T') ? 1 : 0 ;
			} else {
				return (a[i] == 'F') ? 1 : 0 ;
			}
		}
		
		int ways = 0 ;
		
		for (int k = i + 1 ; k <= j - 1 ; k++) {
			int LT = f(i, k - 1, 1, a);
			int LF = f(i, k - 1, 0, a);
			int RT = f(k + 1, j, 1, a);
			int RF = f(k + 1, j, 0, a);
			
			if (a[k] == '&') {
				if (isTrue == 1) {
					ways += LT * RT;
				} else {
					ways += LT * RF + LF* RT + LF * RF ;
				}
			} else if (a[k] == '|') {
				if (isTrue == 1) {
					ways += LT * RF + LF* RT + LT * RT ;
				} else {
					ways += LF * RF;
				}
			} else if (a[k] == '^') {
				if (isTrue == 1) {
					ways += LT * RF + LF* RT;
				} else {
					ways += LT * RT + LF * RF;
				}
			}
			
		}
		return ways;
	}
}



// Memoization 
class Solution {
	static int countWays(String s) {
		// code here
		char a [] = s.toCharArray();
		
		int n = a.length;
		
		int [][][] dp = new int[n][n][2] ;
		
		for(int [][] x : dp){
		    for(int [] y : x){
		        Arrays.fill(y , -1 );
		    }
		}
		
		return f(0, n - 1, 1, a , dp);
	}
	
	static int f(int i, int j, int isTrue, char[] a , int [][][] dp) {
		
		if (i> j)
			return 0 ;
		
		if (i == j) {
			if (isTrue == 1) {
				return (a[i] == 'T') ? 1 : 0 ;
			} else {
				return (a[i] == 'F') ? 1 : 0 ;
			}
		}
		
		if(dp [i][j][isTrue] != -1) return dp[i][j][isTrue];
		
		int ways = 0 ;
		
		for (int k = i + 1 ; k <= j - 1 ; k++) {
			int LT = f(i, k - 1, 1, a, dp);
			int LF = f(i, k - 1, 0, a, dp);
			int RT = f(k + 1, j, 1, a, dp);
			int RF = f(k + 1, j, 0, a, dp);
			
			if (a[k] == '&') {
				if (isTrue == 1) {
					ways += LT * RT;
				} else {
					ways += LT * RF + LF* RT + LF * RF ;
				}
			} else if (a[k] == '|') {
				if (isTrue == 1) {
					ways += LT * RF + LF* RT + LT * RT ;
				} else {
					ways += LF * RF;
				}
			} else if (a[k] == '^') {
				if (isTrue == 1) {
					ways += LT * RF + LF* RT;
				} else {
					ways += LT * RT + LF * RF;
				}
			}
			
		}
		return dp[i][j][isTrue] = ways;
	}
}
