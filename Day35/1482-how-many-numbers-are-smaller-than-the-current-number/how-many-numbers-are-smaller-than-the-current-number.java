class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        for(int i =0 ; i< n ; i++){
            ans[i] = small_count(nums , nums[i]);
        }
        return ans;
    }

    public static int small_count(int [] nums , int t ){
        int count= 0;

        for(int i =0 ; i< nums.length; i++){
            if(nums[i]<t) count++;
        }
        return count;
    }
}