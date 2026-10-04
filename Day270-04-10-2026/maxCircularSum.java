class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        // maximum Subarray Sum 
        
        
        if(arr.length== 0) return 0 ;
        int currmaxsum = arr[0];
        int currminsum = arr[0];
        int maxsum = arr[0];
        int minsum = arr[0];
        
        int total_sum =arr[0] ; 
        
        
        for(int i= 1 ; i < arr.length ; i++){
            currmaxsum = Math.max(arr[i] , currmaxsum + arr[i]);
            maxsum = Math.max(currmaxsum , maxsum);
            
            
            currminsum = Math.min(arr[i] , currminsum + arr[i]);
            minsum = Math.min(currminsum , minsum);
            
            total_sum += arr[i];
        }
        
        if(maxsum< 0) return maxsum;
        int circularsum = total_sum - minsum ;
        
        int normalsum = maxsum ;
        
        return Math.max(circularsum , normalsum);
    }
}
