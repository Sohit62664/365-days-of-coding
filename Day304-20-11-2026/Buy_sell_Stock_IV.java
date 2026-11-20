class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n][2][k+1];
        for(int j = 1 ; j<= k; j++){
        dp[n - 1][0][j] = prices[n - 1];
        // dp[n - 1][0][2] = prices[n - 1];
        }

        

        for (int i = n - 2; i >= 0; i--) {
            for (int buy = 1; buy >= 0; buy--) {
                for (int tx = k; tx >0; tx--) {
                    if (buy == 1) {
                        int nb = 0 + dp[i + 1][1][tx];
                        int b = -prices[i] + dp[i + 1][0][tx];

                        dp[i][buy][tx] = Math.max(nb, b);
                    } else {
                        int hold = dp[i + 1][0][tx ];
                        int sold = prices[i] + dp[i + 1][1][tx-1];

                        dp[i][buy][tx] = Math.max(hold, sold);
                    }
                }
            }
        }

        
        return dp[0][1][k];
    }
}
