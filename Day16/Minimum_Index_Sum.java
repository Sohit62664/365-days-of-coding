import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minimum_Index_Sum {
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            HashMap<String, Integer> map1 = new HashMap<>();
            // HashMap<Integer , Integer> map2 = new HashMap<>();

            // Common and Least index sum should push into the answer List

            for (int i = 0; i < list1.length; i++) {
                map1.put(list1[i], i);
            }

            List<String> result = new ArrayList<>();
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < list2.length; j++) {
                if (map1.containsKey(list2[j])) {
                    int sum = map1.get(list2[j]) + j;

                    if (min > sum) {
                        result.clear();// got better Answer
                        result.add(list2[j]);
                        min = sum;
                    } else if (min == sum) {
                        result.add(list2[j]); // Same minimum sum
                    }
                }
            }
            return result.toArray(new String[0]);
        }
    }
}
