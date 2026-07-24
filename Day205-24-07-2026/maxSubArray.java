class Solution {
    public int maxSubArray(int[] nums) {
        // Brute force 

        int max_sum = 0 ;
        int n = nums.length;
        for(int i =0 ; i< n ; i ++){
            int curr_sum = 0 ;
            for(int j = i ; j<n ; j++){
                curr_sum += nums[j];
                max_sum = Math.max(max_sum , curr_sum);
            }
        }

        return max_sum ;
    }
}
