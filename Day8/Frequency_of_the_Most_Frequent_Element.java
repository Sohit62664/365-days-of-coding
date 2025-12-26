package Day8;

import java.util.Arrays;

public class Frequency_of_the_Most_Frequent_Element {
    class Solution {
        public int maxFrequency(int[] nums, int k) {

            // Arrays.sort(nums); // ascending
            // reverse(nums); // manually reverse

            // int count = 0;
            // for (int i = 0; i < nums.length; i++) {
            // int picked = nums[i];
            // int j = i + 1;
            // int count_t = 0;
            // while (k != 0) {
            // if (nums[j] != picked) {
            // nums[j]++;
            // k--;
            // } else {
            // count_t++;
            // j++;
            // }
            // }
            // count = Math.max(count, count_t);
            // }
            // return count;

            Arrays.sort(nums); // keep ascending (IMPORTANT)

            int left = 0;
            long sum = 0; // sum of current window
            int maxFreq = 1;

            for (int right = 0; right < nums.length; right++) {
                sum += nums[right];

                // shrink window if operations needed > k

                // operations_needed =
                // (target × window_size) − (sum of elements in window)

                while ((long) nums[right] * (right - left + 1) - sum > k) {
                    sum -= nums[left];
                    left++;
                }

                maxFreq = Math.max(maxFreq, right - left + 1);
            }

            return maxFreq;
        }

        // static void reverse(int[] nums) {
        // int i = 0, j = nums.length - 1;
        // while (i < j) {
        // int temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // i++;
        // j--;
        // }
        // }
    }

}
