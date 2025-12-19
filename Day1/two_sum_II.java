class Solution {
    //method 01 
    // leetcode - 167
    
    public int[] twoSum(int[] num, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < num.length; i++) {
            int n1 = num[i];
            int compliment = binsearch(num, target - num[i]);
            if (compliment != -1) {
                ans[0] = i + 1;
                ans[1] = compliment + 1;
                return ans;
            }
        }
        return ans;
    }

    static int binsearch(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target && mid + 1 < nums.length && nums[mid + 1] == nums[mid]) { // handling duplicates 
                return mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    // method 02 using two pointer Approach

    public int[] twoSum(int[] num, int target) {

        int left = 0;
        int right = num.length - 1;
        while (left <= right) {
            int sum = num[left] + num[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];

    }

}