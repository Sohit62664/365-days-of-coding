import java.util.HashMap;

public class Contains_Duplicate_II {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    int last_index = map.get(nums[i]);
                    if (i - last_index <= k) {
                        return true;
                    }
                }

                map.put(nums[i], i);
            }

            return false;

        }
    }
}
