class Solution {
    public int minimumCost(int[] nums) {
        int k = 3;
        if (nums.length < k)
            return -1;
        if (nums.length == 3) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            return sum;
        } else {
            int n = nums.length;
            int smallest_sum = nums[0] + first_and_second_smallest_after0(nums);
            return smallest_sum;
        }

    }

    public static int first_and_second_smallest_after0(int[] nums) {
        int first_smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < first_smallest) {
                second_smallest = first_smallest;
                first_smallest = nums[i];
            } else if (nums[i] < second_smallest) {
                second_smallest = nums[i];
            }
        }
        return second_smallest + first_smallest;
    }
}