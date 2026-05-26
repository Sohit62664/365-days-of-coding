class Solution {

    public void nextPermutation(int[] nums) {

        //find breakpoint and swap with just bigger and SWap with it
        //reverse the right side ;

        int pivot = breakpoint(nums);
        int n = nums.length;

        // if breakpoint exists
        if (pivot != -1) {

            int next = n - 1;

            for (int i = n - 1; i > pivot; i--) {

                if (nums[i] > nums[pivot]) {
                    next = i;
                    break;
                }
            }

            swap(nums, pivot, next);
        }

        // reverse right side
        reverse(nums, pivot + 1, n - 1);
    }

    int breakpoint(int[] nums) {

        int n = nums.length - 2;

        while (n >= 0 && nums[n] >= nums[n + 1]) {
            n--;
        }

        return n;
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
