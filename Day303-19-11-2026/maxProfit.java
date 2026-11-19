class Solution {
    public int maxProfit(int[] price) {
        int mincost = price[0];
        int profit = 0 ; 

        for(int i =0 ; i< price.length ; i++){
            profit = Math.max(profit , price[i] - mincost);

            mincost = Math.min(mincost , price[i]);
        }

        return profit ;
    }
}
