class Solution {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int n = s1.length() ;
        int m = s2.length();
        
        int dp[][] = new int[n+1][m+1];
        
        int max = 0 ;
        
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] = 0 ;
                }
                
                max = Math.max(max , dp[i][j]);
            }
        }
        
        return max;
    }
}





// recursive solution
class Solution {
	int max = 0 ;
	public int longCommSubstr(String s1, String s2) {
		// code here
		int n = s1.length() ;
		int m = s2.length();
		
		// int dp[][] = new int[n + 1][m + 1];
		f(n - 1, m - 1, 0, s1, s2);
		
		return max;
	}
	
	void f(int i, int j, int l, String s1, String s2) {
		if (i < 0 || j < 0) {
			max = Math.max(max, l);
			return;
		}
		
		if (s1.charAt(i) == s2.charAt(j)) {
			max = Math.max(max, l + 1);
			f(i - 1, j - 1, l + 1, s1, s2);
		}
		
		f(i - 1, j, 0, s1, s2);
		f(i, j - 1, 0, s1, s2);
		
	}
}




// memoization using 3 state dp 

class Solution {
	int max = 0 ;
	public int longCommSubstr(String s1, String s2) {
		// code here
		int n = s1.length() ;
		int m = s2.length();
		int l = Math.min(n, m);
		
		int dp[][][] = new int[n][m][l];
		for (int y[][] : dp) {
			for (int[] x : y) {
				Arrays.fill(x, -1);
				
			}
		}
		
		int ans = f(n - 1, m - 1, 0, s1, s2, dp);
		
// 		for (int x [] : dp) {
// 			System.out.println(Arrays.toString(x));
// 		}
		
		return ans ;
		
		// 		return max;
	}
	
	int f(int i, int j, int l, String s1, String s2, int[][][] dp) {
		if (i < 0 || j < 0) {
			max = Math.max(max, l);
			return max;
		}
		
		if (dp[i][j][l] != -1)
			return dp[i][j][l];
		int matched = 0 ;
		
		if (s1.charAt(i) == s2.charAt(j)) {
			max = Math.max(max, l + 1);
			matched = f(i - 1, j - 1, l + 1, s1, s2, dp);
		}
		
		int nm1 = f(i - 1, j, 0, s1, s2, dp);
		int nm2 = f(i, j - 1, 0, s1, s2, dp);
		
		return dp[i][j][l] = Math.max(matched, Math.max(nm1, nm2));
		
	}
}

