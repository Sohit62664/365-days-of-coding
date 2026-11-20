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
