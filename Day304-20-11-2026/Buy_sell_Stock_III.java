class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;

        
        return f(0 , 1 , n ,2 , prices);
    }

    int f(int i , int buy , int n , int tx , int [] prices){
        if(i == n || tx == 0 ) return 0 ;
        
        if(buy== 1) {
            int nb = 0+ f(i+1 , 1 , n , tx , prices);
            int b = -prices[i] + f(i+1 , 0 , n , tx , prices);

            return Math.max(nb , b);
        } else{
            int hold = f(i+1 , 0 , n , tx , prices );
            int sold = prices[i] + f(i+1 , 1 , n , tx-1 , prices);

            return Math.max(hold , sold );
        }
    }
}




// Memoization 

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;
        int dp[][][] = new int[n][2][2];
        for(int [][] twod : dp){
            for(int row [] : twod){
                Arrays.fill(row , -1);
            }
        }



        return f(0 , 1 , n ,2 , prices , dp);
    }

    int f(int i , int buy , int n , int tx , int [] prices , int [][][] dp ){
        if(i == n || tx == 0 ) return 0 ;
        

        if(dp[i][buy][tx-1] != -1) return dp[i][buy][tx-1];
        if(buy== 1) {
            int nb = 0+ f(i+1 , 1 , n , tx , prices , dp);
            int b = -prices[i] + f(i+1 , 0 , n , tx , prices , dp);

            return dp[i][buy][tx-1] = Math.max(nb , b);
        } else{
            int hold = f(i+1 , 0 , n , tx , prices  , dp);
            int sold = prices[i] + f(i+1 , 1 , n , tx-1 , prices , dp);

            return dp[i][buy][tx-1] =  Math.max(hold , sold );
        }
    }
}



// Tabulation 
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n][2][3];

        dp[n - 1][0][1] = prices[n - 1];
        dp[n - 1][0][2] = prices[n - 1];
        dp[n - 1][0][0] = 0 ;

        for (int i = n - 2; i >= 0; i--) {
            for (int buy = 1; buy >= 0; buy--) {
                for (int tx = 2; tx >0; tx--) {
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

        
        return dp[0][1][2];
    
    }
}




// memization with dp[n][2][3]
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;
        int dp[][][] = new int[n][2][3];
        for(int [][] twod : dp){
            for(int row [] : twod){
                Arrays.fill(row , -1);
            }
        }

        return f(0 , 1 , n , 2 , prices , dp);
    }

    int f(int i , int buy , int n , int tx , int [] prices , int [][][] dp ){
        if(i == n || tx == 0 ) return 0 ;
        

        if(dp[i][buy][tx] != -1) return dp[i][buy][tx];
        if(buy== 1) {
            int nb = 0+ f(i+1 , 1 , n , tx , prices , dp);
            int b = -prices[i] + f(i+1 , 0 , n , tx , prices , dp);

            return dp[i][buy][tx] = Math.max(nb , b);
        } else{
            int hold = f(i+1 , 0 , n , tx , prices  , dp);
            int sold = prices[i] + f(i+1 , 1 , n , tx-1 , prices , dp);

            return dp[i][buy][tx] =  Math.max(hold , sold );
        }
    }
}
