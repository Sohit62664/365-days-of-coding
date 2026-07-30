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


// implimanting the same approach in another form 

    class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0 ;
        int max_sum = Integer.MIN_VALUE ;
        
        
        for(int right = 0 ; right < arr.length  ; right ++){
            sum+= arr[right];
            if(right>= k-1 ){ // window full
                max_sum = Math.max(sum , max_sum );
                sum -= arr[right - k + 1];
            }
        }
        
        
        
        return max_sum ; 
        
    }
}
