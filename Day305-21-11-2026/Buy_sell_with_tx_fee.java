class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;

        return f(0 , 1 , fee , n , prices);
    }

    int f(int i , int buy , int fee , int n , int[] prices){

        if(i== n) return 0 ;

        if(buy == 1){
            int nb = f(i+1 , buy , fee , n , prices );
            int b = -prices[i] + f(i+1 , 0 , fee , n , prices );

            return Math.max(nb , b);
        }else{
            int hold = f(i+1 , buy , fee , n , prices);
            int sold = prices[i] -fee + f(i+1 , 1 , fee , n , prices);

            return Math.max(hold , sold);
        }

    }
}
