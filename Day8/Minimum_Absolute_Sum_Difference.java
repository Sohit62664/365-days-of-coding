package Day8;

import java.util.Arrays;

public class Minimum_Absolute_Sum_Difference {
    class Solution {
        public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
            int[] Clone_num = nums1.clone();
            Arrays.sort(Clone_num);
            long absSum = 0;
            for (int i = 0; i < nums1.length; i++) {
                absSum += Math.abs(nums1[i] - nums2[i]);
            }
            long min_sum = absSum;
            for (int i = 0; i < nums1.length; i++) {
                long fake_sum = absSum;
                long diff = Math.abs(nearest(Clone_num, nums2[i]) - nums2[i]);
                fake_sum -= Math.abs(nums1[i] - nums2[i]);
                fake_sum += diff;
                min_sum = Math.min(min_sum, fake_sum);
            }
            return (int) (min_sum % 1_000_000_007);

        }

        public int nearest(int[] nums, int target) {

            int st = 0;
            int end = nums.length - 1;

            while (st <= end) {
                int mid = st + (end - st) / 2;

                if (nums[mid] == target) {
                    return nums[mid];
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

            // edge caces
            if (st == 0) {
                return nums[st];
            }
            if (st == nums.length) {
                return nums[st - 1];
            }

            if (Math.abs(target - nums[st]) > Math.abs(target - nums[st - 1])) {
                return nums[st - 1];
            } else {
                return nums[st];
            }
        }

        // Nearest function 02 :
        // private int nearest(int[] sortedNums1, int target) {

        // int left = 0, right = sortedNums1.length - 1;

        // while (left <= right) {
        // int mid = left + (right - left) / 2;

        // if (sortedNums1[mid] == target) {
        // return sortedNums1[mid]; // exact match (best case)
        // } else if (sortedNums1[mid] < target) {
        // left = mid + 1;
        // } else {
        // right = mid - 1;
        // }
        // }

        // // After loop:
        // // right < left
        // // Check closest among neighbors
        // if (right < 0)
        // return sortedNums1[left];
        // if (left >= sortedNums1.length)
        // return sortedNums1[right];

        // return Math.abs(sortedNums1[left] - target) < Math.abs(sortedNums1[right] -
        // target)
        // ? sortedNums1[left]
        // : sortedNums1[right];

        // }
        // }

    }

}
