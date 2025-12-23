package Day5;

public class Find_Minimum_in_Rotated_Sorted {
    class Solution {
        public int findMin(int[] nums) {
            int st = 0;
            int end = nums.length - 1;

            while (st <= end) {
                int mid = st + (end - st) / 2;

                // duplicates handling
                // if (nums[st] == nums[mid] && nums[mid] == nums[end]) {
                // st++;
                // end--;
                // continue;
                // }

                if (mid < end && nums[mid] > nums[mid + 1]) {
                    return nums[mid + 1];
                } else if (st < mid && nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                } else if (nums[st] >= nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }

            }

            return nums[0];

        }
    }

    // Logic 1
    // logic if the pivot not found i.e. the array is not rotated so minimum will be
    // at 0th index
    // if pivot found then the next element of the pivot will be minimum Element

}
