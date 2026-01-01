package Day14;

import java.util.HashMap;

public class majority_Element_HashMap {

    // majority element with the help of hashmap
    class Solution {
        public int majorityElement(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            for (int c : arr) {
                if (map.get(c) > (arr.length / 2))
                    return c;
            }

            return -1;
        }
    }
}
