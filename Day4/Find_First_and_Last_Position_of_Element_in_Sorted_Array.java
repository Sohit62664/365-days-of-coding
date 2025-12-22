package Day4;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int st = 0;
            int end = nums.length - 1;
            int ans1 = -1;
            int ans2 = -1;

            // For First Position

            while (st <= end) {
                int mid = st + (end - st) / 2;
                if (nums[mid] == target) {
                    ans1 = mid;
                    end = mid - 1; // continue in the left for the first positio
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

            // last position
            st = 0;
            end = nums.length - 1;

            while (st <= end) {
                int mid = st + (end - st) / 2;
                if (nums[mid] == target) {
                    ans2 = mid;
                    st = mid + 1; // continue in the right for the last positio
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            return new int[] { ans1, ans2 };
        }
    }
}
