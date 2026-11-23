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




//Tabulation

class Solution {
	static int countWays(String s) {
		// code here
		char a [] = s.toCharArray();
		
		int n = a.length;
		
		int [][][] dp = new int[n][n][2] ;
		
		for (int i = 0; i<n ; i++) {
			for (int isTrue = 0 ; isTrue <= 1 ; isTrue++) {
				if (isTrue == 1) {
					dp[i][i][1] = (a[i] == 'T') ? 1 : 0 ;
				} else {
					dp[i][i][0] = (a[i] == 'F') ? 1 : 0 ;
				}
				
			}
		}
		
// 		for (int [][] x : dp) {
// 			for (int [] y : x) {
// 				System.out.print(Arrays.toString(y));
// 			}
// 			System.out.println();
// 		}
		for (int i = n - 1 ; i >= 0 ; i--) {
			for (int j = i+2 ; j < n ; j++) { // A valid Expression Must contains at least one Operator 

				for (int isTrue = 0 ; isTrue <= 1 ; isTrue++) {
					int ways = 0 ;
					
					for (int k = i + 1 ; k <= j - 1 ; k++) {
						int LT = dp[i][k - 1][1];
						int LF = dp[i][k - 1][0];
						int RT = dp[k + 1][j][1];
						int RF = dp[k + 1][j][0];
						// 		System.out.println("Hii");
						
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
					dp[i][j][isTrue] = ways;
				}
			}
		}
		
// 		for (int [][] x : dp) {
// 			for (int [] y : x) {
// 				System.out.print(Arrays.toString(y));
// 			}
// 			System.out.println();
// 		}
		
		return dp[0][n - 1][1];
	}
	
	static int f(int i, int j, int isTrue, char[] a, int [][][] dp) {
		
		if (i> j)
			return 0 ;
		
		if (i == j) {
			if (isTrue == 1) {
				return (a[i] == 'T') ? 1 : 0 ;
			} else {
				return (a[i] == 'F') ? 1 : 0 ;
			}
		}
		
		if (dp [i][j][isTrue] != -1)
			return dp[i][j][isTrue];
		
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

