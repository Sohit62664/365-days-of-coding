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
