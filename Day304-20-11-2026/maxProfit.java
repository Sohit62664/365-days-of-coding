class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int dp[][] = new int[n][2];

        dp[n - 1][1] = 0;
        dp[n - 1][0] = prices[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 1; j >=0 ; j--) {
                if (j == 1) {
                    int b = -prices[i] + dp[i+1 ][0] ; 
                    int nb = dp[i+1][j]  ; 

                     dp[i][j] = Math.max(b, nb);

                } else {
                    //want sold 
                    int keep =  dp[i+1 ][0] ;
                    int sold = prices[i] + dp[i+1][1] ;

                     dp[i][j] = Math.max(keep, sold);
                }
            }
        }

        return dp[0][1];
    }
}
