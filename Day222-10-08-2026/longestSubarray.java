// correct only for Positive array

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int left = 0 ;
        int sum = 0 ;
        int size = 0 ;
        
        for(int right = 0 ; right < arr.length ; right++){
            
            sum+= arr[right];
            
            while(sum > k){
                sum-=arr[left];
                left++;
            }
            if(sum == k)
            size = Math.max(size , right -left+1);
        }
        
        return size ;
    }
}
