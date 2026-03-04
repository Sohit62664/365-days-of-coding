class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int left =0 ;
        int max = 0 ;
        int xor = 0 ;
        
        for(int right = 0 ; right<arr.length ; right++){
            xor^= arr[right];
            if(right-left+1==k){
                max= Math.max(xor , max);
                xor^=arr[left];
                left++;
            }
        }
        
        return max;
    }
}
