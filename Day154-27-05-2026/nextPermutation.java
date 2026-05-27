class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pi = pivot(nums);
        if (pi == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int next = n - 1;

        while (next >= 0 && nums[next] <= nums[pi]) {
            next--;
        }

        swap(nums, pi, next);

        reverse(nums, pi + 1, n - 1);
        return;

    }

    int pivot(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i + 1] > nums[i]) {
                return i;
            }
            i--;
        }

        return -1;
    }

    void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int i, int j) {

        while (i < j) {

            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
