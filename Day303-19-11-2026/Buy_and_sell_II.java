class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;

        return f(0 , n , true , prices , 0);
    }
    int f( int i ,int n ,  boolean buy , int[] prices , int cost ) {
        if(i==n){
            return 0 ;
        }

        if(buy){
            int b =  f(i+1 ,n ,  !buy , prices , prices[i]); // we can buy 
            int nb = f(i + 1 , n , buy , prices , 0 ) ;// not buying 

            return Math.max(b , nb);

        }else{
            //want sold 
            int keep = f(i+1 ,n , buy , prices , cost);
            int profit = prices[i] - cost ;
            profit = Math.max(profit , 0 );
            int sold = profit + f(i+1 ,n , !buy , prices , 0);

            return Math.max(keep , sold);
        }
    }
}

//memoization

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length ;

        int dp[][] = new int[n][2];
        for(int x[] : dp){
            Arrays.fill(x , -1);
        }
        return f(0 , n , 1 , prices , 0 , dp);
    }
    int f( int i ,int n ,  int buy , int[] prices , int cost , int [][] dp ) {
        if(i==n){
            return 0 ;
        }

        if(dp[i][buy] != -1) return dp[i][buy];
        if(buy== 1){
            int b =  -prices[i] + f(i+1 ,n ,  0 , prices , prices[i] , dp ); // we can buy 
            int nb = f(i + 1 , n , buy , prices , 0  , dp ) ;// not buying 

            return dp[i][buy] = Math.max(b , nb);

        }else{
            //want sold 
            int keep = f(i+1 ,n , buy , prices , cost , dp );
            int sold = prices[i] + f(i+1 ,n , 1 , prices , 0 , dp);

            return dp[i][buy] =  Math.max(keep , sold);
        }
    }
}
