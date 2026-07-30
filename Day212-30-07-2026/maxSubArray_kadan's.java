class Solution {
    public int maxSubArray(int[] nums) {
        //Kadan's Algo 

        int max_sum =nums[0]; 
        int curr_sum =nums[0];

        for(int i =1 ; i< nums.length ; i ++ ){
            int num = nums[i];
            curr_sum = Math.max(curr_sum + num , num);
            max_sum = Math.max(curr_sum  , max_sum);

        }

        return max_sum ;
    }
}
