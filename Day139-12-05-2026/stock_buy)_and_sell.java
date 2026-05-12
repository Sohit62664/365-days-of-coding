class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int minSoFar = prices[0];
        int p =0 ;
        for(int num : prices){
            minSoFar= Math.min(minSoFar, num);
            p = Math.max(p , num - minSoFar);
        }
        
        return p;
    }
}
