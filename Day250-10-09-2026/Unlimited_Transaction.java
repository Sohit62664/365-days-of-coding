class Solution {
    public int maxProfit(int[] prices) {
        // code here
        //unlimited Transaction 
        // sum of all the transaction which are positive 
        
        //brute force O(n^2)
        // recursion based Solurtion  either hold or sell , either buy or skip 
        
        
        return helper(prices , 0 , false);
    }
    
    
    int helper(int [] prices , int day , boolean holding){
        
        if(day == prices.length){
            return 0 ; 
        }
        
        if(!holding){
            // buy or skip 
            int buy = -prices[day] + helper( prices , day+1 , true );
            int skip = helper( prices , day+1 , false );
            
            
            return Math.max(buy , skip);
            
            
        }else{
            // sell or Hold
            
            int sell = prices[day] + helper(prices , day+1 , false);
            
            int skip = helper(prices , day +1 , true);
            
            
            return Math.max(sell , skip );
        }
    }
}





// optimize Approach 


class Solution {
    public int maxProfit(int[] prices) {
        // code here
        // optimize Approach 
        
        // sell if curr price > last pricr
        
        int profit =0 ; 
        
        for(int i =1 ; i< prices.length ; i++ ){
            if(prices[i]> prices[i-1]){
                profit+= prices[i] - prices[i-1];
            }
        }
        
        return profit ;
    }
}

