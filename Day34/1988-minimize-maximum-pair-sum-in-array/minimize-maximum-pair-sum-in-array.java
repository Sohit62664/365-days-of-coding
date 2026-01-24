class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i =0, j = nums.length-1;
        int max_pair_sum = 0;
        while(i<j){
            int sum = nums[i]+nums[j];
            max_pair_sum = Math.max(max_pair_sum, sum);
            i++;
            j--;
        }
        return max_pair_sum;
    }
}