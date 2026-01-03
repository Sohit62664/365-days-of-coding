import java.util.HashMap;
import java.util.HashSet;

/*
logic:
count frequency of every element of the array 
-> check for the duplicate exist or not in the frequency if exist -> false otherwice -> true
*/
public class Unique_number_of_Occurrence {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int key = arr[i];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            HashSet<Integer> set = new HashSet<>();

            for (Integer c : map.values()) {
                if (set.contains(c)) {
                    return false;
                } else {
                    set.add(c);
                }
            }

            return true;
        }
    }
}
