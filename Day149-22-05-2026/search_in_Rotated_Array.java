class Solution {
    public int search(int[] nums, int target) {
        //Rotated Sorted 
        // find the pivot 
        // apply bin Search in the left and right

        int pi = pivot(nums);

        if (pi != -1) {
            //left Search 
            int left = binSearch(nums, target, 0, pi);
            if (left != -1) {
                return left;
            } else {
                return (binSearch(nums, target, pi + 1, nums.length - 1));
            }

            //Right Search
        } else {
            //find in Complete array 
            return binSearch(nums, target, 0, nums.length - 1);
        }

    }

    int binSearch(int[] nums, int target, int st, int end) {
        if (st > end)
            return -1;

        int mid = st + (end - st) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return binSearch(nums, target, st, mid - 1);
        } else {
            return binSearch(nums, target, mid + 1, end);
        }
    }

    int pivot(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return i - 1;
            }
        }

        return -1;

    }
}
