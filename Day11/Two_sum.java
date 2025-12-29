package Day11;

import java.util.HashMap;

public class Two_sum {

    // With the help of binary Search
    class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            for (int i = 0; i < nums.length; i++) {
                ans[0] = i;
                int compliment = target - nums[i];
                ans[1] = bin_search(nums, compliment);
                if (ans[1] != (-1)) {
                    return ans;
                }
            }
            return ans;
        }

        static int bin_search(int[] nums, int compliment) {
            int st = 0;
            int end = nums.length;
            while (st <= end) {
                int mid = st + (end - st) / 2;
                if (nums[mid] == compliment) {
                    return mid;
                } else if (compliment < nums[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
            return -1;
        }
    }

    // With the help of HashMap

    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            // int [] ans
            for (int i = 0; i < nums.length; i++) {
                int need = target - nums[i];
                if (map.containsKey(need)) {
                    return new int[] { i, map.get(need) };
                }
                map.put(nums[i], i);
            }

            return new int[] { -1, -1 };
        }
    }
}
