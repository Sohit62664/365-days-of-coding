package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            List<int[]> answer = new ArrayList<>();

            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            for (int i = 0; i < intervals.length; i++) {
                if (answer.isEmpty()) {
                    answer.add(intervals[i]);
                } else if (answer.get(answer.size() - 1)[1] >= intervals[i][0]
                        && answer.get(answer.size() - 1)[1] >= intervals[i][1]) {
                    continue;
                } else if (answer.get(answer.size() - 1)[1] >= intervals[i][0]) {
                    answer.get(answer.size() - 1)[1] = intervals[i][1];
                } else {
                    answer.add(intervals[i]);
                }
            }

            int[][] result = new int[answer.size()][2];

            for (int i = 0; i < answer.size(); i++) {
                result[i] = answer.get(i);
            }

            return result;
        }
    }

}
