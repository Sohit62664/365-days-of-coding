package Day4;

public class Binary_search {
    // 704. Binary Search

    class Solution {
        public int search(int[] nums, int target) {
            int st = 0;
            int end = nums.length - 1;
            // if(target>nums[end])
            while (st <= end) {
                int mid = st + (end - st) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            return -1;
        }
    }
}
