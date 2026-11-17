class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];

        int lcs = f(str1 , str2 , n , m , dp);

        int i = n ;
        int j = m ; 

        char ans [] = new char[n+m-lcs];
        int ind = n+m-lcs-1;
        while(i>0 && j > 0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                ans[ind--] = str1.charAt(i-1) ;
                i--; j--;
            }else if(dp[i-1][j]> dp[i][j-1]){
                ans[ind--] = str1.charAt(i-1) ;
                i--;
            }else{
                ans[ind--] = str2.charAt(j-1) ;
                j--;
            }
        }

        while(i> 0){
            ans[ind--] = str1.charAt(i-1) ;
            i--;
        }
        while(j > 0){
            ans[ind--] = str2.charAt(j-1) ;
            j--;
        }


        return new String(ans);

    }


    int f(String s1, String s2, int n, int m , int[][] dp ) {
        
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
