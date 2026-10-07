class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 ; 
        int sum =0 ; 
        int min  = Integer.MAX_VALUE;
        for(int right = 0 ; right< nums.length ; right++ ){
            // expand
            sum+= nums[right];
            // manage window
            // if(sum>= target){
            //     min = Math.min(min , right - left+1);
            // }

            while (sum >=  target){
                sum-= nums[left];
                min = Math.min(min , right - left+1);
                left++;
            }
            // if(sum>= target)
            // min = Math.min(min , right - left);
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
