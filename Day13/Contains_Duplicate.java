package Day13;

import java.util.HashMap;

public class Contains_Duplicate {

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int x : nums) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            for (Integer f : freq.values()) {
                if (f > 1) {
                    return true;
                }
            }
            return false;
        }
    }
}