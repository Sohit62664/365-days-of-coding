package Day6;

import java.util.Arrays;

public class Find_Right_Interval {
    class Solution {
        public int[] findRightInterval(int[][] intervals) {
            // ArrayList<Integer> index = new ArrayList<>();
            int[] ans = new int[intervals.length];

            int[][] starts = new int[intervals.length][2];
            for (int i = 0; i < starts.length; i++) {
                starts[i][0] = intervals[i][0];
                starts[i][1] = i;
            }

            Arrays.sort(starts, (a, b) -> a[0] - b[0]);

            for (int i = 0; i < intervals.length; i++) {

                int target = intervals[i][1];
                int st = 0;
                int end = intervals.length - 1;
                int idx = -1;

                while (st <= end) {
                    int mid = st + (end - st) / 2;

                    if (starts[mid][0] >= target) {
                        idx = starts[mid][1];
                        end = mid - 1;
                    } else {
                        st = mid + 1;
                    }
                }
                ans[i] = idx;

            }
            return ans;
        }
    }
}
