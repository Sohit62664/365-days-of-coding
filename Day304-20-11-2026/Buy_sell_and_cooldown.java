class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        return f(  0 ,  1 , n , prices);
    }

    int f(int i , int buy ,int n , int [] prices){
        if(i >= n ) return 0 ;
        

        if(buy == 1 ){
            return Math.max(0 + f(i+1 , buy , n , prices) , -prices[i] + f(i+1 , 0 , n , prices));
        }else{
            return Math.max( 0+  f(i+1 , buy , n , prices) , prices[i] + f(i+2 , 1 , n , prices) );
        }
    }
}



//Implimented Memoization

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+1 ][2];

        for(int row [] : dp){
            Arrays.fill(row , -1) ;
        }
        return f(  0 ,  1 , n , prices  , dp);
    }

    int f(int i , int buy ,int n , int [] prices  , int [][] dp){
        if(i >= n ) return 0 ;
        if(dp[i][buy]!= -1) return dp[i][buy];

        if(buy == 1 ){
            return dp[i][buy]= Math.max(0 + f(i+1 , buy , n , prices , dp ) , -prices[i] + f(i+1 , 0 , n , prices , dp ));
        }else{ 
            
            return dp[i][buy]=  Math.max( 0+  f(i+1 , buy , n , prices , dp ) , prices[i] + f(i+2 , 1 , n , prices , dp ) );
        }
    }
}
