package Day4;

public class Single_Element_in_a_Sorted_Array {
    // 540. Single Element in a Sorted Array

    class Solution {
        public int singleNonDuplicate(int[] nums) {

            int st = 0;
            int n = nums.length;
            int end = n - 1;

            if (n == 1)
                return nums[0];
            while (st <= end) {
                int mid = st + (end - st) / 2;
                // edge caases Handling
                if (mid == 0 && nums[mid + 1] != nums[mid])
                    return nums[mid];
                if (mid == end && nums[end] != nums[end - 1])
                    return nums[mid];

                // bace case
                if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1])
                    return nums[mid];

                // left right logic
                if (mid % 2 == 0) {
                    if (nums[mid] == nums[mid + 1]) {
                        st = mid + 1;
                    } else {
                        end = mid + 1;
                    }
                } else {
                    if (nums[mid] != nums[mid - 1]) {
                        end = mid - 1;
                    } else {
                        st = mid + 1;
                    }
                }

            }

            return -1;
        }
    }
}
