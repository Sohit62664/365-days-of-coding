package Day17;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            // (prifixsum , Frequency)
            map.put(0, 1);

            int prefix_sum = 0;
            int count = 0;
            for (int num : nums) {
                prefix_sum += num;
                if (map.containsKey(prefix_sum - k)) {
                    count += map.get(prefix_sum - k);
                }

                map.put(prefix_sum, map.getOrDefault(prefix_sum, 0) + 1);
            }
            return count;
        }
    }
}
