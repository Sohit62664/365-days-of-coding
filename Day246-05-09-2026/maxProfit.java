class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0 ;
        for(int buy = 0 ; buy < prices.length ; buy++){
            for(int sell = buy+1 ; sell < prices.length ; sell++){
                int profit =prices[sell]-  prices[buy] ;
                max_profit = Math.max(max_profit , profit);
            }
        }

        return  max_profit;
    }
}



//Optimize approach

class Solution {
    public int maxProfit(int[] prices) {
        int max_profit =0 ;
        
        int min_price = prices[0];
        for(int i = 1 ; i< prices.length ; i++){
            int profit = prices[i]- min_price ;

            min_price = Math.min(min_price , prices[i]);
            max_profit = Math.max(max_profit , profit);
        }

        return max_profit;
    }
}
