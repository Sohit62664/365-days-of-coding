package Day17;

import java.util.HashMap;

public class Subarray_Sum_Divisible_by_k {
    class Solution {
        public int subarraysDivByK(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            // (remainder , frequency)
            int Perfix_Sum = 0;
            int count = 0;

            map.put(0, 1);
            for (int num : nums) {
                Perfix_Sum += num;
                int remainder = (Perfix_Sum % k + k) % k;
                if (map.containsKey(remainder)) {
                    count += map.get(remainder);
                }

                map.put(remainder, map.getOrDefault(remainder, 0) + 1);
            }
            return count;
        }
    }
}
