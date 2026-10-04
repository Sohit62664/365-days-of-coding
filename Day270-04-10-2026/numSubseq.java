class Solution {
    int count = 0;

    public int numSubseq(int[] nums, int target) {
        helper(nums, target, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        return count;
    }

    void helper(int[] nums, int target, int min, int max, int i) {

        if (i == nums.length) {
            if (min != Integer.MAX_VALUE && max - min <= target) {
                count++;
            }
            return;
        }

        // Take nums[i]
        int newMin = Math.min(min, nums[i]);
        int newMax = Math.max(max, nums[i]);

        helper(nums, target, newMin, newMax, i + 1);

        // Don't take nums[i]
        helper(nums, target, min, max, i + 1);
    }
}
