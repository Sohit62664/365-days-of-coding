class Solution {
    public int maxSubArray(int[] nums) {
        int c_sum = nums[0];
        int max_sum = nums[0] ;

        for(int i=1 ; i < nums.length ; i++){
            c_sum = Math.max(c_sum+ nums[i] , nums[i]);
            max_sum = Math.max(c_sum , max_sum);
        }
        return max_sum;
    }
}
