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
