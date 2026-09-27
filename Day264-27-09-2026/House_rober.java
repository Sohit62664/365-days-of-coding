class Solution {
    public int rob(int[] nums) {
        return helper(nums , nums.length-1);
    }

    int helper(int [] nums , int i){
        if(i== 0){
            return 0 ;
        }
        
        
        int pick = nums[i]; // takew the current element and go tthe next nonn adjacent 

        if(i > 1){
            pick+= helper(nums , i -2);
        }

        int non_pick = helper(nums , i - 1);

        return Math.max(pick , non_pick);

        
    }
}
