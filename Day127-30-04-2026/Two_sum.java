class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = {-1,-1};
        for(int i = 0 ; i< nums.length; i++){
            int compliment = target - nums[i];
            //search compliment
            for(int j = 0 ; j< nums.length ; j++){
                if(j!=i){
                    if(nums[j]==compliment){
                        ans[0]= i;
                        ans[1]= j;
                        return ans;
                    }
                }
            }
        }
        return ans ;
    }
}
