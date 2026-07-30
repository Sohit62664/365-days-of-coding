class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0 ;
        int max_sum = 0 ;
        
        
        int i = 0 ;
        
        for(int j =0 ; j< arr.length ; j++){
            
            sum+= arr[j];
            if(j-i+1 == k){
                max_sum = Math.max(max_sum , sum);
                
                sum-= arr[i];
                i++;
            }
        }
        
        return max_sum ; 
        
    }
}
