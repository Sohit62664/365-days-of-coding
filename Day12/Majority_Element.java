package Day12;

import java.util.HashMap;

public class Majority_Element {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            int n = nums.length;
            for (int x : nums) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            for (Integer key : freq.keySet()) {
                if (freq.get(key) > (n / 2)) {
                    return key;
                }
            }
            return -1;
        }

    }
}
