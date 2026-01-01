package Day14;

import java.util.Arrays;
import java.util.HashMap;

public class Relative_Ranks {
    class Solution {
        public String[] findRelativeRanks(int[] score) {
            int copy[] = new int[score.length];
            for (int i = 0; i < score.length; i++) {
                copy[i] = score[i];
            }
            Arrays.sort(score);
            String[] ans = new String[score.length];
            HashMap<Integer, Integer> map = new HashMap<>();
            int j = 1;
            for (int i = score.length - 1; i >= 0; i--) {
                map.put(score[i], j);
                j++;
            }

            for (int i = 0; i < score.length; i++) {
                if (map.get(copy[i]) == 1) {
                    ans[i] = "Gold Medal";
                } else if (map.get(copy[i]) == 2) {
                    ans[i] = "Silver Medal";
                } else if (map.get(copy[i]) == 3) {
                    ans[i] = "Bronze Medal";
                } else {
                    ans[i] = String.valueOf(map.get(copy[i]));
                }
            }
            return ans;

        }
    }
}
