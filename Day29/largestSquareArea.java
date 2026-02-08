package Day29;

import java.util.ArrayList;
import java.util.HashMap;

public class largestSquareArea {
    class Solution {
        public ArrayList<Integer> nextFreqGreater(int[] arr) {
            // code here
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                // boolean flag= false;
                int copy_j = -1;
                int i_freq = map.get(arr[i]);
                for (int j = i; j < arr.length; j++) {
                    if (i_freq < map.get(arr[j])) {
                        copy_j = arr[j];
                        break;
                    }
                }
                ans.add(copy_j);

            }
            return ans;
        }
    }
}
