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



// recursive Solution 


class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        return f(0 , 1 , n , k , prices);
    }

    int f(int i , int buy , int n , int k , int[] prices){
        if(i == n || k ==0 ) {
            return 0 ;
        }
        
        if(buy == 1){
            return Math.max(f(i+1 , buy , n , k , prices ) , -prices[i] + f(i+1 , 0 , n , k , prices));
        }else{
            return Math.max( f(i+1 , buy , n , k , prices) , prices[i] + f(i + 1 , 1  , n , k-1 , prices) );
        }
    }
}



// Memoization 
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int [n][2][k+1];

        for(int [][] d : dp){
            for(int [] r : d){
                Arrays.fill(r , -1) ; 
            }
        }
        return f(0 , 1 , n , k , prices , dp);
    }

    int f(int i , int buy , int n , int k , int[] prices , int [][][] dp){
        if(i == n || k ==0 ) {
            return 0 ;
        }
        
        if(dp[i][buy][k] != -1) return dp[i][buy][k] ;
        if(buy == 1){
            return dp[i][buy][k] = Math.max(f(i+1 , buy , n , k , prices  , dp) , -prices[i] + f(i+1 , 0 , n , k , prices , dp));
        }else{
            return dp[i][buy][k] =Math.max( f(i+1 , buy , n , k , prices , dp) , prices[i] + f(i + 1 , 1  , n , k-1 , prices , dp) );
        }
    }
}
    


// tabulation 
class Solution {
    public int maxProfit(int m, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][m + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int k = 1; k <= m; k++) {
                    if (buy == 1) {
                         dp[i][buy][k] = Math.max(dp[i + 1][buy][k],
                                -prices[i] + dp[i + 1][0][k]);
                    } else {
                         dp[i][buy][k] = Math.max(dp[i + 1][0][k] , prices[i] + dp[i + 1][1][k - 1]);
                    }
                } 
            }
        }

        return dp[0][1][m];
    }
}
