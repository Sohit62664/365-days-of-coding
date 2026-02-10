import java.util.*;

class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> evenSet = new HashSet<>();
            HashSet<Integer> oddSet = new HashSet<>();

            for (int j = i; j < n; j++) {
                int val = nums[j];
                if (val % 2 == 0) {
                    evenSet.add(val);
                } else {
                    oddSet.add(val);
                }

                if (evenSet.size() == oddSet.size()) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}
