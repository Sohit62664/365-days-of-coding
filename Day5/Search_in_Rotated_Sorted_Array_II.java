package Day5;

public class Search_in_Rotated_Sorted_Array_II {
    class Solution {
        public boolean search(int[] nums, int target) {
            int st = 0;
            int end = nums.length - 1;

            while (st <= end) {
                int mid = st + (end - st) / 2;
                if (nums[mid] == target) {
                    return true;
                }

                // duplicates handling
                if (nums[st] == nums[mid] && nums[mid] == nums[end]) {
                    st++;
                    end--;
                    continue;
                }
                // left sorted
                if (nums[st] <= nums[mid]) {
                    if (nums[st] <= target && nums[mid] > target) {
                        end = mid - 1;
                    } else {
                        st = mid + 1;
                    }
                } else {
                    // right Sorted
                    if (nums[mid] < target && nums[end] >= target) {
                        st = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return false;
        }
    }
}
